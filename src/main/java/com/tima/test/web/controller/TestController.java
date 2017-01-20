package com.tima.test.web.controller;

import com.tima.test.dao.entity.User;
import com.tima.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private UserService userService;

    // @GetMapping("index")
    @RequestMapping("/")
    public String testIndex() {
        System.out.println("testIndex.............");
        User user = userService.selectById(1l);

        User user1 = new User(2l,"chenyu2","chenyu3");

        userService.insert(user1);
        System.out.println(user.toString());
        return user1.toString();
    }
}
