package com.fab.algo.proxy;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 10:05 AM 2020/6/15
 * @Modified:
 */
public class DBQueryProxy implements IDBQuery {
    private DBQuery real = null;

    @Override
    public String request(String ss) {
        if(real == null){
            real = new DBQuery();
        }
        return real.request(ss);
    }
}
