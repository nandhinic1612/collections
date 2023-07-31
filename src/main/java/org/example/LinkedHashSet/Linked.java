package org.example.LinkedHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Linked {
    public static void main(String []args){
        ArrayList A = new ArrayList();
        A.add("nisha");
        A.add("Lavanya");
        A.add("nandhini");
        A.add("sahana");
        System.out.println("ArrayList :"+A);

        LinkedHashSet list = new LinkedHashSet(A);
        System.out.println("LinkedHashSet :"+list);

        LinkedHashSet ll = new LinkedHashSet();
        ll.add("D");
        ll.add("sahana");
        System.out.println("New LinkedHashSet :"+ll);

//        list.retainAll(ll);
//        System.out.println("intersection :"+list);   //common

//        ll.addAll(list);
//        System.out.println("new linkedlist"+ll);  //union

        list.removeAll(ll);
        System.out.println("different element :"+list);
    }
}
