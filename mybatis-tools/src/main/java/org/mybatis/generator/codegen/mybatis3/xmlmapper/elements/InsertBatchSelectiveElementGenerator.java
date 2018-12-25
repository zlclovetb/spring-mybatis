package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

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

public class InsertBatchSelectiveElementGenerator extends AbstractXmlElementGenerator {

  public InsertBatchSelectiveElementGenerator() {
    super();
  }

  @Override
  public void addElements(XmlElement parentElement) {
    XmlElement answer = new XmlElement("insert");

    answer.addAttribute(new Attribute("id", "insertBatchSelective"));

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

    StringBuilder sb = new StringBuilder();

    sb.append("insert into ");
    sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
    answer.addElement(new TextElement(sb.toString()));

    XmlElement innerForEach = new XmlElement("foreach");
    innerForEach.addAttribute(new Attribute("collection", "list"));
    innerForEach.addAttribute(new Attribute("item", "item"));
    innerForEach.addAttribute(new Attribute("index", "index"));
    innerForEach.addAttribute(new Attribute("separator", ","));

    XmlElement valuesTrimElement = new XmlElement("trim");
    valuesTrimElement.addAttribute(new Attribute("prefix", "(")); //$NON-NLS-2$
    valuesTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-2$
    valuesTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-2$
    innerForEach.addElement(valuesTrimElement);

    StringBuilder insertClause = new StringBuilder();
    insertClause.append("(");
    List<IntrospectedColumn> columns = ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable.getAllColumns());
    for (int i = 0; i < columns.size(); i++) {
      IntrospectedColumn introspectedColumn = columns.get(i);
      insertClause.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
      if (i + 1 < columns.size()) {
        insertClause.append(", ");
      }
      if (insertClause.length() > 80) {
        answer.addElement(new TextElement(insertClause.toString()));
        insertClause.setLength(0);
        OutputUtilities.xmlIndent(insertClause, 1);
      }

      XmlElement valuesNotNullElement = new XmlElement("if");
      sb.setLength(0);
      sb.append("item." + introspectedColumn.getJavaProperty());
      sb.append(" != null");
      valuesNotNullElement.addAttribute(new Attribute("test", sb.toString()));

      sb.setLength(0);
      sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn, "item."));
      sb.append(',');
      valuesNotNullElement.addElement(new TextElement(sb.toString()));
      valuesTrimElement.addElement(valuesNotNullElement);

      valuesNotNullElement = new XmlElement("if");
      sb.setLength(0);
      sb.append("item." + introspectedColumn.getJavaProperty());
      sb.append(" == null");
      valuesNotNullElement.addAttribute(new Attribute("test", sb.toString()));

      sb.setLength(0);
      sb.append("NULL");
      sb.append(',');
      valuesNotNullElement.addElement(new TextElement(sb.toString()));
      valuesTrimElement.addElement(valuesNotNullElement);
    }
    insertClause.append(")");

    answer.addElement(new TextElement(insertClause.toString()));
    answer.addElement(new TextElement("values "));
    answer.addElement(innerForEach);

    if (context.getPlugins().sqlMapInsertSelectiveElementGenerated(answer, introspectedTable)) {
      parentElement.addElement(answer);
    }
  }
}
