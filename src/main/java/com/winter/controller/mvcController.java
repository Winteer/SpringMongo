package com.winter.controller;

import com.winter.service.mvcService;
import com.winter.util.PrintMessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName mvcController
 * @Description TODO
 * @Author Winter
 * @Date 2018/11/18 14:22
 **/


@Controller
@RequestMapping("/mvc")
public class mvcController {

    @Autowired
    private mvcService mvcServiceImpl;

    @RequestMapping(value = "sendKey",method = RequestMethod.GET)
    @ResponseBody
    public String hello(String key){
        return "hello:-->"+key;
    }


    @RequestMapping(value = "getMongoInfoByID",method = RequestMethod.GET)
    @ResponseBody
    public List<Map> getValue(String id) throws Exception {
        PrintMessageUtil.printInfo("获得id:---->"+id);
        List<Map> tmpList = new ArrayList();
        HashMap map = new HashMap();
        map.put("YBZJ","101000011273");
        tmpList = mvcServiceImpl.queryMongoByID("CZRK",map);
        return tmpList;
    }
}
