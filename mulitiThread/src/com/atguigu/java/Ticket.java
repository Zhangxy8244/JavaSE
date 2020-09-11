package com.atguigu.java;

//集成Runnable接口形式同步代码块
public class Ticket implements Runnable{

        private int tickets = 1000;

        @Override
        public void run() {

            while (true){

                synchronized (this){
                    if (tickets > 0) {

                        System.out.println(Thread.currentThread().getName() + "号窗口买票，票号为：" + tickets--);

                    }
                    else {
                        break;
                    }
                }

            }
        }

}
