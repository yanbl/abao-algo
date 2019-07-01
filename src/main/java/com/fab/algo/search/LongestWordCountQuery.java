package com.fab.algo.search;

/**
 * @Author: yanbl
 * @Description: 最长不重字符串查询
 * @Date: Created in 6:33 PM 2019/7/1
 * @Modified:
 */
public class LongestWordCountQuery {

    public static int queryCount(String word) {

        int totalCount = -1;
        int startCount = 0;

        if (word == null || word.length() == 0) {
            return totalCount;
        }
        char[] blankCharArray = new char[word.length()];
        char[] dataCharArray = word.toCharArray();

        for (int i = 0; i < dataCharArray.length; i++) {
            int nowCount = 0;
            for (int j = startCount; j < i + 1; j++) {
                if (blankCharArray[j] == dataCharArray[i]) {
                    blankCharArray[i] = dataCharArray[i];
                    startCount = j + 1;
                    break;

                } else {
                    nowCount++;
                    if (j == i) {
                        blankCharArray[i] = dataCharArray[i];
                    }
                }
            }
            if (totalCount < nowCount) {
                totalCount = nowCount;
            }
        }

        return totalCount;

    }

    public static void main(String[] args) {
        System.out.println(queryCount("ababcdfegbqwertyuiop"));
    }
}
