package com.tima.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChenYu on 2017/1/23.
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "ok......";
    }
}
