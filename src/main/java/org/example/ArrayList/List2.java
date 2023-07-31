package org.example.ArrayList;

import java.util.ArrayList;

public class List2 {
    public static void main(String []args){
        ArrayList L1=new ArrayList();
        L1.add(1);
        L1.add(2);
        System.out.println(L1);
        ArrayList L2=new ArrayList();
        L2.add(11);
        L2.add(12);
        System.out.println(L2);
        L1.addAll(L2);
        System.out.println(L1);
        
    }
}
