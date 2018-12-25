package com.paradm.mybatis.generators;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.util.StringUtility;

import com.paradm.mybatis.GenerateMethodComment;

public class DefaultCommentGenerator implements CommentGenerator {
  private Properties properties;

  private boolean suppressDate;
  private boolean suppressAllComments;
  private boolean addRemarkComments;
  private SimpleDateFormat dateFormat;
  private boolean addMethodFinal;
  private String authorName;
  private String companyName;
  
  public DefaultCommentGenerator() {
    super();
    properties = new Properties();
    suppressDate = false;
    suppressAllComments = false;
    addRemarkComments = false;
    addMethodFinal = true;
    authorName = "Spring.Zhang";
    companyName = "ParaDM Limited";
  }
  
  @Override
  public void addConfigurationProperties(Properties properties) {
    this.properties.putAll(properties);
    suppressDate = StringUtility.isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
    suppressAllComments = StringUtility.isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
    addRemarkComments = StringUtility.isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));

    addMethodFinal = StringUtility.isTrue(properties.getProperty("addMethodFinal"));
    String dateFormatString = properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_DATE_FORMAT);
    if (StringUtility.stringHasValue(dateFormatString)) {
      dateFormat = new SimpleDateFormat(dateFormatString);
    }
    String authorString = properties.getProperty("authorName");
    if (StringUtility.stringHasValue(authorString)) {
      authorName = authorString;
    }
    String companyString = properties.getProperty("companyName");
    if (StringUtility.stringHasValue(companyString)) {
      companyName = companyString;
    }
  }

  @Override
  public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    field.addJavaDocLine("/** ");
    // 添加字段注释
    StringBuffer sb = new StringBuffer();
    // 对应表中字段的备注(数据库中自己写的备注信息)
    if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
      sb.append(" * " + introspectedColumn.getRemarks());
      if (introspectedColumn.getDefaultValue() != null && !introspectedColumn.getDefaultValue().isEmpty()) {
        sb.append("  默认：" + introspectedColumn.getDefaultValue());
      }
    }
    if (sb.length() > 0) {
      field.addJavaDocLine(sb.toString());
    }
    field.addJavaDocLine(" */ ");
  }

  @Override
  public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
    StringBuilder sb = new StringBuilder();

    if ("distinct".equals(field.getName())) {
        sb.append(" * 过滤重复数据");
    } else if ("orderByClause".equals(field.getName())) {
        sb.append(" * 排序字段");
    } else if ("oredCriteria".equals(field.getName())) {
        sb.append(" * 查询条件");
    } else if ("serialVersionUID".equals(field.getName())) {
        sb.append(" * 串行版本ID");
    }
    if (sb.length() > 0) {
        field.addJavaDocLine("/** ");
        field.addJavaDocLine(sb.toString());
        field.addJavaDocLine("*/");
    }
  }

  @Override
  public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    // 添加类注释
    if (suppressAllComments || !addRemarkComments) {
        return;
    }
    topLevelClass.addJavaDocLine("/** ");

    String remarks = introspectedTable.getRemarks();
    // String remarks = introspectedTable.getRemarks();
    if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
        String[] remarkLines = remarks.split(System.getProperty("line.separator"));
        for (String remarkLine : remarkLines) {
            topLevelClass.addJavaDocLine(" * " + remarkLine + " " + introspectedTable.getFullyQualifiedTable());
        }
    }
    addJavadocTag(topLevelClass, false);

    topLevelClass.addJavaDocLine(" */");
    
    introspectedTable.getExampleType();
    
  }
  
  @Override
  public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
    // add no document level comments by default
    // 删除生成GeneratedCriteria对象的注释信息的注释
    if (suppressAllComments) {
      return;
    }
    StringBuilder sb = new StringBuilder();
    String shortName = innerClass.getType().getShortName();
    innerClass.addJavaDocLine("/**");
    sb.append(" * ").append(introspectedTable.getRemarks()).append(introspectedTable.getFullyQualifiedTable());
    if ("GeneratedCriteria".equals(shortName)) {
      sb.append("的基本动态SQL对象.");
    } else if ("Criterion".equals(shortName)) {
      sb.append("的动态SQL对象.");
    }

    innerClass.addJavaDocLine(sb.toString());
    innerClass.addJavaDocLine(" */");
  }

  @Override
  public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
    // add no document level comments by default
    // 生成Criteria对象的注释信息的注释
    StringBuilder sb = new StringBuilder();
    innerClass.addJavaDocLine("/**");
    sb.append(" * ").append(introspectedTable.getRemarks());
    sb.append(introspectedTable.getFullyQualifiedTable());
    sb.append("的映射实体");

    innerClass.addJavaDocLine(sb.toString());
    innerClass.addJavaDocLine(" */");
  }

  @Override
  public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
    if (suppressAllComments) {
      return;
    }

    StringBuilder sb = new StringBuilder();

    innerEnum.addJavaDocLine("/**");

    sb.append(" * This addEnumComment,中文注释自行修改、编译源码");
    sb.append(introspectedTable.getFullyQualifiedTable());
    innerEnum.addJavaDocLine(sb.toString());

    addJavadocTag(innerEnum, false);

    innerEnum.addJavaDocLine(" */");
  }

  @Override
  public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    if (suppressAllComments) {
      return;
    }
    method.setFinal(addMethodFinal);
    method.addJavaDocLine("/** ");

    StringBuilder sb = new StringBuilder();
    sb.append(" * 获取 ");
    if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
      sb.append(introspectedColumn.getRemarks()).append(" ");
    }
    sb.append(introspectedTable.getFullyQualifiedTable()).append('.').append(introspectedColumn.getActualColumnName());

    method.addJavaDocLine(sb.toString());

    sb.setLength(0);

    sb.append(" * @return ");
    if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
      sb.append(introspectedColumn.getRemarks());
    } else {
      sb.append(introspectedTable.getFullyQualifiedTable()).append('.').append(introspectedColumn.getActualColumnName());
    }
    method.addJavaDocLine(sb.toString());
    method.addJavaDocLine(" */");
  }

  @Override
  public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    if (suppressAllComments) {
      return;
    }

    method.setFinal(addMethodFinal);
    method.addJavaDocLine("/** ");

    StringBuilder sb = new StringBuilder();
    sb.append(" * 设置 ");
    if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
      sb.append(introspectedColumn.getRemarks()).append(" ");
    }
    sb.append(introspectedTable.getFullyQualifiedTable()).append('.').append(introspectedColumn.getActualColumnName());

    method.addJavaDocLine(sb.toString());

    // 参数
    Parameter parm = method.getParameters().get(0);
    sb.setLength(0);
    sb.append(" * @param ").append(parm.getName() + " ");
    if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
      sb.append(introspectedColumn.getRemarks());
    } else {
      sb.append(introspectedTable.getFullyQualifiedTable()).append('.').append(introspectedColumn.getActualColumnName());
    }
    method.addJavaDocLine(sb.toString());
    method.addJavaDocLine(" */");
  }

  @Override
  public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
    GenerateMethodComment.addGeneralMethodComment(method, addMethodFinal);
  }

  @Override
  public void addJavaFileComment(CompilationUnit compilationUnit) {
    // TODO Auto-generated method stub
  }

  @Override
  public void addComment(XmlElement xmlElement) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addRootComment(XmlElement rootElement) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
    // TODO Auto-generated method stub
    
  }
  
  protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
    StringBuilder sb = new StringBuilder();
    if (markAsDoNotDelete) {
      sb.append(" * do_not_delete_during_merge\n");
    }
    sb.append(" * @author " + authorName);
    sb.append("\n * @company " + companyName);
    String s = getDateString();
    if (s != null) {
      sb.append("\n * @creation date:");
      sb.append(s);
    }
    javaElement.addJavaDocLine(sb.toString());
  }
  
  protected String getDateString() {
    if (suppressDate) {
      return null;
    } else if (dateFormat != null) {
      return dateFormat.format(new Date());
    } else {
      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
  }
}
