package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsTaskReplyMapper;
import com.paradm.dms.entity.DmsTaskReply;
import com.paradm.dms.entity.DmsTaskReplyExample;
import com.paradm.dms.service.DmsTaskReplyService;

@Service
public class DmsTaskReplyServiceImpl implements DmsTaskReplyService {
    @Autowired
    private DmsTaskReplyMapper dmsTaskReplyMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsTaskReplyServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#countByExample(com.paradm.system.entity.DmsTaskReplyExample)
     */ 
    @Override
    public int countByExample(DmsTaskReplyExample example) {
        int count = this.dmsTaskReplyMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsTaskReply selectByPrimaryKey(Long id) {
        return this.dmsTaskReplyMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#selectByExample(com.paradm.system.entity.DmsTaskReplyExample)
     */ 
    @Override
    public List<DmsTaskReply> selectByExample(DmsTaskReplyExample example) {
        return this.dmsTaskReplyMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#deleteByExample(com.paradm.system.entity.DmsTaskReplyExample)
     */ 
    @Override
    public int deleteByExample(DmsTaskReplyExample example) {
        return this.dmsTaskReplyMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsTaskReplyMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#insert(com.paradm.system.entity.DmsTaskReply)
     */ 
    @Override
    public int insert(DmsTaskReply record) {
        return this.dmsTaskReplyMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#insertSelective(com.paradm.system.entity.DmsTaskReply)
     */ 
    @Override
    public int insertSelective(DmsTaskReply record) {
        return this.dmsTaskReplyMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#insertBatch(.List<DmsTaskReply>)
     */ 
    @Override
    public int insertBatch(List<DmsTaskReply> record) {
        return this.dmsTaskReplyMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#insertBatchSelective(.List<DmsTaskReply>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsTaskReply> record) {
        return this.dmsTaskReplyMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsTaskReply)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsTaskReply record) {
        return this.dmsTaskReplyMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#updateByPrimaryKey(com.paradm.system.entity.DmsTaskReply)
     */ 
    @Override
    public int updateByPrimaryKey(DmsTaskReply record) {
        return this.dmsTaskReplyMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#updateByExampleSelective(com.paradm.system.entity.DmsTaskReplycom.paradm.system.entity.DmsTaskReplyExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsTaskReply record, DmsTaskReplyExample example) {
        return this.dmsTaskReplyMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#updateByExample(com.paradm.system.entity.DmsTaskReplycom.paradm.system.entity.DmsTaskReplyExample)
     */ 
    @Override
    public int updateByExample(DmsTaskReply record, DmsTaskReplyExample example) {
        return this.dmsTaskReplyMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsTaskReply)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsTaskReply record) {
        return this.dmsTaskReplyMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsTaskReplyExample)
     */ 
    @Override
    public List<DmsTaskReply> selectByExampleWithBLOBs(DmsTaskReplyExample example) {
        return this.dmsTaskReplyMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#updateBatchByPrimaryKeySelective(.List<DmsTaskReply>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsTaskReply> records) {
        return this.dmsTaskReplyMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsTaskReplyService#updateBatchByPrimaryKey(.List<DmsTaskReply>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsTaskReply> records) {
        return this.dmsTaskReplyMapper.updateBatchByPrimaryKey(records);
    }
}