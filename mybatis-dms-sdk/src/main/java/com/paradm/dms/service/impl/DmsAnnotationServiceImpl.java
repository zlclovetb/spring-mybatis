package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsAnnotationMapper;
import com.paradm.dms.entity.DmsAnnotation;
import com.paradm.dms.entity.DmsAnnotationExample;
import com.paradm.dms.service.DmsAnnotationService;

@Service
public class DmsAnnotationServiceImpl implements DmsAnnotationService {
    @Autowired
    private DmsAnnotationMapper dmsAnnotationMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsAnnotationServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#countByExample(com.paradm.system.entity.DmsAnnotationExample)
     */ 
    @Override
    public int countByExample(DmsAnnotationExample example) {
        int count = this.dmsAnnotationMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsAnnotation selectByPrimaryKey(Long id) {
        return this.dmsAnnotationMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#selectByExample(com.paradm.system.entity.DmsAnnotationExample)
     */ 
    @Override
    public List<DmsAnnotation> selectByExample(DmsAnnotationExample example) {
        return this.dmsAnnotationMapper.selectByExampleWithoutBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#deleteByExample(com.paradm.system.entity.DmsAnnotationExample)
     */ 
    @Override
    public int deleteByExample(DmsAnnotationExample example) {
        return this.dmsAnnotationMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsAnnotationMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#insert(com.paradm.system.entity.DmsAnnotation)
     */ 
    @Override
    public int insert(DmsAnnotation record) {
        return this.dmsAnnotationMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#insertSelective(com.paradm.system.entity.DmsAnnotation)
     */ 
    @Override
    public int insertSelective(DmsAnnotation record) {
        return this.dmsAnnotationMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#insertBatch(.List<DmsAnnotation>)
     */ 
    @Override
    public int insertBatch(List<DmsAnnotation> record) {
        return this.dmsAnnotationMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#insertBatchSelective(.List<DmsAnnotation>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsAnnotation> record) {
        return this.dmsAnnotationMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsAnnotation)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsAnnotation record) {
        return this.dmsAnnotationMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#updateByPrimaryKey(com.paradm.system.entity.DmsAnnotation)
     */ 
    @Override
    public int updateByPrimaryKey(DmsAnnotation record) {
        return this.dmsAnnotationMapper.updateByPrimaryKeyWithoutBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#updateByExampleSelective(com.paradm.system.entity.DmsAnnotationcom.paradm.system.entity.DmsAnnotationExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsAnnotation record, DmsAnnotationExample example) {
        return this.dmsAnnotationMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#updateByExample(com.paradm.system.entity.DmsAnnotationcom.paradm.system.entity.DmsAnnotationExample)
     */ 
    @Override
    public int updateByExample(DmsAnnotation record, DmsAnnotationExample example) {
        return this.dmsAnnotationMapper.updateByExampleWithoutBLOBs(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsAnnotation)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsAnnotation record) {
        return this.dmsAnnotationMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsAnnotationExample)
     */ 
    @Override
    public List<DmsAnnotation> selectByExampleWithBLOBs(DmsAnnotationExample example) {
        return this.dmsAnnotationMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#updateBatchByPrimaryKeySelective(.List<DmsAnnotation>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsAnnotation> records) {
        return this.dmsAnnotationMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsAnnotationService#updateBatchByPrimaryKey(.List<DmsAnnotation>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsAnnotation> records) {
        return this.dmsAnnotationMapper.updateBatchByPrimaryKey(records);
    }
}