package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskCommentMapper;
import com.paradm.task.entity.TaskComment;
import com.paradm.task.entity.TaskCommentExample;
import com.paradm.task.service.TaskCommentService;

@Service
public class TaskCommentServiceImpl implements TaskCommentService {
    @Autowired
    private TaskCommentMapper taskCommentMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskCommentServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#countByExample(com.paradm.system.entity.TaskCommentExample)
     */ 
    @Override
    public int countByExample(TaskCommentExample example) {
        int count = this.taskCommentMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskComment selectByPrimaryKey(Long id) {
        return this.taskCommentMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#selectByExample(com.paradm.system.entity.TaskCommentExample)
     */ 
    @Override
    public List<TaskComment> selectByExample(TaskCommentExample example) {
        return this.taskCommentMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#deleteByExample(com.paradm.system.entity.TaskCommentExample)
     */ 
    @Override
    public int deleteByExample(TaskCommentExample example) {
        return this.taskCommentMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskCommentMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#insert(com.paradm.system.entity.TaskComment)
     */ 
    @Override
    public int insert(TaskComment record) {
        return this.taskCommentMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#insertSelective(com.paradm.system.entity.TaskComment)
     */ 
    @Override
    public int insertSelective(TaskComment record) {
        return this.taskCommentMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#insertBatch(.List<TaskComment>)
     */ 
    @Override
    public int insertBatch(List<TaskComment> record) {
        return this.taskCommentMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#insertBatchSelective(.List<TaskComment>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskComment> record) {
        return this.taskCommentMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskComment)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskComment record) {
        return this.taskCommentMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#updateByPrimaryKey(com.paradm.system.entity.TaskComment)
     */ 
    @Override
    public int updateByPrimaryKey(TaskComment record) {
        return this.taskCommentMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#updateByExampleSelective(com.paradm.system.entity.TaskCommentcom.paradm.system.entity.TaskCommentExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskComment record, TaskCommentExample example) {
        return this.taskCommentMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#updateByExample(com.paradm.system.entity.TaskCommentcom.paradm.system.entity.TaskCommentExample)
     */ 
    @Override
    public int updateByExample(TaskComment record, TaskCommentExample example) {
        return this.taskCommentMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskComment)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskComment record) {
        return this.taskCommentMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskCommentExample)
     */ 
    @Override
    public List<TaskComment> selectByExampleWithBLOBs(TaskCommentExample example) {
        return this.taskCommentMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#updateBatchByPrimaryKeySelective(.List<TaskComment>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskComment> records) {
        return this.taskCommentMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskCommentService#updateBatchByPrimaryKey(.List<TaskComment>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskComment> records) {
        return this.taskCommentMapper.updateBatchByPrimaryKey(records);
    }
}