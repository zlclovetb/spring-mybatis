package com.paradm.workspace.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.workspace.dao.WspUserOrgnizeMapper;
import com.paradm.workspace.entity.WspUserOrgnize;
import com.paradm.workspace.entity.WspUserOrgnizeExample;
import com.paradm.workspace.service.WspUserOrgnizeService;

@Service
public class WspUserOrgnizeServiceImpl implements WspUserOrgnizeService {
    @Autowired
    private WspUserOrgnizeMapper wspUserOrgnizeMapper;

    private static final Logger logger = LoggerFactory.getLogger(WspUserOrgnizeServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#countByExample(com.paradm.system.entity.WspUserOrgnizeExample)
     */ 
    @Override
    public int countByExample(WspUserOrgnizeExample example) {
        int count = this.wspUserOrgnizeMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public WspUserOrgnize selectByPrimaryKey(Long id) {
        return this.wspUserOrgnizeMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#selectByExample(com.paradm.system.entity.WspUserOrgnizeExample)
     */ 
    @Override
    public List<WspUserOrgnize> selectByExample(WspUserOrgnizeExample example) {
        return this.wspUserOrgnizeMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#deleteByExample(com.paradm.system.entity.WspUserOrgnizeExample)
     */ 
    @Override
    public int deleteByExample(WspUserOrgnizeExample example) {
        return this.wspUserOrgnizeMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.wspUserOrgnizeMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#insert(com.paradm.system.entity.WspUserOrgnize)
     */ 
    @Override
    public int insert(WspUserOrgnize record) {
        return this.wspUserOrgnizeMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#insertSelective(com.paradm.system.entity.WspUserOrgnize)
     */ 
    @Override
    public int insertSelective(WspUserOrgnize record) {
        return this.wspUserOrgnizeMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#insertBatch(.List<WspUserOrgnize>)
     */ 
    @Override
    public int insertBatch(List<WspUserOrgnize> record) {
        return this.wspUserOrgnizeMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#insertBatchSelective(.List<WspUserOrgnize>)
     */ 
    @Override
    public int insertBatchSelective(List<WspUserOrgnize> record) {
        return this.wspUserOrgnizeMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#updateByPrimaryKeySelective(com.paradm.system.entity.WspUserOrgnize)
     */ 
    @Override
    public int updateByPrimaryKeySelective(WspUserOrgnize record) {
        return this.wspUserOrgnizeMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#updateByPrimaryKey(com.paradm.system.entity.WspUserOrgnize)
     */ 
    @Override
    public int updateByPrimaryKey(WspUserOrgnize record) {
        return this.wspUserOrgnizeMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#updateByExampleSelective(com.paradm.system.entity.WspUserOrgnizecom.paradm.system.entity.WspUserOrgnizeExample)
     */ 
    @Override
    public int updateByExampleSelective(WspUserOrgnize record, WspUserOrgnizeExample example) {
        return this.wspUserOrgnizeMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#updateByExample(com.paradm.system.entity.WspUserOrgnizecom.paradm.system.entity.WspUserOrgnizeExample)
     */ 
    @Override
    public int updateByExample(WspUserOrgnize record, WspUserOrgnizeExample example) {
        return this.wspUserOrgnizeMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.WspUserOrgnize)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(WspUserOrgnize record) {
        return this.wspUserOrgnizeMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#selectByExampleWithBLOBs(com.paradm.system.entity.WspUserOrgnizeExample)
     */ 
    @Override
    public List<WspUserOrgnize> selectByExampleWithBLOBs(WspUserOrgnizeExample example) {
        return this.wspUserOrgnizeMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#updateBatchByPrimaryKeySelective(.List<WspUserOrgnize>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<WspUserOrgnize> records) {
        return this.wspUserOrgnizeMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspUserOrgnizeService#updateBatchByPrimaryKey(.List<WspUserOrgnize>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<WspUserOrgnize> records) {
        return this.wspUserOrgnizeMapper.updateBatchByPrimaryKey(records);
    }
}