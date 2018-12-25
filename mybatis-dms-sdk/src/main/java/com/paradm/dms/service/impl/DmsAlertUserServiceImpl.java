package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsAlertUserMapper;
import com.paradm.dms.entity.DmsAlertUser;
import com.paradm.dms.entity.DmsAlertUserExample;
import com.paradm.dms.service.DmsAlertUserService;

@Service
public class DmsAlertUserServiceImpl implements DmsAlertUserService {
    @Autowired
    private DmsAlertUserMapper dmsAlertUserMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsAlertUserServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#countByExample(com.paradm.system.entity.DmsAlertUserExample)
     */ 
    @Override
    public int countByExample(DmsAlertUserExample example) {
        int count = this.dmsAlertUserMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsAlertUser selectByPrimaryKey(Long id) {
        return this.dmsAlertUserMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#selectByExample(com.paradm.system.entity.DmsAlertUserExample)
     */ 
    @Override
    public List<DmsAlertUser> selectByExample(DmsAlertUserExample example) {
        return this.dmsAlertUserMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#deleteByExample(com.paradm.system.entity.DmsAlertUserExample)
     */ 
    @Override
    public int deleteByExample(DmsAlertUserExample example) {
        return this.dmsAlertUserMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsAlertUserMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#insert(com.paradm.system.entity.DmsAlertUser)
     */ 
    @Override
    public int insert(DmsAlertUser record) {
        return this.dmsAlertUserMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#insertSelective(com.paradm.system.entity.DmsAlertUser)
     */ 
    @Override
    public int insertSelective(DmsAlertUser record) {
        return this.dmsAlertUserMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#insertBatch(.List<DmsAlertUser>)
     */ 
    @Override
    public int insertBatch(List<DmsAlertUser> record) {
        return this.dmsAlertUserMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#insertBatchSelective(.List<DmsAlertUser>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsAlertUser> record) {
        return this.dmsAlertUserMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsAlertUser)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsAlertUser record) {
        return this.dmsAlertUserMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#updateByPrimaryKey(com.paradm.system.entity.DmsAlertUser)
     */ 
    @Override
    public int updateByPrimaryKey(DmsAlertUser record) {
        return this.dmsAlertUserMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#updateByExampleSelective(com.paradm.system.entity.DmsAlertUsercom.paradm.system.entity.DmsAlertUserExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsAlertUser record, DmsAlertUserExample example) {
        return this.dmsAlertUserMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#updateByExample(com.paradm.system.entity.DmsAlertUsercom.paradm.system.entity.DmsAlertUserExample)
     */ 
    @Override
    public int updateByExample(DmsAlertUser record, DmsAlertUserExample example) {
        return this.dmsAlertUserMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsAlertUser)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsAlertUser record) {
        return this.dmsAlertUserMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsAlertUserExample)
     */ 
    @Override
    public List<DmsAlertUser> selectByExampleWithBLOBs(DmsAlertUserExample example) {
        return this.dmsAlertUserMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#updateBatchByPrimaryKeySelective(.List<DmsAlertUser>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsAlertUser> records) {
        return this.dmsAlertUserMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertUserService#updateBatchByPrimaryKey(.List<DmsAlertUser>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsAlertUser> records) {
        return this.dmsAlertUserMapper.updateBatchByPrimaryKey(records);
    }
}