package com.paradm.mybatis.plugins;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.util.StringUtility;

import static com.paradm.mybatis.GenerateMethodComment.addGeneralMethodComment;

public class BaseMapperGeneratorPlugin extends PluginAdapter {
  private Set<String> mappers = new HashSet<String>();
  private boolean enableAnnotation = true;
  
  private FullyQualifiedJavaType E;
  private FullyQualifiedJavaType T;
  private FullyQualifiedJavaType TLIST;
  private FullyQualifiedJavaType PK;
  
  private FullyQualifiedJavaType interfaceType;
  
  @Override
  public void setProperties(Properties properties) {
    super.setProperties(properties);
    String mappers = this.properties.getProperty("mappers");
    if (StringUtility.stringHasValue(mappers)) {
      for (String mapper : mappers.split(",")) {
        this.mappers.add(mapper);
      }
    }

    if ("FALSE".equals(this.properties.getProperty("enableAnnotation"))) {
      this.enableAnnotation = StringUtility.isTrue(this.properties.getProperty("enableAnnotation"));
    } 
    
    String interfaceName = this.properties.getProperty("interfaceName");
    String interfacePack = this.properties.getProperty("interfacePack");
    if (interfaceName != null && interfacePack != null) {
      interfaceType = new FullyQualifiedJavaType(interfacePack + "." + interfaceName);

      E = new FullyQualifiedJavaType("E");
      T = new FullyQualifiedJavaType("T");
      TLIST = new FullyQualifiedJavaType("List<T>");
      PK = new FullyQualifiedJavaType("PK");
      
      this.mappers.add(interfacePack + "." + interfaceName);
    }
  }
  
  @Override
  public boolean validate(List<String> warnings) {
    return true;
  }

  @Override
  public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    if (this.mappers.size() > 0) {
      interfaze.getMethods().clear();
      interfaze.getAnnotations().clear();

      FullyQualifiedJavaType entityType = new FullyQualifiedJavaType(introspectedTable.getBaseRecordType());
      FullyQualifiedJavaType exampleType = new FullyQualifiedJavaType(introspectedTable.getExampleType());
      if (introspectedTable.getPrimaryKeyColumns() == null || introspectedTable.getPrimaryKeyColumns().size() == 0) {
        interfaze.addImportedType(new FullyQualifiedJavaType("This has not setup the primary key"));
      } else {
        interfaze.addImportedType(introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType());
      }
      interfaze.addImportedType(exampleType);
      interfaze.addImportedType(entityType);

      if(enableAnnotation) {
        FullyQualifiedJavaType serviceType = new FullyQualifiedJavaType("org.springframework.stereotype.Repository");
        interfaze.addImportedType(serviceType);
        interfaze.addAnnotation("@Repository");
      }

      for (String mapper : this.mappers) {
        interfaze.addImportedType(new FullyQualifiedJavaType(mapper));
        interfaze.addSuperInterface(new FullyQualifiedJavaType(
            mapper + "<" + entityType.getShortName() + "," + exampleType.getShortName() + "," + introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType().getShortName() + ">"));
      }
      
      addClassComment(interfaze);
    }else {
      super.clientGenerated(interfaze, topLevelClass, introspectedTable);
    }
    return true;
  }
  
  @Override
  public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
    List<GeneratedJavaFile> files = new ArrayList<GeneratedJavaFile>();
    Interface baseMapper = new Interface(interfaceType);
    baseMapper.setVisibility(JavaVisibility.PUBLIC);

    // import used class
    baseMapper.addImportedType(new FullyQualifiedJavaType("java.io.Serializable"));
    baseMapper.addImportedType(new FullyQualifiedJavaType("java.util.List"));
    baseMapper.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Param"));

    // add generic support
    interfaceType.addTypeArgument(new FullyQualifiedJavaType("T, E, PK extends Serializable"));

    // add method and the comment
    Method method = countByExample(introspectedTable);
    baseMapper.addMethod(method);

    method = deleteByExample(introspectedTable);
    baseMapper.addMethod(method);

    method = deleteByPrimaryKey(introspectedTable);
    baseMapper.addMethod(method);

    method = insert(introspectedTable);
    baseMapper.addMethod(method);

    method = insertSelective(introspectedTable);
    baseMapper.addMethod(method);

    method = insertBatch(introspectedTable);
    baseMapper.addMethod(method);

    method = insertBatchSelective(introspectedTable);
    baseMapper.addMethod(method);

    method = selectByExampleWithBLOBs(introspectedTable);
    baseMapper.addMethod(method);
    
    method = selectByExampleWithoutBLOBs(introspectedTable);
    baseMapper.addMethod(method);

    method = selectByExample(introspectedTable);
    baseMapper.addMethod(method);

    method = selectByPrimaryKey(introspectedTable);
    baseMapper.addMethod(method);

    method = updateByPrimaryKeySelective(introspectedTable);
    baseMapper.addMethod(method);

    method = updateByPrimaryKeyWithBLOBs(introspectedTable);
    baseMapper.addMethod(method);
    
    method = updateByPrimaryKeyWithoutBLOBs(introspectedTable);
    baseMapper.addMethod(method);

    method = updateByPrimaryKey(introspectedTable);
    baseMapper.addMethod(method);

    method = updateByExample(introspectedTable);
    baseMapper.addMethod(method);

    method = updateByExampleSelective(introspectedTable);
    baseMapper.addMethod(method);

    method = updateByExampleWithBLOBs(introspectedTable);
    baseMapper.addMethod(method);
    
    method = updateByExampleWithoutBLOBs(introspectedTable);
    baseMapper.addMethod(method);

    method = updateBatchByPrimaryKey(introspectedTable);
    baseMapper.addMethod(method);

    method = updateBatchByPrimaryKeySelective(introspectedTable);
    baseMapper.addMethod(method);

    method = updateBatchByExampleSelective(introspectedTable);
    baseMapper.addMethod(method);

    method = updateBatchByExample(introspectedTable);
    baseMapper.addMethod(method);

    addClassComment(baseMapper);

    String project = context.getJavaClientGeneratorConfiguration().getTargetProject();
    GeneratedJavaFile file = new GeneratedJavaFile(baseMapper, project, context.getJavaFormatter());
    files.add(file);
    return files;
  }

  /**
   * add Example Class Comment
   */
  public void addClassComment(JavaElement javaElement) {
    javaElement.addJavaDocLine("/**");
    javaElement.addJavaDocLine(" * 通用IMapper<T, E, PK>");
    javaElement.addJavaDocLine(" * T:实体类");
    javaElement.addJavaDocLine(" * E:Example");
    javaElement.addJavaDocLine(" * PK:主键的变量类型");
    javaElement.addJavaDocLine(" *");
    javaElement.addJavaDocLine(" * @author spring");
    javaElement.addJavaDocLine(" *         github: https://github.com/zlc_tb");
    javaElement.addJavaDocLine(" *         date: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    javaElement.addJavaDocLine(" */");
  }

  /**
   * add method countByExample
   */
  protected Method countByExample(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("countByExample");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(E, "example"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method deleteByExample
   */
  protected Method deleteByExample(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("deleteByExample");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(E, "example"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method deleteByPrimaryKey
   */
  protected Method deleteByPrimaryKey(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("deleteByPrimaryKey");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(PK, "pk"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method insert
   */
  protected Method insert(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("insert");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(T, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method insertSelective
   */
  protected Method insertSelective(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("insertSelective");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(T, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method insertBatch
   */
  protected Method insertBatch(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("insertBatch");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(TLIST, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method insertBatchSelective
   */
  protected Method insertBatchSelective(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("insertBatchSelective");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(TLIST, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method selectByExampleWithBLOBs
   */
  protected Method selectByExampleWithBLOBs(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("selectByExampleWithBLOBs");
    method.setReturnType(new FullyQualifiedJavaType("List<T>"));
    method.addParameter(new Parameter(E, "example"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }
  
  /**
   * add method selectByExampleWithoutBLOBs
   */
  protected Method selectByExampleWithoutBLOBs(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("selectByExampleWithoutBLOBs");
    method.setReturnType(new FullyQualifiedJavaType("List<T>"));
    method.addParameter(new Parameter(E, "example"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method selectByExample
   */
  protected Method selectByExample(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("selectByExample");
    method.setReturnType(new FullyQualifiedJavaType("List<T>"));
    method.addParameter(new Parameter(E, "example"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method selectByPrimaryKey
   */
  protected Method selectByPrimaryKey(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("selectByPrimaryKey");
    method.setReturnType(new FullyQualifiedJavaType("T"));
    method.addParameter(new Parameter(PK, "pk"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateByPrimaryKeySelective
   */
  protected Method updateByPrimaryKeySelective(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateByPrimaryKeySelective");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(T, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateByPrimaryKeyWithBLOBs
   */
  protected Method updateByPrimaryKeyWithBLOBs(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateByPrimaryKeyWithBLOBs");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(T, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }
  
  /**
   * add method updateByPrimaryKeyWithoutBLOBs
   */
  protected Method updateByPrimaryKeyWithoutBLOBs(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateByPrimaryKeyWithoutBLOBs");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(T, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateByPrimaryKey
   */
  protected Method updateByPrimaryKey(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateByPrimaryKey");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(T, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateByExample
   */
  protected Method updateByExample(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateByExample");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.setVisibility(JavaVisibility.PUBLIC);

    Parameter record = new Parameter(T, "record");
    record.addAnnotation("@Param(\"record\")");
    method.addParameter(record);
    Parameter example = new Parameter(E, "example");
    example.addAnnotation("@Param(\"example\")");
    method.addParameter(example);

    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateByExampleSelective
   */
  protected Method updateByExampleSelective(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateByExampleSelective");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.setVisibility(JavaVisibility.PUBLIC);

    Parameter record = new Parameter(T, "record");
    record.addAnnotation("@Param(\"record\")");
    method.addParameter(record);
    Parameter example = new Parameter(E, "example");
    example.addAnnotation("@Param(\"example\")");
    method.addParameter(example);

    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateByExampleWithBLOBs
   */
  protected Method updateByExampleWithBLOBs(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateByExampleWithBLOBs");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.setVisibility(JavaVisibility.PUBLIC);
    
    Parameter record = new Parameter(T, "record");
    record.addAnnotation("@Param(\"record\")");
    method.addParameter(record);
    Parameter example = new Parameter(E, "example");
    example.addAnnotation("@Param(\"example\")");
    method.addParameter(example);
    
    addGeneralMethodComment(method);
    return method;
  }
  
  /**
   * add method updateByExampleWithoutBLOBs
   */
  protected Method updateByExampleWithoutBLOBs(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateByExampleWithoutBLOBs");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.setVisibility(JavaVisibility.PUBLIC);

    Parameter record = new Parameter(T, "record");
    record.addAnnotation("@Param(\"record\")");
    method.addParameter(record);
    Parameter example = new Parameter(E, "example");
    example.addAnnotation("@Param(\"example\")");
    method.addParameter(example);

    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateBatchByPrimaryKey
   */
  protected Method updateBatchByPrimaryKey(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateBatchByPrimaryKey");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(TLIST, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateBatchByPrimaryKeySelective
   */
  protected Method updateBatchByPrimaryKeySelective(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateBatchByPrimaryKeySelective");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.addParameter(new Parameter(TLIST, "record"));
    method.setVisibility(JavaVisibility.PUBLIC);
    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateBatchByExampleSelective
   */
  protected Method updateBatchByExampleSelective(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateBatchByExampleSelective");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.setVisibility(JavaVisibility.PUBLIC);

    Parameter record = new Parameter(TLIST, "record");
    record.addAnnotation("@Param(\"recordList\")");
    method.addParameter(record);
    Parameter example = new Parameter(E, "example");
    example.addAnnotation("@Param(\"example\")");
    method.addParameter(example);

    addGeneralMethodComment(method);
    return method;
  }

  /**
   * add method updateBatchByExample
   */
  protected Method updateBatchByExample(IntrospectedTable introspectedTable) {
    Method method = new Method();
    method.setName("updateBatchByExample");
    method.setReturnType(FullyQualifiedJavaType.getIntInstance());
    method.setVisibility(JavaVisibility.PUBLIC);

    Parameter record = new Parameter(TLIST, "record");
    record.addAnnotation("@Param(\"recordList\")");
    method.addParameter(record);
    Parameter example = new Parameter(E, "example");
    example.addAnnotation("@Param(\"example\")");
    method.addParameter(example);

    addGeneralMethodComment(method);
    return method;
  }
  
}
