package com.fab.algo.proxy;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 12:16 PM 2020/6/22
 * @Modified:
 */
public class B {

    {
        System.out.println("B 1");
    }

    static {
        System.out.println("B 2");
    }

    public B(){
        System.out.println("B 3");

    }

    {
        System.out.println("B 4");
    }

    static {
        System.out.println("B 5");
    }
}
