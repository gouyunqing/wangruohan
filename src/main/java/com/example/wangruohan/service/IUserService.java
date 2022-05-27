package com.example.wangruohan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.domain.User;

public interface IUserService extends IService<User> {
    IPage<User> getPage(int currentPage, int pageSize);
}
