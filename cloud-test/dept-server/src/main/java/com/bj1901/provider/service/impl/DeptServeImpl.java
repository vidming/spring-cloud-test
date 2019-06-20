package com.bj1901.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bj1901.api.domain.Dept;
import com.bj1901.provider.dao.IDeptDao;
import com.bj1901.provider.service.IDeptService;
import org.springframework.stereotype.Service;

/**
 * @Author: adming
 * @Date: 2019/6/18 0018 16:59
 */
@Service("deptService")
public class DeptServeImpl extends ServiceImpl<IDeptDao, Dept> implements IDeptService {
}
