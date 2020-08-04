package com.fab.algo.interview;

import com.fab.algo.PlaceTheOrderThirdPlatformReqDto;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 10:09 PM 2020/2/7
 * @Modified:
 */
public class TestC {


    public static void main(String[] args) throws Exception{
        BigDecimal o = new BigDecimal(10);
        Integer ii = new Integer(1);
        System.out.println(ii.equals(1));

        int[] a = new int[]{};

        TestC tc = new TestC();
        BigDecimal dd = new BigDecimal(200);
        tc.testAA(dd);
        System.out.println("aa");

    }


    public void testAA(BigDecimal be){
        be = be.subtract(new BigDecimal(1));
    }
    public void testBB(){

    }

}
