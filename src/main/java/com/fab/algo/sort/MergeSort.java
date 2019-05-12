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
        if (p >= r) {
            return;
        }

        int q = (p + r) / 2;
        int n = q + 1;

        int[] bb = new int[n];
        int[] cc = new int[r - q];
        System.arraycopy(dataArr, p, bb, 0, n);
        System.arraycopy(dataArr, q + 1, cc, 0, r - q);

        merge(bb, 0, bb.length - 1);
        merge(cc, 0, cc.length - 1);

        sort(dataArr, bb, cc);

    }

    private void sort(int[] dataArr, int[] bb, int[] cc) {

        int i = 0, j = 0, k = 0;
        int[] dataTemp = new int[dataArr.length];

        while (i < bb.length && j < cc.length) {
            if (bb[i] > cc[j]) {
                dataTemp[k++] = cc[j++];
            } else {
                dataTemp[k++] = bb[i++];
            }
        }

        int start = i, end = bb.length;
        boolean isB = true;
        if (j < cc.length) {
            start = j;
            end = cc.length;
            isB = false;
        }

        while (start < end) {
            if (isB) {
                dataTemp[k++] = bb[start++];
            } else {
                dataTemp[k++] = cc[start++];
            }
        }

        for (int i1 = 0; i1 < dataArr.length; i1++) {
            dataArr[i1] = dataTemp[i1];
        }
    }
}
