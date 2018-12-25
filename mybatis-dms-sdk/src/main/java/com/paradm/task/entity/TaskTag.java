package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskTag extends BaseEntity implements Serializable {
    /** 
     */ 
    private String tag;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_TAG.TAG
     * @return TASK_TAG.TAG
     */
    public String getTag() {
        return tag;
    }

    /** 
     * 设置 TASK_TAG.TAG
     * @param tag TASK_TAG.TAG
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}