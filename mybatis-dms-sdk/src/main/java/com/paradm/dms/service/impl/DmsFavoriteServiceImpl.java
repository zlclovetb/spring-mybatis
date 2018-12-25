package com.paradm.dms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.dms.bao.DmsFavoriteMapper;
import com.paradm.dms.entity.DmsFavorite;
import com.paradm.dms.entity.DmsFavoriteExample;
import com.paradm.dms.service.DmsFavoriteService;

@Service
public class DmsFavoriteServiceImpl implements DmsFavoriteService {
    @Autowired
    private DmsFavoriteMapper dmsFavoriteMapper;

    private static final Logger logger = LoggerFactory.getLogger(DmsFavoriteServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#countByExample(com.paradm.system.entity.DmsFavoriteExample)
     */ 
    @Override
    public int countByExample(DmsFavoriteExample example) {
        int count = this.dmsFavoriteMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public DmsFavorite selectByPrimaryKey(Long id) {
        return this.dmsFavoriteMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#selectByExample(com.paradm.system.entity.DmsFavoriteExample)
     */ 
    @Override
    public List<DmsFavorite> selectByExample(DmsFavoriteExample example) {
        return this.dmsFavoriteMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#deleteByExample(com.paradm.system.entity.DmsFavoriteExample)
     */ 
    @Override
    public int deleteByExample(DmsFavoriteExample example) {
        return this.dmsFavoriteMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.dmsFavoriteMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#insert(com.paradm.system.entity.DmsFavorite)
     */ 
    @Override
    public int insert(DmsFavorite record) {
        return this.dmsFavoriteMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#insertSelective(com.paradm.system.entity.DmsFavorite)
     */ 
    @Override
    public int insertSelective(DmsFavorite record) {
        return this.dmsFavoriteMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#insertBatch(.List<DmsFavorite>)
     */ 
    @Override
    public int insertBatch(List<DmsFavorite> record) {
        return this.dmsFavoriteMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#insertBatchSelective(.List<DmsFavorite>)
     */ 
    @Override
    public int insertBatchSelective(List<DmsFavorite> record) {
        return this.dmsFavoriteMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#updateByPrimaryKeySelective(com.paradm.system.entity.DmsFavorite)
     */ 
    @Override
    public int updateByPrimaryKeySelective(DmsFavorite record) {
        return this.dmsFavoriteMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#updateByPrimaryKey(com.paradm.system.entity.DmsFavorite)
     */ 
    @Override
    public int updateByPrimaryKey(DmsFavorite record) {
        return this.dmsFavoriteMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#updateByExampleSelective(com.paradm.system.entity.DmsFavoritecom.paradm.system.entity.DmsFavoriteExample)
     */ 
    @Override
    public int updateByExampleSelective(DmsFavorite record, DmsFavoriteExample example) {
        return this.dmsFavoriteMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#updateByExample(com.paradm.system.entity.DmsFavoritecom.paradm.system.entity.DmsFavoriteExample)
     */ 
    @Override
    public int updateByExample(DmsFavorite record, DmsFavoriteExample example) {
        return this.dmsFavoriteMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.DmsFavorite)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(DmsFavorite record) {
        return this.dmsFavoriteMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#selectByExampleWithBLOBs(com.paradm.system.entity.DmsFavoriteExample)
     */ 
    @Override
    public List<DmsFavorite> selectByExampleWithBLOBs(DmsFavoriteExample example) {
        return this.dmsFavoriteMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#updateBatchByPrimaryKeySelective(.List<DmsFavorite>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<DmsFavorite> records) {
        return this.dmsFavoriteMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.DmsFavoriteService#updateBatchByPrimaryKey(.List<DmsFavorite>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<DmsFavorite> records) {
        return this.dmsFavoriteMapper.updateBatchByPrimaryKey(records);
    }
}