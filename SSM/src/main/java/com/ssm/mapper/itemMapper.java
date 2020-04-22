package com.ssm.mapper;

import com.ssm.pojo.TbItem;

import java.util.List;

public interface itemMapper {

    TbItem selectByExample  ();
    List<TbItem> selectAll();
}
