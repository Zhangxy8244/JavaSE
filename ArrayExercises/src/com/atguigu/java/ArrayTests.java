package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;

public class ArrayTests {

    @Test
    public void test1() {

        int num;
        num = 10;//初始化
        int id = 1001;//声明 + 初始化
        int[] ids;//声明
        //静态初始化
        ids = new int[]{1001, 1002, 1003};
        //动态初始化
        String[] names = new String[5];
        int[] arr4 = {1, 2, 3, 4, 5}; //类型推断
        for (int i :
                arr4) {
            System.out.println(i);
        }
    }

    @Test
    public void test2() {

        /**
         * 二位数组的声明和初始化
         */

        ///显式声明一个每行维度不同的二维数组
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        //动态初始化1
        String[][] strs = new String[3][2];
        //动态初始化2
        String[][] strs2 = new String[3][];

        //每行元素初始化
        strs2[0] = new String[10];
        strs2[1] = new String[20];
        strs2[2] = new String[30];


    }

    @Test
    public void test3(){

        /**
         * Arrays工具类的使用
         * ①定义在java。util包下
         * ②Arrays：提供了很多操作数组的方法
         */

        int arr1[] = new int[]{21, 43, 51, 65, 4, 456, 78, 69};
        int arr2[] = new int[]{38, 45, 789, 534, 42, 68, 19, 69};

        //1.判断数组是否相等
        System.out.println(Arrays.equals(arr1, arr2));

        //2.输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3.将指定值填充到数组中
        Arrays.fill(arr1, 2);
        System.out.println(Arrays.toString(arr1));

        //4.对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }



}
