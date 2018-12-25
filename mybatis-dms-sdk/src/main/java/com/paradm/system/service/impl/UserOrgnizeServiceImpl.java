package com.paradm.system.service.impl;

import com.paradm.system.dao.UserOrgnizeMapper;
import com.paradm.system.entity.UserOrgnize;
import com.paradm.system.entity.UserOrgnizeExample;
import com.paradm.system.service.UserOrgnizeService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOrgnizeServiceImpl implements UserOrgnizeService {
    @Autowired
    private UserOrgnizeMapper userOrgnizeMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserOrgnizeServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#countByExample(com.paradm.system.entity.UserOrgnizeExample)
     */ 
    @Override
    public int countByExample(UserOrgnizeExample example) {
        int count = this.userOrgnizeMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public UserOrgnize selectByPrimaryKey(Long id) {
        return this.userOrgnizeMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#selectByExample(com.paradm.system.entity.UserOrgnizeExample)
     */ 
    @Override
    public List<UserOrgnize> selectByExample(UserOrgnizeExample example) {
        return this.userOrgnizeMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#deleteByExample(com.paradm.system.entity.UserOrgnizeExample)
     */ 
    @Override
    public int deleteByExample(UserOrgnizeExample example) {
        return this.userOrgnizeMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.userOrgnizeMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#insert(com.paradm.system.entity.UserOrgnize)
     */ 
    @Override
    public int insert(UserOrgnize record) {
        return this.userOrgnizeMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#insertSelective(com.paradm.system.entity.UserOrgnize)
     */ 
    @Override
    public int insertSelective(UserOrgnize record) {
        return this.userOrgnizeMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#insertBatch(.List<UserOrgnize>)
     */ 
    @Override
    public int insertBatch(List<UserOrgnize> record) {
        return this.userOrgnizeMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#insertBatchSelective(.List<UserOrgnize>)
     */ 
    @Override
    public int insertBatchSelective(List<UserOrgnize> record) {
        return this.userOrgnizeMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#updateByPrimaryKeySelective(com.paradm.system.entity.UserOrgnize)
     */ 
    @Override
    public int updateByPrimaryKeySelective(UserOrgnize record) {
        return this.userOrgnizeMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#updateByPrimaryKey(com.paradm.system.entity.UserOrgnize)
     */ 
    @Override
    public int updateByPrimaryKey(UserOrgnize record) {
        return this.userOrgnizeMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#updateByExampleSelective(com.paradm.system.entity.UserOrgnizecom.paradm.system.entity.UserOrgnizeExample)
     */ 
    @Override
    public int updateByExampleSelective(UserOrgnize record, UserOrgnizeExample example) {
        return this.userOrgnizeMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#updateByExample(com.paradm.system.entity.UserOrgnizecom.paradm.system.entity.UserOrgnizeExample)
     */ 
    @Override
    public int updateByExample(UserOrgnize record, UserOrgnizeExample example) {
        return this.userOrgnizeMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.UserOrgnize)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(UserOrgnize record) {
        return this.userOrgnizeMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#selectByExampleWithBLOBs(com.paradm.system.entity.UserOrgnizeExample)
     */ 
    @Override
    public List<UserOrgnize> selectByExampleWithBLOBs(UserOrgnizeExample example) {
        return this.userOrgnizeMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#updateBatchByPrimaryKeySelective(.List<UserOrgnize>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<UserOrgnize> records) {
        return this.userOrgnizeMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserOrgnizeService#updateBatchByPrimaryKey(.List<UserOrgnize>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<UserOrgnize> records) {
        return this.userOrgnizeMapper.updateBatchByPrimaryKey(records);
    }
}