package com.imooc.controller;

import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class StuFooController {

    @Autowired
    private StuService stuService;

    @GetMapping("/getStu/{id}")
    public Stu getStu(@PathVariable int id) {
        System.out.println("德玛西亚");
        return stuService.getStuInfo(id);
    }

    @PostMapping("/saveStu")
    public Object saveStu() {
        stuService.saveStu();
        return "saveStu成功";
    }

    @PostMapping("/updateStu")
    public Object updateStu(int id) {
        stuService.updateStu(id);
        return "updateStu成功";
    }

    @GetMapping("/deleteStu")
    public Object deleteStu(int id) {
        stuService.deleteStu(id);
        return "deleteStu成功";
    }

}
