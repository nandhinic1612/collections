package org.example.Dequeue;

import java.util.Deque;
import java.util.LinkedList;

class DeQueue {

    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();

        numbers.offer(1);
         numbers.addFirst(33);
        numbers.addLast(30);
        numbers.offerLast(2);
        numbers.offerFirst(3);

        System.out.println("Deque: " + numbers);

        System.out.println("First Element: " + numbers.peekFirst());

        System.out.println("Last Element: " + numbers.peekLast());

        numbers.pollFirst();
        System.out.println("Removed First Element: " +numbers);

        numbers.pollLast();
        System.out.println("Removed Last Element: " +numbers );

        numbers.offerFirst(7);
        System.out.println("Updated Deque: " + numbers);

        numbers.offerLast(10);
        System.out.println("Updated Deque: " + numbers);
        System.out.println("first element: "+numbers.getFirst());
        System.out.println("last element: "+numbers.getLast());
        System.out.println(numbers);

    }
}
