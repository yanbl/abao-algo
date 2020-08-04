package com.fab.algo.interview;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 7:43 PM 2020/1/11
 * @Modified:
 */
public class Ta {

    private static volatile  int d = 1;
    public static void main(String[] args){


        new Thread(new Runnable() {
            private int i= 1;
            public void run() {
                while(i<=2 ){
                    if(d==1) {
                        i++;
                        System.out.println("1");
                        d = 2;
                    }

                }
            }
        }).start();

        new Thread(new Runnable() {
            private int i= 1;
            public void run() {
                while(i<=2 ){
                    if(d==2) {
                        i++;
                        System.out.println("2");
                        d = 3;
                    }

                }
            }
        }).start();

        new Thread(new Runnable() {
            private int i= 1;
            public void run() {
                while(i<=2){
                    if(d==3) {
                        System.out.println("3");
                        i++;
                        d = 1;
                    }
                }
            }
        }).start();
    }
}
