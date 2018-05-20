package com.test.java.tree;

/**
 * Created by Micheal on 2018/5/20.
 */
public class Tree {
    private Node root;

    /**
     * 先序遍历
     *
     * @param node
     */
    public void before(Node node) {
        if (node != null) {
            //先遍历根节点
            System.out.println(node.getValue());
            before(node.getLeftChild());//左子树
            before(node.getRightChild());
        }
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public void middle(Node node) {
        if (node != null) {
            middle(node.getLeftChild());
            System.out.println(node.getValue());
            middle(node.getRightChild());
        }
    }

    /**
     * 后序遍历
     *
     * @param node
     */
    public void after(Node node) {
        if (node != null) {
            after(node.getLeftChild());
            before(node.getRightChild());
            System.out.println(node.getValue());
        }
    }

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
        Tree tr = new Tree();
        tr.insert(10);
        tr.insert(20);
        tr.insert(15);
        tr.insert(3);
//        System.out.println(tr.root.getValue());
//        System.out.println(tr.root.getLeftChild().getValue());
//        System.out.println(tr.root.getRightChild().getLeftChild().getValue());
//        Node node = tr.find(21);
//        System.out.println(node);
//        System.out.println(node.getValue());
//        tr.before(tr.root);
        tr.after(tr.root);
    }
}
