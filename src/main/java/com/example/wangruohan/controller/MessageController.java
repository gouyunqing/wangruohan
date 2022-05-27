package com.example.wangruohan.controller;


import com.example.wangruohan.controller.utils.R;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.domain.Message;
import com.example.wangruohan.service.IArtistService;
import com.example.wangruohan.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private IMessageService messageService;

    @GetMapping
    public R getAll(){
        return new R(true, messageService.list());
    }

    @PostMapping
    public R save(@RequestBody Message message){
        return new R(messageService.save(message));
    }

    @PutMapping
    public R update(@RequestBody Message message){
        return new R(messageService.updateById(message));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(messageService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, messageService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new R(true, messageService.getPage(currentPage, pageSize));
    }
}
