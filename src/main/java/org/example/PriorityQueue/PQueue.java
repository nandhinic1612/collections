package org.example.PriorityQueue;

import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue PQueue = new PriorityQueue();

        PQueue.add("C");
        PQueue.add("A");
        PQueue.add("D");
        PQueue.add("F");
        PQueue.add("B");

        System.out.println("PriorityQueue: " + PQueue);
        System.out.println(PQueue.poll());
        System.out.println(PQueue.poll());
        System.out.println(PQueue.poll());
        System.out.println(PQueue.poll());

        System.out.println("Size of PriorityQueue: " + PQueue.size());

        System.out.println("top element: " + PQueue.peek());
        System.out.println("Head element " + PQueue.peek());

        System.out.println(PQueue.poll());


        System.out.println("Is PriorityQueue empty? " + PQueue.isEmpty());

        //head
        System.out.println(PQueue.peek());

        //remove
        System.out.println(PQueue.poll());

        System.out.println("Polling elements");
        while (!PQueue.isEmpty()) {
            //int polledElement = PQueue.poll();
            System.out.println("Polled element: " + PQueue.poll());
        }

        System.out.println("after polling all elements: " + PQueue);

        System.out.println("Is PriorityQueue empty: " + PQueue.isEmpty());

        PQueue.offer(70);
        PQueue.offer(60);
        PQueue.offer(80);

        PriorityQueue<Integer> PQueueCopy = new PriorityQueue<>(PQueue);

        PQueue.clear();
        System.out.println("Is PriorityQueue empty now? " + PQueue.isEmpty());

        System.out.println("Copied PriorityQueue: " + PQueueCopy);

        PriorityQueue PQ = new PriorityQueue();
        PQ.add("d");
        PQ.add("1");
        PQ.add("D");
        PQ.add("4");
        PQ.add("a");
        System.out.println("PQ elements :" + PQ);
        System.out.println(PQ.poll());
//        System.out.println(PQ.poll());
//        System.out.println(PQ.poll());
        while (!PQ.isEmpty()) {
            System.out.println(PQ.poll());
        }
    }
}

