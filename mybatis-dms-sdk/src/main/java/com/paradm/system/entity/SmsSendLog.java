package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class SmsSendLog extends BaseEntity implements Serializable {
    /** 
     */ 
    private String description;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 SMS_SEND_LOG.DESCRIPTION
     * @return SMS_SEND_LOG.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 SMS_SEND_LOG.DESCRIPTION
     * @param description SMS_SEND_LOG.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}