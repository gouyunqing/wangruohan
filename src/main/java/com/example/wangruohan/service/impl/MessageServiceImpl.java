package com.example.wangruohan.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wangruohan.dao.JobDao;
import com.example.wangruohan.dao.MessageDao;
import com.example.wangruohan.domain.Job;
import com.example.wangruohan.domain.Message;
import com.example.wangruohan.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageServiceImpl extends ServiceImpl<MessageDao, Message> implements IMessageService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public IPage<Message> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        messageDao.selectPage(page, null);
        return page;
    }
}
