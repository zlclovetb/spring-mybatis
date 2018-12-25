package com.paradm.system.service.impl;

import com.paradm.system.dao.SmsSendLogMapper;
import com.paradm.system.entity.SmsSendLog;
import com.paradm.system.entity.SmsSendLogExample;
import com.paradm.system.service.SmsSendLogService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsSendLogServiceImpl implements SmsSendLogService {
    @Autowired
    private SmsSendLogMapper smsSendLogMapper;

    private static final Logger logger = LoggerFactory.getLogger(SmsSendLogServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#countByExample(com.paradm.system.entity.SmsSendLogExample)
     */ 
    @Override
    public int countByExample(SmsSendLogExample example) {
        int count = this.smsSendLogMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public SmsSendLog selectByPrimaryKey(Long id) {
        return this.smsSendLogMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#selectByExample(com.paradm.system.entity.SmsSendLogExample)
     */ 
    @Override
    public List<SmsSendLog> selectByExample(SmsSendLogExample example) {
        return this.smsSendLogMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#deleteByExample(com.paradm.system.entity.SmsSendLogExample)
     */ 
    @Override
    public int deleteByExample(SmsSendLogExample example) {
        return this.smsSendLogMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.smsSendLogMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#insert(com.paradm.system.entity.SmsSendLog)
     */ 
    @Override
    public int insert(SmsSendLog record) {
        return this.smsSendLogMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#insertSelective(com.paradm.system.entity.SmsSendLog)
     */ 
    @Override
    public int insertSelective(SmsSendLog record) {
        return this.smsSendLogMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#insertBatch(.List<SmsSendLog>)
     */ 
    @Override
    public int insertBatch(List<SmsSendLog> record) {
        return this.smsSendLogMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#insertBatchSelective(.List<SmsSendLog>)
     */ 
    @Override
    public int insertBatchSelective(List<SmsSendLog> record) {
        return this.smsSendLogMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#updateByPrimaryKeySelective(com.paradm.system.entity.SmsSendLog)
     */ 
    @Override
    public int updateByPrimaryKeySelective(SmsSendLog record) {
        return this.smsSendLogMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#updateByPrimaryKey(com.paradm.system.entity.SmsSendLog)
     */ 
    @Override
    public int updateByPrimaryKey(SmsSendLog record) {
        return this.smsSendLogMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#updateByExampleSelective(com.paradm.system.entity.SmsSendLogcom.paradm.system.entity.SmsSendLogExample)
     */ 
    @Override
    public int updateByExampleSelective(SmsSendLog record, SmsSendLogExample example) {
        return this.smsSendLogMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#updateByExample(com.paradm.system.entity.SmsSendLogcom.paradm.system.entity.SmsSendLogExample)
     */ 
    @Override
    public int updateByExample(SmsSendLog record, SmsSendLogExample example) {
        return this.smsSendLogMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.SmsSendLog)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(SmsSendLog record) {
        return this.smsSendLogMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#selectByExampleWithBLOBs(com.paradm.system.entity.SmsSendLogExample)
     */ 
    @Override
    public List<SmsSendLog> selectByExampleWithBLOBs(SmsSendLogExample example) {
        return this.smsSendLogMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#updateBatchByPrimaryKeySelective(.List<SmsSendLog>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<SmsSendLog> records) {
        return this.smsSendLogMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SmsSendLogService#updateBatchByPrimaryKey(.List<SmsSendLog>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<SmsSendLog> records) {
        return this.smsSendLogMapper.updateBatchByPrimaryKey(records);
    }
}