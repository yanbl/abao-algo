package com.fab.algo.sort.impl;


import com.alibaba.fastjson.JSONObject;
import com.fab.algo.sort.SortBase;

/**
 * @Author: yanbl
 * @Description: 插入排序
 * @Date: Created in 2:11 PM 2019/5/12
 * @Modified:
 */
public class InsertSort extends SortBase.SortBaseImpl {

    public void sort(int[] toSortData, boolean isReverse) {

        if (toSortData == null || toSortData.length <= 1) {
            return;
        }
        System.out.println("before InsertSort sort data:" + JSONObject.toJSONString(toSortData));

        int n = toSortData.length;
        for (int i = 1; i < n; i++) {
            int temp = toSortData[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (isReverse) {
                    if (toSortData[j] < temp) {
                        toSortData[j + 1] = toSortData[j];
                    } else {
                        break;
                    }
                } else {
                    if (toSortData[j] > temp) {
                        toSortData[j + 1] = toSortData[j];
                    } else {
                        break;
                    }
                }
            }

            toSortData[j + 1] = temp;
        }

        System.out.println("after InsertSort sort data:" + JSONObject.toJSONString(toSortData));

    }
}
