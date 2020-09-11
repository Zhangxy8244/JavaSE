package com.atguigu.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
创建线程的方式三：实现Callable接口

如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大?
1. caLL()可以有返回值的。
2. caLL()可以抛出异常，被外面的操作捕获，获取异常的信息
3. callable是支持泛型的

 */

//1.创建一个实现Callable的实现类
class NumThread implements Callable{

    //2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class MultiThreadOfCallable {

    public static void main(String[] args) {

        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4.讲此Callable接口实现类的对象作为传递到FutureTask构造器中，创建Futuretask的对象
        FutureTask futureTask = new FutureTask(numThread);
        //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并start()
        new Thread(futureTask).start();

        try {
            //6.获取Callable中call()的返回值
            //get()方法的返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
