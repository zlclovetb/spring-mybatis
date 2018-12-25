package com.paradm.dms.entity;

import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAnnotationWithBLOBs extends DmsAnnotation implements Serializable {
    /** 
     */ 
    private String text;

    /** 
     */ 
    private String icon;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ANNOTATION.TEXT
     * @return DMS_ANNOTATION.TEXT
     */
    public String getText() {
        return text;
    }

    /** 
     * 设置 DMS_ANNOTATION.TEXT
     * @param text DMS_ANNOTATION.TEXT
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION.ICON
     * @return DMS_ANNOTATION.ICON
     */
    public String getIcon() {
        return icon;
    }

    /** 
     * 设置 DMS_ANNOTATION.ICON
     * @param icon DMS_ANNOTATION.ICON
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}