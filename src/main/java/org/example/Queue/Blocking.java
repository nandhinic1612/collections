package org.example.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Blocking {
    public static void main(String []args){
        Queue q=new ArrayBlockingQueue(3);
        q.add(2);
        q.add(3);
        q.add(4);
       boolean Add = q.offer(5);
       System.out.println("is 5 is added :" +Add);

        System.out.println(q);

        }
    }

