package com.atguigu.java;

import java.lang.reflect.Executable;
import java.util.concurrent.*;

/**
 * 创建线程的方式四：线程池
 * 好处:
 * 1.提高响应速度（减少了创建新线程的时间）
 * 2.降低资源消耗（重复利用线程池中线程，不需要每次都创建）
 * 3.便于线程管理
 *      corePoolsize:核心池的大小
 *      maximumPooLsize:最大线程数
 *      keepAliveTime:线程没有任务时最多保持多长时间后会终止
 */

class Print1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

}class Print2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" +i);
            }
        }
    }
}
public class MultiThreadOfThreadPool {
    public static void main(String[] args) {
        //1. 提供指定线程数的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
//        System.out.println(service.getClass());
        //由于接口中没有定义变量，所以不能够使用ExecutorService直接设置线程池属性，需要做一个强制类型转换
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池的属性
        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime();


        //2. 执行指定的线程的操作。需要提供实现Runnable或者Callable接口的实现类的对象
        service.execute(new Print1());
        service.execute(new Print2());
//        service.submit(Callable callable); //适用于Callable

        //3. 关闭连接池
        service.shutdown();

    }
}
