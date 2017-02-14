package com.thatcodecorner.stack;

public class Stack {
    private static class Node {

        private Node next;
        private Integer data;
        public Node(Integer data) {
            this.data = data;
        }
    }
    private Node top;

    private boolean isEmpty() {
        return top == null;
    }
    private Integer peek() {
        if(top != null) {
            return top.data;
        }
        return null;
    }
    private void push(Integer value) {
        Node node = new Node(value);
        node.next = top;
        top = node;

    }
    private Integer pop() {
        if(top != null) {
            Integer value = top.data;
            top = top.next;
            return value;
        }
        return null;
    }
}
