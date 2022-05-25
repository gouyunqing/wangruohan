package com.example.wangruohan.daoTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.wangruohan.dao.UserDao;
import com.example.wangruohan.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetById(Integer id){
        System.out.println(userDao.selectById(1));
    }

    @Test
    void testSave(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("password");
        user.setStatus(true);
        userDao.insert(user);

    }

    @Test
    void testUpdata(){
        User user = new User();
        user.setId(5);
        user.setUsername("test111");
        user.setPassword("password");
        user.setStatus(true);
        userDao.updateById(user);

    }

    @Test
    void testDeleteById(){
        userDao.deleteById(5);

    }

    @Test
    void testGetAll(){
        System.out.println(userDao.selectList(null));

    }

    @Test
    void testGetPage(){
        IPage<User> page = new Page<User>(2, 3);
        userDao.selectPage(page, null);
    }

    @Test
    void testGetBy(){
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.like("username", "gou");
        System.out.println(userDao.selectList(qw));
    }
}
