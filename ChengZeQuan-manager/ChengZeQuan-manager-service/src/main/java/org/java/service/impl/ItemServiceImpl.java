package org.java.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java.common.pojo.EasyUIDataGrideResult;
import org.java.mapper.TbItemMapper;
import org.java.pojo.TbItem;
import org.java.pojo.TbItemExample;
import org.java.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    TbItemMapper itemMapper;

    @Override
    public TbItem getById(Long id) {
        return itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public EasyUIDataGrideResult getItemList(Integer pageNow, Integer pageSize) {
        //开始分页
        PageHelper.startPage(pageNow, pageSize);
        //执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        //返回的结果
        EasyUIDataGrideResult result = new EasyUIDataGrideResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }
}
