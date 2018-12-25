package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskProjectRecordMapper;
import com.paradm.task.entity.TaskProjectRecord;
import com.paradm.task.entity.TaskProjectRecordExample;
import com.paradm.task.service.TaskProjectRecordService;

@Service
public class TaskProjectRecordServiceImpl implements TaskProjectRecordService {
    @Autowired
    private TaskProjectRecordMapper taskProjectRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskProjectRecordServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#countByExample(com.paradm.system.entity.TaskProjectRecordExample)
     */ 
    @Override
    public int countByExample(TaskProjectRecordExample example) {
        int count = this.taskProjectRecordMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskProjectRecord selectByPrimaryKey(Long id) {
        return this.taskProjectRecordMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#selectByExample(com.paradm.system.entity.TaskProjectRecordExample)
     */ 
    @Override
    public List<TaskProjectRecord> selectByExample(TaskProjectRecordExample example) {
        return this.taskProjectRecordMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#deleteByExample(com.paradm.system.entity.TaskProjectRecordExample)
     */ 
    @Override
    public int deleteByExample(TaskProjectRecordExample example) {
        return this.taskProjectRecordMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskProjectRecordMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#insert(com.paradm.system.entity.TaskProjectRecord)
     */ 
    @Override
    public int insert(TaskProjectRecord record) {
        return this.taskProjectRecordMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#insertSelective(com.paradm.system.entity.TaskProjectRecord)
     */ 
    @Override
    public int insertSelective(TaskProjectRecord record) {
        return this.taskProjectRecordMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#insertBatch(.List<TaskProjectRecord>)
     */ 
    @Override
    public int insertBatch(List<TaskProjectRecord> record) {
        return this.taskProjectRecordMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#insertBatchSelective(.List<TaskProjectRecord>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskProjectRecord> record) {
        return this.taskProjectRecordMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskProjectRecord)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskProjectRecord record) {
        return this.taskProjectRecordMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#updateByPrimaryKey(com.paradm.system.entity.TaskProjectRecord)
     */ 
    @Override
    public int updateByPrimaryKey(TaskProjectRecord record) {
        return this.taskProjectRecordMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#updateByExampleSelective(com.paradm.system.entity.TaskProjectRecordcom.paradm.system.entity.TaskProjectRecordExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskProjectRecord record, TaskProjectRecordExample example) {
        return this.taskProjectRecordMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#updateByExample(com.paradm.system.entity.TaskProjectRecordcom.paradm.system.entity.TaskProjectRecordExample)
     */ 
    @Override
    public int updateByExample(TaskProjectRecord record, TaskProjectRecordExample example) {
        return this.taskProjectRecordMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskProjectRecord)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskProjectRecord record) {
        return this.taskProjectRecordMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskProjectRecordExample)
     */ 
    @Override
    public List<TaskProjectRecord> selectByExampleWithBLOBs(TaskProjectRecordExample example) {
        return this.taskProjectRecordMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#updateBatchByPrimaryKeySelective(.List<TaskProjectRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskProjectRecord> records) {
        return this.taskProjectRecordMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskProjectRecordService#updateBatchByPrimaryKey(.List<TaskProjectRecord>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskProjectRecord> records) {
        return this.taskProjectRecordMapper.updateBatchByPrimaryKey(records);
    }
}