package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskAuditTrailMapper;
import com.paradm.task.entity.TaskAuditTrail;
import com.paradm.task.entity.TaskAuditTrailExample;
import com.paradm.task.service.TaskAuditTrailService;

@Service
public class TaskAuditTrailServiceImpl implements TaskAuditTrailService {
    @Autowired
    private TaskAuditTrailMapper taskAuditTrailMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskAuditTrailServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#countByExample(com.paradm.system.entity.TaskAuditTrailExample)
     */ 
    @Override
    public int countByExample(TaskAuditTrailExample example) {
        int count = this.taskAuditTrailMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskAuditTrail selectByPrimaryKey(Long id) {
        return this.taskAuditTrailMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#selectByExample(com.paradm.system.entity.TaskAuditTrailExample)
     */ 
    @Override
    public List<TaskAuditTrail> selectByExample(TaskAuditTrailExample example) {
        return this.taskAuditTrailMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#deleteByExample(com.paradm.system.entity.TaskAuditTrailExample)
     */ 
    @Override
    public int deleteByExample(TaskAuditTrailExample example) {
        return this.taskAuditTrailMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskAuditTrailMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#insert(com.paradm.system.entity.TaskAuditTrail)
     */ 
    @Override
    public int insert(TaskAuditTrail record) {
        return this.taskAuditTrailMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#insertSelective(com.paradm.system.entity.TaskAuditTrail)
     */ 
    @Override
    public int insertSelective(TaskAuditTrail record) {
        return this.taskAuditTrailMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#insertBatch(.List<TaskAuditTrail>)
     */ 
    @Override
    public int insertBatch(List<TaskAuditTrail> record) {
        return this.taskAuditTrailMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#insertBatchSelective(.List<TaskAuditTrail>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskAuditTrail> record) {
        return this.taskAuditTrailMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskAuditTrail record) {
        return this.taskAuditTrailMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#updateByPrimaryKey(com.paradm.system.entity.TaskAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKey(TaskAuditTrail record) {
        return this.taskAuditTrailMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#updateByExampleSelective(com.paradm.system.entity.TaskAuditTrailcom.paradm.system.entity.TaskAuditTrailExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskAuditTrail record, TaskAuditTrailExample example) {
        return this.taskAuditTrailMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#updateByExample(com.paradm.system.entity.TaskAuditTrailcom.paradm.system.entity.TaskAuditTrailExample)
     */ 
    @Override
    public int updateByExample(TaskAuditTrail record, TaskAuditTrailExample example) {
        return this.taskAuditTrailMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskAuditTrail record) {
        return this.taskAuditTrailMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskAuditTrailExample)
     */ 
    @Override
    public List<TaskAuditTrail> selectByExampleWithBLOBs(TaskAuditTrailExample example) {
        return this.taskAuditTrailMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#updateBatchByPrimaryKeySelective(.List<TaskAuditTrail>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskAuditTrail> records) {
        return this.taskAuditTrailMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAuditTrailService#updateBatchByPrimaryKey(.List<TaskAuditTrail>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskAuditTrail> records) {
        return this.taskAuditTrailMapper.updateBatchByPrimaryKey(records);
    }
}