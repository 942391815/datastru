package com.test.java.link;

/**
 * Created by Micheal on 2018/5/18.
 */
public class Test2 {
    public static void main(String[] args) {
        Node node = new Node();
        node.setData(1);

        Node node1 = new Node();
        node1.setData(2);
        node.setNextNode(node1);

        Node node2 = new Node();
        node2.setData(3);
        node1.setNextNode(node2);

        Node node3 = reverseNode2(node);
        System.out.println(node3);
    }

    private static Node reverseNode2(Node node) {
        Node pre = null;
        while(node != null){
            Node now = node;
            Node next = node.getNextNode();
            now.setNextNode(null);
            node.setNextNode(pre);
            pre=next;
        }
        return pre;
    }
}
