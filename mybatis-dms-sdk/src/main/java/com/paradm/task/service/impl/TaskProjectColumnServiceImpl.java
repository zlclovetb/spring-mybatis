package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskProjectColumnMapper;
import com.paradm.task.entity.TaskProjectColumn;
import com.paradm.task.entity.TaskProjectColumnExample;
import com.paradm.task.service.TaskProjectColumnService;

@Service
public class TaskProjectColumnServiceImpl implements TaskProjectColumnService {
    @Autowired
    private TaskProjectColumnMapper taskProjectColumnMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskProjectColumnServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#countByExample(com.paradm.system.entity.TaskProjectColumnExample)
     */ 
    @Override
    public int countByExample(TaskProjectColumnExample example) {
        int count = this.taskProjectColumnMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskProjectColumn selectByPrimaryKey(Long id) {
        return this.taskProjectColumnMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#selectByExample(com.paradm.system.entity.TaskProjectColumnExample)
     */ 
    @Override
    public List<TaskProjectColumn> selectByExample(TaskProjectColumnExample example) {
        return this.taskProjectColumnMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#deleteByExample(com.paradm.system.entity.TaskProjectColumnExample)
     */ 
    @Override
    public int deleteByExample(TaskProjectColumnExample example) {
        return this.taskProjectColumnMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskProjectColumnMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#insert(com.paradm.system.entity.TaskProjectColumn)
     */ 
    @Override
    public int insert(TaskProjectColumn record) {
        return this.taskProjectColumnMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#insertSelective(com.paradm.system.entity.TaskProjectColumn)
     */ 
    @Override
    public int insertSelective(TaskProjectColumn record) {
        return this.taskProjectColumnMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#insertBatch(.List<TaskProjectColumn>)
     */ 
    @Override
    public int insertBatch(List<TaskProjectColumn> record) {
        return this.taskProjectColumnMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#insertBatchSelective(.List<TaskProjectColumn>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskProjectColumn> record) {
        return this.taskProjectColumnMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskProjectColumn)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskProjectColumn record) {
        return this.taskProjectColumnMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#updateByPrimaryKey(com.paradm.system.entity.TaskProjectColumn)
     */ 
    @Override
    public int updateByPrimaryKey(TaskProjectColumn record) {
        return this.taskProjectColumnMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#updateByExampleSelective(com.paradm.system.entity.TaskProjectColumncom.paradm.system.entity.TaskProjectColumnExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskProjectColumn record, TaskProjectColumnExample example) {
        return this.taskProjectColumnMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#updateByExample(com.paradm.system.entity.TaskProjectColumncom.paradm.system.entity.TaskProjectColumnExample)
     */ 
    @Override
    public int updateByExample(TaskProjectColumn record, TaskProjectColumnExample example) {
        return this.taskProjectColumnMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskProjectColumn)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskProjectColumn record) {
        return this.taskProjectColumnMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskProjectColumnExample)
     */ 
    @Override
    public List<TaskProjectColumn> selectByExampleWithBLOBs(TaskProjectColumnExample example) {
        return this.taskProjectColumnMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#updateBatchByPrimaryKeySelective(.List<TaskProjectColumn>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskProjectColumn> records) {
        return this.taskProjectColumnMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectColumnService#updateBatchByPrimaryKey(.List<TaskProjectColumn>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskProjectColumn> records) {
        return this.taskProjectColumnMapper.updateBatchByPrimaryKey(records);
    }
}