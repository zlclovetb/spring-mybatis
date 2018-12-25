package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskRecordMapper;
import com.paradm.task.entity.TaskRecord;
import com.paradm.task.entity.TaskRecordExample;
import com.paradm.task.service.TaskRecordService;

@Service
public class TaskRecordServiceImpl implements TaskRecordService {
    @Autowired
    private TaskRecordMapper taskRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskRecordServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#countByExample(com.paradm.system.entity.TaskRecordExample)
     */ 
    @Override
    public int countByExample(TaskRecordExample example) {
        int count = this.taskRecordMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskRecord selectByPrimaryKey(Long id) {
        return this.taskRecordMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#selectByExample(com.paradm.system.entity.TaskRecordExample)
     */ 
    @Override
    public List<TaskRecord> selectByExample(TaskRecordExample example) {
        return this.taskRecordMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#deleteByExample(com.paradm.system.entity.TaskRecordExample)
     */ 
    @Override
    public int deleteByExample(TaskRecordExample example) {
        return this.taskRecordMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskRecordMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#insert(com.paradm.system.entity.TaskRecord)
     */ 
    @Override
    public int insert(TaskRecord record) {
        return this.taskRecordMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#insertSelective(com.paradm.system.entity.TaskRecord)
     */ 
    @Override
    public int insertSelective(TaskRecord record) {
        return this.taskRecordMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#insertBatch(.List<TaskRecord>)
     */ 
    @Override
    public int insertBatch(List<TaskRecord> record) {
        return this.taskRecordMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#insertBatchSelective(.List<TaskRecord>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskRecord> record) {
        return this.taskRecordMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskRecord)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskRecord record) {
        return this.taskRecordMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#updateByPrimaryKey(com.paradm.system.entity.TaskRecord)
     */ 
    @Override
    public int updateByPrimaryKey(TaskRecord record) {
        return this.taskRecordMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#updateByExampleSelective(com.paradm.system.entity.TaskRecordcom.paradm.system.entity.TaskRecordExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskRecord record, TaskRecordExample example) {
        return this.taskRecordMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#updateByExample(com.paradm.system.entity.TaskRecordcom.paradm.system.entity.TaskRecordExample)
     */ 
    @Override
    public int updateByExample(TaskRecord record, TaskRecordExample example) {
        return this.taskRecordMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskRecord)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskRecord record) {
        return this.taskRecordMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskRecordExample)
     */ 
    @Override
    public List<TaskRecord> selectByExampleWithBLOBs(TaskRecordExample example) {
        return this.taskRecordMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#updateBatchByPrimaryKeySelective(.List<TaskRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskRecord> records) {
        return this.taskRecordMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskRecordService#updateBatchByPrimaryKey(.List<TaskRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskRecord> records) {
        return this.taskRecordMapper.updateBatchByPrimaryKey(records);
    }
}