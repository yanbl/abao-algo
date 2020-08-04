package com.fab.algo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 5:45 PM 2020/6/16
 * @Modified:
 */
public class Demo1 {

    public static void main(String[] args){

        List<String> handler = new ArrayList<>();
        for(int i=0;i<1000;i++){
            //HugeStr h = new HugeStr();
            ImprovedHugeStr h = new ImprovedHugeStr();
            handler.add(h.getSubString(1,5));
        }


    }

    static class HugeStr{
        private String str = new String(new char[1000000000]);
        public String getSubString(int begin,int end){
            return str.substring(begin,end);
        }
    }


    static class ImprovedHugeStr{
        private String str = new String(new char[1000000000]);
        public String getSubString(int begin,int end){
            return new String(str.substring(begin,end));
        }
    }
}
