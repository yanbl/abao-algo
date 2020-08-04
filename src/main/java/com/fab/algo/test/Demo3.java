package com.fab.algo.test;

import java.util.StringTokenizer;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 9:41 AM 2020/6/18
 * @Modified:
 */
public class Demo3 {

    public static void main(String[] args){
        String orgStr = "aas;2121;333;哈哈";
        StringTokenizer st = new StringTokenizer(orgStr,";");
        for(int i=0;i<10000;i++){
            while(st.hasMoreTokens()){
                st.nextToken();
            }
            st = new StringTokenizer(orgStr,";");
        }
    }
}
