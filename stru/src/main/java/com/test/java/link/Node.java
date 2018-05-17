package com.test.java.link;

/**
 * Created by Micheal on 2018/5/9.
 */
public class Node {
    private Integer data;
    private Node nextNode;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return data + "";
    }
}
