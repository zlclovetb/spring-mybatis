package com.paradm.system.service.impl;

import com.paradm.system.dao.UserRegisterUrlMapper;
import com.paradm.system.entity.UserRegisterUrl;
import com.paradm.system.entity.UserRegisterUrlExample;
import com.paradm.system.service.UserRegisterUrlService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterUrlServiceImpl implements UserRegisterUrlService {
    @Autowired
    private UserRegisterUrlMapper userRegisterUrlMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserRegisterUrlServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#countByExample(com.paradm.system.entity.UserRegisterUrlExample)
     */ 
    @Override
    public int countByExample(UserRegisterUrlExample example) {
        int count = this.userRegisterUrlMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public UserRegisterUrl selectByPrimaryKey(Long id) {
        return this.userRegisterUrlMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#selectByExample(com.paradm.system.entity.UserRegisterUrlExample)
     */ 
    @Override
    public List<UserRegisterUrl> selectByExample(UserRegisterUrlExample example) {
        return this.userRegisterUrlMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#deleteByExample(com.paradm.system.entity.UserRegisterUrlExample)
     */ 
    @Override
    public int deleteByExample(UserRegisterUrlExample example) {
        return this.userRegisterUrlMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.userRegisterUrlMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#insert(com.paradm.system.entity.UserRegisterUrl)
     */ 
    @Override
    public int insert(UserRegisterUrl record) {
        return this.userRegisterUrlMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#insertSelective(com.paradm.system.entity.UserRegisterUrl)
     */ 
    @Override
    public int insertSelective(UserRegisterUrl record) {
        return this.userRegisterUrlMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#insertBatch(.List<UserRegisterUrl>)
     */ 
    @Override
    public int insertBatch(List<UserRegisterUrl> record) {
        return this.userRegisterUrlMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#insertBatchSelective(.List<UserRegisterUrl>)
     */ 
    @Override
    public int insertBatchSelective(List<UserRegisterUrl> record) {
        return this.userRegisterUrlMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#updateByPrimaryKeySelective(com.paradm.system.entity.UserRegisterUrl)
     */ 
    @Override
    public int updateByPrimaryKeySelective(UserRegisterUrl record) {
        return this.userRegisterUrlMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#updateByPrimaryKey(com.paradm.system.entity.UserRegisterUrl)
     */ 
    @Override
    public int updateByPrimaryKey(UserRegisterUrl record) {
        return this.userRegisterUrlMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#updateByExampleSelective(com.paradm.system.entity.UserRegisterUrlcom.paradm.system.entity.UserRegisterUrlExample)
     */ 
    @Override
    public int updateByExampleSelective(UserRegisterUrl record, UserRegisterUrlExample example) {
        return this.userRegisterUrlMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#updateByExample(com.paradm.system.entity.UserRegisterUrlcom.paradm.system.entity.UserRegisterUrlExample)
     */ 
    @Override
    public int updateByExample(UserRegisterUrl record, UserRegisterUrlExample example) {
        return this.userRegisterUrlMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.UserRegisterUrl)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(UserRegisterUrl record) {
        return this.userRegisterUrlMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#selectByExampleWithBLOBs(com.paradm.system.entity.UserRegisterUrlExample)
     */ 
    @Override
    public List<UserRegisterUrl> selectByExampleWithBLOBs(UserRegisterUrlExample example) {
        return this.userRegisterUrlMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#updateBatchByPrimaryKeySelective(.List<UserRegisterUrl>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<UserRegisterUrl> records) {
        return this.userRegisterUrlMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.UserRegisterUrlService#updateBatchByPrimaryKey(.List<UserRegisterUrl>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<UserRegisterUrl> records) {
        return this.userRegisterUrlMapper.updateBatchByPrimaryKey(records);
    }
}