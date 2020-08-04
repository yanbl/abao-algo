package com.fab.algo.stack;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 8:55 PM 2019/11/6
 * @Modified:
 */
public class StackDemo {

    public static Map<String,String> map = new HashMap<String,String>();

    static {
        map.put("{","}");
        map.put("}","{");
        map.put("[","]");
        map.put("]","[");
        map.put("(",")");
        map.put(")","(");
    }


    public static boolean check(String toCheck){

        if(toCheck.length()%2!=0){
            return false;
        }
        FabStack<String> stack = new FabStack<String>(toCheck.length());

        char[] sa = toCheck.toCharArray();
        for(int i=0;i<sa.length/2;i++){
            stack.push(sa[i]+"");
        }

        for (int i=sa.length/2;i<sa.length;i++){
            String s = sa[i]+"";
            if(!s.equals(map.get(stack.pop()))){
                return false;
            }
        }

        if (stack.count==0){
            return true;
        }

        return false;


    }
}
