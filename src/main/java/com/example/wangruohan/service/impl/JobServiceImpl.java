package com.example.wangruohan.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wangruohan.dao.JobDao;
import com.example.wangruohan.domain.Job;
import com.example.wangruohan.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobServiceImpl extends ServiceImpl<JobDao, Job> implements IJobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public IPage<Job> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        jobDao.selectPage(page, null);
        return page;
    }
}
