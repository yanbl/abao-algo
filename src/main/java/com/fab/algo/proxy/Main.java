package com.fab.algo.proxy;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 10:06 AM 2020/6/15
 * @Modified:
 */
public class Main {

    public static void main(String[] args){
        IDBQuery pq = new DBQueryProxy();
        System.out.println(pq.request("aa"));


        IDBQuery pq01 = createJdkProxy();
        System.out.println(pq01.request("bb"));


        IDBQuery pq02 = createCglibProxy();
        System.out.println(pq02.request("cc"));


    }


    public static IDBQuery createJdkProxy(){
        IDBQuery jdkProxy = (IDBQuery)Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{IDBQuery.class},
                new JdkDbQueryHandler());

        return jdkProxy;
    }



    public static IDBQuery createCglibProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new CglibDbQueryInterceptor());
        enhancer.setInterfaces(new Class[]{IDBQuery.class});

        IDBQuery cglibProxy = (IDBQuery) enhancer.create();
        return cglibProxy;
    }
}
