package org.example.Vector;

import java.util.Iterator;
import java.util.Vector;

class VectorEx {
    public static void main(String[] args) {
        Vector<String> Test= new Vector<>();
        Test.add("saran");
        Test.add("ram");
        Test.add("vishnu");

        String element = Test.get(2);
        System.out.println("Element at index 2: " + element);
        System.out.println(Test.remove("ram"));

        Iterator<String> itr = Test.iterator();
        System.out.print("using iterator: ");
        while(itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(", ");
        }

    }
}
