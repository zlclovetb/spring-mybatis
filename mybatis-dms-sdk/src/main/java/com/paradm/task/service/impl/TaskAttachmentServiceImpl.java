package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskAttachmentMapper;
import com.paradm.task.entity.TaskAttachment;
import com.paradm.task.entity.TaskAttachmentExample;
import com.paradm.task.service.TaskAttachmentService;

@Service
public class TaskAttachmentServiceImpl implements TaskAttachmentService {
    @Autowired
    private TaskAttachmentMapper taskAttachmentMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskAttachmentServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#countByExample(com.paradm.system.entity.TaskAttachmentExample)
     */ 
    @Override
    public int countByExample(TaskAttachmentExample example) {
        int count = this.taskAttachmentMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskAttachment selectByPrimaryKey(Long id) {
        return this.taskAttachmentMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#selectByExample(com.paradm.system.entity.TaskAttachmentExample)
     */ 
    @Override
    public List<TaskAttachment> selectByExample(TaskAttachmentExample example) {
        return this.taskAttachmentMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#deleteByExample(com.paradm.system.entity.TaskAttachmentExample)
     */ 
    @Override
    public int deleteByExample(TaskAttachmentExample example) {
        return this.taskAttachmentMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskAttachmentMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#insert(com.paradm.system.entity.TaskAttachment)
     */ 
    @Override
    public int insert(TaskAttachment record) {
        return this.taskAttachmentMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#insertSelective(com.paradm.system.entity.TaskAttachment)
     */ 
    @Override
    public int insertSelective(TaskAttachment record) {
        return this.taskAttachmentMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#insertBatch(.List<TaskAttachment>)
     */ 
    @Override
    public int insertBatch(List<TaskAttachment> record) {
        return this.taskAttachmentMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#insertBatchSelective(.List<TaskAttachment>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskAttachment> record) {
        return this.taskAttachmentMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskAttachment)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskAttachment record) {
        return this.taskAttachmentMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#updateByPrimaryKey(com.paradm.system.entity.TaskAttachment)
     */ 
    @Override
    public int updateByPrimaryKey(TaskAttachment record) {
        return this.taskAttachmentMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#updateByExampleSelective(com.paradm.system.entity.TaskAttachmentcom.paradm.system.entity.TaskAttachmentExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskAttachment record, TaskAttachmentExample example) {
        return this.taskAttachmentMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#updateByExample(com.paradm.system.entity.TaskAttachmentcom.paradm.system.entity.TaskAttachmentExample)
     */ 
    @Override
    public int updateByExample(TaskAttachment record, TaskAttachmentExample example) {
        return this.taskAttachmentMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskAttachment)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskAttachment record) {
        return this.taskAttachmentMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskAttachmentExample)
     */ 
    @Override
    public List<TaskAttachment> selectByExampleWithBLOBs(TaskAttachmentExample example) {
        return this.taskAttachmentMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#updateBatchByPrimaryKeySelective(.List<TaskAttachment>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskAttachment> records) {
        return this.taskAttachmentMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskAttachmentService#updateBatchByPrimaryKey(.List<TaskAttachment>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskAttachment> records) {
        return this.taskAttachmentMapper.updateBatchByPrimaryKey(records);
    }
}