package com.thatcodecorner.graphsearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();

        private Node(int id) {
            id = id;
        }
    }

    private Node getNode(int id) {
        return null;
    }

    public void addEdge(int source, int destination) {
    }

    public boolean hadPathDFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return hasPathDFS(s, d, visited);

    }

    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {

        if (visited.contains(source.id)) {
            return false;
        }
        visited.add(source.id);

        if (source.id == destination.id) {
            return true;
        }

        for (Node newSource : source.adjacent) {
            if (hasPathDFS(newSource, destination, visited)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasPathBFS(Node source, Node destination, HashSet<Integer> visited) {
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        nextToVisit.add(source);

        while (!nextToVisit.isEmpty()) {
            Node testNode = nextToVisit.remove();
            if (testNode.id == destination.id) {
                return true;
            }
            if (visited.contains(testNode.id)) {
                continue;
            }
            visited.add(testNode.id);
            nextToVisit.addAll(testNode.adjacent);
        }
        return false;
    }
}