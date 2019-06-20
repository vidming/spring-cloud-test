package com.bj1901.api.feign_interface;

import com.bj1901.api.domain.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: adming
 * @Date: 2019/6/20 0020 16:03
 */
@FeignClient("dept-server")
@RequestMapping("/dept8081")
public interface RequestInterface {

    @GetMapping("/findAll")
    public List<Dept> findAll();

    @GetMapping("/findOne/{deptId}")
    public Dept findOne(@PathVariable("deptId") Integer deptId);

}
