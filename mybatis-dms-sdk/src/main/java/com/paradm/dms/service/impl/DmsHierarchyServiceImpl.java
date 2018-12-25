package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsHierarchyMapper;
import com.paradm.dms.entity.DmsHierarchy;
import com.paradm.dms.entity.DmsHierarchyExample;
import com.paradm.dms.service.DmsHierarchyService;

@Service
public class DmsHierarchyServiceImpl implements DmsHierarchyService {
    @Autowired
    private DmsHierarchyMapper dmsHierarchyMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsHierarchyServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#countByExample(com.paradm.system.entity.DmsHierarchyExample)
     */ 
    @Override
    public int countByExample(DmsHierarchyExample example) {
        int count = this.dmsHierarchyMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsHierarchy selectByPrimaryKey(Long id) {
        return this.dmsHierarchyMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#selectByExample(com.paradm.system.entity.DmsHierarchyExample)
     */ 
    @Override
    public List<DmsHierarchy> selectByExample(DmsHierarchyExample example) {
        return this.dmsHierarchyMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#deleteByExample(com.paradm.system.entity.DmsHierarchyExample)
     */ 
    @Override
    public int deleteByExample(DmsHierarchyExample example) {
        return this.dmsHierarchyMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsHierarchyMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#insert(com.paradm.system.entity.DmsHierarchy)
     */ 
    @Override
    public int insert(DmsHierarchy record) {
        return this.dmsHierarchyMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#insertSelective(com.paradm.system.entity.DmsHierarchy)
     */ 
    @Override
    public int insertSelective(DmsHierarchy record) {
        return this.dmsHierarchyMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#insertBatch(.List<DmsHierarchy>)
     */ 
    @Override
    public int insertBatch(List<DmsHierarchy> record) {
        return this.dmsHierarchyMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#insertBatchSelective(.List<DmsHierarchy>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsHierarchy> record) {
        return this.dmsHierarchyMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsHierarchy)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsHierarchy record) {
        return this.dmsHierarchyMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#updateByPrimaryKey(com.paradm.system.entity.DmsHierarchy)
     */ 
    @Override
    public int updateByPrimaryKey(DmsHierarchy record) {
        return this.dmsHierarchyMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#updateByExampleSelective(com.paradm.system.entity.DmsHierarchycom.paradm.system.entity.DmsHierarchyExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsHierarchy record, DmsHierarchyExample example) {
        return this.dmsHierarchyMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#updateByExample(com.paradm.system.entity.DmsHierarchycom.paradm.system.entity.DmsHierarchyExample)
     */ 
    @Override
    public int updateByExample(DmsHierarchy record, DmsHierarchyExample example) {
        return this.dmsHierarchyMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsHierarchy)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsHierarchy record) {
        return this.dmsHierarchyMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsHierarchyExample)
     */ 
    @Override
    public List<DmsHierarchy> selectByExampleWithBLOBs(DmsHierarchyExample example) {
        return this.dmsHierarchyMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#updateBatchByPrimaryKeySelective(.List<DmsHierarchy>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsHierarchy> records) {
        return this.dmsHierarchyMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsHierarchyService#updateBatchByPrimaryKey(.List<DmsHierarchy>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsHierarchy> records) {
        return this.dmsHierarchyMapper.updateBatchByPrimaryKey(records);
    }
}