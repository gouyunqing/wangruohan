package com.example.wangruohan.controller;


import com.example.wangruohan.controller.utils.R;
import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.domain.User;
import com.example.wangruohan.service.IArtistService;
import com.example.wangruohan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public R getAll(){
        return new R(true, userService.list());
    }

    @PostMapping
    public R save(@RequestBody User user){
        return new R(userService.save(user));
    }

    @PutMapping
    public R update(@RequestBody User user){
        return new R(userService.updateById(user));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(userService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, userService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new R(true, userService.getPage(currentPage, pageSize));
    }
}
