package com.winter.service.impl;

import com.winter.dao.mvcDao;
import com.winter.service.mvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName mvcServiceImpl
 * @Description TODO
 * @Author Winter
 * @Date 2018/11/18 18:11
 **/
@Service
public class mvcServiceImpl  implements mvcService {

    @Autowired
    private mvcDao mvcDao;

    /**
     * 根据ID进行查询
     * @param tableName
     * @param key
     * @return
     */
    public List<Map> queryMongoByID(String tableName, HashMap<?, ?> key){
        List<Map> tmpList = new ArrayList<>();
        tmpList = mvcDao.queryMongoByID(tableName,key);
        return tmpList;
    }

}
