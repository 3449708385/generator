package com.mgp.usermanager.service.impl;

import com.mgp.usermanager.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Long roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}