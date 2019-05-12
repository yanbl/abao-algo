package com.fab.algo.sort;

import com.fab.algo.sort.impl.BubblingSort;
import com.fab.algo.sort.impl.InsertSort;
import com.fab.algo.sort.impl.QuerySort;
import org.junit.Test;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 2:00 PM 2019/5/12
 * @Modified:
 */
public class TestSort {


    @Test
    public void testBubblingSort(){
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 18};

        SortBase sb = new BubblingSort();
        sb.sort(a);

    }


    @Test
    public void testInsertSort(){
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 18};

        SortBase sb = new InsertSort();
        sb.sort(a);
    }


    @Test
    public void testQuerySort(){
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 18};

        SortBase sb = new QuerySort();
        sb.sort(a);
    }
}
