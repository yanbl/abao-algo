package com.fab.algo.test;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 2:16 PM 2020/6/16
 * @Modified:
 */
public class Main {

    public static void main(String[] args) {

        short a = (-1) & 255;
        System.out.println(a);

        System.out.println(0xff);

        int[] m = {3,2,1,9};
        sort(m);
        System.out.println("aa");

    }


    public static void sort(int[] array) {
        int i = 0;
        int max = array[0];
        int l = array.length;

        for(i = 1;i<l;i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        int[] temp = new int[max +1];
        for(i=0;i<l;i++){
            temp[array[i]] = array[i];
        }

        int j = 0;
        int max1 = max + 1;
        for(i=0;i<max1;i++){
            if(temp[i]>0){
                array[j++] = temp[i];
            }
        }

    }
}
