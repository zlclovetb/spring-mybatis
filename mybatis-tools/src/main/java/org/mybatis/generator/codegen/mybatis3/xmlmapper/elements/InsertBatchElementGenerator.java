package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.OutputUtilities;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.ListUtilities;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;
import org.mybatis.generator.config.GeneratedKey;

public class InsertBatchElementGenerator extends AbstractXmlElementGenerator {

  public InsertBatchElementGenerator() {
    super();
  }

  @Override
  public void addElements(XmlElement parentElement) {
    XmlElement answer = new XmlElement("insert");

    answer.addAttribute(new Attribute("id", "insertBatch"));

    answer.addAttribute(new Attribute("parameterType", "java.util.List"));

    context.getCommentGenerator().addComment(answer);

    GeneratedKey gk = introspectedTable.getGeneratedKey();
    if (gk != null) {
      IntrospectedColumn introspectedColumn = introspectedTable.getColumn(gk.getColumn());
      // if the column is null, then it's a configuration error. The
      // warning has already been reported
      if (introspectedColumn != null) {
        if (gk.isJdbcStandard()) {
          answer.addAttribute(new Attribute("useGeneratedKeys", "true")); //$NON-NLS-2$
          answer.addAttribute(new Attribute("keyProperty", introspectedColumn.getJavaProperty()));
          answer.addAttribute(new Attribute("keyColumn", introspectedColumn.getActualColumnName()));
        } else {
          answer.addElement(getSelectKey(introspectedColumn, gk));
        }
      }
    }

    StringBuilder insertClause = new StringBuilder();
    StringBuilder valuesClause = new StringBuilder();

    insertClause.append("insert into ");
    insertClause.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
    insertClause.append(" (");

    valuesClause.append("(");

    List<String> valuesClauses = new ArrayList<String>();
    List<IntrospectedColumn> columns = ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable.getAllColumns());
    for (int i = 0; i < columns.size(); i++) {
      IntrospectedColumn introspectedColumn = columns.get(i);

      insertClause.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
      valuesClause.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn, "item."));
      if (i + 1 < columns.size()) {
        insertClause.append(", ");
        valuesClause.append(", ");
      }

      if (valuesClause.length() > 80) {
        answer.addElement(new TextElement(insertClause.toString()));
        insertClause.setLength(0);
        OutputUtilities.xmlIndent(insertClause, 1);

        valuesClauses.add(valuesClause.toString());
        valuesClause.setLength(0);
        OutputUtilities.xmlIndent(valuesClause, 1);
      }
    }

    insertClause.append(')');
    answer.addElement(new TextElement(insertClause.toString()));
    answer.addElement(new TextElement("values "));

    valuesClause.append(')');
    valuesClauses.add(valuesClause.toString());

    XmlElement innerForEach = new XmlElement("foreach");
    innerForEach.addAttribute(new Attribute("collection", "list"));
    innerForEach.addAttribute(new Attribute("item", "item"));
    innerForEach.addAttribute(new Attribute("index", "index"));
    innerForEach.addAttribute(new Attribute("separator", ","));


    for (String clause : valuesClauses) {
      innerForEach.addElement(new TextElement(clause));
    }

    answer.addElement(innerForEach);
    if (context.getPlugins().sqlMapInsertElementGenerated(answer, introspectedTable)) {
      parentElement.addElement(answer);
    }
  }
}
