package com.paradm.dms.bao;

import org.springframework.stereotype.Repository;

import com.paradm.base.dao.BaseMapper;
import com.paradm.dms.entity.DmsPermission;
import com.paradm.dms.entity.DmsPermissionExample;

/**
 * 通用IMapper<T, E, PK>
 * T:实体类
 * E:Example
 * PK:主键的变量类型
 *
 * @author spring
 *         github: https://github.com/zlc_tb
 *         date: 2018-12-25 13:32:33
 */
@Repository
public interface DmsPermissionMapper extends BaseMapper<DmsPermission, DmsPermissionExample, Long> {
}