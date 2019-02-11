package com.purpleslatelogdev.elasticsearch.controller;

		
import org.springframework.web.bind.annotation.*;

import com.purpleslatelogdev.elasticsearch.dao.UserDao;
import com.purpleslatelogdev.elasticsearch.bean.User;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping
    public User insertBook(@RequestBody User user) throws Exception{
        return userDao.insertBook(user);
    }

    @GetMapping("/{id}")
    public Map<String, Object> getBookById(@PathVariable String id){
        return userDao.getBookById(id);
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateBookById(@RequestBody User user, @PathVariable String id){
        return userDao.updateBookById(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable String id){
         userDao.deleteBookById(id);
    }
}
