package com.fab.algo.quick;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 5:27 PM 2019/12/18
 * @Modified:
 */
public class QuickSort2 {

    public static void quickSort(int[] d) {
        if (d == null || d.length <= 1) {
            return;
        }

        sort(d, 0, d.length - 1);
    }

    private static void sort(int[] d, int left, int right) {
        if (left < right) {
            int index = getIndex(d, left, right);
            sort(d, left, index - 1);
            sort(d, index + 1, right);
        }
    }

    private static int getIndex(int[] d, int left, int right) {
        int temp = d[left];
        while (left < right) {
            while (left < right && temp < d[right]) {
                right--;
            }
            d[left] = d[right];

            while (left < right && temp > d[left]) {
                left++;
            }
            d[right] = d[left];
        }

        d[left] = temp;

        return left;
    }
}
