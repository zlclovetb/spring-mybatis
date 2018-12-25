package com.paradm.dms;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.paradm.dms.bao.DmsDocumentMapper;
import com.paradm.dms.entity.DmsDocument;
import com.paradm.dms.entity.DmsDocumentExample;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class DmsDocumentTest {
  @Autowired
  protected SqlSessionFactory sessionFactory;
  @Autowired
  protected DmsDocumentMapper dmsDocumentMapper;
  
  @Test
  @Transactional(propagation = Propagation.NOT_SUPPORTED)
  public void getdoc() {
    //SqlSession session = sessionFactory.openSession();
    //DmsDocumentMapper docMapper = session.getMapper(DmsDocumentMapper.class);
    DmsDocument dmsDocument = dmsDocumentMapper.selectByPrimaryKey(1059974730427138195l);
    System.out.println(dmsDocument.getDocName());
    //session.close();
  }
  
  @Test
  @Transactional(propagation = Propagation.NOT_SUPPORTED)
  public void batchUpdate(){
    //DmsDocument dmsDocument = dmsDocumentMapper.selectByPrimaryKey(1059974730427138195l);
    DmsDocument dmsDocument = new DmsDocument();
    dmsDocument.setId(1059974730427138195l);
    dmsDocument.setDocName("PHK_IssueList_20151120.xlsx");
    
    List<DmsDocument> dmsDocuments = new ArrayList<>();
    dmsDocuments.add(dmsDocument);
    
    //int count = dmsDocumentMapper.updateBatchByPrimaryKeySelective(dmsDocuments);
    int count = dmsDocumentMapper.updateBatchByPrimaryKey(dmsDocuments);
    System.out.println(count);
    System.out.println(dmsDocument.getDocName());
  }
  
  @Test
  @Transactional(propagation = Propagation.NOT_SUPPORTED)
  public void batchInsert() throws CloneNotSupportedException {
    DmsDocument dmsDocument = dmsDocumentMapper.selectByPrimaryKey(1059974730427138195l);
    DmsDocument dmsDocument1 = (DmsDocument) dmsDocument.clone();
    DmsDocument dmsDocument2 = (DmsDocument) dmsDocument.clone();
    dmsDocument1.setId(10001l);
    dmsDocument2.setId(10002l);
    List<DmsDocument> dmsDocuments = new ArrayList<>();
    dmsDocuments.add(dmsDocument1);
    dmsDocuments.add(dmsDocument2);
    
    int count = dmsDocumentMapper.insertBatchSelective(dmsDocuments);
    System.out.println(count);
  }
  
  @Test
  public void getPageDoc() {
    //SqlSession session = sessionFactory.openSession();
    //DmsDocumentMapper docMapper = session.getMapper(DmsDocumentMapper.class);
    
    DmsDocumentExample example = new DmsDocumentExample();
    example.createCriteria().andParentIdEqualTo(1059387103026086129l).andRootIdEqualTo(1059387103026086122l)
    .andRecordStatusEqualTo("A");
    example.setOrderByClause("'DOC_TYPE' DESC, 'DOC_NAME' ASC");
    PageHelper.startPage(2, 10);
    List<DmsDocument> list = dmsDocumentMapper.selectByExample(example);
    System.out.println(list.size());
  }
  
}
