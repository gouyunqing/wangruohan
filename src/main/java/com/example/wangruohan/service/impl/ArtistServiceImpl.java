package com.example.wangruohan.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wangruohan.dao.ArtistDao;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.service.ArtistService;
import com.example.wangruohan.service.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl extends ServiceImpl<ArtistDao, Artist> implements IArtistService {


    @Autowired
    private ArtistDao artistDao;

    @Override
    public IPage<Artist> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        artistDao.selectPage(page, null);
        return page;
    }
}
