package com.fab.algo.interview;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 5:59 PM 2020/1/12
 * @Modified:
 */
public class Cc {

    public static int[] querySort(int[] toData){
        if(toData == null || toData.length<=1){
            return toData;
        }
        for(int i=0;i<toData.length;i++){
            int m = i;
            for(int j=i+1;j<toData.length;j++){
                if(toData[j]<toData[m]){
                    m = j;
                }
            }
            if(m!=i) {
                int temp = toData[i];
                toData[i] = toData[m];
                toData[m] = temp;
            }
        }
        return  toData;
    }
}
