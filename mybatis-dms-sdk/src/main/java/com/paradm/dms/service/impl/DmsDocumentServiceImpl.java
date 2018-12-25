package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsDocumentMapper;
import com.paradm.dms.entity.DmsDocument;
import com.paradm.dms.entity.DmsDocumentExample;
import com.paradm.dms.service.DmsDocumentService;

@Service
public class DmsDocumentServiceImpl implements DmsDocumentService {
    @Autowired
    private DmsDocumentMapper dmsDocumentMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsDocumentServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#countByExample(com.paradm.system.entity.DmsDocumentExample)
     */ 
    @Override
    public int countByExample(DmsDocumentExample example) {
        int count = this.dmsDocumentMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsDocument selectByPrimaryKey(Long id) {
        return this.dmsDocumentMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#selectByExample(com.paradm.system.entity.DmsDocumentExample)
     */ 
    @Override
    public List<DmsDocument> selectByExample(DmsDocumentExample example) {
        return this.dmsDocumentMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#deleteByExample(com.paradm.system.entity.DmsDocumentExample)
     */ 
    @Override
    public int deleteByExample(DmsDocumentExample example) {
        return this.dmsDocumentMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsDocumentMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#insert(com.paradm.system.entity.DmsDocument)
     */ 
    @Override
    public int insert(DmsDocument record) {
        return this.dmsDocumentMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#insertSelective(com.paradm.system.entity.DmsDocument)
     */ 
    @Override
    public int insertSelective(DmsDocument record) {
        return this.dmsDocumentMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#insertBatch(.List<DmsDocument>)
     */ 
    @Override
    public int insertBatch(List<DmsDocument> record) {
        return this.dmsDocumentMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#insertBatchSelective(.List<DmsDocument>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsDocument> record) {
        return this.dmsDocumentMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsDocument)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsDocument record) {
        return this.dmsDocumentMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#updateByPrimaryKey(com.paradm.system.entity.DmsDocument)
     */ 
    @Override
    public int updateByPrimaryKey(DmsDocument record) {
        return this.dmsDocumentMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#updateByExampleSelective(com.paradm.system.entity.DmsDocumentcom.paradm.system.entity.DmsDocumentExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsDocument record, DmsDocumentExample example) {
        return this.dmsDocumentMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#updateByExample(com.paradm.system.entity.DmsDocumentcom.paradm.system.entity.DmsDocumentExample)
     */ 
    @Override
    public int updateByExample(DmsDocument record, DmsDocumentExample example) {
        return this.dmsDocumentMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsDocument)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsDocument record) {
        return this.dmsDocumentMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsDocumentExample)
     */ 
    @Override
    public List<DmsDocument> selectByExampleWithBLOBs(DmsDocumentExample example) {
        return this.dmsDocumentMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#updateBatchByPrimaryKeySelective(.List<DmsDocument>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsDocument> records) {
        return this.dmsDocumentMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsDocumentService#updateBatchByPrimaryKey(.List<DmsDocument>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsDocument> records) {
        return this.dmsDocumentMapper.updateBatchByPrimaryKey(records);
    }
}