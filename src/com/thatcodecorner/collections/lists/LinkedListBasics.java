package com.thatcodecorner.collections.lists;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {

        //This is a doubly linked list - can be traversed both ways
        //Doubly linked list has a link to the previous and the next node
        //Singly linked list only has a link to the next node
        LinkedList<String> ll = new LinkedList<String>();

        //Clear the linked List
        ll.clear();
        //Adding to linked list
        ll.add("ABC");
        ll.add("DEF");
        ll.add("DEF");

        //Adding to linked list at this index
        ll.add(1, "GHI");
        ll.forEach(i -> System.out.println(i));

        //Add to start and end
        ll.addFirst("First");
        ll.addLast("Last");

        //Get Elements
        System.out.println("GETS THROW EXCEPTIONS IF LIST IS EMPTY PEEKFIRST AND PEEKLAST DOES NOT");
        System.out.println("First Element " + ll.getFirst());
        System.out.println("Last Element " + ll.getLast());
        System.out.println("Element at Index 1 " + ll.get(1));


        //Contains
        System.out.println("List contains ABC? " + ll.contains("ABC"));
        System.out.println("Index of an element " + ll.indexOf("Last"));
        System.out.println("Index of non existing element " + ll.indexOf("BATMAN"));
        System.out.println("Last Index of " + ll.lastIndexOf("DEF"));

        //Iterators
        Iterator<String> normalIterator = ll.iterator();
        Iterator<String> descendingIterator = ll.descendingIterator();
        Iterator<String> listIterator = ll.listIterator(2);

        System.out.println("Normal Iterator **********");
        normalIterator.forEachRemaining(System.out::println);
        System.out.println("DESCENDING ITERATOR *********");
        descendingIterator.forEachRemaining(System.out::println);
        System.out.println("LIST ITERATOR STARTING AT INDEX 2 *********");
        listIterator.forEachRemaining(System.out::println);

        System.out.println("Poll, pollFirst and pollLast get element and remove from list");
        String poll = ll.poll();
        System.out.println("Results of poll " + poll);
        System.out.println("Head element has been removed");
        ll.forEach(System.out::println);

        System.out.println("POP takes the first element off the list");
        System.out.println(ll.pop());

        System.out.println("PUSH put element back in front");
        ll.push("Back in Front");

        ll.forEach(System.out::println);

        System.out.println(ll.size());
    }
}
