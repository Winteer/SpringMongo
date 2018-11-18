package com.winter.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName mvcDao
 * @Description TODO
 * @Author Winter
 * @Date 2018/11/18 18:10
 **/
public interface mvcDao {

    /**
     * 根据传入的参数进行查询数量
     */
    public int queryMongoCountById(String sql, Class<?> clazz, String tableName, HashMap<?, ?> key);

    /**
     * 根据ID进行查询
     * @param tableName
     * @param key
     * @return
     */
    public List<Map> queryMongoByID(String tableName, HashMap<?, ?> key);


}
