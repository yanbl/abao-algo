package com.fab.algo.search;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 1:38 PM 2019/9/2
 * @Modified:
 */
public class BinaryQueryOne {

    private Node tree;


    public Node find(int data) {

        Node p = tree;

        while (p != null) {
            if (data > p.data) {
                p = p.right;
            } else if (data < p.data) {
                p = p.left;
            } else {
                return p;
            }
        }
        return null;
    }


    private static class Node {
        private int data;

        private Node left;

        private Node right;


        public Node(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
