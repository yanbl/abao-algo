package com.fab.algo.interview;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 12:03 PM 2020/1/11
 * @Modified:
 */
public class J {


    public static void main(String[] args){

        double d = 0.5;
        float f = 0.5f;
        System.out.println(0.5);

        //char[] chars = {'a','a','b','b','c','c','c'};
        //System.out.println(compress(chars));
    }
    public static List<String> compress(char[] chars) {

        List<String> ll = new ArrayList<String>();

        if(chars == null || chars.length==0){
            return ll;
        }

        int len = 1;
        char temp = chars[0];
        ll.add(chars[0]+"");
        for(int i=1;i<chars.length;i++){
            if(temp == chars[i]){
                len++;
                if(i==chars.length-1){
                    ll.add(len+"");
                }
            }else{
                if(len!=1){
                    ll.add(len+"");
                }
                len=1;
                ll.add(chars[i]+"");
                temp =  chars[i];

            }
        }


        return ll;
    }
}
