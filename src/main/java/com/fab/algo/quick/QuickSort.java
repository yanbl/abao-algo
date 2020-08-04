package com.fab.algo.quick;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 1:59 PM 2019/12/13
 * @Modified:
 */
public class QuickSort {


    public static void quickSort(int[] d){

        sort(d,0,d.length-1);
    }

    private static void sort(int[] d,int L,int M){

        if(L<M){
            int index = getIndex(d,L,M);
            sort(d,L,index-1);
            sort(d,index+1,M);        }

    }


    private static int getIndex(int[] d,int low,int high){

        int temp = d[low];
        while(low<high){

            while(low<high && temp<d[high]){
                high--;
            }
            d[low]=d[high];
            while(low<high && temp>d[low]){
                low++;
            }

            d[high]=d[low];

        }

        d[low] = temp;
        return low;
    }


}


