package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsAuditTrailMapper;
import com.paradm.dms.entity.DmsAuditTrail;
import com.paradm.dms.entity.DmsAuditTrailExample;
import com.paradm.dms.service.DmsAuditTrailService;

@Service
public class DmsAuditTrailServiceImpl implements DmsAuditTrailService {
    @Autowired
    private DmsAuditTrailMapper dmsAuditTrailMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsAuditTrailServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#countByExample(com.paradm.system.entity.DmsAuditTrailExample)
     */ 
    @Override
    public int countByExample(DmsAuditTrailExample example) {
        int count = this.dmsAuditTrailMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsAuditTrail selectByPrimaryKey(Long id) {
        return this.dmsAuditTrailMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#selectByExample(com.paradm.system.entity.DmsAuditTrailExample)
     */ 
    @Override
    public List<DmsAuditTrail> selectByExample(DmsAuditTrailExample example) {
        return this.dmsAuditTrailMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#deleteByExample(com.paradm.system.entity.DmsAuditTrailExample)
     */ 
    @Override
    public int deleteByExample(DmsAuditTrailExample example) {
        return this.dmsAuditTrailMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsAuditTrailMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#insert(com.paradm.system.entity.DmsAuditTrail)
     */ 
    @Override
    public int insert(DmsAuditTrail record) {
        return this.dmsAuditTrailMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#insertSelective(com.paradm.system.entity.DmsAuditTrail)
     */ 
    @Override
    public int insertSelective(DmsAuditTrail record) {
        return this.dmsAuditTrailMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#insertBatch(.List<DmsAuditTrail>)
     */ 
    @Override
    public int insertBatch(List<DmsAuditTrail> record) {
        return this.dmsAuditTrailMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#insertBatchSelective(.List<DmsAuditTrail>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsAuditTrail> record) {
        return this.dmsAuditTrailMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsAuditTrail record) {
        return this.dmsAuditTrailMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#updateByPrimaryKey(com.paradm.system.entity.DmsAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKey(DmsAuditTrail record) {
        return this.dmsAuditTrailMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#updateByExampleSelective(com.paradm.system.entity.DmsAuditTrailcom.paradm.system.entity.DmsAuditTrailExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsAuditTrail record, DmsAuditTrailExample example) {
        return this.dmsAuditTrailMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#updateByExample(com.paradm.system.entity.DmsAuditTrailcom.paradm.system.entity.DmsAuditTrailExample)
     */ 
    @Override
    public int updateByExample(DmsAuditTrail record, DmsAuditTrailExample example) {
        return this.dmsAuditTrailMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsAuditTrail record) {
        return this.dmsAuditTrailMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsAuditTrailExample)
     */ 
    @Override
    public List<DmsAuditTrail> selectByExampleWithBLOBs(DmsAuditTrailExample example) {
        return this.dmsAuditTrailMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#updateBatchByPrimaryKeySelective(.List<DmsAuditTrail>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsAuditTrail> records) {
        return this.dmsAuditTrailMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAuditTrailService#updateBatchByPrimaryKey(.List<DmsAuditTrail>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsAuditTrail> records) {
        return this.dmsAuditTrailMapper.updateBatchByPrimaryKey(records);
    }
}