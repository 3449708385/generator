package com.mgp.usermanager.service.impl;

import com.mgp.usermanager.pojo.RoleMenu;

public interface RoleMenuMapper {
    int deleteByPrimaryKey(Long rolemenurelationid);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey(Long rolemenurelationid);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
}