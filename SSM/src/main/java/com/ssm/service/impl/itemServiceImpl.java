package com.ssm.service.impl;


import com.ssm.pojo.TbItem;
import com.ssm.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class itemServiceImpl implements itemService {
    @Autowired
    com.ssm.mapper.itemMapper itemMapper;
    @Override
    public TbItem selectAll() {
        TbItem tbItem = itemMapper.selectByExample();
        return tbItem;
    }

    @Override
    public List<TbItem> select() {
        return itemMapper.selectAll();
    }
}
