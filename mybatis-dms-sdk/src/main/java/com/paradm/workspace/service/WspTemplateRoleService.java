package com.paradm.workspace.service;

import java.util.List;

import com.paradm.workspace.entity.WspTemplateRole;
import com.paradm.workspace.entity.WspTemplateRoleExample;

public interface WspTemplateRoleService {
    /** 
     * 查询数量
     * @param example 条件对象
     * @return 返回数据的数量
     */
    int countByExample(WspTemplateRoleExample example);

    /** 
     * 根据条件删除
     * @param example 条件对象
     * @return 返回删除成功的数量
     */
    int deleteByExample(WspTemplateRoleExample example);

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
    int insert(WspTemplateRole record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(WspTemplateRole record);

    /** 
     * 添加List集合对象所有字段
     * @param record 批量插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertBatch(List<WspTemplateRole> record);

    /** 
     * 添加List集合对象对应字段
     * @param record 批量插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertBatchSelective(List<WspTemplateRole> record);

    /** 
     * 根据条件查询（二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<WspTemplateRole> selectByExample(WspTemplateRoleExample example);

    /** 
     * 根据ID查询
     * @param id 主键ID
     * @return 返回查询的结果
     */
    WspTemplateRole selectByPrimaryKey(Long id);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(WspTemplateRole record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(WspTemplateRole record);

    /** 
     * 根据条件修改对应字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExampleSelective(WspTemplateRole record, WspTemplateRoleExample example);

    /** 
     * 根据条件修改所有字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExample(WspTemplateRole record, WspTemplateRoleExample example);

    /** 
     * 根据ID修改字段（包含二进制大对象）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeyWithBLOBs(WspTemplateRole record);

    /** 
     * 根据条件查询（包含二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<WspTemplateRole> selectByExampleWithBLOBs(WspTemplateRoleExample example);

    /** 
     * 根据主键，批量更新对应字段数据
     * @param records
     * @return 返回更新成功的数量
     */
    int updateBatchByPrimaryKeySelective(List<WspTemplateRole> records);

    /** 
     * 根据主键，批量更新
     * @param records
     * @return 返回更新成功的数量
     */
    int updateBatchByPrimaryKey(List<WspTemplateRole> records);
}