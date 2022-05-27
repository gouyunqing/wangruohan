package com.example.wangruohan.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wangruohan.dao.JobDao;
import com.example.wangruohan.dao.NewsDao;
import com.example.wangruohan.domain.Job;
import com.example.wangruohan.domain.News;
import com.example.wangruohan.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewsServiceImpl extends ServiceImpl<NewsDao, News> implements INewsService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public IPage<News> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        newsDao.selectPage(page, null);
        return page;
    }
}
