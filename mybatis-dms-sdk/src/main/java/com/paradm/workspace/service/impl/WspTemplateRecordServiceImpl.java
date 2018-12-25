package com.paradm.workspace.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.workspace.dao.WspTemplateRecordMapper;
import com.paradm.workspace.entity.WspTemplateRecord;
import com.paradm.workspace.entity.WspTemplateRecordExample;
import com.paradm.workspace.service.WspTemplateRecordService;

@Service
public class WspTemplateRecordServiceImpl implements WspTemplateRecordService {
    @Autowired
    private WspTemplateRecordMapper wspTemplateRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(WspTemplateRecordServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#countByExample(com.paradm.system.entity.WspTemplateRecordExample)
     */ 
    @Override
    public int countByExample(WspTemplateRecordExample example) {
        int count = this.wspTemplateRecordMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public WspTemplateRecord selectByPrimaryKey(Long id) {
        return this.wspTemplateRecordMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#selectByExample(com.paradm.system.entity.WspTemplateRecordExample)
     */ 
    @Override
    public List<WspTemplateRecord> selectByExample(WspTemplateRecordExample example) {
        return this.wspTemplateRecordMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#deleteByExample(com.paradm.system.entity.WspTemplateRecordExample)
     */ 
    @Override
    public int deleteByExample(WspTemplateRecordExample example) {
        return this.wspTemplateRecordMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.wspTemplateRecordMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#insert(com.paradm.system.entity.WspTemplateRecord)
     */ 
    @Override
    public int insert(WspTemplateRecord record) {
        return this.wspTemplateRecordMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#insertSelective(com.paradm.system.entity.WspTemplateRecord)
     */ 
    @Override
    public int insertSelective(WspTemplateRecord record) {
        return this.wspTemplateRecordMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#insertBatch(.List<WspTemplateRecord>)
     */ 
    @Override
    public int insertBatch(List<WspTemplateRecord> record) {
        return this.wspTemplateRecordMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#insertBatchSelective(.List<WspTemplateRecord>)
     */ 
    @Override
    public int insertBatchSelective(List<WspTemplateRecord> record) {
        return this.wspTemplateRecordMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#updateByPrimaryKeySelective(com.paradm.system.entity.WspTemplateRecord)
     */ 
    @Override
    public int updateByPrimaryKeySelective(WspTemplateRecord record) {
        return this.wspTemplateRecordMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#updateByPrimaryKey(com.paradm.system.entity.WspTemplateRecord)
     */ 
    @Override
    public int updateByPrimaryKey(WspTemplateRecord record) {
        return this.wspTemplateRecordMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#updateByExampleSelective(com.paradm.system.entity.WspTemplateRecordcom.paradm.system.entity.WspTemplateRecordExample)
     */ 
    @Override
    public int updateByExampleSelective(WspTemplateRecord record, WspTemplateRecordExample example) {
        return this.wspTemplateRecordMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#updateByExample(com.paradm.system.entity.WspTemplateRecordcom.paradm.system.entity.WspTemplateRecordExample)
     */ 
    @Override
    public int updateByExample(WspTemplateRecord record, WspTemplateRecordExample example) {
        return this.wspTemplateRecordMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.WspTemplateRecord)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(WspTemplateRecord record) {
        return this.wspTemplateRecordMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#selectByExampleWithBLOBs(com.paradm.system.entity.WspTemplateRecordExample)
     */ 
    @Override
    public List<WspTemplateRecord> selectByExampleWithBLOBs(WspTemplateRecordExample example) {
        return this.wspTemplateRecordMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#updateBatchByPrimaryKeySelective(.List<WspTemplateRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<WspTemplateRecord> records) {
        return this.wspTemplateRecordMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRecordService#updateBatchByPrimaryKey(.List<WspTemplateRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<WspTemplateRecord> records) {
        return this.wspTemplateRecordMapper.updateBatchByPrimaryKey(records);
    }
}