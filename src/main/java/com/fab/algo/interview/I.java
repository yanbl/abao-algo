package com.fab.algo.interview;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 1:35 PM 2020/1/10
 * @Modified:
 */
public class I {

    public static void main(String[] args){

        System.out.println(arrangeCoins(8));
    }


        public static int arrangeCoins(int n) {
            int i = 1;
            int v = n;
            while(v>i){
                v = v-i;
                i++;
            }
            return i-1;

    }
}
