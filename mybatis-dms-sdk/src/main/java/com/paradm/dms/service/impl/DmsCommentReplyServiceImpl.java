package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsCommentReplyMapper;
import com.paradm.dms.entity.DmsCommentReply;
import com.paradm.dms.entity.DmsCommentReplyExample;
import com.paradm.dms.service.DmsCommentReplyService;

@Service
public class DmsCommentReplyServiceImpl implements DmsCommentReplyService {
    @Autowired
    private DmsCommentReplyMapper dmsCommentReplyMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsCommentReplyServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#countByExample(com.paradm.system.entity.DmsCommentReplyExample)
     */ 
    @Override
    public int countByExample(DmsCommentReplyExample example) {
        int count = this.dmsCommentReplyMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsCommentReply selectByPrimaryKey(Long id) {
        return this.dmsCommentReplyMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#selectByExample(com.paradm.system.entity.DmsCommentReplyExample)
     */ 
    @Override
    public List<DmsCommentReply> selectByExample(DmsCommentReplyExample example) {
        return this.dmsCommentReplyMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#deleteByExample(com.paradm.system.entity.DmsCommentReplyExample)
     */ 
    @Override
    public int deleteByExample(DmsCommentReplyExample example) {
        return this.dmsCommentReplyMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsCommentReplyMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#insert(com.paradm.system.entity.DmsCommentReply)
     */ 
    @Override
    public int insert(DmsCommentReply record) {
        return this.dmsCommentReplyMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#insertSelective(com.paradm.system.entity.DmsCommentReply)
     */ 
    @Override
    public int insertSelective(DmsCommentReply record) {
        return this.dmsCommentReplyMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#insertBatch(.List<DmsCommentReply>)
     */ 
    @Override
    public int insertBatch(List<DmsCommentReply> record) {
        return this.dmsCommentReplyMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#insertBatchSelective(.List<DmsCommentReply>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsCommentReply> record) {
        return this.dmsCommentReplyMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsCommentReply)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsCommentReply record) {
        return this.dmsCommentReplyMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#updateByPrimaryKey(com.paradm.system.entity.DmsCommentReply)
     */ 
    @Override
    public int updateByPrimaryKey(DmsCommentReply record) {
        return this.dmsCommentReplyMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#updateByExampleSelective(com.paradm.system.entity.DmsCommentReplycom.paradm.system.entity.DmsCommentReplyExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsCommentReply record, DmsCommentReplyExample example) {
        return this.dmsCommentReplyMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#updateByExample(com.paradm.system.entity.DmsCommentReplycom.paradm.system.entity.DmsCommentReplyExample)
     */ 
    @Override
    public int updateByExample(DmsCommentReply record, DmsCommentReplyExample example) {
        return this.dmsCommentReplyMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsCommentReply)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsCommentReply record) {
        return this.dmsCommentReplyMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsCommentReplyExample)
     */ 
    @Override
    public List<DmsCommentReply> selectByExampleWithBLOBs(DmsCommentReplyExample example) {
        return this.dmsCommentReplyMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#updateBatchByPrimaryKeySelective(.List<DmsCommentReply>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsCommentReply> records) {
        return this.dmsCommentReplyMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsCommentReplyService#updateBatchByPrimaryKey(.List<DmsCommentReply>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsCommentReply> records) {
        return this.dmsCommentReplyMapper.updateBatchByPrimaryKey(records);
    }
}