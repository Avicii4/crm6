package com.harry.crm.service;

import com.common.utils.Page;
import com.harry.crm.pojo.Customer;
import com.harry.crm.pojo.QueryVo;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
public interface CustomerService {
    /**
     * 通过四个条件查询分页对象
     *
     * @param vo 存储客户与分页信息
     * @return
     */
    Page<Customer> selectPageByQueryVo(QueryVo vo);

    /**
     * 根据 ID 查询客户
     *
     * @param id 客户 ID
     * @return 符合条件的客户对象
     */
    Customer selectCustomerById(Integer id);

    /**
     * 修改更新客户信息
     *
     * @param customer 需要修改的客户对象
     */
    void updateCustomer(Customer customer);

    /**
     * 根据客户 ID 删除其全部信息
     *
     * @param id 客户 ID 信息
     */
    void deleteCustomerById(Integer id);
}
