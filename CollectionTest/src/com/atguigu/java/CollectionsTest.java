package com.atguigu.java;

import org.junit.Test;

import java.util.*;


public class CollectionsTest {

    @Test
    public void test() {

        /**
         * 2.常用方法：
         * 2.1排序操作
         * reverse(List)：反转 List 中元素的顺序
         * shuffle(List)：对 List 集合元素进行随机排序
         * sort(List)：根据元素的自然顺序对指定 List 集合元素升序排序
         * sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
         * swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
         */

        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(56);
        arrayList.add(88);

        System.out.println(arrayList);//[123, 56, 88]

        //reverse(List):返回List中的元素的顺序

        Collections.reverse(arrayList);
        System.out.println(arrayList);//[88, 56, 123]

        //shuffle(List):随机排序
        Collections.shuffle(arrayList);
        System.out.println(arrayList); //[88, 123, 56]

        //sort(List):升序排序
        Collections.sort(arrayList);
        System.out.println(arrayList);//[56, 88, 123]

        //swap(List, int i, int j):交换集合中i处和j处的元素
        Collections.swap(arrayList,0, 2);
        System.out.println(arrayList);


    }


    public static void main(String[] args) {

        /**
         * 2.2查找、替换
         * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
         * Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
         * Object min(Collection)
         * Object min(Collection，Comparator)
         * int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
         * void copy(List dest,List src)：将src中的内容复制到dest中
         * boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所旧值
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(56);
        arrayList.add(88);
        arrayList.add(234);

        //返回集合中的最大值
        Object max = Collections.max(arrayList);
        System.out.println(max);//234

        //返回集合中的最小值
        Object min = Collections.min(arrayList);
        System.out.println(min);//56

        //返回指定集合中指定元素出现的次数
        int frequency = Collections.frequency(arrayList, 88);
        System.out.println(frequency);//1

        //void copy(List dest, List src):将src中的内容复制到dest中
        List dest = Arrays.asList(new Object[arrayList.size()]);
        Collections.copy(dest, arrayList);
        System.out.println(dest); //[123, 56, 88, 234]
    }


}
