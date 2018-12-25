package com.paradm.system.dao;

import org.springframework.stereotype.Repository;

import com.paradm.base.dao.BaseMapper;
import com.paradm.system.entity.SysAuditTrail;
import com.paradm.system.entity.SysAuditTrailExample;

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
public interface SysAuditTrailMapper extends BaseMapper<SysAuditTrail, SysAuditTrailExample, Long> {
}