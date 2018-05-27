package com.test.java.tree;

/**
 * Created by Micheal on 2018/5/20.
 * 二叉树删除
 */
public class DeleteTree {
    private Node root;

    public Node find(long value) {
        Node current = root;
        while (current.getValue() != value) {
            if (current.getValue() > value) {
                current = current.getLeftChild();//左子树
            } else {
                current = current.getRightChild();//右子树
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }


    /**
     * 二叉树插入
     *
     * @param value
     */
    public void insert(long value) {
        Node node = new Node(value);
        Node current = root;//当前节点
        Node parent;//父节点
        if (root == null) {
            root = node;
        } else {
            while (true) {
                parent = current;
                if (current.getValue() > value) {//left
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(node);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(node);
                        return;
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        DeleteTree tr = new DeleteTree();
        tr.insert(10);
        tr.insert(20);
        tr.insert(15);
        tr.insert(3);
    }
}
