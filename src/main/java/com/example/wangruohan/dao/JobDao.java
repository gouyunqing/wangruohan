package com.example.wangruohan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wangruohan.domain.Job;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobDao extends BaseMapper<Job> {
}
