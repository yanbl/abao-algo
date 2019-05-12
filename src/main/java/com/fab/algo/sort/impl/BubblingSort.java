package com.fab.algo.sort.impl;

import com.alibaba.fastjson.JSONObject;
import com.fab.algo.sort.SortBase;

/**
 * @Author: yanbl
 * @Description: 冒泡排序算法
 * @Date: Created in 1:29 PM 2019/5/12
 * @Modified:
 */
public class BubblingSort extends SortBase.SortBaseImpl {


    public void sort(int[] toSortData, boolean isReverse) {

        if (toSortData == null || toSortData.length <= 1) {
            return;
        }

        System.out.println("before BubblingSort sort data:" + JSONObject.toJSONString(toSortData));

        int n = toSortData.length;
        for (int i = 0; i < n; i++) {
            boolean isContinue = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (isReverse) {
                    if (toSortData[j] < toSortData[j + 1]) {
                        int temp = toSortData[j];
                        toSortData[j] = toSortData[j + 1];
                        toSortData[j + 1] = temp;
                        isContinue = true;
                    }
                } else {
                    if (toSortData[j] > toSortData[j + 1]) {
                        int temp = toSortData[j];
                        toSortData[j] = toSortData[j + 1];
                        toSortData[j + 1] = temp;
                        isContinue = true;
                    }
                }
            }
            if(!isContinue){
                break;
            }
        }

        System.out.println("after BubblingSort sort data:" + JSONObject.toJSONString(toSortData));

    }
}
