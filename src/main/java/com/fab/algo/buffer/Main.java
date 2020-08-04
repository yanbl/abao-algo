package com.fab.algo.buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 2:38 PM 2020/6/15
 * @Modified:
 */
public class Main {

    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter(new File("file.txt"));
        long begin = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            writer.write(i);
        }
        writer.close();
        System.out.println("testFileWriter spend:"+(System.currentTimeMillis()-begin));



        Writer writer01 = new BufferedWriter(new FileWriter(new File("file.txt")));
        long begin01 = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            writer01.write(i);
        }
        writer01.close();
        System.out.println("testFileWriterBuffer spend:"+(System.currentTimeMillis()-begin01));
    }
}
