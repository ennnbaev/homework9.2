package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivan", 20);
        map.put("Dima", 25);
        map.put("Ann", 30);
        map.put("Danny", 69);
        map.put("Liza", 66);
        map.put("Kirill", 13);
        map.put("Angelina", 77);
        map.put("Yura", 2);
        map.put("Daniela", 3);
        map.put("Arina", 9);
        Set<String> set=map.keySet();
        Map<Integer,String > result = new HashMap<>();
        for(String s:set ){
            result.put(map.get(s),s );
        }

        System.out.println(map);
        System.out.println(result);
    }
}
