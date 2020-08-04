package com.fab.algo.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: yanbl
 * @Description: 归并排序
 * @Date: Created in 4:29 PM 2019/5/12
 * @Modified:
 */
public class MergeSort {

    public void mergeSort(int[] toSortData) {

        if (toSortData == null || toSortData.length <= 1) {
            return;
        }
        Long b = System.currentTimeMillis();
        System.out.println("before MergeSort sort data:" + JSONObject.toJSONString(toSortData));
        merge(toSortData, 0, toSortData.length - 1);
        System.out.println("after MergeSort sort data:" + JSONObject.toJSONString(toSortData) + ",use " + (System.currentTimeMillis() - b) + "ms");

    }

    private void merge(int[] dataArr, int p, int r) {
        if (p == r) {
            return;
        }

        int q = p+((r-p) >> 1);

        merge(dataArr, p, q);
        merge(dataArr, q+1, r);

        sort(dataArr, p,q, r);

    }

    private void sort(int[] dataArr, int l, int m,int r) {

        int i = 0, j = l, k = m+1;
        int[] dataTemp = new int[r-l+1];

        while (j <=m && k <= r) {
            dataTemp[i++] = dataArr[j]<dataArr[k]?dataArr[j++]:dataArr[k++];
        }

        while(j<=m){
            dataTemp[i++] = dataArr[j++];
        }

        while(k<=r){
            dataTemp[i++] = dataArr[k++];
        }


        for (int i1 = 0; i1 < dataTemp.length; i1++) {
            dataArr[l+i1] = dataTemp[i1];
        }
    }
}
