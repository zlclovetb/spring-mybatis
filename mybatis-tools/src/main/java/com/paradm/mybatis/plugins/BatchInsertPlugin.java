package com.paradm.mybatis.plugins;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.ListUtilities;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.paradm.mybatis.tools.FormatTools;
import com.paradm.mybatis.tools.GenetateConstant;
import com.paradm.mybatis.tools.JavaElementGeneratorTools;
import com.paradm.mybatis.tools.XmlElementGeneratorTools;

public class BatchInsertPlugin extends PluginAdapter {
  protected static final Logger logger = LoggerFactory.getLogger(BatchInsertPlugin.class); // 日志
  public static final String METHOD_BATCH_INSERT = "batchInsert"; // 方法名
  public static final String METHOD_BATCH_INSERT_SELECTIVE = "batchInsertSelective"; // 方法名
  public static final String PRO_ALLOW_MULTI_QUERIES = "allowMultiQueries"; // property
                                                                            // allowMultiQueries
  private boolean allowMultiQueries = false; // 是否允许多sql提交

  @Override
  public boolean validate(List<String> warnings) {
    return true;
  }

  @Override
  public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    // 1. batchInsert
    FullyQualifiedJavaType listType = FullyQualifiedJavaType.getNewListInstance();
    listType.addTypeArgument(introspectedTable.getRules().calculateAllFieldsClass());
    Method mBatchInsert =
        JavaElementGeneratorTools.generateMethod(METHOD_BATCH_INSERT, JavaVisibility.DEFAULT, FullyQualifiedJavaType.getIntInstance(), new Parameter(listType, "list", "@Param(\"list\")")

        );
    CommentGenerator commentGenerator = context.getCommentGenerator();
    commentGenerator.addGeneralMethodComment(mBatchInsert, introspectedTable);
    // interface 增加方法
    FormatTools.addMethodWithBestPosition(interfaze, mBatchInsert);
    logger.debug("itfsw(批量插入插件):" + interfaze.getType().getShortName() + "增加batchInsert方法。");

    // 2. batchInsertSelective
    FullyQualifiedJavaType selectiveType = new FullyQualifiedJavaType(introspectedTable.getRules().calculateAllFieldsClass().getShortName() + "." + GenetateConstant.ENUM_NAME);
    Method mBatchInsertSelective = JavaElementGeneratorTools.generateMethod(METHOD_BATCH_INSERT_SELECTIVE, JavaVisibility.DEFAULT, FullyQualifiedJavaType.getIntInstance(),
        new Parameter(listType, "list", "@Param(\"list\")"), new Parameter(selectiveType, "selective", "@Param(\"selective\")", true));
    commentGenerator.addGeneralMethodComment(mBatchInsertSelective, introspectedTable);
    // interface 增加方法
    FormatTools.addMethodWithBestPosition(interfaze, mBatchInsertSelective);
    logger.debug("itfsw(批量插入插件):" + interfaze.getType().getShortName() + "增加batchInsertSelective方法。");

    return true;
  }

  @Override
  public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
    // 1. batchInsert
    XmlElement batchInsertEle = new XmlElement("insert");
    batchInsertEle.addAttribute(new Attribute("id", METHOD_BATCH_INSERT));
    // 参数类型
    batchInsertEle.addAttribute(new Attribute("parameterType", "map"));
    // 添加注释(!!!必须添加注释，overwrite覆盖生成时，@see
    // XmlFileMergerJaxp.isGeneratedNode会去判断注释中是否存在OLD_ELEMENT_TAGS中的一点，例子：@mbg.generated)
    CommentGenerator commentGenerator = context.getCommentGenerator();
    commentGenerator.addComment(batchInsertEle);

    // 使用JDBC的getGenereatedKeys方法获取主键并赋值到keyProperty设置的领域模型属性中。所以只支持MYSQL和SQLServer
    XmlElementGeneratorTools.useGeneratedKeys(batchInsertEle, introspectedTable);

    batchInsertEle.addElement(new TextElement("insert into " + introspectedTable.getFullyQualifiedTableNameAtRuntime()));
    for (Element element : XmlElementGeneratorTools.generateKeys(ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable.getAllColumns()), true)) {
      batchInsertEle.addElement(element);
    }

    // 添加foreach节点
    XmlElement foreachElement = new XmlElement("foreach");
    foreachElement.addAttribute(new Attribute("collection", "list"));
    foreachElement.addAttribute(new Attribute("item", "item"));
    foreachElement.addAttribute(new Attribute("separator", ","));

    for (Element element : XmlElementGeneratorTools.generateValues(ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable.getAllColumns()), "item.")) {
      foreachElement.addElement(element);
    }

    // values 构建
    batchInsertEle.addElement(new TextElement("values"));
    batchInsertEle.addElement(foreachElement);
    document.getRootElement().addElement(batchInsertEle);
    logger.debug("itfsw(批量插入插件):" + introspectedTable.getMyBatis3XmlMapperFileName() + "增加batchInsert实现方法。");

    // 2. batchInsertSelective
    XmlElement batchInsertSelectiveEle = new XmlElement("insert");
    // 添加注释(!!!必须添加注释，overwrite覆盖生成时，@see
    // XmlFileMergerJaxp.isGeneratedNode会去判断注释中是否存在OLD_ELEMENT_TAGS中的一点，例子：@mbg.generated)
    commentGenerator.addComment(batchInsertSelectiveEle);

    batchInsertSelectiveEle.addAttribute(new Attribute("id", METHOD_BATCH_INSERT_SELECTIVE));
    // 参数类型
    batchInsertSelectiveEle.addAttribute(new Attribute("parameterType", "map"));

    // 使用JDBC的getGenereatedKeys方法获取主键并赋值到keyProperty设置的领域模型属性中。所以只支持MYSQL和SQLServer
    XmlElementGeneratorTools.useGeneratedKeys(batchInsertSelectiveEle, introspectedTable);

    // 支持原生字段非空判断
    if (this.allowMultiQueries) {
      XmlElement chooseEle = new XmlElement("choose");

      // selective 增强
      XmlElement selectiveEnhancedEle = new XmlElement("when");
      selectiveEnhancedEle.addAttribute(new Attribute("test", "selective != null and selective.length > 0"));
      chooseEle.addElement(selectiveEnhancedEle);

      selectiveEnhancedEle.getElements().addAll(this.generateSelectiveEnhancedEles(introspectedTable));

      // 原生非空判断语句
      XmlElement selectiveNormalEle = new XmlElement("otherwise");
      chooseEle.addElement(selectiveNormalEle);

      XmlElement foreachEle = new XmlElement("foreach");
      selectiveNormalEle.addElement(foreachEle);
      foreachEle.addAttribute(new Attribute("collection", "list"));
      foreachEle.addAttribute(new Attribute("item", "item"));
      foreachEle.addAttribute(new Attribute("separator", ";"));


      foreachEle.addElement(new TextElement("insert into " + introspectedTable.getFullyQualifiedTableNameAtRuntime()));

      XmlElement insertTrimElement = new XmlElement("trim");
      foreachEle.addElement(insertTrimElement);
      insertTrimElement.addElement(XmlElementGeneratorTools.generateKeysSelective(ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable.getAllColumns()), "item."));

      foreachEle.addElement(new TextElement("values"));

      XmlElement valuesTrimElement = new XmlElement("trim");
      foreachEle.addElement(valuesTrimElement);
      valuesTrimElement.addElement(XmlElementGeneratorTools.generateValuesSelective(ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable.getAllColumns()), "item."));

      batchInsertSelectiveEle.addElement(chooseEle);
    } else {
      batchInsertSelectiveEle.getElements().addAll(this.generateSelectiveEnhancedEles(introspectedTable));
    }

    document.getRootElement().addElement(batchInsertSelectiveEle);
    logger.debug("itfsw(批量插入插件):" + introspectedTable.getMyBatis3XmlMapperFileName() + "增加batchInsertSelective实现方法。");

    return true;
  }

  private List<Element> generateSelectiveEnhancedEles(IntrospectedTable introspectedTable) {
    List<Element> eles = new ArrayList<>();

    eles.add(new TextElement("insert into " + introspectedTable.getFullyQualifiedTableNameAtRuntime() + " ("));

    XmlElement foreachInsertColumns = new XmlElement("foreach");
    foreachInsertColumns.addAttribute(new Attribute("collection", "selective"));
    foreachInsertColumns.addAttribute(new Attribute("item", "column"));
    foreachInsertColumns.addAttribute(new Attribute("separator", ","));
    foreachInsertColumns.addElement(new TextElement("${column.escapedColumnName}"));

    eles.add(foreachInsertColumns);

    eles.add(new TextElement(")"));

    // values
    eles.add(new TextElement("values"));

    // foreach values
    XmlElement foreachValues = new XmlElement("foreach");
    foreachValues.addAttribute(new Attribute("collection", "list"));
    foreachValues.addAttribute(new Attribute("item", "item"));
    foreachValues.addAttribute(new Attribute("separator", ","));

    foreachValues.addElement(new TextElement("("));

    // foreach 所有插入的列，比较是否存在
    XmlElement foreachInsertColumnsCheck = new XmlElement("foreach");
    foreachInsertColumnsCheck.addAttribute(new Attribute("collection", "selective"));
    foreachInsertColumnsCheck.addAttribute(new Attribute("item", "column"));
    foreachInsertColumnsCheck.addAttribute(new Attribute("separator", ","));

    // 所有表字段
    List<IntrospectedColumn> columns = ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable.getAllColumns());
    List<IntrospectedColumn> columns1 = ListUtilities.removeIdentityAndGeneratedAlwaysColumns(introspectedTable.getAllColumns());
    for (int i = 0; i < columns1.size(); i++) {
      IntrospectedColumn introspectedColumn = columns.get(i);
      XmlElement check = new XmlElement("if");
      check.addAttribute(new Attribute("test", "'" + introspectedColumn.getActualColumnName() + "'.toString() == column.value"));
      check.addElement(new TextElement(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn, "item.")));

      foreachInsertColumnsCheck.addElement(check);
    }
    foreachValues.addElement(foreachInsertColumnsCheck);

    foreachValues.addElement(new TextElement(")"));

    eles.add(foreachValues);

    return eles;
  }
}
