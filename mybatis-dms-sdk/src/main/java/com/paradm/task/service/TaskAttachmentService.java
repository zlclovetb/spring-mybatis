package com.paradm.task.service;

import java.util.List;

import com.paradm.task.entity.TaskAttachment;
import com.paradm.task.entity.TaskAttachmentExample;

public interface TaskAttachmentService {
    /** 
     * 查询数量
     * @param example 条件对象
     * @return 返回数据的数量
     */
    int countByExample(TaskAttachmentExample example);

    /** 
     * 根据条件删除
     * @param example 条件对象
     * @return 返回删除成功的数量
     */
    int deleteByExample(TaskAttachmentExample example);

    /** 
     * 根据ID删除
     * @param id 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long id);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(TaskAttachment record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(TaskAttachment record);

    /** 
     * 添加List集合对象所有字段
     * @param record 批量插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertBatch(List<TaskAttachment> record);

    /** 
     * 添加List集合对象对应字段
     * @param record 批量插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertBatchSelective(List<TaskAttachment> record);

    /** 
     * 根据条件查询（二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<TaskAttachment> selectByExample(TaskAttachmentExample example);

    /** 
     * 根据ID查询
     * @param id 主键ID
     * @return 返回查询的结果
     */
    TaskAttachment selectByPrimaryKey(Long id);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(TaskAttachment record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(TaskAttachment record);

    /** 
     * 根据条件修改对应字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExampleSelective(TaskAttachment record, TaskAttachmentExample example);

    /** 
     * 根据条件修改所有字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExample(TaskAttachment record, TaskAttachmentExample example);

    /** 
     * 根据ID修改字段（包含二进制大对象）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeyWithBLOBs(TaskAttachment record);

    /** 
     * 根据条件查询（包含二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<TaskAttachment> selectByExampleWithBLOBs(TaskAttachmentExample example);

    /** 
     * 根据主键，批量更新对应字段数据
     * @param records
     * @return 返回更新成功的数量
     */
    int updateBatchByPrimaryKeySelective(List<TaskAttachment> records);

    /** 
     * 根据主键，批量更新
     * @param records
     * @return 返回更新成功的数量
     */
    int updateBatchByPrimaryKey(List<TaskAttachment> records);
}