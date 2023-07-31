package org.example.Map;

import java.util.Map;
import java.util.HashMap;

class map {

    public static void main(String[] args) {
        Map test = new HashMap();

        test.put(10,"d");
        test.put(2, "s");
        test.put(3, "r");
        System.out.println("Map: " + test);

//        test.replaceAll((key, value) -> value.toUpperCase());
//        System.out.println("Updated HashMap: " + test);

        System.out.println("Keys: " + test.keySet());  //map key

        System.out.println("Values: " + test.values());  //map value
        System.out.println("getting element :"+test.get(10));

        System.out.println(test.getOrDefault(1,"null"));

        System.out.println("replacing value :"+test.replace(2,"N"));  //replace
        System.out.println(test);

        System.out.println("Entries: " + test.entrySet()); //access entire set
        System.out.println("Removed Value: " + test.remove(2));

        System.out.println(test.values());  //values present


    }
}
