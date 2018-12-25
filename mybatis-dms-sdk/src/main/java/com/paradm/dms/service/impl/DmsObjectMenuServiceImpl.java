package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsObjectMenuMapper;
import com.paradm.dms.entity.DmsObjectMenu;
import com.paradm.dms.entity.DmsObjectMenuExample;
import com.paradm.dms.service.DmsObjectMenuService;

@Service
public class DmsObjectMenuServiceImpl implements DmsObjectMenuService {
    @Autowired
    private DmsObjectMenuMapper dmsObjectMenuMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsObjectMenuServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#countByExample(com.paradm.system.entity.DmsObjectMenuExample)
     */ 
    @Override
    public int countByExample(DmsObjectMenuExample example) {
        int count = this.dmsObjectMenuMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsObjectMenu selectByPrimaryKey(Long id) {
        return this.dmsObjectMenuMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#selectByExample(com.paradm.system.entity.DmsObjectMenuExample)
     */ 
    @Override
    public List<DmsObjectMenu> selectByExample(DmsObjectMenuExample example) {
        return this.dmsObjectMenuMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#deleteByExample(com.paradm.system.entity.DmsObjectMenuExample)
     */ 
    @Override
    public int deleteByExample(DmsObjectMenuExample example) {
        return this.dmsObjectMenuMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsObjectMenuMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#insert(com.paradm.system.entity.DmsObjectMenu)
     */ 
    @Override
    public int insert(DmsObjectMenu record) {
        return this.dmsObjectMenuMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#insertSelective(com.paradm.system.entity.DmsObjectMenu)
     */ 
    @Override
    public int insertSelective(DmsObjectMenu record) {
        return this.dmsObjectMenuMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#insertBatch(.List<DmsObjectMenu>)
     */ 
    @Override
    public int insertBatch(List<DmsObjectMenu> record) {
        return this.dmsObjectMenuMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#insertBatchSelective(.List<DmsObjectMenu>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsObjectMenu> record) {
        return this.dmsObjectMenuMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsObjectMenu)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsObjectMenu record) {
        return this.dmsObjectMenuMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#updateByPrimaryKey(com.paradm.system.entity.DmsObjectMenu)
     */ 
    @Override
    public int updateByPrimaryKey(DmsObjectMenu record) {
        return this.dmsObjectMenuMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#updateByExampleSelective(com.paradm.system.entity.DmsObjectMenucom.paradm.system.entity.DmsObjectMenuExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsObjectMenu record, DmsObjectMenuExample example) {
        return this.dmsObjectMenuMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#updateByExample(com.paradm.system.entity.DmsObjectMenucom.paradm.system.entity.DmsObjectMenuExample)
     */ 
    @Override
    public int updateByExample(DmsObjectMenu record, DmsObjectMenuExample example) {
        return this.dmsObjectMenuMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsObjectMenu)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsObjectMenu record) {
        return this.dmsObjectMenuMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsObjectMenuExample)
     */ 
    @Override
    public List<DmsObjectMenu> selectByExampleWithBLOBs(DmsObjectMenuExample example) {
        return this.dmsObjectMenuMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#updateBatchByPrimaryKeySelective(.List<DmsObjectMenu>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsObjectMenu> records) {
        return this.dmsObjectMenuMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsObjectMenuService#updateBatchByPrimaryKey(.List<DmsObjectMenu>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsObjectMenu> records) {
        return this.dmsObjectMenuMapper.updateBatchByPrimaryKey(records);
    }
}