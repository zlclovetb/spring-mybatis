package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsTaskMapper;
import com.paradm.dms.entity.DmsTask;
import com.paradm.dms.entity.DmsTaskExample;
import com.paradm.dms.service.DmsTaskService;

@Service
public class DmsTaskServiceImpl implements DmsTaskService {
    @Autowired
    private DmsTaskMapper dmsTaskMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsTaskServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#countByExample(com.paradm.system.entity.DmsTaskExample)
     */ 
    @Override
    public int countByExample(DmsTaskExample example) {
        int count = this.dmsTaskMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsTask selectByPrimaryKey(Long id) {
        return this.dmsTaskMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#selectByExample(com.paradm.system.entity.DmsTaskExample)
     */ 
    @Override
    public List<DmsTask> selectByExample(DmsTaskExample example) {
        return this.dmsTaskMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#deleteByExample(com.paradm.system.entity.DmsTaskExample)
     */ 
    @Override
    public int deleteByExample(DmsTaskExample example) {
        return this.dmsTaskMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsTaskMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#insert(com.paradm.system.entity.DmsTask)
     */ 
    @Override
    public int insert(DmsTask record) {
        return this.dmsTaskMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#insertSelective(com.paradm.system.entity.DmsTask)
     */ 
    @Override
    public int insertSelective(DmsTask record) {
        return this.dmsTaskMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#insertBatch(.List<DmsTask>)
     */ 
    @Override
    public int insertBatch(List<DmsTask> record) {
        return this.dmsTaskMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#insertBatchSelective(.List<DmsTask>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsTask> record) {
        return this.dmsTaskMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsTask)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsTask record) {
        return this.dmsTaskMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#updateByPrimaryKey(com.paradm.system.entity.DmsTask)
     */ 
    @Override
    public int updateByPrimaryKey(DmsTask record) {
        return this.dmsTaskMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#updateByExampleSelective(com.paradm.system.entity.DmsTaskcom.paradm.system.entity.DmsTaskExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsTask record, DmsTaskExample example) {
        return this.dmsTaskMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#updateByExample(com.paradm.system.entity.DmsTaskcom.paradm.system.entity.DmsTaskExample)
     */ 
    @Override
    public int updateByExample(DmsTask record, DmsTaskExample example) {
        return this.dmsTaskMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsTask)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsTask record) {
        return this.dmsTaskMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsTaskExample)
     */ 
    @Override
    public List<DmsTask> selectByExampleWithBLOBs(DmsTaskExample example) {
        return this.dmsTaskMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#updateBatchByPrimaryKeySelective(.List<DmsTask>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsTask> records) {
        return this.dmsTaskMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskService#updateBatchByPrimaryKey(.List<DmsTask>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsTask> records) {
        return this.dmsTaskMapper.updateBatchByPrimaryKey(records);
    }
}