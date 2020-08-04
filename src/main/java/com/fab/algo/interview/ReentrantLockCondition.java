package com.fab.algo.interview;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 6:40 PM 2020/1/11
 * @Modified:
 */
public class ReentrantLockCondition implements Runnable{
    private static ReentrantLock lock=new ReentrantLock();
    private static Condition condition=lock.newCondition();
    public static void main(String[] args) throws InterruptedException {
        ReentrantLockCondition rlc=new ReentrantLockCondition();
        Thread t1=new Thread(rlc);
        t1.start();
        Thread.sleep(3000);//主线程等待一会，否则主线程先获得锁就会导致signal()先执行，那t1就不会被唤醒了
        lock.lock();
        condition.signal();//先获得锁
        lock.unlock();
    }
    public void run() {
        try{
            lock.lock();
            condition.await();//先加锁，还要捕获异常
            System.out.println("Thread is going on");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
}
