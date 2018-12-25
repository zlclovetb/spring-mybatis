package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsObjectMenu extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long menuItemId;

    /** 
     */ 
    private String objectType;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_OBJECT_MENU.MENU_ITEM_ID
     * @return DMS_OBJECT_MENU.MENU_ITEM_ID
     */
    public Long getMenuItemId() {
        return menuItemId;
    }

    /** 
     * 设置 DMS_OBJECT_MENU.MENU_ITEM_ID
     * @param menuItemId DMS_OBJECT_MENU.MENU_ITEM_ID
     */
    public void setMenuItemId(Long menuItemId) {
        this.menuItemId = menuItemId;
    }

    /** 
     * 获取 DMS_OBJECT_MENU.OBJECT_TYPE
     * @return DMS_OBJECT_MENU.OBJECT_TYPE
     */
    public String getObjectType() {
        return objectType;
    }

    /** 
     * 设置 DMS_OBJECT_MENU.OBJECT_TYPE
     * @param objectType DMS_OBJECT_MENU.OBJECT_TYPE
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }
}