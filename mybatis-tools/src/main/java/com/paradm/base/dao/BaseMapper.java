package com.paradm.base.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 通用IMapper<M, E, PK>
 * T:实体类
 * E:Example
 * PK:主键的变量类型
 *
 * @author orange1438
 * github: github.com/zlc_tb
 * date: 2018/12/11 17:39
 */
public interface BaseMapper<T, E, PK extends Serializable> {
  
  /**
   * 查询数量
   *
   * @param example 条件对象
   * @return 返回的数量
   */
  long countByExample(E example);

  /**
   * 根据条件删除
   *
   * @param example 条件对象
   * @return 返回删除成功的数量
   */
  int deleteByExample(E example);

  /**
   * 根据PK删除
   *
   * @param PK 主键PK
   * @return 返回删除成功的数量
   */
  int deleteByPrimaryKey(PK PK);

  /**
   * 添加对象所有字段
   *
   * @param record 插入字段对象(必须含PK）
   * @return 返回添加成功的数量
   */
  int insert(T record);

  /**
   * 添加对象对应字段
   *
   * @param record 插入字段对象(必须含PK）
   * @return 返回添加成功的数量
   */
  int insertSelective(T record);

  /**
   * 添加对象集合对应字段
   *
   * @param record 插入字段对象(必须含PK）
   * @return 返回添加成功的数量
   */
  int insertBatchSelective(List<T> record);

  /**
   * 添加对象集合对应字段
   *
   * @param record 插入字段对象(必须含PK）
   * @return 返回添加成功的数量
   */
  int insertBatch(List<T> record);

  /**
   * 根据条件查询（二进制大对象）
   *
   * @param example 条件对象
   * @return 返回查询的结果
   */
  List<T> selectByExample(E example);

  /**
   * 根据PK查询
   *
   * @param PK 主键PK
   * @return 返回查询的结果
   */
  T selectByPrimaryKey(PK PK);
  
  /**
   * 根据条件查询（包含二进制大对象）
   *
   * @param example 条件对象
   * @return 返回查询的结果
   */
  List<T> selectByExampleWithBLOBs(E example);

  /**
   * 根据PK修改对应字段
   *
   * @param record 修改字段对象(必须含PK）
   * @return 返回更新成功的数量
   */
  int updateByPrimaryKeySelective(T record);

  /**
   * 根据PK修改所有字段(必须含PK）
   *
   * @param record 修改字段对象(必须含PK）
   * @return 返回更新成功的数量
   */
  int updateByPrimaryKey(T record);

  /**
   * 根据PK修改字段（包含二进制大对象）
   *
   * @param record 修改字段对象(必须含PK）
   * @return 返回更新成功的数量
   */
  int updateByPrimaryKeyWithBLOBs(T record);

  /**
   * 根据条件修改字段 （包含大字段）
   * @param record 修改字段对象(必须含PK）
   * @param example 条件对象
   * @return 返回更新成功的数量
   */
  int updateByExampleWithBLOBs(@Param("record") T record, @Param("example") E example);

  /**
   * 根据条件修改对应字段
   * @param record 修改字段对象 (JOPO)
   * @param example 条件对象
   * @return 返回更新成功的数量
   */
  int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

  /**
   * 根据条件修改所有字段
   * @param record 修改字段对象 (JOPO)
   * @param example 条件对象
   * @return 返回更新成功的数量
   */
  int updateByExample(@Param("record") T record, @Param("example") E example);


  /**
   * 根据PK批量修改对应字段
   *
   * @param record 修改字段对象(必须含PK）
   * @return 返回更新成功的数量
   */
  int updateBatchByPrimaryKeySelective(List<T> record);

  /**
   * 根据PK批量修改所有字段(必须含PK）
   *
   * @param record 修改字段对象(必须含PK）
   * @return 返回更新成功的数量
   */
  int updateBatchByPrimaryKey(List<T> record);

  /**
   * 根据条件批量修改对应字段
   * @param record 修改字段对象 (JOPO)
   * @param example 条件对象
   * @return 返回更新成功的数量
   */
  int updateBatchByExampleSelective(@Param("recordList") List<T> record, @Param("example") E example);

  /**
   * 根据条件批量修改所有字段
   * @param record 修改字段对象 (JOPO)
   * @param example 条件对象
   * @return 返回更新成功的数量
   */
  int updateBatchByExample(@Param("recordList") List<T> record, @Param("example") E example);
  
}
