package com.paradm.system.service.impl;

import com.paradm.system.dao.SysNotificationGroupMapper;
import com.paradm.system.entity.SysNotificationGroup;
import com.paradm.system.entity.SysNotificationGroupExample;
import com.paradm.system.service.SysNotificationGroupService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysNotificationGroupServiceImpl implements SysNotificationGroupService {
    @Autowired
    private SysNotificationGroupMapper sysNotificationGroupMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysNotificationGroupServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#countByExample(com.paradm.system.entity.SysNotificationGroupExample)
     */ 
    @Override
    public int countByExample(SysNotificationGroupExample example) {
        int count = this.sysNotificationGroupMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public SysNotificationGroup selectByPrimaryKey(Long id) {
        return this.sysNotificationGroupMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#selectByExample(com.paradm.system.entity.SysNotificationGroupExample)
     */ 
    @Override
    public List<SysNotificationGroup> selectByExample(SysNotificationGroupExample example) {
        return this.sysNotificationGroupMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#deleteByExample(com.paradm.system.entity.SysNotificationGroupExample)
     */ 
    @Override
    public int deleteByExample(SysNotificationGroupExample example) {
        return this.sysNotificationGroupMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.sysNotificationGroupMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#insert(com.paradm.system.entity.SysNotificationGroup)
     */ 
    @Override
    public int insert(SysNotificationGroup record) {
        return this.sysNotificationGroupMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#insertSelective(com.paradm.system.entity.SysNotificationGroup)
     */ 
    @Override
    public int insertSelective(SysNotificationGroup record) {
        return this.sysNotificationGroupMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#insertBatch(.List<SysNotificationGroup>)
     */ 
    @Override
    public int insertBatch(List<SysNotificationGroup> record) {
        return this.sysNotificationGroupMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#insertBatchSelective(.List<SysNotificationGroup>)
     */ 
    @Override
    public int insertBatchSelective(List<SysNotificationGroup> record) {
        return this.sysNotificationGroupMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#updateByPrimaryKeySelective(com.paradm.system.entity.SysNotificationGroup)
     */ 
    @Override
    public int updateByPrimaryKeySelective(SysNotificationGroup record) {
        return this.sysNotificationGroupMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#updateByPrimaryKey(com.paradm.system.entity.SysNotificationGroup)
     */ 
    @Override
    public int updateByPrimaryKey(SysNotificationGroup record) {
        return this.sysNotificationGroupMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#updateByExampleSelective(com.paradm.system.entity.SysNotificationGroupcom.paradm.system.entity.SysNotificationGroupExample)
     */ 
    @Override
    public int updateByExampleSelective(SysNotificationGroup record, SysNotificationGroupExample example) {
        return this.sysNotificationGroupMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#updateByExample(com.paradm.system.entity.SysNotificationGroupcom.paradm.system.entity.SysNotificationGroupExample)
     */ 
    @Override
    public int updateByExample(SysNotificationGroup record, SysNotificationGroupExample example) {
        return this.sysNotificationGroupMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.SysNotificationGroup)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(SysNotificationGroup record) {
        return this.sysNotificationGroupMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#selectByExampleWithBLOBs(com.paradm.system.entity.SysNotificationGroupExample)
     */ 
    @Override
    public List<SysNotificationGroup> selectByExampleWithBLOBs(SysNotificationGroupExample example) {
        return this.sysNotificationGroupMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#updateBatchByPrimaryKeySelective(.List<SysNotificationGroup>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<SysNotificationGroup> records) {
        return this.sysNotificationGroupMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysNotificationGroupService#updateBatchByPrimaryKey(.List<SysNotificationGroup>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<SysNotificationGroup> records) {
        return this.sysNotificationGroupMapper.updateBatchByPrimaryKey(records);
    }
}