package org.example.Queue;   //FIFO

import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;

class number {

    public static void main(String[] args) {
        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.peek());
        System.out.println(numbers.poll());
        /*System.out.println(numbers.element());
        System.out.println(numbers.remove());*/

        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Queue: " + numbers);
        System.out.println("top Element: " + numbers.peek());

        System.out.println("Removed Element: " + numbers.poll());
        System.out.println("Removed Element: " + numbers.poll());


        System.out.println("Updated Queue: " + numbers);
    }
}
