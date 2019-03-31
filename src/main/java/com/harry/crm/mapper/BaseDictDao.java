package com.harry.crm.mapper;

import com.harry.crm.pojo.BaseDict;

import java.util.List;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
public interface BaseDictDao {
    /**
     * 给出查询选项的下拉菜单项
     * 002：客户来源；001：所属行业；006：客户级别
     *
     * @param code 查询选项类型编码
     * @return 选项信息列表
     */
    List<BaseDict> selectBaseDictListByCode(String code);
}
