package com.example.wangruohan.controller;


import com.example.wangruohan.controller.utils.R;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.domain.News;
import com.example.wangruohan.service.IArtistService;
import com.example.wangruohan.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Newses")
public class NewsController {

    @Autowired
    private INewsService newsService;

    @GetMapping
    public R getAll(){
        return new R(true, newsService.list());
    }

    @PostMapping
    public R save(@RequestBody News news){
        return new R(newsService.save(news));
    }

    @PutMapping
    public R update(@RequestBody News news){
        return new R(newsService.updateById(news));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(newsService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, newsService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new R(true, newsService.getPage(currentPage, pageSize));
    }
}
