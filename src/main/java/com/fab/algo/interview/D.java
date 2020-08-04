package com.fab.algo.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 9:54 AM 2020/1/2
 * @Modified:
 */
public class D {

    public static void main(String[] args){
        String m = "pwwkew";
        System.out.println(getMaxLen(m));
    }

    public static int getMaxLen(String s){

        if(s==null || s.length()==0){
            return 0;
        }

        char[] d = s.toCharArray();
        int k = 0;

        int maxKey = 0;
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<d.length;i++){
            String m = String.valueOf(d[i]);
           if(map.containsKey(m)){
               map.clear();
              k=0;
           }else{
               k++;
               map.put(m,1);
           }

            if(maxKey<k){
                maxKey = k;
            }
        }

        return maxKey;
    }
}
