package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsRootMapper;
import com.paradm.dms.entity.DmsRoot;
import com.paradm.dms.entity.DmsRootExample;
import com.paradm.dms.service.DmsRootService;

@Service
public class DmsRootServiceImpl implements DmsRootService {
    @Autowired
    private DmsRootMapper dmsRootMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsRootServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#countByExample(com.paradm.system.entity.DmsRootExample)
     */ 
    @Override
    public int countByExample(DmsRootExample example) {
        int count = this.dmsRootMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsRoot selectByPrimaryKey(Long id) {
        return this.dmsRootMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#selectByExample(com.paradm.system.entity.DmsRootExample)
     */ 
    @Override
    public List<DmsRoot> selectByExample(DmsRootExample example) {
        return this.dmsRootMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#deleteByExample(com.paradm.system.entity.DmsRootExample)
     */ 
    @Override
    public int deleteByExample(DmsRootExample example) {
        return this.dmsRootMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsRootMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#insert(com.paradm.system.entity.DmsRoot)
     */ 
    @Override
    public int insert(DmsRoot record) {
        return this.dmsRootMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#insertSelective(com.paradm.system.entity.DmsRoot)
     */ 
    @Override
    public int insertSelective(DmsRoot record) {
        return this.dmsRootMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#insertBatch(.List<DmsRoot>)
     */ 
    @Override
    public int insertBatch(List<DmsRoot> record) {
        return this.dmsRootMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#insertBatchSelective(.List<DmsRoot>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsRoot> record) {
        return this.dmsRootMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsRoot)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsRoot record) {
        return this.dmsRootMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#updateByPrimaryKey(com.paradm.system.entity.DmsRoot)
     */ 
    @Override
    public int updateByPrimaryKey(DmsRoot record) {
        return this.dmsRootMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#updateByExampleSelective(com.paradm.system.entity.DmsRootcom.paradm.system.entity.DmsRootExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsRoot record, DmsRootExample example) {
        return this.dmsRootMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#updateByExample(com.paradm.system.entity.DmsRootcom.paradm.system.entity.DmsRootExample)
     */ 
    @Override
    public int updateByExample(DmsRoot record, DmsRootExample example) {
        return this.dmsRootMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsRoot)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsRoot record) {
        return this.dmsRootMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsRootExample)
     */ 
    @Override
    public List<DmsRoot> selectByExampleWithBLOBs(DmsRootExample example) {
        return this.dmsRootMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#updateBatchByPrimaryKeySelective(.List<DmsRoot>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsRoot> records) {
        return this.dmsRootMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsRootService#updateBatchByPrimaryKey(.List<DmsRoot>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsRoot> records) {
        return this.dmsRootMapper.updateBatchByPrimaryKey(records);
    }
}