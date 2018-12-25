package org.mybatis.generator.codegen.mybatis3.xmlmapper;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.AbstractXmlGenerator;
import org.mybatis.generator.codegen.XmlConstants;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.BaseColumnListElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.BlobColumnListElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.CountByExampleElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.DeleteByExampleElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.DeleteByPrimaryKeyElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.ExampleWhereClauseElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.InsertBatchElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.InsertBatchSelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.InsertElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.InsertSelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.ResultMapWithBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.ResultMapWithoutBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.SelectByExampleWithBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.SelectByExampleWithoutBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.SelectByPrimaryKeyElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateBatchByExampleElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateBatchByExampleSelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateBatchByPrimaryKeyElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateBatchByPrimaryKeySelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByExampleSelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByExampleWithBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByExampleWithoutBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByPrimaryKeySelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByPrimaryKeyWithBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByPrimaryKeyWithoutBLOBsElementGenerator;
import org.mybatis.generator.internal.util.messages.Messages;

public class XMLMapperGenerator extends AbstractXmlGenerator {

  @Override
  public Document getDocument() {
    Document document = new Document(XmlConstants.MYBATIS3_MAPPER_PUBLIC_ID, XmlConstants.MYBATIS3_MAPPER_SYSTEM_ID);
    document.setRootElement(getSqlMapElement());

    if (!context.getPlugins().sqlMapDocumentGenerated(document, introspectedTable)) {
      document = null;
    }

    return document;
  }

  protected XmlElement getSqlMapElement() {
    FullyQualifiedTable table = introspectedTable.getFullyQualifiedTable();
    progressCallback.startTask(Messages.getString("Progress.12", table.toString()));
    XmlElement answer = new XmlElement("mapper");
    String namespace = introspectedTable.getMyBatis3SqlMapNamespace();
    answer.addAttribute(new Attribute("namespace", namespace));

    context.getCommentGenerator().addRootComment(answer);

    addResultMapWithoutBLOBsElement(answer);
    addResultMapWithBLOBsElement(answer);
    addExampleWhereClauseElement(answer);
    addMyBatis3UpdateByExampleWhereClauseElement(answer);
    addBaseColumnListElement(answer);
    addBlobColumnListElement(answer);
    addSelectByExampleWithBLOBsElement(answer);
    addSelectByExampleWithoutBLOBsElement(answer);
    addSelectByPrimaryKeyElement(answer);
    addDeleteByPrimaryKeyElement(answer);
    addDeleteByExampleElement(answer);
    addInsertElement(answer);
    addInsertSelectiveElement(answer);
    addInsertBatchElement(answer);
    addInsertBatchSelectiveElement(answer);
    addCountByExampleElement(answer);
    addUpdateByExampleSelectiveElement(answer);
    addUpdateByExampleWithBLOBsElement(answer);
    addUpdateByExampleWithoutBLOBsElement(answer);
    addUpdateByPrimaryKeySelectiveElement(answer);
    addUpdateByPrimaryKeyWithBLOBsElement(answer);
    addUpdateByPrimaryKeyWithoutBLOBsElement(answer);

    // 批量更新
    addUpdateBatchByPrimaryKeyElement(answer);
    addUpdateBatchByPrimaryKeySelectiveElement(answer);

    addUpdateBatchByExampleElement(answer);
    addUpdateBatchByExampleSelectiveElement(answer);

    return answer;
  }

  protected void addResultMapWithoutBLOBsElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateBaseResultMap()) {
      AbstractXmlElementGenerator elementGenerator = new ResultMapWithoutBLOBsElementGenerator(false);
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addResultMapWithBLOBsElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateResultMapWithBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new ResultMapWithBLOBsElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addExampleWhereClauseElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateSQLExampleWhereClause()) {
      AbstractXmlElementGenerator elementGenerator = new ExampleWhereClauseElementGenerator(false);
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addMyBatis3UpdateByExampleWhereClauseElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateMyBatis3UpdateByExampleWhereClause()) {
      AbstractXmlElementGenerator elementGenerator = new ExampleWhereClauseElementGenerator(true);
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addBaseColumnListElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateBaseColumnList()) {
      AbstractXmlElementGenerator elementGenerator = new BaseColumnListElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addBlobColumnListElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateBlobColumnList()) {
      AbstractXmlElementGenerator elementGenerator = new BlobColumnListElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addSelectByExampleWithoutBLOBsElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateSelectByExampleWithoutBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new SelectByExampleWithoutBLOBsElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addSelectByExampleWithBLOBsElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateSelectByExampleWithBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new SelectByExampleWithBLOBsElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addSelectByPrimaryKeyElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateSelectByPrimaryKey()) {
      AbstractXmlElementGenerator elementGenerator = new SelectByPrimaryKeyElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addDeleteByExampleElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateDeleteByExample()) {
      AbstractXmlElementGenerator elementGenerator = new DeleteByExampleElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addDeleteByPrimaryKeyElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateDeleteByPrimaryKey()) {
      AbstractXmlElementGenerator elementGenerator = new DeleteByPrimaryKeyElementGenerator(false);
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addInsertElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateInsert()) {
      AbstractXmlElementGenerator elementGenerator = new InsertElementGenerator(false);
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addInsertSelectiveElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateInsertSelective()) {
      AbstractXmlElementGenerator elementGenerator = new InsertSelectiveElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addInsertBatchElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateInsert()) {
      AbstractXmlElementGenerator elementGenerator = new InsertBatchElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addInsertBatchSelectiveElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateInsertSelective()) {
      AbstractXmlElementGenerator elementGenerator = new InsertBatchSelectiveElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addCountByExampleElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateCountByExample()) {
      AbstractXmlElementGenerator elementGenerator = new CountByExampleElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateByExampleSelectiveElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByExampleSelective()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateByExampleSelectiveElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateByExampleWithBLOBsElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByExampleWithBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateByExampleWithBLOBsElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateByExampleWithoutBLOBsElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByExampleWithoutBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateByExampleWithoutBLOBsElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateByPrimaryKeySelectiveElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByPrimaryKeySelective()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeySelectiveElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateByPrimaryKeyWithBLOBsElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByPrimaryKeyWithBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeyWithBLOBsElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateByPrimaryKeyWithoutBLOBsElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByPrimaryKeyWithoutBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeyWithoutBLOBsElementGenerator(false);
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateBatchByPrimaryKeySelectiveElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByPrimaryKeySelective()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateBatchByPrimaryKeySelectiveElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateBatchByPrimaryKeyElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByPrimaryKeyWithoutBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateBatchByPrimaryKeyElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateBatchByExampleSelectiveElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByExampleSelective()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateBatchByExampleSelectiveElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void addUpdateBatchByExampleElement(XmlElement parentElement) {
    if (introspectedTable.getRules().generateUpdateByExampleWithoutBLOBs()) {
      AbstractXmlElementGenerator elementGenerator = new UpdateBatchByExampleElementGenerator();
      initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
  }

  protected void initializeAndExecuteGenerator(AbstractXmlElementGenerator elementGenerator, XmlElement parentElement) {
    elementGenerator.setContext(context);
    elementGenerator.setIntrospectedTable(introspectedTable);
    elementGenerator.setProgressCallback(progressCallback);
    elementGenerator.setWarnings(warnings);
    elementGenerator.addElements(parentElement);
  }
}