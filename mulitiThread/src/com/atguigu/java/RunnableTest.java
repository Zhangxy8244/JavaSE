package com.atguigu.java;

import org.junit.Test;

public class RunnableTest implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void test(){

        //1.创建对象
        RunnableTest runnableTest = new RunnableTest();
        //2.将此对象作为参数传递到Thread类的构造器当中，创建Thread类的对象
        Thread thread = new Thread(runnableTest);
        //3.通过Thread类的对象调用start()
        thread.start();
    }



    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        Thread thread3 = new Thread(ticket);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}





