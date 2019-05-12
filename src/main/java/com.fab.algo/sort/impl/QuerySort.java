package com.fab.algo.sort.impl;

import com.alibaba.fastjson.JSONObject;
import com.fab.algo.sort.SortBase;

/**
 * @Author: yanbl
 * @Description: 查询排序
 * @Date: Created in 2:54 PM 2019/5/12
 * @Modified:
 */
public class QuerySort extends SortBase.SortBaseImpl {

    public void sort(int[] toSortData, boolean isReverse) {
        if (toSortData == null || toSortData.length <= 1) {
            return;
        }
        System.out.println("before sort data:" + JSONObject.toJSONString(toSortData));

        for (int i = 0; i < toSortData.length; i++) {
            int n = i;
            for (int j = i + 1; j < toSortData.length; j++) {
                if (isReverse) {
                    if (toSortData[j] > toSortData[n]) {
                        n = j;
                    }
                } else {
                    if (toSortData[j] < toSortData[n]) {
                        n = j;
                    }
                }
            }

            if (n != i) {
                int temp = toSortData[i];
                toSortData[i] = toSortData[n];
                toSortData[n] = temp;
            }
        }
        System.out.println("after sort data:" + JSONObject.toJSONString(toSortData));

    }
}
