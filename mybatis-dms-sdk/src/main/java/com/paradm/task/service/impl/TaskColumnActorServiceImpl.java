package com.paradm.task.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.task.dao.TaskColumnActorMapper;
import com.paradm.task.entity.TaskColumnActor;
import com.paradm.task.entity.TaskColumnActorExample;
import com.paradm.task.service.TaskColumnActorService;

@Service
public class TaskColumnActorServiceImpl implements TaskColumnActorService {
    @Autowired
    private TaskColumnActorMapper taskColumnActorMapper;

    private static final Logger logger = LoggerFactory.getLogger(TaskColumnActorServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#countByExample(com.paradm.system.entity.TaskColumnActorExample)
     */ 
    @Override
    public int countByExample(TaskColumnActorExample example) {
        int count = this.taskColumnActorMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TaskColumnActor selectByPrimaryKey(Long id) {
        return this.taskColumnActorMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#selectByExample(com.paradm.system.entity.TaskColumnActorExample)
     */ 
    @Override
    public List<TaskColumnActor> selectByExample(TaskColumnActorExample example) {
        return this.taskColumnActorMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#deleteByExample(com.paradm.system.entity.TaskColumnActorExample)
     */ 
    @Override
    public int deleteByExample(TaskColumnActorExample example) {
        return this.taskColumnActorMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.taskColumnActorMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#insert(com.paradm.system.entity.TaskColumnActor)
     */ 
    @Override
    public int insert(TaskColumnActor record) {
        return this.taskColumnActorMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#insertSelective(com.paradm.system.entity.TaskColumnActor)
     */ 
    @Override
    public int insertSelective(TaskColumnActor record) {
        return this.taskColumnActorMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#insertBatch(.List<TaskColumnActor>)
     */ 
    @Override
    public int insertBatch(List<TaskColumnActor> record) {
        return this.taskColumnActorMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#insertBatchSelective(.List<TaskColumnActor>)
     */ 
    @Override
    public int insertBatchSelective(List<TaskColumnActor> record) {
        return this.taskColumnActorMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#updateByPrimaryKeySelective(com.paradm.system.entity.TaskColumnActor)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TaskColumnActor record) {
        return this.taskColumnActorMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#updateByPrimaryKey(com.paradm.system.entity.TaskColumnActor)
     */ 
    @Override
    public int updateByPrimaryKey(TaskColumnActor record) {
        return this.taskColumnActorMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#updateByExampleSelective(com.paradm.system.entity.TaskColumnActorcom.paradm.system.entity.TaskColumnActorExample)
     */ 
    @Override
    public int updateByExampleSelective(TaskColumnActor record, TaskColumnActorExample example) {
        return this.taskColumnActorMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#updateByExample(com.paradm.system.entity.TaskColumnActorcom.paradm.system.entity.TaskColumnActorExample)
     */ 
    @Override
    public int updateByExample(TaskColumnActor record, TaskColumnActorExample example) {
        return this.taskColumnActorMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TaskColumnActor)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TaskColumnActor record) {
        return this.taskColumnActorMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#selectByExampleWithBLOBs(com.paradm.system.entity.TaskColumnActorExample)
     */ 
    @Override
    public List<TaskColumnActor> selectByExampleWithBLOBs(TaskColumnActorExample example) {
        return this.taskColumnActorMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#updateBatchByPrimaryKeySelective(.List<TaskColumnActor>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TaskColumnActor> records) {
        return this.taskColumnActorMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TaskColumnActorService#updateBatchByPrimaryKey(.List<TaskColumnActor>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TaskColumnActor> records) {
        return this.taskColumnActorMapper.updateBatchByPrimaryKey(records);
    }
}