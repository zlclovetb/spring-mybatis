package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsCommentMapper;
import com.paradm.dms.entity.DmsComment;
import com.paradm.dms.entity.DmsCommentExample;
import com.paradm.dms.service.DmsCommentService;

@Service
public class DmsCommentServiceImpl implements DmsCommentService {
    @Autowired
    private DmsCommentMapper dmsCommentMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsCommentServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#countByExample(com.paradm.system.entity.DmsCommentExample)
     */ 
    @Override
    public int countByExample(DmsCommentExample example) {
        int count = this.dmsCommentMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsComment selectByPrimaryKey(Long id) {
        return this.dmsCommentMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#selectByExample(com.paradm.system.entity.DmsCommentExample)
     */ 
    @Override
    public List<DmsComment> selectByExample(DmsCommentExample example) {
        return this.dmsCommentMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#deleteByExample(com.paradm.system.entity.DmsCommentExample)
     */ 
    @Override
    public int deleteByExample(DmsCommentExample example) {
        return this.dmsCommentMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsCommentMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#insert(com.paradm.system.entity.DmsComment)
     */ 
    @Override
    public int insert(DmsComment record) {
        return this.dmsCommentMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#insertSelective(com.paradm.system.entity.DmsComment)
     */ 
    @Override
    public int insertSelective(DmsComment record) {
        return this.dmsCommentMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#insertBatch(.List<DmsComment>)
     */ 
    @Override
    public int insertBatch(List<DmsComment> record) {
        return this.dmsCommentMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#insertBatchSelective(.List<DmsComment>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsComment> record) {
        return this.dmsCommentMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsComment)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsComment record) {
        return this.dmsCommentMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#updateByPrimaryKey(com.paradm.system.entity.DmsComment)
     */ 
    @Override
    public int updateByPrimaryKey(DmsComment record) {
        return this.dmsCommentMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#updateByExampleSelective(com.paradm.system.entity.DmsCommentcom.paradm.system.entity.DmsCommentExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsComment record, DmsCommentExample example) {
        return this.dmsCommentMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#updateByExample(com.paradm.system.entity.DmsCommentcom.paradm.system.entity.DmsCommentExample)
     */ 
    @Override
    public int updateByExample(DmsComment record, DmsCommentExample example) {
        return this.dmsCommentMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsComment)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsComment record) {
        return this.dmsCommentMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsCommentExample)
     */ 
    @Override
    public List<DmsComment> selectByExampleWithBLOBs(DmsCommentExample example) {
        return this.dmsCommentMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#updateBatchByPrimaryKeySelective(.List<DmsComment>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsComment> records) {
        return this.dmsCommentMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentService#updateBatchByPrimaryKey(.List<DmsComment>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsComment> records) {
        return this.dmsCommentMapper.updateBatchByPrimaryKey(records);
    }
}