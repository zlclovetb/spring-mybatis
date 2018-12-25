package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsContentMapper;
import com.paradm.dms.entity.DmsContent;
import com.paradm.dms.entity.DmsContentExample;
import com.paradm.dms.service.DmsContentService;

@Service
public class DmsContentServiceImpl implements DmsContentService {
    @Autowired
    private DmsContentMapper dmsContentMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsContentServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#countByExample(com.paradm.system.entity.DmsContentExample)
     */ 
    @Override
    public int countByExample(DmsContentExample example) {
        int count = this.dmsContentMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsContent selectByPrimaryKey(Long id) {
        return this.dmsContentMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#selectByExample(com.paradm.system.entity.DmsContentExample)
     */ 
    @Override
    public List<DmsContent> selectByExample(DmsContentExample example) {
        return this.dmsContentMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#deleteByExample(com.paradm.system.entity.DmsContentExample)
     */ 
    @Override
    public int deleteByExample(DmsContentExample example) {
        return this.dmsContentMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsContentMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#insert(com.paradm.system.entity.DmsContent)
     */ 
    @Override
    public int insert(DmsContent record) {
        return this.dmsContentMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#insertSelective(com.paradm.system.entity.DmsContent)
     */ 
    @Override
    public int insertSelective(DmsContent record) {
        return this.dmsContentMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#insertBatch(.List<DmsContent>)
     */ 
    @Override
    public int insertBatch(List<DmsContent> record) {
        return this.dmsContentMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#insertBatchSelective(.List<DmsContent>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsContent> record) {
        return this.dmsContentMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsContent)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsContent record) {
        return this.dmsContentMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#updateByPrimaryKey(com.paradm.system.entity.DmsContent)
     */ 
    @Override
    public int updateByPrimaryKey(DmsContent record) {
        return this.dmsContentMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#updateByExampleSelective(com.paradm.system.entity.DmsContentcom.paradm.system.entity.DmsContentExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsContent record, DmsContentExample example) {
        return this.dmsContentMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#updateByExample(com.paradm.system.entity.DmsContentcom.paradm.system.entity.DmsContentExample)
     */ 
    @Override
    public int updateByExample(DmsContent record, DmsContentExample example) {
        return this.dmsContentMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsContent)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsContent record) {
        return this.dmsContentMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsContentExample)
     */ 
    @Override
    public List<DmsContent> selectByExampleWithBLOBs(DmsContentExample example) {
        return this.dmsContentMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#updateBatchByPrimaryKeySelective(.List<DmsContent>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsContent> records) {
        return this.dmsContentMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsContentService#updateBatchByPrimaryKey(.List<DmsContent>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsContent> records) {
        return this.dmsContentMapper.updateBatchByPrimaryKey(records);
    }
}