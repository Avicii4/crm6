package com.harry.crm.service;

import com.harry.crm.pojo.BaseDict;

import java.util.List;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
public interface BaseDictService {
    /**
     * 查询所有客户信息
     *
     * @param code
     * @return
     */
    List<BaseDict> selectBaseDictListByCode(String code);
}
