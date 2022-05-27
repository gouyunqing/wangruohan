package com.example.wangruohan.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wangruohan.domain.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsDao extends BaseMapper<News> {
}
