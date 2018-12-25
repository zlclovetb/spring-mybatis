package com.paradm.system.service.impl;

import com.paradm.system.dao.SysNotificationMapper;
import com.paradm.system.entity.SysNotification;
import com.paradm.system.entity.SysNotificationExample;
import com.paradm.system.service.SysNotificationService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysNotificationServiceImpl implements SysNotificationService {
    @Autowired
    private SysNotificationMapper sysNotificationMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysNotificationServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#countByExample(com.paradm.system.entity.SysNotificationExample)
     */ 
    @Override
    public int countByExample(SysNotificationExample example) {
        int count = this.sysNotificationMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public SysNotification selectByPrimaryKey(Long id) {
        return this.sysNotificationMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#selectByExample(com.paradm.system.entity.SysNotificationExample)
     */ 
    @Override
    public List<SysNotification> selectByExample(SysNotificationExample example) {
        return this.sysNotificationMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#deleteByExample(com.paradm.system.entity.SysNotificationExample)
     */ 
    @Override
    public int deleteByExample(SysNotificationExample example) {
        return this.sysNotificationMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.sysNotificationMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#insert(com.paradm.system.entity.SysNotification)
     */ 
    @Override
    public int insert(SysNotification record) {
        return this.sysNotificationMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#insertSelective(com.paradm.system.entity.SysNotification)
     */ 
    @Override
    public int insertSelective(SysNotification record) {
        return this.sysNotificationMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#insertBatch(.List<SysNotification>)
     */ 
    @Override
    public int insertBatch(List<SysNotification> record) {
        return this.sysNotificationMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#insertBatchSelective(.List<SysNotification>)
     */ 
    @Override
    public int insertBatchSelective(List<SysNotification> record) {
        return this.sysNotificationMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#updateByPrimaryKeySelective(com.paradm.system.entity.SysNotification)
     */ 
    @Override
    public int updateByPrimaryKeySelective(SysNotification record) {
        return this.sysNotificationMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#updateByPrimaryKey(com.paradm.system.entity.SysNotification)
     */ 
    @Override
    public int updateByPrimaryKey(SysNotification record) {
        return this.sysNotificationMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#updateByExampleSelective(com.paradm.system.entity.SysNotificationcom.paradm.system.entity.SysNotificationExample)
     */ 
    @Override
    public int updateByExampleSelective(SysNotification record, SysNotificationExample example) {
        return this.sysNotificationMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#updateByExample(com.paradm.system.entity.SysNotificationcom.paradm.system.entity.SysNotificationExample)
     */ 
    @Override
    public int updateByExample(SysNotification record, SysNotificationExample example) {
        return this.sysNotificationMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.SysNotification)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(SysNotification record) {
        return this.sysNotificationMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#selectByExampleWithBLOBs(com.paradm.system.entity.SysNotificationExample)
     */ 
    @Override
    public List<SysNotification> selectByExampleWithBLOBs(SysNotificationExample example) {
        return this.sysNotificationMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#updateBatchByPrimaryKeySelective(.List<SysNotification>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<SysNotification> records) {
        return this.sysNotificationMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationService#updateBatchByPrimaryKey(.List<SysNotification>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<SysNotification> records) {
        return this.sysNotificationMapper.updateBatchByPrimaryKey(records);
    }
}