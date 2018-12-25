package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class SysNotificationGroup extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long groupId;

    /** 
     */ 
    private Long notificationId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 SYS_NOTIFICATION_GROUP.GROUP_ID
     * @return SYS_NOTIFICATION_GROUP.GROUP_ID
     */
    public Long getGroupId() {
        return groupId;
    }

    /** 
     * 设置 SYS_NOTIFICATION_GROUP.GROUP_ID
     * @param groupId SYS_NOTIFICATION_GROUP.GROUP_ID
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /** 
     * 获取 SYS_NOTIFICATION_GROUP.NOTIFICATION_ID
     * @return SYS_NOTIFICATION_GROUP.NOTIFICATION_ID
     */
    public Long getNotificationId() {
        return notificationId;
    }

    /** 
     * 设置 SYS_NOTIFICATION_GROUP.NOTIFICATION_ID
     * @param notificationId SYS_NOTIFICATION_GROUP.NOTIFICATION_ID
     */
    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }
}