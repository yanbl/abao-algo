package com.fab.algo.test;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 2:26 PM 2020/6/17
 * @Modified:
 */
public class Demo2 {

    public static void main(String[] args){

        Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock) {
                    lock.notifyAll();
                }
            }
        }).start();
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("aa");



    }
}
