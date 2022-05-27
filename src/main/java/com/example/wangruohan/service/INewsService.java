package com.example.wangruohan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.domain.News;

public interface INewsService extends IService<News> {
    IPage<News> getPage(int currentPage, int pageSize);
}
