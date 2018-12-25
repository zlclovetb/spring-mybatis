package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAlert extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private String alertType;

    /** 
     */ 
    private String notifyWay;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ALERT.DOC_ID
     * @return DMS_ALERT.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_ALERT.DOC_ID
     * @param docId DMS_ALERT.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_ALERT.ALERT_TYPE
     * @return DMS_ALERT.ALERT_TYPE
     */
    public String getAlertType() {
        return alertType;
    }

    /** 
     * 设置 DMS_ALERT.ALERT_TYPE
     * @param alertType DMS_ALERT.ALERT_TYPE
     */
    public void setAlertType(String alertType) {
        this.alertType = alertType == null ? null : alertType.trim();
    }

    /** 
     * 获取 DMS_ALERT.NOTIFY_WAY
     * @return DMS_ALERT.NOTIFY_WAY
     */
    public String getNotifyWay() {
        return notifyWay;
    }

    /** 
     * 设置 DMS_ALERT.NOTIFY_WAY
     * @param notifyWay DMS_ALERT.NOTIFY_WAY
     */
    public void setNotifyWay(String notifyWay) {
        this.notifyWay = notifyWay == null ? null : notifyWay.trim();
    }
}