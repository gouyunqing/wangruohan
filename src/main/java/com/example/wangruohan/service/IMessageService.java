package com.example.wangruohan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.domain.Message;


public interface IMessageService extends IService<Message> {
    IPage<Message> getPage(int currentPage, int pageSize);
}
