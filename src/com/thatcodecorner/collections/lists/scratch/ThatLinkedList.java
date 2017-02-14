package com.thatcodecorner.collections.lists.scratch;

public class ThatLinkedList {

    private Node head;
    private int size;

    public ThatLinkedList() {
        head = null;
    }


    public void append(String data) {
        if(head == null) {
            head = new Node(data);
        }

        Node nodeToAppend = new Node(data);
        if(head != null) {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNext(nodeToAppend);
        }
        size++;
    }


    public int getSize() {
        return size;
    }
}
