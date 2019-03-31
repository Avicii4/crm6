package com.harry.crm.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
@Getter
@Setter
public class QueryVo {

    /**
     * 客户信息
     */
    private String custName;
    private String custSource;
    private String custIndustry;
    private String custLevel;

    /**
     * 当前页
     */
    private Integer page;
    private Integer size = 10;
    private Integer startRow = 0;
}
