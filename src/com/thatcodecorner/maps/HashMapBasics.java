package com.thatcodecorner.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("Rafal", 33);
        hm.put("Bob", 57);
        hm.put("Mike", 44);
        hm.put("Rover", 82);

        Map<String, Integer> hm2 = new HashMap<String, Integer>();
        hm2.put("Joker", 21);
        hm2.put("The Bat Man", 25);

        System.out.println(hm2.put("Joker", 23));
        System.out.println(hm2.put("Sandman", 23));

        //GET
        Integer rafAge = hm.get("Rafal");
        System.out.println("Rafal Age: " + rafAge);
        Integer fakeAge = hm.get("NoKey");
        System.out.println("Fake Age: " + fakeAge);

        //Check if the values are there
        System.out.println(hm.containsKey("Bob"));
        System.out.println(hm.containsValue(44));
        System.out.println("Fake Key exists? " + hm.containsKey("FakeKey"));

        //LAMBDA for each
        hm.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));

        //LAMBDA adding one to all values
        hm.replaceAll((k,v) -> v + 1);

        //Check if hashmap is empty
        System.out.println(hm.isEmpty());

        //Key sets
        Set keySet = hm.keySet();
        keySet.forEach((k) -> System.out.println("Printing Key " + k));

        hm.putAll(hm2);

        hm.forEach((k, v) -> customPrintMethod(k, v));

        //Size
        System.out.println("Size " + hm.size());
        //Old way of iterating over set
        Set s = hm.entrySet();
        Iterator<Map.Entry<String, Integer>> it = s.iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void customPrintMethod(String key, Integer value) {
        System.out.println("Key " + key + " Value " + value);
    }

}
