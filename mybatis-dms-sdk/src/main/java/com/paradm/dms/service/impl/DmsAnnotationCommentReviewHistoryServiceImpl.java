package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsAnnotationCommentReviewHistoryMapper;
import com.paradm.dms.entity.DmsAnnotationCommentReviewHistory;
import com.paradm.dms.entity.DmsAnnotationCommentReviewHistoryExample;
import com.paradm.dms.service.DmsAnnotationCommentReviewHistoryService;

@Service
public class DmsAnnotationCommentReviewHistoryServiceImpl implements DmsAnnotationCommentReviewHistoryService {
    @Autowired
    private DmsAnnotationCommentReviewHistoryMapper dmsAnnotationCommentReviewHistoryMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsAnnotationCommentReviewHistoryServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#countByExample(com.paradm.system.entity.DmsAnnotationCommentReviewHistoryExample)
     */ 
    @Override
    public int countByExample(DmsAnnotationCommentReviewHistoryExample example) {
        int count = this.dmsAnnotationCommentReviewHistoryMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsAnnotationCommentReviewHistory selectByPrimaryKey(Long id) {
        return this.dmsAnnotationCommentReviewHistoryMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#selectByExample(com.paradm.system.entity.DmsAnnotationCommentReviewHistoryExample)
     */ 
    @Override
    public List<DmsAnnotationCommentReviewHistory> selectByExample(DmsAnnotationCommentReviewHistoryExample example) {
        return this.dmsAnnotationCommentReviewHistoryMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#deleteByExample(com.paradm.system.entity.DmsAnnotationCommentReviewHistoryExample)
     */ 
    @Override
    public int deleteByExample(DmsAnnotationCommentReviewHistoryExample example) {
        return this.dmsAnnotationCommentReviewHistoryMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsAnnotationCommentReviewHistoryMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#insert(com.paradm.system.entity.DmsAnnotationCommentReviewHistory)
     */ 
    @Override
    public int insert(DmsAnnotationCommentReviewHistory record) {
        return this.dmsAnnotationCommentReviewHistoryMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#insertSelective(com.paradm.system.entity.DmsAnnotationCommentReviewHistory)
     */ 
    @Override
    public int insertSelective(DmsAnnotationCommentReviewHistory record) {
        return this.dmsAnnotationCommentReviewHistoryMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#insertBatch(.List<DmsAnnotationCommentReviewHistory>)
     */ 
    @Override
    public int insertBatch(List<DmsAnnotationCommentReviewHistory> record) {
        return this.dmsAnnotationCommentReviewHistoryMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#insertBatchSelective(.List<DmsAnnotationCommentReviewHistory>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsAnnotationCommentReviewHistory> record) {
        return this.dmsAnnotationCommentReviewHistoryMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsAnnotationCommentReviewHistory)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsAnnotationCommentReviewHistory record) {
        return this.dmsAnnotationCommentReviewHistoryMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#updateByPrimaryKey(com.paradm.system.entity.DmsAnnotationCommentReviewHistory)
     */ 
    @Override
    public int updateByPrimaryKey(DmsAnnotationCommentReviewHistory record) {
        return this.dmsAnnotationCommentReviewHistoryMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#updateByExampleSelective(com.paradm.system.entity.DmsAnnotationCommentReviewHistorycom.paradm.system.entity.DmsAnnotationCommentReviewHistoryExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsAnnotationCommentReviewHistory record, DmsAnnotationCommentReviewHistoryExample example) {
        return this.dmsAnnotationCommentReviewHistoryMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#updateByExample(com.paradm.system.entity.DmsAnnotationCommentReviewHistorycom.paradm.system.entity.DmsAnnotationCommentReviewHistoryExample)
     */ 
    @Override
    public int updateByExample(DmsAnnotationCommentReviewHistory record, DmsAnnotationCommentReviewHistoryExample example) {
        return this.dmsAnnotationCommentReviewHistoryMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsAnnotationCommentReviewHistory)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsAnnotationCommentReviewHistory record) {
        return this.dmsAnnotationCommentReviewHistoryMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsAnnotationCommentReviewHistoryExample)
     */ 
    @Override
    public List<DmsAnnotationCommentReviewHistory> selectByExampleWithBLOBs(DmsAnnotationCommentReviewHistoryExample example) {
        return this.dmsAnnotationCommentReviewHistoryMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#updateBatchByPrimaryKeySelective(.List<DmsAnnotationCommentReviewHistory>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsAnnotationCommentReviewHistory> records) {
        return this.dmsAnnotationCommentReviewHistoryMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentReviewHistoryService#updateBatchByPrimaryKey(.List<DmsAnnotationCommentReviewHistory>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsAnnotationCommentReviewHistory> records) {
        return this.dmsAnnotationCommentReviewHistoryMapper.updateBatchByPrimaryKey(records);
    }
}