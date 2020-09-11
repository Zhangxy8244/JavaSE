package com.atguigu.java;

import org.junit.Test;

import java.util.*;

public class MapTest {

    @Test
    public void test() {
        /**
         * 3.3 元视图操作的方法：
         * Set keySet()：返回所有key构成的Set集合
         * Collection values()：返回所有value构成的Collection集合
         * Set entrySet()：返回所有key-value对构成的Set集合
         */

        Map map = new HashMap();
        map.put("AA", 10);
        map.put("BB", 20);
        map.put("CC", 30);
        map.put("DD", 40);

        //返回所有key构成的Set集合
        Set c1 = map.keySet();
        for (Object o :
                c1) {
            System.out.println(o);

        }

        //返回所有value构成的Collection集合
        Collection c = map.values();
        for (Object o :
                c) {
            System.out.println(o);
        }

        //返回所有key-value对构成的Set集合
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "-->" + entry.getValue());

            /**
             * 总结：常用方法：
             * 添加：put(Object key,Object value)
             * 删除：remove(Object key)
             * 修改：put(Object key,Object value)
             * 查询：get(Object key)
             * 长度：size()
             * 遍历：keySet() / values() / entrySet()
             */

        }




    }
}
