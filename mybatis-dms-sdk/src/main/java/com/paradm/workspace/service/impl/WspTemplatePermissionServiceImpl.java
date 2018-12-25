package com.paradm.workspace.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.workspace.dao.WspTemplatePermissionMapper;
import com.paradm.workspace.entity.WspTemplatePermission;
import com.paradm.workspace.entity.WspTemplatePermissionExample;
import com.paradm.workspace.service.WspTemplatePermissionService;

@Service
public class WspTemplatePermissionServiceImpl implements WspTemplatePermissionService {
    @Autowired
    private WspTemplatePermissionMapper wspTemplatePermissionMapper;

    private static final Logger logger = LoggerFactory.getLogger(WspTemplatePermissionServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#countByExample(com.paradm.system.entity.WspTemplatePermissionExample)
     */ 
    @Override
    public int countByExample(WspTemplatePermissionExample example) {
        int count = this.wspTemplatePermissionMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public WspTemplatePermission selectByPrimaryKey(Long id) {
        return this.wspTemplatePermissionMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#selectByExample(com.paradm.system.entity.WspTemplatePermissionExample)
     */ 
    @Override
    public List<WspTemplatePermission> selectByExample(WspTemplatePermissionExample example) {
        return this.wspTemplatePermissionMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#deleteByExample(com.paradm.system.entity.WspTemplatePermissionExample)
     */ 
    @Override
    public int deleteByExample(WspTemplatePermissionExample example) {
        return this.wspTemplatePermissionMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.wspTemplatePermissionMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#insert(com.paradm.system.entity.WspTemplatePermission)
     */ 
    @Override
    public int insert(WspTemplatePermission record) {
        return this.wspTemplatePermissionMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#insertSelective(com.paradm.system.entity.WspTemplatePermission)
     */ 
    @Override
    public int insertSelective(WspTemplatePermission record) {
        return this.wspTemplatePermissionMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#insertBatch(.List<WspTemplatePermission>)
     */ 
    @Override
    public int insertBatch(List<WspTemplatePermission> record) {
        return this.wspTemplatePermissionMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#insertBatchSelective(.List<WspTemplatePermission>)
     */ 
    @Override
    public int insertBatchSelective(List<WspTemplatePermission> record) {
        return this.wspTemplatePermissionMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#updateByPrimaryKeySelective(com.paradm.system.entity.WspTemplatePermission)
     */ 
    @Override
    public int updateByPrimaryKeySelective(WspTemplatePermission record) {
        return this.wspTemplatePermissionMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#updateByPrimaryKey(com.paradm.system.entity.WspTemplatePermission)
     */ 
    @Override
    public int updateByPrimaryKey(WspTemplatePermission record) {
        return this.wspTemplatePermissionMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#updateByExampleSelective(com.paradm.system.entity.WspTemplatePermissioncom.paradm.system.entity.WspTemplatePermissionExample)
     */ 
    @Override
    public int updateByExampleSelective(WspTemplatePermission record, WspTemplatePermissionExample example) {
        return this.wspTemplatePermissionMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#updateByExample(com.paradm.system.entity.WspTemplatePermissioncom.paradm.system.entity.WspTemplatePermissionExample)
     */ 
    @Override
    public int updateByExample(WspTemplatePermission record, WspTemplatePermissionExample example) {
        return this.wspTemplatePermissionMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.WspTemplatePermission)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(WspTemplatePermission record) {
        return this.wspTemplatePermissionMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#selectByExampleWithBLOBs(com.paradm.system.entity.WspTemplatePermissionExample)
     */ 
    @Override
    public List<WspTemplatePermission> selectByExampleWithBLOBs(WspTemplatePermissionExample example) {
        return this.wspTemplatePermissionMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#updateBatchByPrimaryKeySelective(.List<WspTemplatePermission>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<WspTemplatePermission> records) {
        return this.wspTemplatePermissionMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplatePermissionService#updateBatchByPrimaryKey(.List<WspTemplatePermission>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<WspTemplatePermission> records) {
        return this.wspTemplatePermissionMapper.updateBatchByPrimaryKey(records);
    }
}