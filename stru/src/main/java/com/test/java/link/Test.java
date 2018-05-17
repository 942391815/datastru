package com.test.java.link;


/**
 * Created by Micheal on 2018/5/9.
 */
public class Test {
    public static void main(String[] args) {
        Node node = new Node();
        node.setData(1);

        Node node1 = new Node();
        node1.setData(2);
        node.setNextNode(node1);

        Node node2 = new Node();
        node2.setData(3);
        node1.setNextNode(node2);


        System.out.println(reverseNode1(node));
    }

    public static Node reverseNode1(Node node){
        Node pre = null;
        Node now = node;
        while(now!=null){
            Node next = now.getNextNode();
            now.setNextNode(pre);
            pre=now;
            now=next;
        }
        return pre;
    }
}
