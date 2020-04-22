package org.java.service.impl;

import org.java.common.pojo.EasyUITreeNodeResult;
import org.java.mapper.TbItemCatMapper;
import org.java.pojo.TbItemCat;
import org.java.pojo.TbItemCatExample;
import org.java.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    TbItemCatMapper itemCatMapper;
    @Override
    public List<EasyUITreeNodeResult> getTreeNodeByParetId(Long parent) {
        TbItemCatExample e = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = e.createCriteria();
        criteria.andParentIdEqualTo(parent);
        List<TbItemCat> tbItemCats = itemCatMapper.selectByExample(e);
        List<EasyUITreeNodeResult> list= new ArrayList<EasyUITreeNodeResult>();
        for (TbItemCat itemCat: tbItemCats){
            EasyUITreeNodeResult r = new EasyUITreeNodeResult();
            r.setId(itemCat.getId());
            r.setState(itemCat.getIsParent()?"closed":"open");
            list.add(r);
        }
        return list;
    }
}
