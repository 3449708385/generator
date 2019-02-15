package com.mgp.usermanager.service.impl;

import com.mgp.usermanager.pojo.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long userrolerelationid);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long userrolerelationid);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}