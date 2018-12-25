package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.TmpKeydocumentMapper;
import com.paradm.dms.entity.TmpKeydocument;
import com.paradm.dms.entity.TmpKeydocumentExample;
import com.paradm.dms.service.TmpKeydocumentService;

@Service
public class TmpKeydocumentServiceImpl implements TmpKeydocumentService {
    @Autowired
    private TmpKeydocumentMapper tmpKeydocumentMapper;

    private static final Logger logger = LoggerFactory.getLogger(TmpKeydocumentServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#countByExample(com.paradm.system.entity.TmpKeydocumentExample)
     */ 
    @Override
    public int countByExample(TmpKeydocumentExample example) {
        int count = this.tmpKeydocumentMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public TmpKeydocument selectByPrimaryKey(Long id) {
        return this.tmpKeydocumentMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#selectByExample(com.paradm.system.entity.TmpKeydocumentExample)
     */ 
    @Override
    public List<TmpKeydocument> selectByExample(TmpKeydocumentExample example) {
        return this.tmpKeydocumentMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#deleteByExample(com.paradm.system.entity.TmpKeydocumentExample)
     */ 
    @Override
    public int deleteByExample(TmpKeydocumentExample example) {
        return this.tmpKeydocumentMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.tmpKeydocumentMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#insert(com.paradm.system.entity.TmpKeydocument)
     */ 
    @Override
    public int insert(TmpKeydocument record) {
        return this.tmpKeydocumentMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#insertSelective(com.paradm.system.entity.TmpKeydocument)
     */ 
    @Override
    public int insertSelective(TmpKeydocument record) {
        return this.tmpKeydocumentMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#insertBatch(.List<TmpKeydocument>)
     */ 
    @Override
    public int insertBatch(List<TmpKeydocument> record) {
        return this.tmpKeydocumentMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#insertBatchSelective(.List<TmpKeydocument>)
     */ 
    @Override
    public int insertBatchSelective(List<TmpKeydocument> record) {
        return this.tmpKeydocumentMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#updateByPrimaryKeySelective(com.paradm.system.entity.TmpKeydocument)
     */ 
    @Override
    public int updateByPrimaryKeySelective(TmpKeydocument record) {
        return this.tmpKeydocumentMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#updateByPrimaryKey(com.paradm.system.entity.TmpKeydocument)
     */ 
    @Override
    public int updateByPrimaryKey(TmpKeydocument record) {
        return this.tmpKeydocumentMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#updateByExampleSelective(com.paradm.system.entity.TmpKeydocumentcom.paradm.system.entity.TmpKeydocumentExample)
     */ 
    @Override
    public int updateByExampleSelective(TmpKeydocument record, TmpKeydocumentExample example) {
        return this.tmpKeydocumentMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#updateByExample(com.paradm.system.entity.TmpKeydocumentcom.paradm.system.entity.TmpKeydocumentExample)
     */ 
    @Override
    public int updateByExample(TmpKeydocument record, TmpKeydocumentExample example) {
        return this.tmpKeydocumentMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.TmpKeydocument)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(TmpKeydocument record) {
        return this.tmpKeydocumentMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#selectByExampleWithBLOBs(com.paradm.system.entity.TmpKeydocumentExample)
     */ 
    @Override
    public List<TmpKeydocument> selectByExampleWithBLOBs(TmpKeydocumentExample example) {
        return this.tmpKeydocumentMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#updateBatchByPrimaryKeySelective(.List<TmpKeydocument>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<TmpKeydocument> records) {
        return this.tmpKeydocumentMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.TmpKeydocumentService#updateBatchByPrimaryKey(.List<TmpKeydocument>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<TmpKeydocument> records) {
        return this.tmpKeydocumentMapper.updateBatchByPrimaryKey(records);
    }
}