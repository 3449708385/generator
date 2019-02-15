package com.mgp.usermanager.service.impl;

import com.mgp.usermanager.pojo.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Long menuid);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Long menuid);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}