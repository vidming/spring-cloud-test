package com.bj1901.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bj1901.api.domain.Dept;
import com.bj1901.provider.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: adming
 * @Date: 2019/6/18 0018 17:05
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll() {
        return  deptService.list();
    }

    @RequestMapping("/findOne/{deptId}")
    @ResponseBody
    public Object findOne(@PathVariable Integer deptId) {
        QueryWrapper<Dept>  queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", deptId);
        return  deptService.getOne(queryWrapper);
    }

}
