package com.fab.algo.proxy;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 10:02 AM 2020/6/15
 * @Modified:
 */
public class DBQuery implements IDBQuery{

    public  DBQuery(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String request(String ss) {
        return ss + " request string";
    }
}
