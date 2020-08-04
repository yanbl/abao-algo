package com.fab.algo;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 7:07 AM 2020/1/2
 * @Modified:
 */
public class Node {

    public int key;
    public int value;
    public Node nextNode;

    public Node() {

    }

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}
