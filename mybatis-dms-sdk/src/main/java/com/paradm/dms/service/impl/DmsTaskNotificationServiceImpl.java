package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsTaskNotificationMapper;
import com.paradm.dms.entity.DmsTaskNotification;
import com.paradm.dms.entity.DmsTaskNotificationExample;
import com.paradm.dms.service.DmsTaskNotificationService;

@Service
public class DmsTaskNotificationServiceImpl implements DmsTaskNotificationService {
    @Autowired
    private DmsTaskNotificationMapper dmsTaskNotificationMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsTaskNotificationServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#countByExample(com.paradm.system.entity.DmsTaskNotificationExample)
     */ 
    @Override
    public int countByExample(DmsTaskNotificationExample example) {
        int count = this.dmsTaskNotificationMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsTaskNotification selectByPrimaryKey(Long id) {
        return this.dmsTaskNotificationMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#selectByExample(com.paradm.system.entity.DmsTaskNotificationExample)
     */ 
    @Override
    public List<DmsTaskNotification> selectByExample(DmsTaskNotificationExample example) {
        return this.dmsTaskNotificationMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#deleteByExample(com.paradm.system.entity.DmsTaskNotificationExample)
     */ 
    @Override
    public int deleteByExample(DmsTaskNotificationExample example) {
        return this.dmsTaskNotificationMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsTaskNotificationMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#insert(com.paradm.system.entity.DmsTaskNotification)
     */ 
    @Override
    public int insert(DmsTaskNotification record) {
        return this.dmsTaskNotificationMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#insertSelective(com.paradm.system.entity.DmsTaskNotification)
     */ 
    @Override
    public int insertSelective(DmsTaskNotification record) {
        return this.dmsTaskNotificationMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#insertBatch(.List<DmsTaskNotification>)
     */ 
    @Override
    public int insertBatch(List<DmsTaskNotification> record) {
        return this.dmsTaskNotificationMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#insertBatchSelective(.List<DmsTaskNotification>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsTaskNotification> record) {
        return this.dmsTaskNotificationMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsTaskNotification)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsTaskNotification record) {
        return this.dmsTaskNotificationMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#updateByPrimaryKey(com.paradm.system.entity.DmsTaskNotification)
     */ 
    @Override
    public int updateByPrimaryKey(DmsTaskNotification record) {
        return this.dmsTaskNotificationMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#updateByExampleSelective(com.paradm.system.entity.DmsTaskNotificationcom.paradm.system.entity.DmsTaskNotificationExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsTaskNotification record, DmsTaskNotificationExample example) {
        return this.dmsTaskNotificationMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#updateByExample(com.paradm.system.entity.DmsTaskNotificationcom.paradm.system.entity.DmsTaskNotificationExample)
     */ 
    @Override
    public int updateByExample(DmsTaskNotification record, DmsTaskNotificationExample example) {
        return this.dmsTaskNotificationMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsTaskNotification)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsTaskNotification record) {
        return this.dmsTaskNotificationMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsTaskNotificationExample)
     */ 
    @Override
    public List<DmsTaskNotification> selectByExampleWithBLOBs(DmsTaskNotificationExample example) {
        return this.dmsTaskNotificationMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#updateBatchByPrimaryKeySelective(.List<DmsTaskNotification>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsTaskNotification> records) {
        return this.dmsTaskNotificationMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskNotificationService#updateBatchByPrimaryKey(.List<DmsTaskNotification>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsTaskNotification> records) {
        return this.dmsTaskNotificationMapper.updateBatchByPrimaryKey(records);
    }
}