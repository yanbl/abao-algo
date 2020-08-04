package com.fab.algo.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 6:45 AM 2020/1/2
 * @Modified:
 */
public class B {



    public static void main(String[] args){
        int[] d = {2,3,7,5};

        System.out.println(Arrays.toString(getSum1(d,9)));
    }
    public static int[] getSum(int[] d,int key){

        int [] t = {-1,-1};
        if(d==null || d.length<2){
            return t;
        }

        for(int i=0;i<d.length;i++){
            for(int j=i+1;j<d.length;j++){
                if(d[i]+d[j]==key){
                    t[0]=i;
                    t[1] = j;
                    return t;
                }
            }
        }

        return t;
    }


    public static int[] getSum1(int[] d,int key){

        int [] t = {-1,-1};
        if(d==null || d.length<2){
            return t;
        }

        Map<Integer,Integer> map = new HashMap<Integer, Integer>(d.length);
        for(int i=0;i<d.length;i++){
           int m = key-d[i];
           if(map.containsKey(m)){
               t[0]=i;
               t[1] = map.get(m);
           }else{
               map.put(d[i],i);
           }
        }

        return t;
    }
}
