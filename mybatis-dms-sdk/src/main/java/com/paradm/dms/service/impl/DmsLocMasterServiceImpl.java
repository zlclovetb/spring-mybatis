package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsLocMasterMapper;
import com.paradm.dms.entity.DmsLocMaster;
import com.paradm.dms.entity.DmsLocMasterExample;
import com.paradm.dms.service.DmsLocMasterService;

@Service
public class DmsLocMasterServiceImpl implements DmsLocMasterService {
    @Autowired
    private DmsLocMasterMapper dmsLocMasterMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsLocMasterServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#countByExample(com.paradm.system.entity.DmsLocMasterExample)
     */ 
    @Override
    public int countByExample(DmsLocMasterExample example) {
        int count = this.dmsLocMasterMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsLocMaster selectByPrimaryKey(Long id) {
        return this.dmsLocMasterMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#selectByExample(com.paradm.system.entity.DmsLocMasterExample)
     */ 
    @Override
    public List<DmsLocMaster> selectByExample(DmsLocMasterExample example) {
        return this.dmsLocMasterMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#deleteByExample(com.paradm.system.entity.DmsLocMasterExample)
     */ 
    @Override
    public int deleteByExample(DmsLocMasterExample example) {
        return this.dmsLocMasterMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsLocMasterMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#insert(com.paradm.system.entity.DmsLocMaster)
     */ 
    @Override
    public int insert(DmsLocMaster record) {
        return this.dmsLocMasterMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#insertSelective(com.paradm.system.entity.DmsLocMaster)
     */ 
    @Override
    public int insertSelective(DmsLocMaster record) {
        return this.dmsLocMasterMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#insertBatch(.List<DmsLocMaster>)
     */ 
    @Override
    public int insertBatch(List<DmsLocMaster> record) {
        return this.dmsLocMasterMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#insertBatchSelective(.List<DmsLocMaster>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsLocMaster> record) {
        return this.dmsLocMasterMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsLocMaster)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsLocMaster record) {
        return this.dmsLocMasterMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#updateByPrimaryKey(com.paradm.system.entity.DmsLocMaster)
     */ 
    @Override
    public int updateByPrimaryKey(DmsLocMaster record) {
        return this.dmsLocMasterMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#updateByExampleSelective(com.paradm.system.entity.DmsLocMastercom.paradm.system.entity.DmsLocMasterExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsLocMaster record, DmsLocMasterExample example) {
        return this.dmsLocMasterMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#updateByExample(com.paradm.system.entity.DmsLocMastercom.paradm.system.entity.DmsLocMasterExample)
     */ 
    @Override
    public int updateByExample(DmsLocMaster record, DmsLocMasterExample example) {
        return this.dmsLocMasterMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsLocMaster)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsLocMaster record) {
        return this.dmsLocMasterMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsLocMasterExample)
     */ 
    @Override
    public List<DmsLocMaster> selectByExampleWithBLOBs(DmsLocMasterExample example) {
        return this.dmsLocMasterMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#updateBatchByPrimaryKeySelective(.List<DmsLocMaster>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsLocMaster> records) {
        return this.dmsLocMasterMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsLocMasterService#updateBatchByPrimaryKey(.List<DmsLocMaster>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsLocMaster> records) {
        return this.dmsLocMasterMapper.updateBatchByPrimaryKey(records);
    }
}