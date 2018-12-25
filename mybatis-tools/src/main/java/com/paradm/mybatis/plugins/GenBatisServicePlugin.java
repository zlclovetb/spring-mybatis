package com.paradm.mybatis.plugins;

import static com.paradm.mybatis.GenerateMethodComment.*;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.util.StringUtility;

public class GenBatisServicePlugin extends PluginAdapter {
  private FullyQualifiedJavaType slf4jLogger;
  private FullyQualifiedJavaType slf4jLoggerFactory;
  private FullyQualifiedJavaType serviceType;
  private FullyQualifiedJavaType daoType;
  private FullyQualifiedJavaType interfaceType;
  private FullyQualifiedJavaType pojoType;
  private FullyQualifiedJavaType pojoCriteriaType;
  private FullyQualifiedJavaType listType;
  private FullyQualifiedJavaType autowired;
  private FullyQualifiedJavaType service;
  private FullyQualifiedJavaType returnType;
  private String servicePack;
  private String serviceImplPack;
  private String project;
  private String pojoUrl;

  private boolean enableAnnotation = true;
  private boolean enableInsertBatchSelective = false;
  private boolean enableInsertSelective = false;
  private boolean enableOperatorBLOBs = false;
  private boolean enableUpdateByExampleSelective = false;
  private boolean enableUpdateBatchByPrimaryKeySelective = false;
  private boolean enableUpdateByPrimaryKeySelective = false;

  public GenBatisServicePlugin() {
    super();
    slf4jLogger = new FullyQualifiedJavaType("org.slf4j.Logger");
    slf4jLoggerFactory = new FullyQualifiedJavaType("org.slf4j.LoggerFactory");
  }

  @Override
  public boolean validate(List<String> warnings) {
    if (StringUtility.stringHasValue(properties.getProperty("enableAnnotation"))) {
      enableAnnotation = StringUtility.isTrue(properties.getProperty("enableAnnotation"));
    }

    String enableInsertBatchSelective = properties.getProperty("enableInsertBatchSelective");

    String enableUpdateByExampleSelective = properties.getProperty("enableUpdateByExampleSelective");

    String enableInsertSelective = properties.getProperty("enableInsertSelective");

    String enableUpdateBatchByPrimaryKeySelective = properties.getProperty("enableUpdateBatchByPrimaryKeySelective");

    String enableOperatorBLOBs = properties.getProperty("enableOperatorBLOBs");

    String enableUpdateByPrimaryKeySelective = properties.getProperty("enableUpdateByPrimaryKeySelective");

    if (StringUtility.stringHasValue(enableInsertBatchSelective)) {
      this.enableInsertBatchSelective = StringUtility.isTrue(enableInsertBatchSelective);
    }
    if (StringUtility.stringHasValue(enableUpdateByExampleSelective)) {
      this.enableUpdateByExampleSelective = StringUtility.isTrue(enableUpdateByExampleSelective);
    }
    if (StringUtility.stringHasValue(enableInsertSelective)) {
      this.enableInsertSelective = StringUtility.isTrue(enableInsertSelective);
    }
    if (StringUtility.stringHasValue(enableUpdateBatchByPrimaryKeySelective)) {
      this.enableUpdateBatchByPrimaryKeySelective = StringUtility.isTrue(enableUpdateBatchByPrimaryKeySelective);
    }
    if (StringUtility.stringHasValue(enableOperatorBLOBs)) {
      this.enableOperatorBLOBs = StringUtility.isTrue(enableOperatorBLOBs);
    }
    if (StringUtility.stringHasValue(enableUpdateByPrimaryKeySelective)) {
      this.enableUpdateByPrimaryKeySelective = StringUtility.isTrue(enableUpdateByPrimaryKeySelective);
    }

    servicePack = properties.getProperty("targetPackage");
    serviceImplPack = properties.getProperty("implementationPackage");
    project = properties.getProperty("targetProject");

    pojoUrl = context.getJavaModelGeneratorConfiguration().getTargetPackage();

    if (enableAnnotation) {
      autowired = new FullyQualifiedJavaType("org.springframework.beans.factory.annotation.Autowired");
      service = new FullyQualifiedJavaType("org.springframework.stereotype.Service");
    }
    return true;
  }

  @Override
  public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
    List<GeneratedJavaFile> files = new ArrayList<GeneratedJavaFile>();
    String table = introspectedTable.getBaseRecordType();
    String example = introspectedTable.getExampleType();
    
    String tableName = table.replaceAll(this.pojoUrl + ".", "");
    String exampleName = example.replaceAll(this.pojoUrl + ".", "");
    
    interfaceType = new FullyQualifiedJavaType(servicePack + "." + tableName + "Service");

    // mybatis
    daoType = new FullyQualifiedJavaType(introspectedTable.getMyBatis3JavaMapperType());

    // logger.info(toLowerCase(daoType.getShortName()));
    serviceType = new FullyQualifiedJavaType(serviceImplPack + "." + tableName + "ServiceImpl");

    pojoType = new FullyQualifiedJavaType(pojoUrl + "." + tableName);

    pojoCriteriaType = new FullyQualifiedJavaType(pojoUrl + "." + exampleName);
    
    listType = new FullyQualifiedJavaType("java.util.List");
    Interface interface1 = new Interface(interfaceType);
    TopLevelClass topLevelClass = new TopLevelClass(serviceType);
    // import used class
    addImport(interface1, topLevelClass);

    // interface
    addService(interface1, introspectedTable, tableName, files);
    // implementation
    addServiceImpl(topLevelClass, introspectedTable, tableName, files);
    addLogger(topLevelClass);

    return files;
  }

  /**
   * add service interface
   *
   * @param tableName
   * @param files
   */
  protected void addService(Interface interface1, IntrospectedTable introspectedTable, String tableName, List<GeneratedJavaFile> files) {

    interface1.setVisibility(JavaVisibility.PUBLIC);

    Method method = countByExample(introspectedTable, tableName);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);
    
    method = getOtherInteger("deleteByExample", introspectedTable, tableName, 3);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);
    
    method = getOtherInteger("deleteByPrimaryKey", introspectedTable, tableName, 2);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);
    
    method = getOtherInsertboolean("insert", introspectedTable, tableName);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);
    
    if (enableInsertSelective) {
      method = getOtherInsertboolean("insertSelective", introspectedTable, tableName);
      method.getBodyLines().clear();
      interface1.addMethod(method);
      addGeneralMethodComment(method);
    }
    
    method = getBatchInsertboolean("insertBatch", introspectedTable, tableName);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);
    
    if (enableInsertBatchSelective) {
      method = getBatchInsertboolean("insertBatchSelective", introspectedTable, tableName);
      method.getBodyLines().clear();
      interface1.addMethod(method);
      addGeneralMethodComment(method);
    }
    
    method = selectByExample(introspectedTable, tableName);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);
    
    method = selectByPrimaryKey(introspectedTable, tableName);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);

    if (enableUpdateByPrimaryKeySelective) {
      method = getOtherInteger("updateByPrimaryKeySelective", introspectedTable, tableName, 1);
      method.getBodyLines().clear();
      interface1.addMethod(method);
      addGeneralMethodComment(method);
    } 
    
    method = getOtherInteger("updateByPrimaryKey", introspectedTable, tableName, 1);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);
    
    if (enableUpdateByExampleSelective) {
      method = getOtherInteger("updateByExampleSelective", introspectedTable, tableName, 4);
      method.getBodyLines().clear();
      interface1.addMethod(method);
      addGeneralMethodComment(method);
    }

    method = getOtherInteger("updateByExample", introspectedTable, tableName, 4);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);

    if (enableOperatorBLOBs) {
      method = getOtherInteger("updateByPrimaryKeyWithBLOBs", introspectedTable, tableName, 1);
      method.getBodyLines().clear();
      interface1.addMethod(method);
      addGeneralMethodComment(method);

      method = selectByExampleWithBLOBs(introspectedTable, tableName);
      method.getBodyLines().clear();
      interface1.addMethod(method);
      addGeneralMethodComment(method);
    }

    if (enableUpdateBatchByPrimaryKeySelective) {
      method = getOtherInteger("updateBatchByPrimaryKeySelective", introspectedTable, tableName, 5);
      method.getBodyLines().clear();
      interface1.addMethod(method);
      addGeneralMethodComment(method);
    }

    method = getOtherInteger("updateBatchByPrimaryKey", introspectedTable, tableName, 5);
    method.getBodyLines().clear();
    interface1.addMethod(method);
    addGeneralMethodComment(method);

    GeneratedJavaFile file = new GeneratedJavaFile(interface1, project, context.getJavaFormatter());
    files.add(file);
  }

  /**
   * add service impl
   *
   * @param introspectedTable
   * @param tableName
   * @param files
   */
  protected void addServiceImpl(TopLevelClass topLevelClass, IntrospectedTable introspectedTable, String tableName, List<GeneratedJavaFile> files) {
    topLevelClass.setVisibility(JavaVisibility.PUBLIC);
    topLevelClass.addSuperInterface(interfaceType);

    if (enableAnnotation) {
      topLevelClass.addAnnotation("@Service");
      topLevelClass.addImportedType(service);
    }
    addField(topLevelClass, tableName);
    Method method = countByExample(introspectedTable, tableName);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);
    
    method = selectByPrimaryKey(introspectedTable, tableName);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);
    
    method = selectByExample(introspectedTable, tableName);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);

    /**
     * type: pojo 1 ;key 2 ;example 3 ;pojo+example 4
     */

    method = getOtherInteger("deleteByExample", introspectedTable, tableName, 3);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);
    
    method = getOtherInteger("deleteByPrimaryKey", introspectedTable, tableName, 2);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);
    
    method = getOtherInsertboolean("insert", introspectedTable, tableName);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);
    
    if (enableInsertSelective) {
      method = getOtherInsertboolean("insertSelective", introspectedTable, tableName);
      addGeneralImplMethodComment(method, interfaceType);
      method.addAnnotation("@Override");
      topLevelClass.addMethod(method);
    }
    method = getBatchInsertboolean("insertBatch", introspectedTable, tableName);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);
    
    if (enableInsertBatchSelective) {
      method = getBatchInsertboolean("insertBatchSelective", introspectedTable, tableName);
      addGeneralImplMethodComment(method, interfaceType);
      method.addAnnotation("@Override");
      topLevelClass.addMethod(method);
    }

    if (enableUpdateByPrimaryKeySelective) {
      method = getOtherInteger("updateByPrimaryKeySelective", introspectedTable, tableName, 1);
      addGeneralImplMethodComment(method, interfaceType);
      method.addAnnotation("@Override");
      topLevelClass.addMethod(method);
    }
    
    method = getOtherInteger("updateByPrimaryKey", introspectedTable, tableName, 1);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);

    if (enableUpdateByExampleSelective) {
      method = getOtherInteger("updateByExampleSelective", introspectedTable, tableName, 4);
      addGeneralImplMethodComment(method, interfaceType);
      method.addAnnotation("@Override");
      topLevelClass.addMethod(method);
    }

    method = getOtherInteger("updateByExample", introspectedTable, tableName, 4);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);

    if (enableOperatorBLOBs) {
      method = getOtherInteger("updateByPrimaryKeyWithBLOBs", introspectedTable, tableName, 1);
      addGeneralImplMethodComment(method, interfaceType);
      method.addAnnotation("@Override");
      topLevelClass.addMethod(method);
      
      method = selectByExampleWithBLOBs(introspectedTable, tableName);
      addGeneralImplMethodComment(method, interfaceType);
      method.addAnnotation("@Override");
      topLevelClass.addMethod(method);
    }

    if (enableUpdateBatchByPrimaryKeySelective) {
      method = getOtherInteger("updateBatchByPrimaryKeySelective", introspectedTable, tableName, 5);
      addGeneralImplMethodComment(method, interfaceType);
      method.addAnnotation("@Override");
      topLevelClass.addMethod(method);
    }

    method = getOtherInteger("updateBatchByPrimaryKey", introspectedTable, tableName, 5);
    addGeneralImplMethodComment(method, interfaceType);
    method.addAnnotation("@Override");
    topLevelClass.addMethod(method);

    // generate java file
    GeneratedJavaFile file = new GeneratedJavaFile(topLevelClass, project, context.getJavaFormatter());
    files.add(file);
  }

  /**
   * add field
   *
   * @param topLevelClass
   */
  protected void addField(TopLevelClass topLevelClass, String tableName) {
    // add dao
    Field field = new Field();
    field.setName(toLowerCase(daoType.getShortName())); // set name
    topLevelClass.addImportedType(daoType);
    field.setType(daoType); // set type
    field.setVisibility(JavaVisibility.PRIVATE);
    if (enableAnnotation) {
      field.addAnnotation("@Autowired");
    }
    topLevelClass.addField(field);
  }

  /**
   * add selectByPrimaryKey
   */
  protected Method selectByPrimaryKey(IntrospectedTable introspectedTable, String tableName) {
    Method method = new Method();
    method.setName("selectByPrimaryKey");
    method.setReturnType(pojoType);
    if (introspectedTable.getRules().generatePrimaryKeyClass()) {
      FullyQualifiedJavaType type = new FullyQualifiedJavaType(introspectedTable.getPrimaryKeyType());
      method.addParameter(new Parameter(type, "key"));
    } else {
      for (IntrospectedColumn introspectedColumn : introspectedTable.getPrimaryKeyColumns()) {
        FullyQualifiedJavaType type = introspectedColumn.getFullyQualifiedJavaType();
        method.addParameter(new Parameter(type, introspectedColumn.getJavaProperty()));
      }
    }
    method.setVisibility(JavaVisibility.PUBLIC);
    StringBuilder sb = new StringBuilder();
    // method.addBodyLine("try {");
    sb.append("return this.");
    sb.append(getDaoShort());
    sb.append("selectByPrimaryKey");
    sb.append("(");
    for (IntrospectedColumn introspectedColumn : introspectedTable.getPrimaryKeyColumns()) {
      sb.append(introspectedColumn.getJavaProperty());
      sb.append(",");
    }
    sb.setLength(sb.length() - 1);
    sb.append(");");
    method.addBodyLine(sb.toString());
    // method.addBodyLine("} catch (Exception e) {");
    // method.addBodyLine("logger.error(\"Exception: \", e);");
    // method.addBodyLine("return null;");
    // method.addBodyLine("}");
    
    return method;
  }

  /**
   * add countByExample
   */
  protected Method countByExample(IntrospectedTable introspectedTable, String tableName) {
    Method method = new Method();
    method.setName("countByExample");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(pojoCriteriaType, "example"));
    method.setVisibility(JavaVisibility.PUBLIC);
    StringBuilder sb = new StringBuilder();
    sb.append("int count = this.");
    sb.append(getDaoShort());
    sb.append("countByExample");
    sb.append("(");
    sb.append("example");
    sb.append(");");
    method.addBodyLine(sb.toString());
    method.addBodyLine("logger.debug(\"count: {}\", count);");
    method.addBodyLine("return count;");
    
    
    return method;
  }

  /**
   * add selectByExample
   */
  protected Method selectByExample(IntrospectedTable introspectedTable, String tableName) {
    Method method = new Method();
    method.setName("selectByExample");
    method.setReturnType(new FullyQualifiedJavaType("List<" + tableName + ">"));
    method.addParameter(new Parameter(pojoCriteriaType, "example"));
    method.setVisibility(JavaVisibility.PUBLIC);
    StringBuilder sb = new StringBuilder();
    sb.append("return this.");
    sb.append(getDaoShort());
    if (introspectedTable.hasBLOBColumns()) {
      sb.append("selectByExampleWithoutBLOBs");
    } else {
      sb.append("selectByExample");
    }
    sb.append("(");
    sb.append("example");
    sb.append(");");
    method.addBodyLine(sb.toString());
    
    
    return method;
  }
  
  protected Method selectByExampleWithBLOBs(IntrospectedTable introspectedTable, String tableName) {
    Method method = new Method();
    method.setName("selectByExampleWithBLOBs");
    method.setReturnType(new FullyQualifiedJavaType("List<" + tableName + ">"));
    method.addParameter(new Parameter(pojoCriteriaType, "example"));
    method.setVisibility(JavaVisibility.PUBLIC);
    StringBuilder sb = new StringBuilder();
    sb.append("return this.");
    sb.append(getDaoShort());
    sb.append("selectByExampleWithBLOBs");
    sb.append("(");
    sb.append("example");
    sb.append(");");
    method.addBodyLine(sb.toString());
    
    
    return method;
  }

  /**
   * add getOtherInteger
   */
  protected Method getOtherInteger(String methodName, IntrospectedTable introspectedTable, String tableName, int type) {
    Method method = new Method();
    method.setName(methodName);
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    String params = addParams(introspectedTable, method, type);
    method.setVisibility(JavaVisibility.PUBLIC);
    StringBuilder sb = new StringBuilder();
    // method.addBodyLine("try {");
    sb.append("return this.");
    sb.append(getDaoShort());
    if (methodName.indexOf("WithBLOBs") < 0 && introspectedTable.hasBLOBColumns() && (!"updateBatchByPrimaryKeySelective".equals(methodName)) && (!"updateBatchByPrimaryKey".equals(methodName))
        && (!"updateByPrimaryKeySelective".equals(methodName) && !"deleteByPrimaryKey".equals(methodName) && !"deleteByExample".equals(methodName) && !"updateByExampleSelective".equals(methodName))) {
        sb.append(methodName + "WithoutBLOBs");
    } else {
      sb.append(methodName);
    }
    sb.append("(");
    sb.append(params);
    sb.append(");");
    method.addBodyLine(sb.toString());
    
    
    return method;
  }

  /**
   * getOtherInsertboolean
   */
  protected Method getOtherInsertboolean(String methodName, IntrospectedTable introspectedTable, String tableName) {
    Method method = new Method();
    method.setName(methodName);
    method.setReturnType(returnType);
    method.addParameter(new Parameter(pojoType, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    StringBuilder sb = new StringBuilder();
    if (returnType == null) {
      sb.append("this.");
    } else {
      sb.append("return this.");
    }
    sb.append(getDaoShort());
    sb.append(methodName);
    sb.append("(");
    sb.append("record");
    sb.append(");");
    method.addBodyLine(sb.toString());
    
    
    return method;
  }
  
  protected Method getBatchInsertboolean(String methodName, IntrospectedTable introspectedTable, String tableName) {
    Method method = new Method();
    method.setName(methodName);
    method.setReturnType(returnType);
    method.addParameter(new Parameter(new FullyQualifiedJavaType("List<" + tableName + ">"), "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    StringBuilder sb = new StringBuilder();
    if (returnType == null) {
      sb.append("this.");
    } else {
      sb.append("return this.");
    }
    sb.append(getDaoShort());
    sb.append(methodName);
    sb.append("(");
    sb.append("record");
    sb.append(");");
    method.addBodyLine(sb.toString());
    
    return method;
  }

  /**
   * type : pojo 1 key 2 example 3 pojo+example 4
   */
  protected String addParams(IntrospectedTable introspectedTable, Method method, int type1) {
    switch (type1) {
      case 1:
        method.addParameter(new Parameter(pojoType, "record"));
        return "record";
      case 2:
        if (introspectedTable.getRules().generatePrimaryKeyClass()) {
          FullyQualifiedJavaType type = new FullyQualifiedJavaType(introspectedTable.getPrimaryKeyType());
          method.addParameter(new Parameter(type, "key"));
        } else {
          for (IntrospectedColumn introspectedColumn : introspectedTable.getPrimaryKeyColumns()) {
            FullyQualifiedJavaType type = introspectedColumn.getFullyQualifiedJavaType();
            method.addParameter(new Parameter(type, introspectedColumn.getJavaProperty()));
          }
        }
        StringBuffer sb = new StringBuffer();
        for (IntrospectedColumn introspectedColumn : introspectedTable.getPrimaryKeyColumns()) {
          sb.append(introspectedColumn.getJavaProperty());
          sb.append(",");
        }
        if(sb.length() > 0) {
          sb.setLength(sb.length() - 1);
        }
        return sb.toString();
      case 3:
        method.addParameter(new Parameter(pojoCriteriaType, "example"));
        return "example";
      case 4:

        method.addParameter(0, new Parameter(pojoType, "record"));
        method.addParameter(1, new Parameter(pojoCriteriaType, "example"));
        return "record, example";
      case 5:
        method.addParameter(new Parameter(new FullyQualifiedJavaType("List<" + introspectedTable.getBaseRecordType() + ">"), "records"));
        return "records";
      default:
        break;
    }
    return null;
  }

  protected void addComment(JavaElement field, String comment) {
    StringBuilder sb = new StringBuilder();
    field.addJavaDocLine("/**");
    sb.append(" * ");
    comment = comment.replaceAll("\n", "<br>\n\t * ");
    sb.append(comment);
    field.addJavaDocLine(sb.toString());
    field.addJavaDocLine(" */");
  }

  /**
   * add field
   *
   * @param topLevelClass
   */
  protected void addField(TopLevelClass topLevelClass) {
    // add success
    Field field = new Field();
    field.setName("success"); // set name
    field.setType(FullyQualifiedJavaType.getBooleanPrimitiveInstance()); // set type
    field.setVisibility(JavaVisibility.PRIVATE);
    addComment(field, "执行结果");
    topLevelClass.addField(field);
    // set result
    field = new Field();
    field.setName("message"); // set name
    field.setType(FullyQualifiedJavaType.getStringInstance()); // set type
    field.setVisibility(JavaVisibility.PRIVATE);
    addComment(field, "消息结果");
    topLevelClass.addField(field);
  }

  /**
   *
   * @param tableName
   * @return
   */
  protected String toLowerCase(String tableName) {
    StringBuilder sb = new StringBuilder(tableName);
    sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
    return sb.toString();
  }

  /**
   *
   * @param tableName
   * @return
   */
  protected String toUpperCase(String tableName) {
    StringBuilder sb = new StringBuilder(tableName);
    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
    return sb.toString();
  }

  /**
   * import class
   */
  private void addImport(Interface interfaces, TopLevelClass topLevelClass) {
    interfaces.addImportedType(pojoType);
    interfaces.addImportedType(pojoCriteriaType);
    interfaces.addImportedType(listType);
    topLevelClass.addImportedType(daoType);
    topLevelClass.addImportedType(interfaceType);
    topLevelClass.addImportedType(pojoType);
    topLevelClass.addImportedType(pojoCriteriaType);
    topLevelClass.addImportedType(listType);
    topLevelClass.addImportedType(slf4jLogger);
    topLevelClass.addImportedType(slf4jLoggerFactory);
    if (enableAnnotation) {
      topLevelClass.addImportedType(service);
      topLevelClass.addImportedType(autowired);
    }
  }

  /**
   * import logger
   */
  private void addLogger(TopLevelClass topLevelClass) {
    Field field = new Field();
    field.setFinal(true);
    field.setInitializationString("LoggerFactory.getLogger(" + topLevelClass.getType().getShortName() + ".class)"); // set value
    field.setName("logger"); // set name
    field.setStatic(true);
    field.setType(new FullyQualifiedJavaType("Logger")); // set type
    field.setVisibility(JavaVisibility.PRIVATE);
    topLevelClass.addField(field);
  }

  private String getDaoShort() {
    return toLowerCase(daoType.getShortName()) + ".";
  }

  public boolean clientInsertMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
    returnType = method.getReturnType();
    return true;
  }
  
}
