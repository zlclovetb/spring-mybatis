package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsAlertMapper;
import com.paradm.dms.entity.DmsAlert;
import com.paradm.dms.entity.DmsAlertExample;
import com.paradm.dms.service.DmsAlertService;

@Service
public class DmsAlertServiceImpl implements DmsAlertService {
    @Autowired
    private DmsAlertMapper dmsAlertMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsAlertServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#countByExample(com.paradm.system.entity.DmsAlertExample)
     */ 
    @Override
    public int countByExample(DmsAlertExample example) {
        int count = this.dmsAlertMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsAlert selectByPrimaryKey(Long id) {
        return this.dmsAlertMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#selectByExample(com.paradm.system.entity.DmsAlertExample)
     */ 
    @Override
    public List<DmsAlert> selectByExample(DmsAlertExample example) {
        return this.dmsAlertMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#deleteByExample(com.paradm.system.entity.DmsAlertExample)
     */ 
    @Override
    public int deleteByExample(DmsAlertExample example) {
        return this.dmsAlertMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsAlertMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#insert(com.paradm.system.entity.DmsAlert)
     */ 
    @Override
    public int insert(DmsAlert record) {
        return this.dmsAlertMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#insertSelective(com.paradm.system.entity.DmsAlert)
     */ 
    @Override
    public int insertSelective(DmsAlert record) {
        return this.dmsAlertMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#insertBatch(.List<DmsAlert>)
     */ 
    @Override
    public int insertBatch(List<DmsAlert> record) {
        return this.dmsAlertMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#insertBatchSelective(.List<DmsAlert>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsAlert> record) {
        return this.dmsAlertMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsAlert)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsAlert record) {
        return this.dmsAlertMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#updateByPrimaryKey(com.paradm.system.entity.DmsAlert)
     */ 
    @Override
    public int updateByPrimaryKey(DmsAlert record) {
        return this.dmsAlertMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#updateByExampleSelective(com.paradm.system.entity.DmsAlertcom.paradm.system.entity.DmsAlertExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsAlert record, DmsAlertExample example) {
        return this.dmsAlertMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#updateByExample(com.paradm.system.entity.DmsAlertcom.paradm.system.entity.DmsAlertExample)
     */ 
    @Override
    public int updateByExample(DmsAlert record, DmsAlertExample example) {
        return this.dmsAlertMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsAlert)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsAlert record) {
        return this.dmsAlertMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsAlertExample)
     */ 
    @Override
    public List<DmsAlert> selectByExampleWithBLOBs(DmsAlertExample example) {
        return this.dmsAlertMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#updateBatchByPrimaryKeySelective(.List<DmsAlert>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsAlert> records) {
        return this.dmsAlertMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAlertService#updateBatchByPrimaryKey(.List<DmsAlert>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsAlert> records) {
        return this.dmsAlertMapper.updateBatchByPrimaryKey(records);
    }
}