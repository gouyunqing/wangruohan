package com.example.wangruohan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wangruohan.domain.Artist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArtistDao extends BaseMapper<Artist> {
}
