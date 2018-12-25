package com.paradm.system.service.impl;

import com.paradm.system.dao.SysCountryCodeMapper;
import com.paradm.system.entity.SysCountryCode;
import com.paradm.system.entity.SysCountryCodeExample;
import com.paradm.system.service.SysCountryCodeService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysCountryCodeServiceImpl implements SysCountryCodeService {
    @Autowired
    private SysCountryCodeMapper sysCountryCodeMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysCountryCodeServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#countByExample(com.paradm.system.entity.SysCountryCodeExample)
     */ 
    @Override
    public int countByExample(SysCountryCodeExample example) {
        int count = this.sysCountryCodeMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public SysCountryCode selectByPrimaryKey(Long id) {
        return this.sysCountryCodeMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#selectByExample(com.paradm.system.entity.SysCountryCodeExample)
     */ 
    @Override
    public List<SysCountryCode> selectByExample(SysCountryCodeExample example) {
        return this.sysCountryCodeMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#deleteByExample(com.paradm.system.entity.SysCountryCodeExample)
     */ 
    @Override
    public int deleteByExample(SysCountryCodeExample example) {
        return this.sysCountryCodeMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.sysCountryCodeMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#insert(com.paradm.system.entity.SysCountryCode)
     */ 
    @Override
    public int insert(SysCountryCode record) {
        return this.sysCountryCodeMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#insertSelective(com.paradm.system.entity.SysCountryCode)
     */ 
    @Override
    public int insertSelective(SysCountryCode record) {
        return this.sysCountryCodeMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#insertBatch(.List<SysCountryCode>)
     */ 
    @Override
    public int insertBatch(List<SysCountryCode> record) {
        return this.sysCountryCodeMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#insertBatchSelective(.List<SysCountryCode>)
     */ 
    @Override
    public int insertBatchSelective(List<SysCountryCode> record) {
        return this.sysCountryCodeMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#updateByPrimaryKeySelective(com.paradm.system.entity.SysCountryCode)
     */ 
    @Override
    public int updateByPrimaryKeySelective(SysCountryCode record) {
        return this.sysCountryCodeMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#updateByPrimaryKey(com.paradm.system.entity.SysCountryCode)
     */ 
    @Override
    public int updateByPrimaryKey(SysCountryCode record) {
        return this.sysCountryCodeMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#updateByExampleSelective(com.paradm.system.entity.SysCountryCodecom.paradm.system.entity.SysCountryCodeExample)
     */ 
    @Override
    public int updateByExampleSelective(SysCountryCode record, SysCountryCodeExample example) {
        return this.sysCountryCodeMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#updateByExample(com.paradm.system.entity.SysCountryCodecom.paradm.system.entity.SysCountryCodeExample)
     */ 
    @Override
    public int updateByExample(SysCountryCode record, SysCountryCodeExample example) {
        return this.sysCountryCodeMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.SysCountryCode)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(SysCountryCode record) {
        return this.sysCountryCodeMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#selectByExampleWithBLOBs(com.paradm.system.entity.SysCountryCodeExample)
     */ 
    @Override
    public List<SysCountryCode> selectByExampleWithBLOBs(SysCountryCodeExample example) {
        return this.sysCountryCodeMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#updateBatchByPrimaryKeySelective(.List<SysCountryCode>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<SysCountryCode> records) {
        return this.sysCountryCodeMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.SysCountryCodeService#updateBatchByPrimaryKey(.List<SysCountryCode>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<SysCountryCode> records) {
        return this.sysCountryCodeMapper.updateBatchByPrimaryKey(records);
    }
}