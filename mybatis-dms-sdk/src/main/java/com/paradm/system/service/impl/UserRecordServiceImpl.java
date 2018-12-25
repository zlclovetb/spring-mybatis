package com.paradm.system.service.impl;

import com.paradm.system.dao.UserRecordMapper;
import com.paradm.system.entity.UserRecord;
import com.paradm.system.entity.UserRecordExample;
import com.paradm.system.service.UserRecordService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRecordServiceImpl implements UserRecordService {
    @Autowired
    private UserRecordMapper userRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserRecordServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#countByExample(com.paradm.system.entity.UserRecordExample)
     */ 
    @Override
    public int countByExample(UserRecordExample example) {
        int count = this.userRecordMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public UserRecord selectByPrimaryKey(Long id) {
        return this.userRecordMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#selectByExample(com.paradm.system.entity.UserRecordExample)
     */ 
    @Override
    public List<UserRecord> selectByExample(UserRecordExample example) {
        return this.userRecordMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#deleteByExample(com.paradm.system.entity.UserRecordExample)
     */ 
    @Override
    public int deleteByExample(UserRecordExample example) {
        return this.userRecordMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.userRecordMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#insert(com.paradm.system.entity.UserRecord)
     */ 
    @Override
    public int insert(UserRecord record) {
        return this.userRecordMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#insertSelective(com.paradm.system.entity.UserRecord)
     */ 
    @Override
    public int insertSelective(UserRecord record) {
        return this.userRecordMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#insertBatch(.List<UserRecord>)
     */ 
    @Override
    public int insertBatch(List<UserRecord> record) {
        return this.userRecordMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#insertBatchSelective(.List<UserRecord>)
     */ 
    @Override
    public int insertBatchSelective(List<UserRecord> record) {
        return this.userRecordMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#updateByPrimaryKeySelective(com.paradm.system.entity.UserRecord)
     */ 
    @Override
    public int updateByPrimaryKeySelective(UserRecord record) {
        return this.userRecordMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#updateByPrimaryKey(com.paradm.system.entity.UserRecord)
     */ 
    @Override
    public int updateByPrimaryKey(UserRecord record) {
        return this.userRecordMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#updateByExampleSelective(com.paradm.system.entity.UserRecordcom.paradm.system.entity.UserRecordExample)
     */ 
    @Override
    public int updateByExampleSelective(UserRecord record, UserRecordExample example) {
        return this.userRecordMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#updateByExample(com.paradm.system.entity.UserRecordcom.paradm.system.entity.UserRecordExample)
     */ 
    @Override
    public int updateByExample(UserRecord record, UserRecordExample example) {
        return this.userRecordMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.UserRecord)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(UserRecord record) {
        return this.userRecordMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#selectByExampleWithBLOBs(com.paradm.system.entity.UserRecordExample)
     */ 
    @Override
    public List<UserRecord> selectByExampleWithBLOBs(UserRecordExample example) {
        return this.userRecordMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#updateBatchByPrimaryKeySelective(.List<UserRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<UserRecord> records) {
        return this.userRecordMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRecordService#updateBatchByPrimaryKey(.List<UserRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<UserRecord> records) {
        return this.userRecordMapper.updateBatchByPrimaryKey(records);
    }
}