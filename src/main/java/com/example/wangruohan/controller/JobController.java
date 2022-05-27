package com.example.wangruohan.controller;


import com.example.wangruohan.controller.utils.R;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.domain.Job;
import com.example.wangruohan.service.IArtistService;
import com.example.wangruohan.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private IJobService jobService;

    @GetMapping
    public R getAll(){
        return new R(true, jobService.list());
    }

    @PostMapping
    public R save(@RequestBody Job job){
        return new R(jobService.save(job));
    }

    @PutMapping
    public R update(@RequestBody Job job){
        return new R(jobService.updateById(job));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(jobService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, jobService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new R(true, jobService.getPage(currentPage, pageSize));
    }
}
