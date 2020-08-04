package com.fab.algo.pool;

import org.apache.commons.pool.PoolableObjectFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 11:40 PM 2020/6/15
 * @Modified:
 */
public class PoolableObjectFactoryDemo implements PoolableObjectFactory {

    private static AtomicInteger counter = new AtomicInteger(0);
    @Override
    public Object makeObject() throws Exception {
        Object obj = String.valueOf(counter.getAndIncrement());
        System.out.println("Create Object " + obj);
        return obj;
    }

    @Override
    public void destroyObject(Object o) throws Exception {

        System.out.println("Destroy Object "+o);
    }

    @Override
    public boolean validateObject(Object o) {
        return true;
    }

    @Override
    public void activateObject(Object o) throws Exception {

        System.out.println("Before borrow " + o);
    }

    @Override
    public void passivateObject(Object o) throws Exception {
        System.out.println("return " + o);
    }
}
