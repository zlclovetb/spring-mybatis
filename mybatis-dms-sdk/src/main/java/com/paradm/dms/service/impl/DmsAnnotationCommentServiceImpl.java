package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsAnnotationCommentMapper;
import com.paradm.dms.entity.DmsAnnotationComment;
import com.paradm.dms.entity.DmsAnnotationCommentExample;
import com.paradm.dms.service.DmsAnnotationCommentService;

@Service
public class DmsAnnotationCommentServiceImpl implements DmsAnnotationCommentService {
    @Autowired
    private DmsAnnotationCommentMapper dmsAnnotationCommentMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsAnnotationCommentServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#countByExample(com.paradm.system.entity.DmsAnnotationCommentExample)
     */ 
    @Override
    public int countByExample(DmsAnnotationCommentExample example) {
        int count = this.dmsAnnotationCommentMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsAnnotationComment selectByPrimaryKey(Long id) {
        return this.dmsAnnotationCommentMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#selectByExample(com.paradm.system.entity.DmsAnnotationCommentExample)
     */ 
    @Override
    public List<DmsAnnotationComment> selectByExample(DmsAnnotationCommentExample example) {
        return this.dmsAnnotationCommentMapper.selectByExampleWithoutBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#deleteByExample(com.paradm.system.entity.DmsAnnotationCommentExample)
     */ 
    @Override
    public int deleteByExample(DmsAnnotationCommentExample example) {
        return this.dmsAnnotationCommentMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsAnnotationCommentMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#insert(com.paradm.system.entity.DmsAnnotationComment)
     */ 
    @Override
    public int insert(DmsAnnotationComment record) {
        return this.dmsAnnotationCommentMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#insertSelective(com.paradm.system.entity.DmsAnnotationComment)
     */ 
    @Override
    public int insertSelective(DmsAnnotationComment record) {
        return this.dmsAnnotationCommentMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#insertBatch(.List<DmsAnnotationComment>)
     */ 
    @Override
    public int insertBatch(List<DmsAnnotationComment> record) {
        return this.dmsAnnotationCommentMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#insertBatchSelective(.List<DmsAnnotationComment>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsAnnotationComment> record) {
        return this.dmsAnnotationCommentMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsAnnotationComment)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsAnnotationComment record) {
        return this.dmsAnnotationCommentMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#updateByPrimaryKey(com.paradm.system.entity.DmsAnnotationComment)
     */ 
    @Override
    public int updateByPrimaryKey(DmsAnnotationComment record) {
        return this.dmsAnnotationCommentMapper.updateByPrimaryKeyWithoutBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#updateByExampleSelective(com.paradm.system.entity.DmsAnnotationCommentcom.paradm.system.entity.DmsAnnotationCommentExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsAnnotationComment record, DmsAnnotationCommentExample example) {
        return this.dmsAnnotationCommentMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#updateByExample(com.paradm.system.entity.DmsAnnotationCommentcom.paradm.system.entity.DmsAnnotationCommentExample)
     */ 
    @Override
    public int updateByExample(DmsAnnotationComment record, DmsAnnotationCommentExample example) {
        return this.dmsAnnotationCommentMapper.updateByExampleWithoutBLOBs(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsAnnotationComment)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsAnnotationComment record) {
        return this.dmsAnnotationCommentMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsAnnotationCommentExample)
     */ 
    @Override
    public List<DmsAnnotationComment> selectByExampleWithBLOBs(DmsAnnotationCommentExample example) {
        return this.dmsAnnotationCommentMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#updateBatchByPrimaryKeySelective(.List<DmsAnnotationComment>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsAnnotationComment> records) {
        return this.dmsAnnotationCommentMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationCommentService#updateBatchByPrimaryKey(.List<DmsAnnotationComment>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsAnnotationComment> records) {
        return this.dmsAnnotationCommentMapper.updateBatchByPrimaryKey(records);
    }
}