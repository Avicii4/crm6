package com.harry.crm.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
@Getter
@Setter
public class Customer {
    private Long cust_id;
    private String cust_name;
    private Long cust_user_id;
    private Long cust_create_id;
    private String cust_source;
    private String cust_industry;
    private String cust_level;
    private String cust_linkman;
    private String cust_phone;
    private String cust_mobile;
    private String cust_zipcode;
    private String cust_address;
    private Date cust_createtime;
}
