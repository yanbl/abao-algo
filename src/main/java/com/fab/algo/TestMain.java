package com.fab.algo;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 8:52 AM 2020/6/23
 * @Modified:
 */
public class TestMain {

    public static Node getPref(Node head){
        Node prev = null;
        Node cur = head;

        while(cur != null){
            Node temp = cur.nextNode;

            cur.nextNode=prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}
