package com.paradm.system.service.impl;

import com.paradm.system.dao.SysAuditTrailMapper;
import com.paradm.system.entity.SysAuditTrail;
import com.paradm.system.entity.SysAuditTrailExample;
import com.paradm.system.service.SysAuditTrailService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysAuditTrailServiceImpl implements SysAuditTrailService {
    @Autowired
    private SysAuditTrailMapper sysAuditTrailMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysAuditTrailServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#countByExample(com.paradm.system.entity.SysAuditTrailExample)
     */ 
    @Override
    public int countByExample(SysAuditTrailExample example) {
        int count = this.sysAuditTrailMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public SysAuditTrail selectByPrimaryKey(Long id) {
        return this.sysAuditTrailMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#selectByExample(com.paradm.system.entity.SysAuditTrailExample)
     */ 
    @Override
    public List<SysAuditTrail> selectByExample(SysAuditTrailExample example) {
        return this.sysAuditTrailMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#deleteByExample(com.paradm.system.entity.SysAuditTrailExample)
     */ 
    @Override
    public int deleteByExample(SysAuditTrailExample example) {
        return this.sysAuditTrailMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.sysAuditTrailMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#insert(com.paradm.system.entity.SysAuditTrail)
     */ 
    @Override
    public int insert(SysAuditTrail record) {
        return this.sysAuditTrailMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#insertSelective(com.paradm.system.entity.SysAuditTrail)
     */ 
    @Override
    public int insertSelective(SysAuditTrail record) {
        return this.sysAuditTrailMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#insertBatch(.List<SysAuditTrail>)
     */ 
    @Override
    public int insertBatch(List<SysAuditTrail> record) {
        return this.sysAuditTrailMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#insertBatchSelective(.List<SysAuditTrail>)
     */ 
    @Override
    public int insertBatchSelective(List<SysAuditTrail> record) {
        return this.sysAuditTrailMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#updateByPrimaryKeySelective(com.paradm.system.entity.SysAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKeySelective(SysAuditTrail record) {
        return this.sysAuditTrailMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#updateByPrimaryKey(com.paradm.system.entity.SysAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKey(SysAuditTrail record) {
        return this.sysAuditTrailMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#updateByExampleSelective(com.paradm.system.entity.SysAuditTrailcom.paradm.system.entity.SysAuditTrailExample)
     */ 
    @Override
    public int updateByExampleSelective(SysAuditTrail record, SysAuditTrailExample example) {
        return this.sysAuditTrailMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#updateByExample(com.paradm.system.entity.SysAuditTrailcom.paradm.system.entity.SysAuditTrailExample)
     */ 
    @Override
    public int updateByExample(SysAuditTrail record, SysAuditTrailExample example) {
        return this.sysAuditTrailMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.SysAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(SysAuditTrail record) {
        return this.sysAuditTrailMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#selectByExampleWithBLOBs(com.paradm.system.entity.SysAuditTrailExample)
     */ 
    @Override
    public List<SysAuditTrail> selectByExampleWithBLOBs(SysAuditTrailExample example) {
        return this.sysAuditTrailMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#updateBatchByPrimaryKeySelective(.List<SysAuditTrail>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<SysAuditTrail> records) {
        return this.sysAuditTrailMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysAuditTrailService#updateBatchByPrimaryKey(.List<SysAuditTrail>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<SysAuditTrail> records) {
        return this.sysAuditTrailMapper.updateBatchByPrimaryKey(records);
    }
}