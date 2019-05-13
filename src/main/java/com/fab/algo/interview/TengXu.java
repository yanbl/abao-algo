package com.fab.algo.interview;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: yanbl
 * @Description: 腾讯面试题
 * 输入一个列数字，输出一列数字，其中，输出列的每个数字都是上一列数字在输出列中出现的次数
 * 例如：
 * 输入：0 1 2 3 4 5 6 7 8 9
 * 输出：6 2 1 0 0 0 1 0 0 0
 * 如0在输出列中出现了6次、1在输出列中出现2次，2在输出列中出现1次等，依次类推，求算法
 * @Date: Created in 9:02 PM 2019/5/13
 * @Modified:
 */

public class TengXu {

    private static final Logger logger = LoggerFactory.getLogger(TengXu.class);

    /**
     * 输入数字
     */
    private static int[] toDate = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    /**
     * 输出数字
     */
    private static int[] container = new int[10];
    /**
     * 是否继续
     */
    private static boolean isContinue = true;

    /**
     * 具体实现
     */
    public static void actual() {
        while (isContinue) {
            boolean cotinu = false;
            for (int i = 0; i < toDate.length; i++) {
                int nData = toDate[i];
                int iCalc = getContainerCount(nData);
                if (container[i] != iCalc) {
                    container[i] = iCalc;
                    cotinu = true;
                }
            }
            isContinue = cotinu;
        }
        System.out.println(JSONObject.toJSONString(container));
    }

    /**
     * 计算对应位数字在输出列出现的次数
     * @param t
     * @return
     */
    private static int getContainerCount(int t) {
        int count = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] == t) {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        actual();
    }
}
