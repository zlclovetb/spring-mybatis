package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsAnnotationHighlightNtextRectMapper;
import com.paradm.dms.entity.DmsAnnotationHighlightNtextRect;
import com.paradm.dms.entity.DmsAnnotationHighlightNtextRectExample;
import com.paradm.dms.service.DmsAnnotationHighlightNtextRectService;

@Service
public class DmsAnnotationHighlightNtextRectServiceImpl implements DmsAnnotationHighlightNtextRectService {
    @Autowired
    private DmsAnnotationHighlightNtextRectMapper dmsAnnotationHighlightNtextRectMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsAnnotationHighlightNtextRectServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#countByExample(com.paradm.system.entity.DmsAnnotationHighlightNtextRectExample)
     */ 
    @Override
    public int countByExample(DmsAnnotationHighlightNtextRectExample example) {
        int count = this.dmsAnnotationHighlightNtextRectMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsAnnotationHighlightNtextRect selectByPrimaryKey(Long id) {
        return this.dmsAnnotationHighlightNtextRectMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#selectByExample(com.paradm.system.entity.DmsAnnotationHighlightNtextRectExample)
     */ 
    @Override
    public List<DmsAnnotationHighlightNtextRect> selectByExample(DmsAnnotationHighlightNtextRectExample example) {
        return this.dmsAnnotationHighlightNtextRectMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#deleteByExample(com.paradm.system.entity.DmsAnnotationHighlightNtextRectExample)
     */ 
    @Override
    public int deleteByExample(DmsAnnotationHighlightNtextRectExample example) {
        return this.dmsAnnotationHighlightNtextRectMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsAnnotationHighlightNtextRectMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#insert(com.paradm.system.entity.DmsAnnotationHighlightNtextRect)
     */ 
    @Override
    public int insert(DmsAnnotationHighlightNtextRect record) {
        return this.dmsAnnotationHighlightNtextRectMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#insertSelective(com.paradm.system.entity.DmsAnnotationHighlightNtextRect)
     */ 
    @Override
    public int insertSelective(DmsAnnotationHighlightNtextRect record) {
        return this.dmsAnnotationHighlightNtextRectMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#insertBatch(.List<DmsAnnotationHighlightNtextRect>)
     */ 
    @Override
    public int insertBatch(List<DmsAnnotationHighlightNtextRect> record) {
        return this.dmsAnnotationHighlightNtextRectMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#insertBatchSelective(.List<DmsAnnotationHighlightNtextRect>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsAnnotationHighlightNtextRect> record) {
        return this.dmsAnnotationHighlightNtextRectMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsAnnotationHighlightNtextRect)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsAnnotationHighlightNtextRect record) {
        return this.dmsAnnotationHighlightNtextRectMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#updateByPrimaryKey(com.paradm.system.entity.DmsAnnotationHighlightNtextRect)
     */ 
    @Override
    public int updateByPrimaryKey(DmsAnnotationHighlightNtextRect record) {
        return this.dmsAnnotationHighlightNtextRectMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#updateByExampleSelective(com.paradm.system.entity.DmsAnnotationHighlightNtextRectcom.paradm.system.entity.DmsAnnotationHighlightNtextRectExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsAnnotationHighlightNtextRect record, DmsAnnotationHighlightNtextRectExample example) {
        return this.dmsAnnotationHighlightNtextRectMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#updateByExample(com.paradm.system.entity.DmsAnnotationHighlightNtextRectcom.paradm.system.entity.DmsAnnotationHighlightNtextRectExample)
     */ 
    @Override
    public int updateByExample(DmsAnnotationHighlightNtextRect record, DmsAnnotationHighlightNtextRectExample example) {
        return this.dmsAnnotationHighlightNtextRectMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsAnnotationHighlightNtextRect)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsAnnotationHighlightNtextRect record) {
        return this.dmsAnnotationHighlightNtextRectMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsAnnotationHighlightNtextRectExample)
     */ 
    @Override
    public List<DmsAnnotationHighlightNtextRect> selectByExampleWithBLOBs(DmsAnnotationHighlightNtextRectExample example) {
        return this.dmsAnnotationHighlightNtextRectMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#updateBatchByPrimaryKeySelective(.List<DmsAnnotationHighlightNtextRect>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsAnnotationHighlightNtextRect> records) {
        return this.dmsAnnotationHighlightNtextRectMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationHighlightNtextRectService#updateBatchByPrimaryKey(.List<DmsAnnotationHighlightNtextRect>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsAnnotationHighlightNtextRect> records) {
        return this.dmsAnnotationHighlightNtextRectMapper.updateBatchByPrimaryKey(records);
    }
}