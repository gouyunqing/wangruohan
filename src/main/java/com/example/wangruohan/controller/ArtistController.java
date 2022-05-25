package com.example.wangruohan.controller;

import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.service.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private IArtistService artistService;

    @GetMapping
    public List<Artist> getAll(){
        return artistService.list();
    }
}
