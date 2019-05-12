package com.fab.algo.sort;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 1:26 PM 2019/5/12
 * @Modified:
 */
public interface SortBase {

    /**
     * 排序算法正序实现
     *
     * @param toSortData 要排序的数据
     */
    void sort(int[] toSortData);

    /**
     * 排序算法实现
     * @param toSortData 要排序的数据
     * @param isReverse 是否逆序
     */
    void sort(int[] toSortData, boolean isReverse);
}
