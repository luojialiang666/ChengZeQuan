package com.ssm.controller;

import com.ssm.pojo.TbItem;
import com.ssm.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class itemcontroller {
   @Autowired
    itemService itemService;


       @RequestMapping( path="/find",produces = "application/json;charset=UTF-8")
       @ResponseBody
      public String find( ){
           List<TbItem> select = itemService.select();

           System.out.println(select.toString());
          return  select.toString();
       }

    @RequestMapping("index")
    public String index(Map map){
        List<TbItem> tbItem = itemService.select();
        map.put("qqq",tbItem);
        return "jsp";
    }
}
