package org.example.Stack;  //LIFO

import java.util.Iterator;
import java.util.Stack;

class Ex1 {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        animals.push("Dog");  //add
        animals.push("Horse");
        animals.push("Cat");
        System.out.println(animals);
        Iterator<String> iterator = animals.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Initial Stack: " + animals);

        System.out.println("Element at top: " + animals.peek());  // Access element from the top
        System.out.println(animals.contains("Cat"));

        System.out.println("Removed Element: " + animals.pop());   //remove
        System.out.println("Searching position: " +animals.search("Cat"));

        System.out.println("Searching position: " +animals.search("Dog"));
        System.out.println("Is the stack empty? " + animals.isEmpty());
//        System.out.println(animals.set(1,"Lion"));
//        System.out.println(animals);
    }
}
