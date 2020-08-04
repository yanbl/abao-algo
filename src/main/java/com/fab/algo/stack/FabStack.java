package com.fab.algo.stack;

import java.util.LinkedHashMap;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 8:31 PM 2019/11/6
 * @Modified:
 */
public class  FabStack<T> {

    private int n;

    public int count;

    private T[] items;


    public FabStack(int n){
        this.n = n;
        this.items = (T[])new Object[n];
        this.count = 0;
    }


    public boolean push(T data){
        if(n == count){
            return false;
        }
        items[count++] = data;
        return true;
    }


    public T pop(){
        if(count == 0){
            return null;
        }
        return items[--count];
    }

    LinkedHashMap

}
