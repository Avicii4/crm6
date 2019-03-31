package com.harry.crm.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
@Data
public class BaseDict implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dict_id;
    private String dict_type_code;
    private String dict_type_name;
    private String dict_item_name;
    private String dict_item_code;
    private Integer dict_sort;
    private String dict_enable;
    private String dict_memo;
}
