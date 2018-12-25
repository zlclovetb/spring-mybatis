package com.paradm.system.service.impl;

import com.paradm.system.dao.SysLoginAuditTrailMapper;
import com.paradm.system.entity.SysLoginAuditTrail;
import com.paradm.system.entity.SysLoginAuditTrailExample;
import com.paradm.system.service.SysLoginAuditTrailService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLoginAuditTrailServiceImpl implements SysLoginAuditTrailService {
    @Autowired
    private SysLoginAuditTrailMapper sysLoginAuditTrailMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysLoginAuditTrailServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#countByExample(com.paradm.system.entity.SysLoginAuditTrailExample)
     */ 
    @Override
    public int countByExample(SysLoginAuditTrailExample example) {
        int count = this.sysLoginAuditTrailMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public SysLoginAuditTrail selectByPrimaryKey(Long id) {
        return this.sysLoginAuditTrailMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#selectByExample(com.paradm.system.entity.SysLoginAuditTrailExample)
     */ 
    @Override
    public List<SysLoginAuditTrail> selectByExample(SysLoginAuditTrailExample example) {
        return this.sysLoginAuditTrailMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#deleteByExample(com.paradm.system.entity.SysLoginAuditTrailExample)
     */ 
    @Override
    public int deleteByExample(SysLoginAuditTrailExample example) {
        return this.sysLoginAuditTrailMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.sysLoginAuditTrailMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#insert(com.paradm.system.entity.SysLoginAuditTrail)
     */ 
    @Override
    public int insert(SysLoginAuditTrail record) {
        return this.sysLoginAuditTrailMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#insertSelective(com.paradm.system.entity.SysLoginAuditTrail)
     */ 
    @Override
    public int insertSelective(SysLoginAuditTrail record) {
        return this.sysLoginAuditTrailMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#insertBatch(.List<SysLoginAuditTrail>)
     */ 
    @Override
    public int insertBatch(List<SysLoginAuditTrail> record) {
        return this.sysLoginAuditTrailMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#insertBatchSelective(.List<SysLoginAuditTrail>)
     */ 
    @Override
    public int insertBatchSelective(List<SysLoginAuditTrail> record) {
        return this.sysLoginAuditTrailMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#updateByPrimaryKeySelective(com.paradm.system.entity.SysLoginAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKeySelective(SysLoginAuditTrail record) {
        return this.sysLoginAuditTrailMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#updateByPrimaryKey(com.paradm.system.entity.SysLoginAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKey(SysLoginAuditTrail record) {
        return this.sysLoginAuditTrailMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#updateByExampleSelective(com.paradm.system.entity.SysLoginAuditTrailcom.paradm.system.entity.SysLoginAuditTrailExample)
     */ 
    @Override
    public int updateByExampleSelective(SysLoginAuditTrail record, SysLoginAuditTrailExample example) {
        return this.sysLoginAuditTrailMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#updateByExample(com.paradm.system.entity.SysLoginAuditTrailcom.paradm.system.entity.SysLoginAuditTrailExample)
     */ 
    @Override
    public int updateByExample(SysLoginAuditTrail record, SysLoginAuditTrailExample example) {
        return this.sysLoginAuditTrailMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.SysLoginAuditTrail)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(SysLoginAuditTrail record) {
        return this.sysLoginAuditTrailMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#selectByExampleWithBLOBs(com.paradm.system.entity.SysLoginAuditTrailExample)
     */ 
    @Override
    public List<SysLoginAuditTrail> selectByExampleWithBLOBs(SysLoginAuditTrailExample example) {
        return this.sysLoginAuditTrailMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#updateBatchByPrimaryKeySelective(.List<SysLoginAuditTrail>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<SysLoginAuditTrail> records) {
        return this.sysLoginAuditTrailMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysLoginAuditTrailService#updateBatchByPrimaryKey(.List<SysLoginAuditTrail>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<SysLoginAuditTrail> records) {
        return this.sysLoginAuditTrailMapper.updateBatchByPrimaryKey(records);
    }
}