package com.fab.algo.sort;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 3:10 PM 2019/12/15
 * @Modified:
 */
public class MergeSort1 {


    public static void mergeSort(int[] d){
        if(d == null || d.length<=1){
            return;
        }
        merge(d,0,d.length-1);
    }
    private static void merge(int[] d,int begin,int end){
        if(begin>=end){
            return;
        }

        int mid = begin + ((end-begin)>>1);
        merge(d,begin,mid);
        merge(d,mid +1,end);
        sort(d,begin,mid,end);

    }
    private static void sort(int[] d,int begin,int mid,int end){
        int[] temp = new int[end-begin +1];
        int i =0;
        int ls = begin;
        int ss = mid +1;

        while(ls<=mid&&ss<=end){
            temp[i++] = d[ls]<d[ss]?d[ls++]:d[ss++];
        }

        while (ls<=mid){
            temp[i++] =d[ls++];
        }

        while(ss<=end){
            temp[i++] = d[ss++];
        }

        System.arraycopy(temp,0,d,begin,end-begin +1);
    }
}
