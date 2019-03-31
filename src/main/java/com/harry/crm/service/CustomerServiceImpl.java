package com.harry.crm.service;

import com.common.utils.Page;
import com.harry.crm.mapper.CustomerDao;
import com.harry.crm.pojo.Customer;
import com.harry.crm.pojo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 客户管理
 *
 * @author Harry Chou
 * @date 2019/3/29
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    /**
     * 通过四个条件查询分页对象
     *
     * @param vo 存储客户与分页信息
     * @return
     */
    @Override
    public Page<Customer> selectPageByQueryVo(QueryVo vo) {
        Page<Customer> page = new Page<>();

        // 每页数目
        page.setSize(5);
        vo.setSize(5);

        if (vo != null) {
            // 判断当前页
            if (vo.getPage() != null) {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() - 1) * vo.getSize());
            }

            // 判断客户名称
            if (vo.getCustName() != null && !vo.getCustName().trim().equals("")) {
                vo.setCustName(vo.getCustName().trim());
            }

            // 判断客户来源
            if (vo.getCustSource() != null && !vo.getCustSource().trim().equals("")) {
                vo.setCustSource(vo.getCustSource().trim());
            }

            // 判断客户所属行业
            if (vo.getCustIndustry() != null && !vo.getCustIndustry().trim().equals("")) {
                vo.setCustIndustry(vo.getCustIndustry().trim());
            }

            // 判断客户级别
            if (vo.getCustLevel() != null && !vo.getCustLevel().trim().equals("")) {
                vo.setCustLevel(vo.getCustLevel().trim());
            }

            // 总条数
            page.setTotal(customerDao.customerCountByQueryVo(vo));
            // 分页结果集
            page.setRows(customerDao.selectCustomerListByQueryVo(vo));
        }

        return page;
    }

    @Override
    public Customer selectCustomerById(Integer id) {
        return customerDao.selectCustomerById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomerById(Integer id) {
        customerDao.deleteCustomerById(id);
    }
}
