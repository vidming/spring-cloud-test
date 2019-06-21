package com.bj1901.api.feign_interface.impl;

import com.bj1901.api.domain.Dept;
import com.bj1901.api.feign_interface.RequestInterface;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: adming
 * @Date: 2019/6/21 0021 10:58
 */
@Component
@RequestMapping("/fallback/dept8081")
public class RequestFallBackImpl implements RequestInterface {
    @Override
    public List<Dept> findAll() {
        List<Dept> depts = new LinkedList<>();
        depts.add(new Dept().setId(500).setDname("公司还未开设部门！").setLoc("no loc"));
        return depts;
    }

    @Override
    public Dept findOne(Integer deptId) {
        return new Dept().setId(500).setDname("暂无此部门！").setLoc("no loc");
    }
}
