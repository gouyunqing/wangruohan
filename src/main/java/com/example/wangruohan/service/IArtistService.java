package com.example.wangruohan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wangruohan.domain.Artist;

public interface IArtistService extends IService<Artist> {

    IPage<Artist> getPage(int currentPage, int pageSize);
}
