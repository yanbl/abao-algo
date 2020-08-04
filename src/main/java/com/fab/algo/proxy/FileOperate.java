package com.fab.algo.proxy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileOperate {
    public static String readFile(String file){
        String result = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null) {//使用readLine方法，一次读一行
                result = result + "\n" + s;
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        return result;

    }
}
