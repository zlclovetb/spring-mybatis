package com.paradm.mybatis;

import java.util.List;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;

public class GenerateMethodComment {
  public static void addGeneralImplMethodComment(Method method, FullyQualifiedJavaType interfaceType) {
    method.addJavaDocLine("/* (non-Javadoc) ");
    StringBuffer stringBuffer = new StringBuffer(" * @see ");
    stringBuffer.append(interfaceType.getPackageName());
    stringBuffer.append(".");
    stringBuffer.append(interfaceType.getShortName());
    stringBuffer.append("#");
    stringBuffer.append(method.getName());
    stringBuffer.append("(");
    List<Parameter> typeParameters = method.getParameters();
    for (int i = 0; i < typeParameters.size(); i++) {
      Parameter parameterType = typeParameters.get(i);
      stringBuffer.append(parameterType.getType().getPackageName());
      stringBuffer.append(".");
      stringBuffer.append(parameterType.getType().getShortName());
    }
    stringBuffer.append(")");
    method.addJavaDocLine(stringBuffer.toString());
    method.addJavaDocLine(" */ ");
  }
  
  public static void addGeneralMethodComment(Method method) {
    addGeneralMethodComment(method, false);
  }
  
  public static void addGeneralMethodComment(Method method, boolean addMethodFinal) {
    StringBuilder sb = new StringBuilder();

    sb.append(" *");
    if (method.isConstructor()) {
      sb.append(" 构造查询条件");
    }else {
      // 构造函数不需要Final
      method.setFinal(addMethodFinal);
    }

    String methodName = method.getName();
    if ("toString".equals(methodName) || "hashCode".equals(methodName) || "equals".equals(methodName)) {
      return;
    } else if ("setOrderByClause".equals(methodName)) {
      sb.append(" 设置排序字段");
    } else if ("setDistinct".equals(methodName)) {
      sb.append(" 设置过滤重复数据");
    } else if ("getOredCriteria".equals(methodName)) {
      sb.append(" 获取当前的查询条件实例");
    } else if ("isDistinct".equals(methodName)) {
      sb.append(" 是否过滤重复数据");
    } else if ("getOrderByClause".equals(methodName)) {
      sb.append(" 获取排序字段");
    } else if ("createCriteria".equals(methodName)) {
      sb.append(" 创建一个查询条件");
    } else if ("createCriteriaInternal".equals(methodName)) {
      sb.append(" 内部构建查询条件对象");
    } else if ("clear".equals(methodName)) {
      sb.append(" 清除查询条件");
    } else if ("countByExample".equals(methodName)) {
      sb.append(" 查询数量");
    } else if ("deleteByExample".equals(methodName)) {
      sb.append(" 根据条件删除");
    } else if ("deleteByPrimaryKey".equals(methodName)) {
      sb.append(" 根据ID删除");
    } else if ("insert".equals(methodName)) {
      sb.append(" 添加对象所有字段");
    } else if ("insertSelective".equals(methodName)) {
      sb.append(" 添加对象对应字段");
    } else if ("insertBatch".equals(methodName)) {
      sb.append(" 添加List集合对象所有字段");
    } else if ("insertBatchSelective".equals(methodName)) {
      sb.append(" 添加List集合对象对应字段");
    } else if ("selectByExample".equals(methodName)) {
      sb.append(" 根据条件查询（二进制大对象）");
    } else if ("selectByPrimaryKey".equals(methodName)) {
      sb.append(" 根据ID查询");
    } else if ("updateByExampleSelective".equals(methodName)) {
      sb.append(" 根据条件修改对应字段");
    } else if ("updateByExample".equals(methodName)) {
      sb.append(" 根据条件修改所有字段");
    } else if ("updateByPrimaryKeySelective".equals(methodName)) {
      sb.append(" 根据ID修改对应字段");
    } else if ("updateByPrimaryKey".equals(methodName)) {
      sb.append(" 根据ID修改所有字段(必须含ID）");
    } else if ("updateByPrimaryKeyWithBLOBs".equals(methodName)) {
      sb.append(" 根据ID修改字段（包含二进制大对象）");
    } else if ("updateByExampleWithBLOBs".equals(methodName)) {
      sb.append(" 根据条件修改字段 （包含二进制大对象）");
    } else if ("selectByExampleWithBLOBs".equals(methodName)) {
      sb.append(" 根据条件查询（包含二进制大对象）");
    } else if ("updateBatchByPrimaryKey".equals(methodName)) {
      sb.append(" 根据主键，批量更新");
    } else if ("updateBatchByPrimaryKeySelective".equals(methodName)) {
      sb.append(" 根据主键，批量更新对应字段数据");
    } else if ("updateBatchByExampleSelective".equals(methodName)) {
      sb.append(" 根据条件，批量更新对应字段数据");
    } else if ("updateBatchByExample".equals(methodName)) {
      sb.append(" 根据条件，批量更新");
    }

    final List<Parameter> parameterList = method.getParameters();
    if (!parameterList.isEmpty()) {
      if ("or".equals(methodName)) {
        sb.append(" 增加或者的查询条件,用于构建或者查询");
      }
    } else if ("or".equals(methodName)) {
      sb.append(" 创建一个新的或者查询条件");
    }

    method.addJavaDocLine("/** ");
    method.addJavaDocLine(sb.toString());

    String paramterName;
    for (Parameter parameter : parameterList) {
      sb.setLength(0);
      sb.append(" * @param ");
      paramterName = parameter.getName();
      sb.append(paramterName);

      if ("orderByClause".equals(paramterName)) {
        sb.append(" 排序字段");
      } else if ("distinct".equals(paramterName)) {
        sb.append(" 是否过滤重复数据");
      } else if ("criteria".equals(paramterName)) {
        sb.append(" 过滤条件实例");
      } else if ("record".equals(paramterName)) {
        if ("insert".equals(methodName) || "insertSelective".equals(methodName)) {
          sb.append(" 插入字段对象(必须含ID）");
        } else if ("insertBatch".equals(methodName) || "insertBatchSelective".equals(methodName)) {
          sb.append(" 批量插入字段对象(必须含ID）");
        } else if ("updateByExample".equals(methodName) || "updateByExampleSelective".equals(methodName)) {
          sb.append(" 修改字段对象 (JOPO)");
        } else if ("updateBatchByPrimaryKey".equals(methodName) || "updateBatchByPrimaryKeySelective".equals(methodName)) {
          sb.append(" 批量修改字段对象(必须含ID）");
        } else if ("updateBatchByExampleSelective".equals(methodName) || "updateBatchByExample".equals(methodName)) {
          sb.append(" 批量修改字段对象 (JOPO)");
        } else {
          sb.append(" 修改字段对象(必须含ID）");
        }

      } else if ("example".equals(paramterName)) {
        sb.append(" 条件对象");
      } else if (paramterName.toLowerCase().indexOf("id") > -1) {
        sb.append(" 主键ID");
      }
      method.addJavaDocLine(sb.toString());
    }
    if ("countByExample".equals(methodName)) {
      method.addJavaDocLine(" * @return 返回数据的数量");
    } else if (methodName.indexOf("delete") > -1) {
      method.addJavaDocLine(" * @return 返回删除成功的数量");
    } else if (methodName.indexOf("insert") > -1) {
      method.addJavaDocLine(" * @return 返回添加成功的数量");
    } else if (methodName.indexOf("update") > -1) {
      method.addJavaDocLine(" * @return 返回更新成功的数量");
    } else if (methodName.indexOf("select") > -1) {
      method.addJavaDocLine(" * @return 返回查询的结果");
    }
    method.addJavaDocLine(" */");
  }
}
