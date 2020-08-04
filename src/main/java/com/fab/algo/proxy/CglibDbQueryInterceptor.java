package com.fab.algo.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 1:52 PM 2020/6/15
 * @Modified:
 */
public class CglibDbQueryInterceptor implements MethodInterceptor {

    private IDBQuery real = null;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(real == null){
            real = new DBQuery();
        }
        return real.request(String.valueOf(objects[0]));
    }
}
