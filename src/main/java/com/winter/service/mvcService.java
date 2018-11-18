package com.winter.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName mvcService
 * @Description TODO
 * @Author Winter
 * @Date 2018/11/18 18:10
 **/

public interface mvcService {



    /**
     * 根据ID进行查询
     * @param tableName
     * @param key
     * @return
     */
    public List<Map> queryMongoByID(String tableName, HashMap<?, ?> key);

}
