package com.fab.algo.sort;

import com.alibaba.fastjson.JSONObject;
import com.fab.algo.quick.QuickSort2;
import org.junit.Test;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 2:00 PM 2019/5/12
 * @Modified:
 */
public class TestSort {


    @Test
    public void testBubblingSort() {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 18};

        BubblingSort sb = new BubblingSort();
        sb.sort(a);

    }


    @Test
    public void testInsertSort() {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 18};

        InsertSort sb = new InsertSort();
        sb.sort(a);
    }


    @Test
    public void testQuerySort() {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 18};

        QuerySort sb = new QuerySort();
        sb.sort(a);
    }

    @Test
    public void testMergeSort() {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 18};

        MergeSort1.mergeSort(a);
        System.out.println(JSONObject.toJSONString(a));
    }

    @Test
    public void testQuickSort() {
        int[] a = {10, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 9};

        QuickSort2.quickSort(a);
        System.out.println(JSONObject.toJSONString(a));
    }
}
