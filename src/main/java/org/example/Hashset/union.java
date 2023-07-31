package org.example.Hashset;

import java.util.HashSet;

public class union {
    public static void main(String []args){
        HashSet h =new HashSet();
        h.add(11);
        h.add(33);
        h.add(22);
        h.add(30);
       System.out.println(h);

        HashSet h1 =new HashSet();
        h1.add(33);
        h1.add(44);
        h1.add(30);
        System.out.println(h1);

           h.addAll(h1);   //adding 2 sets //union
        System.out.println("union is :"+h);


    //    System.out.println("removed element :"+h.remove(11));
        System.out.println("is all elements removed :"+h.removeAll(h1));
        System.out.println(h);      //difference

    }
}
