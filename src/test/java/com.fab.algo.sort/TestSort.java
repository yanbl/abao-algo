package com.fab.algo.sort;

import com.fab.algo.sort.impl.BubblingSort;
import com.fab.algo.sort.impl.InsertSort;
import org.junit.Test;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 2:00 PM 2019/5/12
 * @Modified:
 */
public class TestSort {

    private static int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 18};

    @Test
    public void testBubblingSort(){
        SortBase sb = new BubblingSort();
        sb.sort(a);
    }


    @Test
    public void testInsertSort(){
        SortBase sb = new InsertSort();
        sb.sort(a);
    }
}
