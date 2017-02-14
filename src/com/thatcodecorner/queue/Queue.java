package com.thatcodecorner.queue;

public class Queue {

    private static class Node {
        private Integer data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node tail;
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public Integer peek() {
        if(head != null) {
            return head.data;
        }
        return null;
    }

    public void add(int data) {
        if(tail != null) {
            Node n = new Node(data);
            tail.next = n;
            tail = n;

        }
        if (head == null) {
            head = new Node(data);
        }
        Node currentNode = head;
        Node n = new Node(data);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = n;
        tail = currentNode.next;

    }

    public Integer remove() {
        if(head != null) {
            Integer value = head.data;
            head = head.next;
            if(head == null) {
                tail = null;
            }
            return value;
        }
        return null;
    }

}
