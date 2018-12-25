package com.paradm.mybatis.generators;

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
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.util.StringUtility;

public class GenCommentGenerator implements CommentGenerator {

  @Override
  public void addConfigurationProperties(Properties properties) {
    // TODO Auto-generated method stub

  }

  @Override
  public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
      field.addJavaDocLine("//" + introspectedColumn.getRemarks());
    }
  }

  @Override
  public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
    // TODO Auto-generated method stub

  }

  @Override
  public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    // TODO Auto-generated method stub

  }

  @Override
  public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
    // TODO Auto-generated method stub

  }

  @Override
  public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
    // TODO Auto-generated method stub

  }

  @Override
  public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
    // TODO Auto-generated method stub

  }

  @Override
  public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    StringBuilder sb = new StringBuilder();
    method.addJavaDocLine("/**");
    if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
        sb.append(" * 获取");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" *");
    }
    sb.setLength(0);
    sb.append(" * @return ");
    sb.append(introspectedColumn.getActualColumnName());
    if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
        sb.append(" - ");
        sb.append(introspectedColumn.getRemarks());
    }
    method.addJavaDocLine(sb.toString());
    method.addJavaDocLine(" */");
  }

  @Override
  public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    StringBuilder sb = new StringBuilder();
    method.addJavaDocLine("/**");
    if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
        sb.append(" * 设置");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" *");
    }
    Parameter parm = method.getParameters().get(0);
    sb.setLength(0);
    sb.append(" * @param ");
    sb.append(parm.getName());
    if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
    }
    method.addJavaDocLine(sb.toString());
    method.addJavaDocLine(" */");

  }

  @Override
  public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
    // TODO Auto-generated method stub

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

}
