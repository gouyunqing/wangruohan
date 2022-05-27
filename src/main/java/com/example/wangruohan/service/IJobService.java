package com.example.wangruohan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.domain.Job;

public interface IJobService extends IService<Job> {
    IPage<Job> getPage(int currentPage, int pageSize);
}
