package com.winter.dao.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.winter.dao.mvcDao;
import com.winter.util.PrintMessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @ClassName mvcDaoImpl
 * @Description TODO
 * @Author Winter
 * @Date 2018/11/18 18:11
 **/
@Repository
public class mvcDaoImpl implements mvcDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    /**
     * 根据传入的参数进行查询数量
     */
    public int queryMongoCountById(String sql, Class<?> clazz, String tableName, HashMap<?, ?> key) {
        int retCount = 0;
        if (tableName == null || "".equals(tableName)) {
            PrintMessageUtil.printWarning(" initDatabase lack of parameter : tableName is empty!");
        }else{
            if (key == null || key.size() == 0) {
                PrintMessageUtil.printWarning(" initDatabase lack of parameter : key is empty!");
            } else {
                DBObject query = new BasicDBObject();
                Iterator<?> iter = key.entrySet().iterator();
                while (iter.hasNext()) {
                    @SuppressWarnings("unchecked")
                    Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
                    query.put(entry.getKey(), entry.getValue());
                    // PrintMessageUtil.printDebug(entry.getKey() + ":" +
                    // entry.getValue());
                    // PrintMessageUtil.printDebug("" + query);
                }
                DBCollection coll = mongoTemplate.getCollection(tableName);
                long ret = coll.count(query);
                retCount = new Long(ret).intValue();
                // PrintMessageUtil.printDebug("" + retCount);
            }
        }
        return retCount;
    }

    /**
     * 根据ID进行查询
     * @param tableName
     * @param key
     * @return
     */
    public List<Map> queryMongoByID(String tableName, HashMap<?, ?> key ){
        List<Map> retList = new ArrayList<Map>();
        if (tableName == null || "".equals(tableName)) {
            PrintMessageUtil.printWarning(" initDatabase lack of parameter : tableName is empty!");
        }else{
            if (key == null || key.size() == 0) {
                PrintMessageUtil.printWarning(" initDatabase lack of parameter : key is empty!");
            } else {
                DBObject query = new BasicDBObject();
                Iterator<?> iter = key.entrySet().iterator();
                while (iter.hasNext()) {
                    @SuppressWarnings("unchecked")
                    Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
                    query.put(entry.getKey(), entry.getValue());
                }
                DBCursor coll = mongoTemplate.getCollection(tableName).find(query);
                List<DBObject> list = coll.toArray();
                for (DBObject obj : list){
                    Map<String, Object> map = obj.toMap();
                    retList.add(map);
                }
            }
        }
        return retList;
    }

}
