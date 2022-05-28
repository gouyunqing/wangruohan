package com.example.wangruohan.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.wangruohan.controller.utils.R;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.service.IArtistService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private IArtistService artistService;

    @GetMapping
    public R getAll(){
        return new R(true, artistService.list());
    }

    @PostMapping
    public R save(@RequestBody Artist artist){
        return new R(artistService.save(artist));
    }

    @PutMapping
    public R update(@RequestBody Artist artist){
        return new R(artistService.updateById(artist));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(artistService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, artistService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    @ResponseBody
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new R(true, artistService.getPage(currentPage, pageSize));
    }
}
