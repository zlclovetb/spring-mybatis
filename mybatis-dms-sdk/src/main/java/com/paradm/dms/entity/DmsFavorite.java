package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsFavorite extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long orgId;

    /** 
     */ 
    private Long docId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_FAVORITE.ORG_ID
     * @return DMS_FAVORITE.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 DMS_FAVORITE.ORG_ID
     * @param orgId DMS_FAVORITE.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /** 
     * 获取 DMS_FAVORITE.DOC_ID
     * @return DMS_FAVORITE.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_FAVORITE.DOC_ID
     * @param docId DMS_FAVORITE.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }
}