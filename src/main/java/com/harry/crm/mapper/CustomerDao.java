package com.harry.crm.mapper;

import com.harry.crm.pojo.Customer;
import com.harry.crm.pojo.QueryVo;

import java.util.List;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
public interface CustomerDao {
    /**
     * 用 POJO 类型查询得到结果的总条数
     *
     * @param vo 存储客户与分页信息
     * @return 结果总条数
     */
    Integer customerCountByQueryVo(QueryVo vo);

    /**
     * 用 POJO 类型得到分页的结果集
     *
     * @param vo 存储客户与分页信息
     * @return 分页的结果集合
     */
    List<Customer> selectCustomerListByQueryVo(QueryVo vo);

    /**
     * 通过 ID 查询客户信息
     *
     * @param id 客户 ID
     * @return 客户对象
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
