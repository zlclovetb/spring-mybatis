package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsHierarchy extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long hierarchyId;

    /** 
     */ 
    private Integer hierarchyLevel;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_HIERARCHY.DOC_ID
     * @return DMS_HIERARCHY.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_HIERARCHY.DOC_ID
     * @param docId DMS_HIERARCHY.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_HIERARCHY.HIERARCHY_ID
     * @return DMS_HIERARCHY.HIERARCHY_ID
     */
    public Long getHierarchyId() {
        return hierarchyId;
    }

    /** 
     * 设置 DMS_HIERARCHY.HIERARCHY_ID
     * @param hierarchyId DMS_HIERARCHY.HIERARCHY_ID
     */
    public void setHierarchyId(Long hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /** 
     * 获取 DMS_HIERARCHY.HIERARCHY_LEVEL
     * @return DMS_HIERARCHY.HIERARCHY_LEVEL
     */
    public Integer getHierarchyLevel() {
        return hierarchyLevel;
    }

    /** 
     * 设置 DMS_HIERARCHY.HIERARCHY_LEVEL
     * @param hierarchyLevel DMS_HIERARCHY.HIERARCHY_LEVEL
     */
    public void setHierarchyLevel(Integer hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }
}