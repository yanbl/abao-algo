package com.fab.algo.proxy;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 1:57 PM 2020/6/22
 * @Modified:
 */
public class D {

    public static void main(String[] args){
        Object lock = new Object();





        new Thread(() -> {
            System.out.println("wait get lock begin");
            synchronized (lock){
                System.out.println("wait get lock");

                try {
                    lock.wait(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait get lock end");

            }
        }).start();
        LockSupport.parkNanos(100000);

        new Thread(() -> {
            System.out.println("sleep get lock begin");
            synchronized (lock){
                System.out.println("sleep get lock");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("sleep get lock end");

            }
        }).start();
    }
}
