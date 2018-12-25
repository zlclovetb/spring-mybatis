package com.paradm.base.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable, Cloneable {
  private static final long serialVersionUID = 3907772215215234398L;
  
  private Long id;
  private Integer updateCount;
  private String recordStatus;
  private Long updaterId;
  private Date updateDate;
  private Long creatorId;
  private Date createDate;
  
  @Override
  public Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Integer getUpdateCount() {
    return updateCount;
  }
  public void setUpdateCount(Integer updateCount) {
    this.updateCount = updateCount;
  }
  public String getRecordStatus() {
    return recordStatus;
  }
  public void setRecordStatus(String recordStatus) {
    this.recordStatus = recordStatus;
  }
  public Long getUpdaterId() {
    return updaterId;
  }
  public void setUpdaterId(Long updaterId) {
    this.updaterId = updaterId;
  }
  public Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }
  public Long getCreatorId() {
    return creatorId;
  }
  public void setCreatorId(Long creatorId) {
    this.creatorId = creatorId;
  }
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
