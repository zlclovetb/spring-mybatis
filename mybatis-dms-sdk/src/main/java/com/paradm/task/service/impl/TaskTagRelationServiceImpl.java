package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskTagRelationMapper;
import com.paradm.task.entity.TaskTagRelation;
import com.paradm.task.entity.TaskTagRelationExample;
import com.paradm.task.service.TaskTagRelationService;

@Service
public class TaskTagRelationServiceImpl implements TaskTagRelationService {
    @Autowired
    private TaskTagRelationMapper taskTagRelationMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskTagRelationServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#countByExample(com.paradm.system.entity.TaskTagRelationExample)
     */ 
    @Override
    public int countByExample(TaskTagRelationExample example) {
        int count = this.taskTagRelationMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskTagRelation selectByPrimaryKey(Long id) {
        return this.taskTagRelationMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#selectByExample(com.paradm.system.entity.TaskTagRelationExample)
     */ 
    @Override
    public List<TaskTagRelation> selectByExample(TaskTagRelationExample example) {
        return this.taskTagRelationMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#deleteByExample(com.paradm.system.entity.TaskTagRelationExample)
     */ 
    @Override
    public int deleteByExample(TaskTagRelationExample example) {
        return this.taskTagRelationMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskTagRelationMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#insert(com.paradm.system.entity.TaskTagRelation)
     */ 
    @Override
    public int insert(TaskTagRelation record) {
        return this.taskTagRelationMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#insertSelective(com.paradm.system.entity.TaskTagRelation)
     */ 
    @Override
    public int insertSelective(TaskTagRelation record) {
        return this.taskTagRelationMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#insertBatch(.List<TaskTagRelation>)
     */ 
    @Override
    public int insertBatch(List<TaskTagRelation> record) {
        return this.taskTagRelationMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#insertBatchSelective(.List<TaskTagRelation>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskTagRelation> record) {
        return this.taskTagRelationMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskTagRelation)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskTagRelation record) {
        return this.taskTagRelationMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#updateByPrimaryKey(com.paradm.system.entity.TaskTagRelation)
     */ 
    @Override
    public int updateByPrimaryKey(TaskTagRelation record) {
        return this.taskTagRelationMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#updateByExampleSelective(com.paradm.system.entity.TaskTagRelationcom.paradm.system.entity.TaskTagRelationExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskTagRelation record, TaskTagRelationExample example) {
        return this.taskTagRelationMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#updateByExample(com.paradm.system.entity.TaskTagRelationcom.paradm.system.entity.TaskTagRelationExample)
     */ 
    @Override
    public int updateByExample(TaskTagRelation record, TaskTagRelationExample example) {
        return this.taskTagRelationMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskTagRelation)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskTagRelation record) {
        return this.taskTagRelationMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskTagRelationExample)
     */ 
    @Override
    public List<TaskTagRelation> selectByExampleWithBLOBs(TaskTagRelationExample example) {
        return this.taskTagRelationMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#updateBatchByPrimaryKeySelective(.List<TaskTagRelation>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskTagRelation> records) {
        return this.taskTagRelationMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskTagRelationService#updateBatchByPrimaryKey(.List<TaskTagRelation>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskTagRelation> records) {
        return this.taskTagRelationMapper.updateBatchByPrimaryKey(records);
    }
}