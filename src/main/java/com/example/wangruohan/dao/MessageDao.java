package com.example.wangruohan.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wangruohan.domain.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageDao extends BaseMapper<Message> {
}
