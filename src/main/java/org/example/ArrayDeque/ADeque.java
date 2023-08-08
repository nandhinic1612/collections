package org.example.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ADeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ADeque = new ArrayDeque<>();
        //add one line
        ADeque.add(23);
        ADeque.add(34);
        ADeque.addFirst(13);
        ADeque.offerFirst(44);
        ADeque.add(45);
        ADeque.add(20);
        System.out.println("ArrayDeque :"+ADeque);

        Iterator AD = ADeque.iterator();
        while(AD.hasNext()){
            System.out.println(AD.next());
        }

        Iterator desAD = ADeque.descendingIterator();
        System.out.println("Descending order :");
        while(desAD.hasNext()){
            System.out.print(desAD.next()+" ");
        }
        System.out.println(ADeque);
        System.out.println("Get First element :"+ADeque.getFirst());
        System.out.println("Get Last element :"+ADeque.getLast());
        System.out.println("Head element :"+ADeque.peekFirst());
        System.out.println("Last element :"+ADeque.peekLast());

        System.out.println("remove :"+ADeque.remove());
        System.out.println("updated :"+ADeque);
       System.out.println("remove first :"+ADeque.removeFirst());
       System.out.println("remove Last :"+ADeque.removeLast());

       ADeque.add(88);
       ADeque.add(56);

       System.out.println(ADeque);

       System.out.println(ADeque.pollFirst());
       System.out.println(ADeque.pollLast());

    }
}
