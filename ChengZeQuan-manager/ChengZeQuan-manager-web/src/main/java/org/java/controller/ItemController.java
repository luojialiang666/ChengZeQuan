package org.java.controller;

import org.java.common.pojo.EasyUIDataGrideResult;
import org.java.pojo.TbItem;
import org.java.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/getById/{id}")
    @ResponseBody
    public TbItem getById(@PathVariable("id") Long id){
        return itemService.getById(id);
    }
    @RequestMapping(value="/item/list",method=RequestMethod.GET)
    @ResponseBody
    public EasyUIDataGrideResult itemList(@RequestParam("page") int page,
                                          @RequestParam("rows") int rows){
        return itemService.getItemList(page, rows);
    }

    @RequestMapping("/{pages}")
    public String index(@PathVariable("pages")String pages){
        return pages;
    }
}
