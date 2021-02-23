package com.imooc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class HelloController {

    final static Logger log = LoggerFactory.getLogger(HelloController.class);


    @GetMapping("/hello")
    public String hello(){
        log.info("哈哈哈哈哈哈");
        return "德玛西亚3321";
    }

}
