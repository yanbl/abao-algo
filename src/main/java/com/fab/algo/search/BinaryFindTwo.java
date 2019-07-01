package com.fab.algo.search;

/**
 * @Author: yanbl
 * @Description: 二分查找
 * @Date: Created in 3:24 PM 2019/5/18
 * @Modified:
 */
public class BinaryFindTwo {

    public static int binaryQuery(int[] dataArr, int toSearchData) {

        int toDataLen = -2;
        if (dataArr == null || dataArr.length <= 0) {
            return toDataLen;
        }

        int begin = 0, end = dataArr.length - 1;
        if (dataArr[begin] == toSearchData) {
            return begin + 1;
        }
        if (dataArr[end] == toSearchData) {
            return end + 1;
        }
        int mid = (end - begin) / 2;

        boolean isQuery = false;
        while (begin < mid) {
            if (dataArr[mid] == toSearchData) {
                isQuery = true;
                boolean sC = false;
                if (dataArr[mid + 1] == toSearchData) {
                    mid++;
                    sC = true;
                }
                if (!sC) {
                    return mid + 1;
                }
            } else {
                if (dataArr[mid] > toSearchData) {
                    end = mid;
                    toDataLen = mid;
                } else {
                    begin = mid;
                }
            }
            if (!isQuery) {
                mid = (end - begin) / 2 + begin;
            }
        }

        return toDataLen + 1;
    }

    public static void main(String[] args) {
        System.out.println(binaryQuery(new int[]{1,6, 8, 9, 10, 11, 12}, 7));
    }
}
