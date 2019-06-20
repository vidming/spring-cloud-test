package com.bj1901.consumer.controller;

import com.bj1901.api.domain.Dept;
import com.bj1901.api.feign_interface.RequestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: adming
 * @Date: 2019/6/18 0018 17:31
 */
@Controller
public class DeptController {

    // @Autowired
    // private RestTemplate restTemplate;

    // @Autowired
    // private DiscoveryClient discoveryClient;

    @Autowired
    private RequestInterface requestInterface;

    @GetMapping("/findAll")
    @ResponseBody
    public List<Dept> findAll() {
        return  requestInterface.findAll();
    }

    @GetMapping("/getOne/{deptId}")
    @ResponseBody
    public Dept getOne(@PathVariable Integer deptId) {
        // 根据服务id获取实例
        //List<ServiceInstance> instances = discoveryClient.getInstances("dept-server");

        // 指定的id服务只有一个，直接获取
        //ServiceInstance instance = instances.get(0);
        //Dept dept = restTemplate.getForObject("http://dept-server/dept8081/dept/findOne/" + deptId, Dept.class);
        return requestInterface.findOne(deptId);
    }

}
