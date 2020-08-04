package com.fab.algo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 9:04 AM 2020/6/4
 * @Modified:
 */
public class Main {

    public static void main(String[] args){
        BigDecimal bd1 = new BigDecimal(Double.toString(0.1));
        System.out.println(bd1.toString());

        BigDecimal bd2 = new BigDecimal("0.1");
        System.out.println(bd2.toString());
    }
}
