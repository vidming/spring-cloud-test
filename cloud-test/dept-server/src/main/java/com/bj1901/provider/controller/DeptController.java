package com.bj1901.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bj1901.api.domain.Dept;
import com.bj1901.provider.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: adming
 * @Date: 2019/6/18 0018 17:05
 */
@Controller
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @GetMapping("/findAll")
    @ResponseBody
    public List<Dept> findAll() {
        return  deptService.list();
    }

    @GetMapping("/findOne/{deptId}")
    @ResponseBody
    public Dept findOne(@PathVariable("deptId") Integer deptId) {
        QueryWrapper<Dept>  queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", deptId);
        return  deptService.getOne(queryWrapper);
    }

}
