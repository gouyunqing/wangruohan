package com.example.wangruohan.service;

import com.example.wangruohan.domain.Artist;

import java.util.List;

public interface ArtistService {
    Boolean save(Artist artist);
    Boolean update(Artist artist);
    Boolean delete(Artist artist);
    Artist getById(Integer id);
    List<Artist> getAll();
}
