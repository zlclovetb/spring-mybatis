package com.paradm.dms.service;

import java.util.List;

import com.paradm.dms.entity.DmsAnnotationDrawingPosition;
import com.paradm.dms.entity.DmsAnnotationDrawingPositionExample;

public interface DmsAnnotationDrawingPositionService {
    /** 
     * 查询数量
     * @param example 条件对象
     * @return 返回数据的数量
     */
    int countByExample(DmsAnnotationDrawingPositionExample example);

    /** 
     * 根据条件删除
     * @param example 条件对象
     * @return 返回删除成功的数量
     */
    int deleteByExample(DmsAnnotationDrawingPositionExample example);

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
    int insert(DmsAnnotationDrawingPosition record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(DmsAnnotationDrawingPosition record);

    /** 
     * 添加List集合对象所有字段
     * @param record 批量插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertBatch(List<DmsAnnotationDrawingPosition> record);

    /** 
     * 添加List集合对象对应字段
     * @param record 批量插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertBatchSelective(List<DmsAnnotationDrawingPosition> record);

    /** 
     * 根据条件查询（二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<DmsAnnotationDrawingPosition> selectByExample(DmsAnnotationDrawingPositionExample example);

    /** 
     * 根据ID查询
     * @param id 主键ID
     * @return 返回查询的结果
     */
    DmsAnnotationDrawingPosition selectByPrimaryKey(Long id);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(DmsAnnotationDrawingPosition record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(DmsAnnotationDrawingPosition record);

    /** 
     * 根据条件修改对应字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExampleSelective(DmsAnnotationDrawingPosition record, DmsAnnotationDrawingPositionExample example);

    /** 
     * 根据条件修改所有字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExample(DmsAnnotationDrawingPosition record, DmsAnnotationDrawingPositionExample example);

    /** 
     * 根据ID修改字段（包含二进制大对象）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeyWithBLOBs(DmsAnnotationDrawingPosition record);

    /** 
     * 根据条件查询（包含二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<DmsAnnotationDrawingPosition> selectByExampleWithBLOBs(DmsAnnotationDrawingPositionExample example);

    /** 
     * 根据主键，批量更新对应字段数据
     * @param records
     * @return 返回更新成功的数量
     */
    int updateBatchByPrimaryKeySelective(List<DmsAnnotationDrawingPosition> records);

    /** 
     * 根据主键，批量更新
     * @param records
     * @return 返回更新成功的数量
     */
    int updateBatchByPrimaryKey(List<DmsAnnotationDrawingPosition> records);
}