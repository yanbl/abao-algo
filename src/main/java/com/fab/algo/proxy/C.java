package com.fab.algo.proxy;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 12:18 PM 2020/6/22
 * @Modified:
 */
public class C extends B{

    {
        System.out.println("C 1");
    }

    static {
        System.out.println("C 2");
    }

    public C(){
        System.out.println("C 3");

    }

    {
        System.out.println("C 4");
    }

    static {
        System.out.println("C 5");
    }
}
