package com.harry.crm.controller;

import com.common.utils.Page;
import com.harry.crm.pojo.BaseDict;
import com.harry.crm.pojo.Customer;
import com.harry.crm.pojo.QueryVo;
import com.harry.crm.service.BaseDictService;
import com.harry.crm.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
@Controller
public class CustomerController {

    @Autowired
    private BaseDictService baseDictService;
    @Autowired
    private CustomerService customerService;

    @Value("${fromType.code}")
    private String fromTypeCode;

    @Value("${industryType.code}")
    private String industryTypeCode;

    @Value("${levelType.code}")
    private String levelTypeCode;

    /**
     * 页面自动跳转至客户查询
     *
     * @return 跳转页面
     */
    @RequestMapping(value = "/customer")
    public String showCustomer() {
        return "redirect:/customer/list.action";
    }

    /**
     * 页面入口
     *
     * @return 查询页面
     */
    @RequestMapping(value = "/customer/list")
    public String list(QueryVo vo, Model model) {
        List<BaseDict> fromType = baseDictService.selectBaseDictListByCode(fromTypeCode);
        List<BaseDict> industryType = baseDictService.selectBaseDictListByCode(industryTypeCode);
        List<BaseDict> levelType = baseDictService.selectBaseDictListByCode(levelTypeCode);

        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);

        Page<Customer> page = customerService.selectPageByQueryVo(vo);
        model.addAttribute("page", page);
        model.addAttribute("custName", vo.getCustName());
        model.addAttribute("custSource", vo.getCustSource());
        model.addAttribute("custIndustry", vo.getCustIndustry());
        model.addAttribute("custLevel", vo.getCustLevel());

        return "customer";
    }

    @RequestMapping(value = "/customer/edit")
    public @ResponseBody
    Customer edit(Integer id) {
        return customerService.selectCustomerById(id);
    }

    @RequestMapping(value = "/customer/update")
    public @ResponseBody
    String update(Customer customer) {
        customerService.updateCustomer(customer);
        return "OK";
    }

    @RequestMapping(value = "/customer/delete")
    public @ResponseBody
    String delete(Integer id) {
        customerService.deleteCustomerById(id);
        return "OK";
    }
}
