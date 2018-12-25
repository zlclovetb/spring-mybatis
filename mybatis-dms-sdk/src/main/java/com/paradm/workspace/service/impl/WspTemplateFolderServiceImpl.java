package com.paradm.workspace.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paradm.workspace.dao.WspTemplateFolderMapper;
import com.paradm.workspace.entity.WspTemplateFolder;
import com.paradm.workspace.entity.WspTemplateFolderExample;
import com.paradm.workspace.service.WspTemplateFolderService;

@Service
public class WspTemplateFolderServiceImpl implements WspTemplateFolderService {
    @Autowired
    private WspTemplateFolderMapper wspTemplateFolderMapper;

    private static final Logger logger = LoggerFactory.getLogger(WspTemplateFolderServiceImpl.class);

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#countByExample(com.paradm.system.entity.WspTemplateFolderExample)
     */ 
    @Override
    public int countByExample(WspTemplateFolderExample example) {
        int count = this.wspTemplateFolderMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#selectByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public WspTemplateFolder selectByPrimaryKey(Long id) {
        return this.wspTemplateFolderMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#selectByExample(com.paradm.system.entity.WspTemplateFolderExample)
     */ 
    @Override
    public List<WspTemplateFolder> selectByExample(WspTemplateFolderExample example) {
        return this.wspTemplateFolderMapper.selectByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#deleteByExample(com.paradm.system.entity.WspTemplateFolderExample)
     */ 
    @Override
    public int deleteByExample(WspTemplateFolderExample example) {
        return this.wspTemplateFolderMapper.deleteByExample(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#deleteByPrimaryKey(java.lang.Long)
     */ 
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.wspTemplateFolderMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#insert(com.paradm.system.entity.WspTemplateFolder)
     */ 
    @Override
    public int insert(WspTemplateFolder record) {
        return this.wspTemplateFolderMapper.insert(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#insertSelective(com.paradm.system.entity.WspTemplateFolder)
     */ 
    @Override
    public int insertSelective(WspTemplateFolder record) {
        return this.wspTemplateFolderMapper.insertSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#insertBatch(.List<WspTemplateFolder>)
     */ 
    @Override
    public int insertBatch(List<WspTemplateFolder> record) {
        return this.wspTemplateFolderMapper.insertBatch(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#insertBatchSelective(.List<WspTemplateFolder>)
     */ 
    @Override
    public int insertBatchSelective(List<WspTemplateFolder> record) {
        return this.wspTemplateFolderMapper.insertBatchSelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#updateByPrimaryKeySelective(com.paradm.system.entity.WspTemplateFolder)
     */ 
    @Override
    public int updateByPrimaryKeySelective(WspTemplateFolder record) {
        return this.wspTemplateFolderMapper.updateByPrimaryKeySelective(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#updateByPrimaryKey(com.paradm.system.entity.WspTemplateFolder)
     */ 
    @Override
    public int updateByPrimaryKey(WspTemplateFolder record) {
        return this.wspTemplateFolderMapper.updateByPrimaryKey(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#updateByExampleSelective(com.paradm.system.entity.WspTemplateFoldercom.paradm.system.entity.WspTemplateFolderExample)
     */ 
    @Override
    public int updateByExampleSelective(WspTemplateFolder record, WspTemplateFolderExample example) {
        return this.wspTemplateFolderMapper.updateByExampleSelective(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#updateByExample(com.paradm.system.entity.WspTemplateFoldercom.paradm.system.entity.WspTemplateFolderExample)
     */ 
    @Override
    public int updateByExample(WspTemplateFolder record, WspTemplateFolderExample example) {
        return this.wspTemplateFolderMapper.updateByExample(record, example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#updateByPrimaryKeyWithBLOBs(com.paradm.system.entity.WspTemplateFolder)
     */ 
    @Override
    public int updateByPrimaryKeyWithBLOBs(WspTemplateFolder record) {
        return this.wspTemplateFolderMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#selectByExampleWithBLOBs(com.paradm.system.entity.WspTemplateFolderExample)
     */ 
    @Override
    public List<WspTemplateFolder> selectByExampleWithBLOBs(WspTemplateFolderExample example) {
        return this.wspTemplateFolderMapper.selectByExampleWithBLOBs(example);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#updateBatchByPrimaryKeySelective(.List<WspTemplateFolder>)
     */ 
    @Override
    public int updateBatchByPrimaryKeySelective(List<WspTemplateFolder> records) {
        return this.wspTemplateFolderMapper.updateBatchByPrimaryKeySelective(records);
    }

    /* (non-Javadoc) 
     * @see com.paradm.system.service.WspTemplateFolderService#updateBatchByPrimaryKey(.List<WspTemplateFolder>)
     */ 
    @Override
    public int updateBatchByPrimaryKey(List<WspTemplateFolder> records) {
        return this.wspTemplateFolderMapper.updateBatchByPrimaryKey(records);
    }
}