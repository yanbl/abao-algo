package com.fab.algo.interview;

import java.util.Arrays;

/**
 * @Author: yanbl
 * @Description:去除重复数据
 * @Date: Created in 2:57 PM 2019/12/20
 * @Modified:
 */
public class A {

    public static int sortRemoveSort(int[] d) {
        if (d == null || d.length <= 1) {
            return 0;
        }
        int index = 0;
        int n = d.length;
        for (int i = 1; i < n; i++) {
            if(d[index]!=d[i]){
               d[++index] = d[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args){
        int[] d = new int[]{1,2,2,3,4,5,5,6};
        System.out.println(sortRemoveSort(d));
        System.out.println(Arrays.toString(d));
    }
}
