package com.fab.algo.interview;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 3:49 PM 2020/1/8
 * @Modified:
 */
public class G {



    public static void main(String[] args){
        char[][] people = {
                {'1','1','1','0'},
                {'1','1','1','0'},
                {'1','1','1','0'},
                {'1','0','1','0'},
                {'1','0','1','0'}};
        System.out.println(maximalSquare(people));
    }

    public static int[][] reconstructQueue(int[][] people) {
        // [7,0], [7,1], [6,1], [5,0], [5,2], [4,4]
        // 再一个一个插入。
        // [7,0]
        // [7,0], [7,1]
        // [7,0], [6,1], [7,1]
        // [5,0], [7,0], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [4,4], [7,1]
        //Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

       return null;
    }

    public static int maximalSquare(char[][] chars){
        int maxLen = 0;
        if(chars==null||chars.length==0){
            return  maxLen;
        }
        int rL = chars.length;
        int cL = chars[0].length;
        int[][] inChar = new int[rL][cL];
        for(int i=0;i<rL;i++){
            for(int j=0;j<cL;j++){
                if(j==0||i==0){
                    inChar[i][j]=chars[i][j]=='0'?0:1;
                }else{
                    inChar[i][j] = chars[i][j]=='0'?0:Math.min(inChar[i][j-1],Math.min(inChar[i-1][j],inChar[i-1][j-1]))+1;
                    maxLen = Math.max(inChar[i][j],maxLen);
                }
            }
        }
        return maxLen*maxLen;
    }



}
