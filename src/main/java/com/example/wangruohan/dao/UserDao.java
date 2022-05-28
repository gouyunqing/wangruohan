package com.example.wangruohan.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wangruohan.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao extends BaseMapper<User> {

    @Select("select * from user where username=#{username} and password=#{password}")
    User selectByUsernameAndPassword(String username, String password);

}
