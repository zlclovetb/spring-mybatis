package com.paradm.workspace.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.workspace.dao.WspRecordMapper;
import com.paradm.workspace.entity.WspRecord;
import com.paradm.workspace.entity.WspRecordExample;
import com.paradm.workspace.service.WspRecordService;

@Service
public class WspRecordServiceImpl implements WspRecordService {
    @Autowired
    private WspRecordMapper wspRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(WspRecordServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#countByExample(com.paradm.system.entity.WspRecordExample)
     */ 
    @Override
    public int countByExample(WspRecordExample example) {
        int count = this.wspRecordMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public WspRecord selectByPrimaryKey(Long id) {
        return this.wspRecordMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#selectByExample(com.paradm.system.entity.WspRecordExample)
     */ 
    @Override
    public List<WspRecord> selectByExample(WspRecordExample example) {
        return this.wspRecordMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#deleteByExample(com.paradm.system.entity.WspRecordExample)
     */ 
    @Override
    public int deleteByExample(WspRecordExample example) {
        return this.wspRecordMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.wspRecordMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#insert(com.paradm.system.entity.WspRecord)
     */ 
    @Override
    public int insert(WspRecord record) {
        return this.wspRecordMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#insertSelective(com.paradm.system.entity.WspRecord)
     */ 
    @Override
    public int insertSelective(WspRecord record) {
        return this.wspRecordMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#insertBatch(.List<WspRecord>)
     */ 
    @Override
    public int insertBatch(List<WspRecord> record) {
        return this.wspRecordMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#insertBatchSelective(.List<WspRecord>)
     */ 
    @Override
    public int insertBatchSelective(List<WspRecord> record) {
        return this.wspRecordMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#updateByPrimaryKeySelective(com.paradm.system.entity.WspRecord)
     */ 
    @Override
    public int updateByPrimaryKeySelective(WspRecord record) {
        return this.wspRecordMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#updateByPrimaryKey(com.paradm.system.entity.WspRecord)
     */ 
    @Override
    public int updateByPrimaryKey(WspRecord record) {
        return this.wspRecordMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#updateByExampleSelective(com.paradm.system.entity.WspRecordcom.paradm.system.entity.WspRecordExample)
     */ 
    @Override
    public int updateByExampleSelective(WspRecord record, WspRecordExample example) {
        return this.wspRecordMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#updateByExample(com.paradm.system.entity.WspRecordcom.paradm.system.entity.WspRecordExample)
     */ 
    @Override
    public int updateByExample(WspRecord record, WspRecordExample example) {
        return this.wspRecordMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.WspRecord)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(WspRecord record) {
        return this.wspRecordMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#selectByExampleWithBLOBs(com.paradm.system.entity.WspRecordExample)
     */ 
    @Override
    public List<WspRecord> selectByExampleWithBLOBs(WspRecordExample example) {
        return this.wspRecordMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#updateBatchByPrimaryKeySelective(.List<WspRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<WspRecord> records) {
        return this.wspRecordMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspRecordService#updateBatchByPrimaryKey(.List<WspRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<WspRecord> records) {
        return this.wspRecordMapper.updateBatchByPrimaryKey(records);
    }
}