package com.bj1901.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: adming
 * @Date: 2019/6/18 0018 16:43
 */
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) //支持链式写法
@Data
public class Dept implements Serializable {
    private Integer id;
    private String dname;
    private String loc;
    //private String db_source;
}
