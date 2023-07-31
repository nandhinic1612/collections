package org.example.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LList1 {
    public static void main(String[] args) {
        LinkedList Test = new LinkedList();

        Test.add("orange");
        Test.add(27);
        Test.add('D');
        Test.add("Apple");
        Test.add("PineApple");

        System.out.println("LinkedList: " + Test);

        System.out.println("Size of LinkedList: " + Test.size());

        System.out.println("Element at index 2: " + Test.get(2));

        System.out.println("Updated LinkedList: " +  Test.set(3, "Banana"));
        System.out.println(Test);

        // using contains()
        String ToFind = "PineApple";
        if (Test.contains(ToFind)) {
            System.out.println(ToFind + ": exists");
        } else {
            System.out.println(" does not exist");
        }

        System.out.println("after removing 'orange': " + Test.remove("orange"));

        Test.addFirst("45");
        Test.addLast("77");
        System.out.println("after adding elements at the front & end: " + Test);

        Test.removeFirst();
        Test.removeLast();
        System.out.println("after removing first & last elements: " + Test);

        Collections.reverse(Test);
        System.out.println("Reversed LinkedList: " + Test);

        LinkedList<String> TestCopy = new LinkedList<>(Test);

        Test.clear();
        System.out.println("after clearing: " + Test);

        System.out.println("Is empty? " + Test.isEmpty());

        TestCopy.add("Pooja");
        TestCopy.add("23");

        Test.addAll(TestCopy);
        System.out.println("adding elements from the copied to test: " + Test);

        System.out.println("Index of element 'Pooja': " + Test.indexOf("Pooja"));

        LinkedList<String> Test1=new LinkedList<>();
        Test1.add("n");
        Test1.add("z");
        Test1.add("a");
        System.out.println(Collections.max(Test1));

        LinkedList<Integer> Test2=new LinkedList<>();
        Test2.add(24);
        Test2.add(67);
        Test2.add(45);

        System.out.println("highest number: "+Collections.max(Test2));
    }
}
