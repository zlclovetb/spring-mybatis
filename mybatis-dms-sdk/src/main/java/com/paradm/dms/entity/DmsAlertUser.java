package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAlertUser extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long alertId;

    /** 
     */ 
    private Long orgId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ALERT_USER.ALERT_ID
     * @return DMS_ALERT_USER.ALERT_ID
     */
    public Long getAlertId() {
        return alertId;
    }

    /** 
     * 设置 DMS_ALERT_USER.ALERT_ID
     * @param alertId DMS_ALERT_USER.ALERT_ID
     */
    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    /** 
     * 获取 DMS_ALERT_USER.ORG_ID
     * @return DMS_ALERT_USER.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 DMS_ALERT_USER.ORG_ID
     * @param orgId DMS_ALERT_USER.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}