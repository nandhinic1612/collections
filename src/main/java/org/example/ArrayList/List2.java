package org.example.ArrayList;

import java.util.ArrayList;

public class List2 {
    public static void main(String []args){
        ArrayList L1=new ArrayList();
        L1.add(1);
        L1.add(2);
        L1.add(5);
        L1.add(6);
        L1.add(8);
        L1.add(10);
        System.out.println(L1);
        ArrayList L2=new ArrayList();
        L2.add(10);
        L2.add(11);
        L2.add(12);
        L2.add(14);
        L2.add(15);
        L2.add(16);
        System.out.println(L2);
        L1.addAll(L2);
        System.out.println(L1);

        System.out.println("contains 5 in L1 : " +L1.contains(5));
        System.out.println("contains 16 in L2 : " +L2.contains(16));
        System.out.println("contains 2 in L1 : " +L1.contains(2));
        System.out.println("check the index : " +L1.indexOf(3));
        System.out.println("check the index : " +L1.indexOf(4));
        System.out.println("check the index : " +L1.indexOf(2));
        System.out.println("check the index : " +L1.indexOf(1));
        
    }
}
