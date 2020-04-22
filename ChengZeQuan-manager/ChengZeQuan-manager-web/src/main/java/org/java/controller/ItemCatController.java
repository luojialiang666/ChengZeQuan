package org.java.controller;

import org.java.common.pojo.EasyUIDataGrideResult;
import org.java.common.pojo.EasyUITreeNodeResult;
import org.java.pojo.TbItem;
import org.java.service.ItemCatService;
import org.java.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public  List<EasyUITreeNodeResult> getTreeNodeResultByparentId(@RequestParam(name = "id",required = false,defaultValue = "0") Long parentId){
        List<EasyUITreeNodeResult> treeNodeByParetId = itemCatService.getTreeNodeByParetId(parentId);
        return treeNodeByParetId;
    }

}
