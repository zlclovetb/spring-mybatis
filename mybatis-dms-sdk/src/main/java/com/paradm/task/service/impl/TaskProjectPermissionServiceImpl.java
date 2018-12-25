package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskProjectPermissionMapper;
import com.paradm.task.entity.TaskProjectPermission;
import com.paradm.task.entity.TaskProjectPermissionExample;
import com.paradm.task.service.TaskProjectPermissionService;

@Service
public class TaskProjectPermissionServiceImpl implements TaskProjectPermissionService {
    @Autowired
    private TaskProjectPermissionMapper taskProjectPermissionMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskProjectPermissionServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#countByExample(com.paradm.system.entity.TaskProjectPermissionExample)
     */ 
    @Override
    public int countByExample(TaskProjectPermissionExample example) {
        int count = this.taskProjectPermissionMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskProjectPermission selectByPrimaryKey(Long id) {
        return this.taskProjectPermissionMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#selectByExample(com.paradm.system.entity.TaskProjectPermissionExample)
     */ 
    @Override
    public List<TaskProjectPermission> selectByExample(TaskProjectPermissionExample example) {
        return this.taskProjectPermissionMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#deleteByExample(com.paradm.system.entity.TaskProjectPermissionExample)
     */ 
    @Override
    public int deleteByExample(TaskProjectPermissionExample example) {
        return this.taskProjectPermissionMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskProjectPermissionMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#insert(com.paradm.system.entity.TaskProjectPermission)
     */ 
    @Override
    public int insert(TaskProjectPermission record) {
        return this.taskProjectPermissionMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#insertSelective(com.paradm.system.entity.TaskProjectPermission)
     */ 
    @Override
    public int insertSelective(TaskProjectPermission record) {
        return this.taskProjectPermissionMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#insertBatch(.List<TaskProjectPermission>)
     */ 
    @Override
    public int insertBatch(List<TaskProjectPermission> record) {
        return this.taskProjectPermissionMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#insertBatchSelective(.List<TaskProjectPermission>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskProjectPermission> record) {
        return this.taskProjectPermissionMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskProjectPermission)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskProjectPermission record) {
        return this.taskProjectPermissionMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#updateByPrimaryKey(com.paradm.system.entity.TaskProjectPermission)
     */ 
    @Override
    public int updateByPrimaryKey(TaskProjectPermission record) {
        return this.taskProjectPermissionMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#updateByExampleSelective(com.paradm.system.entity.TaskProjectPermissioncom.paradm.system.entity.TaskProjectPermissionExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskProjectPermission record, TaskProjectPermissionExample example) {
        return this.taskProjectPermissionMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#updateByExample(com.paradm.system.entity.TaskProjectPermissioncom.paradm.system.entity.TaskProjectPermissionExample)
     */ 
    @Override
    public int updateByExample(TaskProjectPermission record, TaskProjectPermissionExample example) {
        return this.taskProjectPermissionMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskProjectPermission)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskProjectPermission record) {
        return this.taskProjectPermissionMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskProjectPermissionExample)
     */ 
    @Override
    public List<TaskProjectPermission> selectByExampleWithBLOBs(TaskProjectPermissionExample example) {
        return this.taskProjectPermissionMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#updateBatchByPrimaryKeySelective(.List<TaskProjectPermission>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskProjectPermission> records) {
        return this.taskProjectPermissionMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectPermissionService#updateBatchByPrimaryKey(.List<TaskProjectPermission>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskProjectPermission> records) {
        return this.taskProjectPermissionMapper.updateBatchByPrimaryKey(records);
    }
}