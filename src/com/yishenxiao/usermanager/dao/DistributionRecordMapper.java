package com.yishenxiao.usermanager.dao;

import com.yishenxiao.usermanager.beans.DistributionRecord;

public interface DistributionRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DistributionRecord record);

    int insertSelective(DistributionRecord record);

    DistributionRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DistributionRecord record);

    int updateByPrimaryKey(DistributionRecord record);
}