package com.paradm.workspace.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.workspace.dao.WspTemplateRoleMapper;
import com.paradm.workspace.entity.WspTemplateRole;
import com.paradm.workspace.entity.WspTemplateRoleExample;
import com.paradm.workspace.service.WspTemplateRoleService;

@Service
public class WspTemplateRoleServiceImpl implements WspTemplateRoleService {
    @Autowired
    private WspTemplateRoleMapper wspTemplateRoleMapper;

    private static final Logger logger = LoggerFactory.getLogger(WspTemplateRoleServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#countByExample(com.paradm.system.entity.WspTemplateRoleExample)
     */ 
    @Override
    public int countByExample(WspTemplateRoleExample example) {
        int count = this.wspTemplateRoleMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public WspTemplateRole selectByPrimaryKey(Long id) {
        return this.wspTemplateRoleMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#selectByExample(com.paradm.system.entity.WspTemplateRoleExample)
     */ 
    @Override
    public List<WspTemplateRole> selectByExample(WspTemplateRoleExample example) {
        return this.wspTemplateRoleMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#deleteByExample(com.paradm.system.entity.WspTemplateRoleExample)
     */ 
    @Override
    public int deleteByExample(WspTemplateRoleExample example) {
        return this.wspTemplateRoleMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.wspTemplateRoleMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#insert(com.paradm.system.entity.WspTemplateRole)
     */ 
    @Override
    public int insert(WspTemplateRole record) {
        return this.wspTemplateRoleMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#insertSelective(com.paradm.system.entity.WspTemplateRole)
     */ 
    @Override
    public int insertSelective(WspTemplateRole record) {
        return this.wspTemplateRoleMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#insertBatch(.List<WspTemplateRole>)
     */ 
    @Override
    public int insertBatch(List<WspTemplateRole> record) {
        return this.wspTemplateRoleMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#insertBatchSelective(.List<WspTemplateRole>)
     */ 
    @Override
    public int insertBatchSelective(List<WspTemplateRole> record) {
        return this.wspTemplateRoleMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#updateByPrimaryKeySelective(com.paradm.system.entity.WspTemplateRole)
     */ 
    @Override
    public int updateByPrimaryKeySelective(WspTemplateRole record) {
        return this.wspTemplateRoleMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#updateByPrimaryKey(com.paradm.system.entity.WspTemplateRole)
     */ 
    @Override
    public int updateByPrimaryKey(WspTemplateRole record) {
        return this.wspTemplateRoleMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#updateByExampleSelective(com.paradm.system.entity.WspTemplateRolecom.paradm.system.entity.WspTemplateRoleExample)
     */ 
    @Override
    public int updateByExampleSelective(WspTemplateRole record, WspTemplateRoleExample example) {
        return this.wspTemplateRoleMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#updateByExample(com.paradm.system.entity.WspTemplateRolecom.paradm.system.entity.WspTemplateRoleExample)
     */ 
    @Override
    public int updateByExample(WspTemplateRole record, WspTemplateRoleExample example) {
        return this.wspTemplateRoleMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.WspTemplateRole)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(WspTemplateRole record) {
        return this.wspTemplateRoleMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#selectByExampleWithBLOBs(com.paradm.system.entity.WspTemplateRoleExample)
     */ 
    @Override
    public List<WspTemplateRole> selectByExampleWithBLOBs(WspTemplateRoleExample example) {
        return this.wspTemplateRoleMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#updateBatchByPrimaryKeySelective(.List<WspTemplateRole>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<WspTemplateRole> records) {
        return this.wspTemplateRoleMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateRoleService#updateBatchByPrimaryKey(.List<WspTemplateRole>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<WspTemplateRole> records) {
        return this.wspTemplateRoleMapper.updateBatchByPrimaryKey(records);
    }
}