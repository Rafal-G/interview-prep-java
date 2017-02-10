package com.thatcodecorner.trees;

public class BinaryTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.addNode(50, "Root");
        bt.addNode(23, "ABC");
        bt.addNode(31, "DEF");
        bt.addNode(45, "GHI");
        bt.addNode(31, "JKL");
        bt.addNode(24, "MNO");
        bt.addNode(11, "PQR");
        bt.addNode(34, "STU");
        bt.addNode(53, "VWX");

        System.out.println("In Order Traversal");
        bt.inOrderTraverseTree(bt.getRoot());

        System.out.println("Pre Order Traversal");
        bt.preOrderTraverseTree(bt.getRoot());

        System.out.println("Post Order Traversal");
        bt.postOrderTraverseTree(bt.getRoot());

        System.out.println("Search for 30");
        System.out.println(bt.findNode(30));

        System.out.println("Search for 31");
        System.out.println(bt.findNode(31));
    }

    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if(root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while(true) {
                parent = focusNode;
                if(key < parent.getKey()) {
                    focusNode = focusNode.leftChild;
                    if(focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {

            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {

            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);

            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {

            postOrderTraverseTree(focusNode.leftChild);

            postOrderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;
        while(focusNode.getKey() != key) {
            if(key < focusNode.getKey()) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if(focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }


    public Node getRoot(){
        return root;
    }
}

class Node {

    private int key;
    private String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", name='" + name + "}";
    }
}
