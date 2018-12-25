package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsAnnotationDrawingPositionMapper;
import com.paradm.dms.entity.DmsAnnotationDrawingPosition;
import com.paradm.dms.entity.DmsAnnotationDrawingPositionExample;
import com.paradm.dms.service.DmsAnnotationDrawingPositionService;

@Service
public class DmsAnnotationDrawingPositionServiceImpl implements DmsAnnotationDrawingPositionService {
    @Autowired
    private DmsAnnotationDrawingPositionMapper dmsAnnotationDrawingPositionMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsAnnotationDrawingPositionServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#countByExample(com.paradm.system.entity.DmsAnnotationDrawingPositionExample)
     */ 
    @Override
    public int countByExample(DmsAnnotationDrawingPositionExample example) {
        int count = this.dmsAnnotationDrawingPositionMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsAnnotationDrawingPosition selectByPrimaryKey(Long id) {
        return this.dmsAnnotationDrawingPositionMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#selectByExample(com.paradm.system.entity.DmsAnnotationDrawingPositionExample)
     */ 
    @Override
    public List<DmsAnnotationDrawingPosition> selectByExample(DmsAnnotationDrawingPositionExample example) {
        return this.dmsAnnotationDrawingPositionMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#deleteByExample(com.paradm.system.entity.DmsAnnotationDrawingPositionExample)
     */ 
    @Override
    public int deleteByExample(DmsAnnotationDrawingPositionExample example) {
        return this.dmsAnnotationDrawingPositionMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsAnnotationDrawingPositionMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#insert(com.paradm.system.entity.DmsAnnotationDrawingPosition)
     */ 
    @Override
    public int insert(DmsAnnotationDrawingPosition record) {
        return this.dmsAnnotationDrawingPositionMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#insertSelective(com.paradm.system.entity.DmsAnnotationDrawingPosition)
     */ 
    @Override
    public int insertSelective(DmsAnnotationDrawingPosition record) {
        return this.dmsAnnotationDrawingPositionMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#insertBatch(.List<DmsAnnotationDrawingPosition>)
     */ 
    @Override
    public int insertBatch(List<DmsAnnotationDrawingPosition> record) {
        return this.dmsAnnotationDrawingPositionMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#insertBatchSelective(.List<DmsAnnotationDrawingPosition>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsAnnotationDrawingPosition> record) {
        return this.dmsAnnotationDrawingPositionMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsAnnotationDrawingPosition)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsAnnotationDrawingPosition record) {
        return this.dmsAnnotationDrawingPositionMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#updateByPrimaryKey(com.paradm.system.entity.DmsAnnotationDrawingPosition)
     */ 
    @Override
    public int updateByPrimaryKey(DmsAnnotationDrawingPosition record) {
        return this.dmsAnnotationDrawingPositionMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#updateByExampleSelective(com.paradm.system.entity.DmsAnnotationDrawingPositioncom.paradm.system.entity.DmsAnnotationDrawingPositionExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsAnnotationDrawingPosition record, DmsAnnotationDrawingPositionExample example) {
        return this.dmsAnnotationDrawingPositionMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#updateByExample(com.paradm.system.entity.DmsAnnotationDrawingPositioncom.paradm.system.entity.DmsAnnotationDrawingPositionExample)
     */ 
    @Override
    public int updateByExample(DmsAnnotationDrawingPosition record, DmsAnnotationDrawingPositionExample example) {
        return this.dmsAnnotationDrawingPositionMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsAnnotationDrawingPosition)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsAnnotationDrawingPosition record) {
        return this.dmsAnnotationDrawingPositionMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsAnnotationDrawingPositionExample)
     */ 
    @Override
    public List<DmsAnnotationDrawingPosition> selectByExampleWithBLOBs(DmsAnnotationDrawingPositionExample example) {
        return this.dmsAnnotationDrawingPositionMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#updateBatchByPrimaryKeySelective(.List<DmsAnnotationDrawingPosition>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsAnnotationDrawingPosition> records) {
        return this.dmsAnnotationDrawingPositionMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationDrawingPositionService#updateBatchByPrimaryKey(.List<DmsAnnotationDrawingPosition>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsAnnotationDrawingPosition> records) {
        return this.dmsAnnotationDrawingPositionMapper.updateBatchByPrimaryKey(records);
    }
}