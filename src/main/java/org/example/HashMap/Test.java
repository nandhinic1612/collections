package org.example.HashMap;

import java.util.HashMap;

class Test {
    public static void main(String[] args){

        HashMap map = new HashMap();
        map.put(1, "blue");
        map.put(2, "orange");
        map.put(3, "white");
        System.out.println("Hashmap: " + map);

        map.putIfAbsent(4, "green");

        map.putIfAbsent(2, "red");  //2 already present
        System.out.println("Updated Hashmap: " + map);

        HashMap map1 = new HashMap();
        map1.put(1,"pink");
        map1.put(10,"red");

        map.putAll(map1);  //adding
        System.out.println(map);

        System.out.println("Contains :"+map.containsKey(10));  //using key
        System.out.println("Contains :"+map.containsValue("white"));  //using value

        map.replace(2,"purple");  //replace
        System.out.println("replace :"+map);

//        map.replaceAll((key, value) -> value.toUpperCase());
//        System.out.println(map);
        System.out.println(map.getOrDefault(5, "not found"));  //get or default

        System.out.println(map.entrySet());  //return all

        System.out.println(map.keySet());  //key
        System.out.println(map.values());  //values

        System.out.println(map.remove(10, "red"));
        System.out.println(map);

        System.out.println(map.replace(4,"green","orange"));
        System.out.println(map);




    }
}