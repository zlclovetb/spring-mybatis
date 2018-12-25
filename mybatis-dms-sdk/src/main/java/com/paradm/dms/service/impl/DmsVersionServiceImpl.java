package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsVersionMapper;
import com.paradm.dms.entity.DmsVersion;
import com.paradm.dms.entity.DmsVersionExample;
import com.paradm.dms.service.DmsVersionService;

@Service
public class DmsVersionServiceImpl implements DmsVersionService {
    @Autowired
    private DmsVersionMapper dmsVersionMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsVersionServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#countByExample(com.paradm.system.entity.DmsVersionExample)
     */ 
    @Override
    public int countByExample(DmsVersionExample example) {
        int count = this.dmsVersionMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsVersion selectByPrimaryKey(Long id) {
        return this.dmsVersionMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#selectByExample(com.paradm.system.entity.DmsVersionExample)
     */ 
    @Override
    public List<DmsVersion> selectByExample(DmsVersionExample example) {
        return this.dmsVersionMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#deleteByExample(com.paradm.system.entity.DmsVersionExample)
     */ 
    @Override
    public int deleteByExample(DmsVersionExample example) {
        return this.dmsVersionMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsVersionMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#insert(com.paradm.system.entity.DmsVersion)
     */ 
    @Override
    public int insert(DmsVersion record) {
        return this.dmsVersionMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#insertSelective(com.paradm.system.entity.DmsVersion)
     */ 
    @Override
    public int insertSelective(DmsVersion record) {
        return this.dmsVersionMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#insertBatch(.List<DmsVersion>)
     */ 
    @Override
    public int insertBatch(List<DmsVersion> record) {
        return this.dmsVersionMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#insertBatchSelective(.List<DmsVersion>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsVersion> record) {
        return this.dmsVersionMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsVersion)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsVersion record) {
        return this.dmsVersionMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#updateByPrimaryKey(com.paradm.system.entity.DmsVersion)
     */ 
    @Override
    public int updateByPrimaryKey(DmsVersion record) {
        return this.dmsVersionMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#updateByExampleSelective(com.paradm.system.entity.DmsVersioncom.paradm.system.entity.DmsVersionExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsVersion record, DmsVersionExample example) {
        return this.dmsVersionMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#updateByExample(com.paradm.system.entity.DmsVersioncom.paradm.system.entity.DmsVersionExample)
     */ 
    @Override
    public int updateByExample(DmsVersion record, DmsVersionExample example) {
        return this.dmsVersionMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsVersion)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsVersion record) {
        return this.dmsVersionMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsVersionExample)
     */ 
    @Override
    public List<DmsVersion> selectByExampleWithBLOBs(DmsVersionExample example) {
        return this.dmsVersionMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#updateBatchByPrimaryKeySelective(.List<DmsVersion>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsVersion> records) {
        return this.dmsVersionMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsVersionService#updateBatchByPrimaryKey(.List<DmsVersion>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsVersion> records) {
        return this.dmsVersionMapper.updateBatchByPrimaryKey(records);
    }
}