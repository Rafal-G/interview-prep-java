package com.thatcodecorner.collections.lists.scratch;

/**
 * Created by rafal on 2017/02/10.
 */
public class TestClass {

    public static void main(String[] args) {
        ThatLinkedList tll = new ThatLinkedList();
        tll.append("ABC");
        tll.append("DEF");
        tll.append("GHI");
        System.out.println(tll.getSize());
    }
}
