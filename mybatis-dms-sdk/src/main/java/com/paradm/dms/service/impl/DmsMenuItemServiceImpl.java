package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsMenuItemMapper;
import com.paradm.dms.entity.DmsMenuItem;
import com.paradm.dms.entity.DmsMenuItemExample;
import com.paradm.dms.service.DmsMenuItemService;

@Service
public class DmsMenuItemServiceImpl implements DmsMenuItemService {
    @Autowired
    private DmsMenuItemMapper dmsMenuItemMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsMenuItemServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#countByExample(com.paradm.system.entity.DmsMenuItemExample)
     */ 
    @Override
    public int countByExample(DmsMenuItemExample example) {
        int count = this.dmsMenuItemMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsMenuItem selectByPrimaryKey(Long id) {
        return this.dmsMenuItemMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#selectByExample(com.paradm.system.entity.DmsMenuItemExample)
     */ 
    @Override
    public List<DmsMenuItem> selectByExample(DmsMenuItemExample example) {
        return this.dmsMenuItemMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#deleteByExample(com.paradm.system.entity.DmsMenuItemExample)
     */ 
    @Override
    public int deleteByExample(DmsMenuItemExample example) {
        return this.dmsMenuItemMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsMenuItemMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#insert(com.paradm.system.entity.DmsMenuItem)
     */ 
    @Override
    public int insert(DmsMenuItem record) {
        return this.dmsMenuItemMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#insertSelective(com.paradm.system.entity.DmsMenuItem)
     */ 
    @Override
    public int insertSelective(DmsMenuItem record) {
        return this.dmsMenuItemMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#insertBatch(.List<DmsMenuItem>)
     */ 
    @Override
    public int insertBatch(List<DmsMenuItem> record) {
        return this.dmsMenuItemMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#insertBatchSelective(.List<DmsMenuItem>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsMenuItem> record) {
        return this.dmsMenuItemMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsMenuItem)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsMenuItem record) {
        return this.dmsMenuItemMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#updateByPrimaryKey(com.paradm.system.entity.DmsMenuItem)
     */ 
    @Override
    public int updateByPrimaryKey(DmsMenuItem record) {
        return this.dmsMenuItemMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#updateByExampleSelective(com.paradm.system.entity.DmsMenuItemcom.paradm.system.entity.DmsMenuItemExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsMenuItem record, DmsMenuItemExample example) {
        return this.dmsMenuItemMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#updateByExample(com.paradm.system.entity.DmsMenuItemcom.paradm.system.entity.DmsMenuItemExample)
     */ 
    @Override
    public int updateByExample(DmsMenuItem record, DmsMenuItemExample example) {
        return this.dmsMenuItemMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsMenuItem)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsMenuItem record) {
        return this.dmsMenuItemMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsMenuItemExample)
     */ 
    @Override
    public List<DmsMenuItem> selectByExampleWithBLOBs(DmsMenuItemExample example) {
        return this.dmsMenuItemMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#updateBatchByPrimaryKeySelective(.List<DmsMenuItem>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsMenuItem> records) {
        return this.dmsMenuItemMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsMenuItemService#updateBatchByPrimaryKey(.List<DmsMenuItem>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsMenuItem> records) {
        return this.dmsMenuItemMapper.updateBatchByPrimaryKey(records);
    }
}