package com.fab.algo.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 8:32 PM 2020/1/9
 * @Modified:
 */
public class H {

    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] > 0) {
                nums[Math.abs(num) - 1] *= -1;
            } else {
                ans.add(Math.abs(num));
            }
        }
        return ans;
    }

    public static void main(String[] args){


        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));

    }
}
