package com.thatcodecorner.collections.lists.scratch;

public class Node {
    //Reference to the next Node
    Node next = null;
    String nodeData;

    public Node(String data) {
        nodeData = data;
    }

    public Node getNextNode() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    public String getNodeData() {
        return nodeData;
    }
}
