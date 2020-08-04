package com.fab.algo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 11:34 AM 2020/6/15
 * @Modified:
 */
public class JdkDbQueryHandler implements InvocationHandler {
    private IDBQuery real = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(real == null){
            real = new DBQuery();
        }
        return real.request(String.valueOf(args[0]));
    }
}
