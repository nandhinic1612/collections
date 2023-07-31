package org.example.LinkedHashMap;

import java.util.LinkedHashMap;

class LHash {
    public static void main(String[] args) {
        LinkedHashMap num = new LinkedHashMap();

        num.put("janu", 2);
        num.put("ram", 4);
        System.out.println("LinkedHashMap: " + num);

        num.putIfAbsent("nisha", 6);   //putIfAbsent()
        System.out.println("Updated LinkedHashMap :" + num);

        LinkedHashMap num1 = new LinkedHashMap();
        num1.put("lavanya", 1);

        num1.putAll(num);   //putAll
        System.out.println("New LinkedHashMap: " + num1);

        System.out.println(num.entrySet());
        System.out.println(num.keySet());
        System.out.println(num.values());

        System.out.println("value of janu :" + num.get("janu"));  //getting value

        System.out.println("returned :"+ num.getOrDefault( "nandhini", null));
        System.out.println(num);

        System.out.println("removed element :"+num.remove("ram"));
    }
}
