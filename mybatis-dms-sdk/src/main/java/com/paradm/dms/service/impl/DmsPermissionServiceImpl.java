package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsPermissionMapper;
import com.paradm.dms.entity.DmsPermission;
import com.paradm.dms.entity.DmsPermissionExample;
import com.paradm.dms.service.DmsPermissionService;

@Service
public class DmsPermissionServiceImpl implements DmsPermissionService {
    @Autowired
    private DmsPermissionMapper dmsPermissionMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsPermissionServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#countByExample(com.paradm.system.entity.DmsPermissionExample)
     */ 
    @Override
    public int countByExample(DmsPermissionExample example) {
        int count = this.dmsPermissionMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsPermission selectByPrimaryKey(Long id) {
        return this.dmsPermissionMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#selectByExample(com.paradm.system.entity.DmsPermissionExample)
     */ 
    @Override
    public List<DmsPermission> selectByExample(DmsPermissionExample example) {
        return this.dmsPermissionMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#deleteByExample(com.paradm.system.entity.DmsPermissionExample)
     */ 
    @Override
    public int deleteByExample(DmsPermissionExample example) {
        return this.dmsPermissionMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsPermissionMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#insert(com.paradm.system.entity.DmsPermission)
     */ 
    @Override
    public int insert(DmsPermission record) {
        return this.dmsPermissionMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#insertSelective(com.paradm.system.entity.DmsPermission)
     */ 
    @Override
    public int insertSelective(DmsPermission record) {
        return this.dmsPermissionMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#insertBatch(.List<DmsPermission>)
     */ 
    @Override
    public int insertBatch(List<DmsPermission> record) {
        return this.dmsPermissionMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#insertBatchSelective(.List<DmsPermission>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsPermission> record) {
        return this.dmsPermissionMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsPermission)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsPermission record) {
        return this.dmsPermissionMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#updateByPrimaryKey(com.paradm.system.entity.DmsPermission)
     */ 
    @Override
    public int updateByPrimaryKey(DmsPermission record) {
        return this.dmsPermissionMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#updateByExampleSelective(com.paradm.system.entity.DmsPermissioncom.paradm.system.entity.DmsPermissionExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsPermission record, DmsPermissionExample example) {
        return this.dmsPermissionMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#updateByExample(com.paradm.system.entity.DmsPermissioncom.paradm.system.entity.DmsPermissionExample)
     */ 
    @Override
    public int updateByExample(DmsPermission record, DmsPermissionExample example) {
        return this.dmsPermissionMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsPermission)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsPermission record) {
        return this.dmsPermissionMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsPermissionExample)
     */ 
    @Override
    public List<DmsPermission> selectByExampleWithBLOBs(DmsPermissionExample example) {
        return this.dmsPermissionMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#updateBatchByPrimaryKeySelective(.List<DmsPermission>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsPermission> records) {
        return this.dmsPermissionMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsPermissionService#updateBatchByPrimaryKey(.List<DmsPermission>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsPermission> records) {
        return this.dmsPermissionMapper.updateBatchByPrimaryKey(records);
    }
}