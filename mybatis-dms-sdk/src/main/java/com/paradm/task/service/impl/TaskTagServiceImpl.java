package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskTagMapper;
import com.paradm.task.entity.TaskTag;
import com.paradm.task.entity.TaskTagExample;
import com.paradm.task.service.TaskTagService;

@Service
public class TaskTagServiceImpl implements TaskTagService {
    @Autowired
    private TaskTagMapper taskTagMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskTagServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#countByExample(com.paradm.system.entity.TaskTagExample)
     */ 
    @Override
    public int countByExample(TaskTagExample example) {
        int count = this.taskTagMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskTag selectByPrimaryKey(Long id) {
        return this.taskTagMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#selectByExample(com.paradm.system.entity.TaskTagExample)
     */ 
    @Override
    public List<TaskTag> selectByExample(TaskTagExample example) {
        return this.taskTagMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#deleteByExample(com.paradm.system.entity.TaskTagExample)
     */ 
    @Override
    public int deleteByExample(TaskTagExample example) {
        return this.taskTagMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskTagMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#insert(com.paradm.system.entity.TaskTag)
     */ 
    @Override
    public int insert(TaskTag record) {
        return this.taskTagMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#insertSelective(com.paradm.system.entity.TaskTag)
     */ 
    @Override
    public int insertSelective(TaskTag record) {
        return this.taskTagMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#insertBatch(.List<TaskTag>)
     */ 
    @Override
    public int insertBatch(List<TaskTag> record) {
        return this.taskTagMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#insertBatchSelective(.List<TaskTag>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskTag> record) {
        return this.taskTagMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskTag)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskTag record) {
        return this.taskTagMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#updateByPrimaryKey(com.paradm.system.entity.TaskTag)
     */ 
    @Override
    public int updateByPrimaryKey(TaskTag record) {
        return this.taskTagMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#updateByExampleSelective(com.paradm.system.entity.TaskTagcom.paradm.system.entity.TaskTagExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskTag record, TaskTagExample example) {
        return this.taskTagMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#updateByExample(com.paradm.system.entity.TaskTagcom.paradm.system.entity.TaskTagExample)
     */ 
    @Override
    public int updateByExample(TaskTag record, TaskTagExample example) {
        return this.taskTagMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskTag)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskTag record) {
        return this.taskTagMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskTagExample)
     */ 
    @Override
    public List<TaskTag> selectByExampleWithBLOBs(TaskTagExample example) {
        return this.taskTagMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#updateBatchByPrimaryKeySelective(.List<TaskTag>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskTag> records) {
        return this.taskTagMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagService#updateBatchByPrimaryKey(.List<TaskTag>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskTag> records) {
        return this.taskTagMapper.updateBatchByPrimaryKey(records);
    }
}