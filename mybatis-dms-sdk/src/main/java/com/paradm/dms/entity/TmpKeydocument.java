package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TmpKeydocument extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private String content;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TMP_KEYDOCUMENT.DOC_ID
     * @return TMP_KEYDOCUMENT.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 TMP_KEYDOCUMENT.DOC_ID
     * @param docId TMP_KEYDOCUMENT.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 TMP_KEYDOCUMENT.CONTENT
     * @return TMP_KEYDOCUMENT.CONTENT
     */
    public String getContent() {
        return content;
    }

    /** 
     * 设置 TMP_KEYDOCUMENT.CONTENT
     * @param content TMP_KEYDOCUMENT.CONTENT
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}