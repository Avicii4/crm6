package com.harry.crm.service;

import com.harry.crm.mapper.BaseDictDao;
import com.harry.crm.pojo.BaseDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private BaseDictDao baseDictDao;

    @Override
    public List<BaseDict> selectBaseDictListByCode(String code) {
        return baseDictDao.selectBaseDictListByCode(code);
    }
}
