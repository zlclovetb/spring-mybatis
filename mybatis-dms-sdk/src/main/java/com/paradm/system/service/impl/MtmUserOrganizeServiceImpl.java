package com.paradm.system.service.impl;

import com.paradm.system.dao.MtmUserOrganizeMapper;
import com.paradm.system.entity.MtmUserOrganize;
import com.paradm.system.entity.MtmUserOrganizeExample;
import com.paradm.system.service.MtmUserOrganizeService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MtmUserOrganizeServiceImpl implements MtmUserOrganizeService {
    @Autowired
    private MtmUserOrganizeMapper mtmUserOrganizeMapper;

    private static final Logger logger = LoggerFactory.getLogger(MtmUserOrganizeServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#countByExample(com.paradm.system.entity.MtmUserOrganizeExample)
     */ 
    @Override
    public int countByExample(MtmUserOrganizeExample example) {
        int count = this.mtmUserOrganizeMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public MtmUserOrganize selectByPrimaryKey(Long id) {
        return this.mtmUserOrganizeMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#selectByExample(com.paradm.system.entity.MtmUserOrganizeExample)
     */ 
    @Override
    public List<MtmUserOrganize> selectByExample(MtmUserOrganizeExample example) {
        return this.mtmUserOrganizeMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#deleteByExample(com.paradm.system.entity.MtmUserOrganizeExample)
     */ 
    @Override
    public int deleteByExample(MtmUserOrganizeExample example) {
        return this.mtmUserOrganizeMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.mtmUserOrganizeMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#insert(com.paradm.system.entity.MtmUserOrganize)
     */ 
    @Override
    public int insert(MtmUserOrganize record) {
        return this.mtmUserOrganizeMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#insertSelective(com.paradm.system.entity.MtmUserOrganize)
     */ 
    @Override
    public int insertSelective(MtmUserOrganize record) {
        return this.mtmUserOrganizeMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#insertBatch(.List<MtmUserOrganize>)
     */ 
    @Override
    public int insertBatch(List<MtmUserOrganize> record) {
        return this.mtmUserOrganizeMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#insertBatchSelective(.List<MtmUserOrganize>)
     */ 
    @Override
    public int insertBatchSelective(List<MtmUserOrganize> record) {
        return this.mtmUserOrganizeMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#updateByPrimaryKeySelective(com.paradm.system.entity.MtmUserOrganize)
     */ 
    @Override
    public int updateByPrimaryKeySelective(MtmUserOrganize record) {
        return this.mtmUserOrganizeMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#updateByPrimaryKey(com.paradm.system.entity.MtmUserOrganize)
     */ 
    @Override
    public int updateByPrimaryKey(MtmUserOrganize record) {
        return this.mtmUserOrganizeMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#updateByExampleSelective(com.paradm.system.entity.MtmUserOrganizecom.paradm.system.entity.MtmUserOrganizeExample)
     */ 
    @Override
    public int updateByExampleSelective(MtmUserOrganize record, MtmUserOrganizeExample example) {
        return this.mtmUserOrganizeMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#updateByExample(com.paradm.system.entity.MtmUserOrganizecom.paradm.system.entity.MtmUserOrganizeExample)
     */ 
    @Override
    public int updateByExample(MtmUserOrganize record, MtmUserOrganizeExample example) {
        return this.mtmUserOrganizeMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.MtmUserOrganize)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(MtmUserOrganize record) {
        return this.mtmUserOrganizeMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#selectByExampleWithBLOBs(com.paradm.system.entity.MtmUserOrganizeExample)
     */ 
    @Override
    public List<MtmUserOrganize> selectByExampleWithBLOBs(MtmUserOrganizeExample example) {
        return this.mtmUserOrganizeMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#updateBatchByPrimaryKeySelective(.List<MtmUserOrganize>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<MtmUserOrganize> records) {
        return this.mtmUserOrganizeMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.MtmUserOrganizeService#updateBatchByPrimaryKey(.List<MtmUserOrganize>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<MtmUserOrganize> records) {
        return this.mtmUserOrganizeMapper.updateBatchByPrimaryKey(records);
    }
}