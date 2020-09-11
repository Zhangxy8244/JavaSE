package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

public class CollectionTest {

    @Test
    public void test(){

        ArrayList arrayList = new ArrayList();

        /**
         * 1.add(object e):将元素添加到集合中
         */
        arrayList.add("AA");
        arrayList.add("BB");
        arrayList.add("CC");
        arrayList.add("123");
        arrayList.add(new Date());

        //2. size():获取添加元素的个数
        System.out.println(arrayList.size()); //5

        //3.addAll(Collection c):将集合c的元素添加到当前集合中

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("MM");
        arrayList1.add("NN");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList.size()); //7

        //调用arrayList的toString()方法输出
        System.out.println(arrayList); //[AA, BB, CC, 123, Fri Sep 11 16:40:48 CST 2020, MM, NN]

        //清空集合元素
        arrayList1.clear();
        System.out.println(arrayList1); //[]


    }

    @Test
    public void test2() {

        ArrayList arrayList = new ArrayList();

        arrayList.add("AA");
        arrayList.add("BB");
        arrayList.add("CC");
        arrayList.add("123");
        arrayList.add(new Date());
        //13.集合--->数组:toArray()
        Object[] obj = arrayList.toArray();
        for (Object o :
                obj) {
            System.out.println(o);
        }

        //14.数组--->集合:调用Arrays类的静态方法asList()

        ArrayList arrayList1 = (ArrayList) Arrays.asList(obj);
    }

}
