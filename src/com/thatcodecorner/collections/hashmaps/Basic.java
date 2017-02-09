package com.thatcodecorner.collections.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Basic {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("Rafal", 33);
        hm.put("Bob", 57);
        hm.put("Mike", 44);
        hm.put("Rover", 82);

        Set s = hm.entrySet();
        Iterator<Map.Entry<String, Integer>> it = s.iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
