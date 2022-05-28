package com.example.wangruohan.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wangruohan.dao.JobDao;
import com.example.wangruohan.dao.UserDao;
import com.example.wangruohan.domain.Job;
import com.example.wangruohan.domain.User;
import com.example.wangruohan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public IPage<User> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        userDao.selectPage(page, null);
        return page;
    }

    @Override
    public Boolean login(String username, String password) {
        return userDao.selectByUsernameAndPassword(username, password) != null;
    }
}
