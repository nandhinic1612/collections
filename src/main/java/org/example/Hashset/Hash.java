package org.example.Hashset;

import java.util.HashSet;

public class Hash {
    public static void main(String []args){
        HashSet<Integer> test=new HashSet<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        System.out.println("test elements :"+test);

        System.out.println("Hash Code of test :"+test.hashCode());

        HashSet<Integer> test1=new HashSet<>();
        test1.add(5);
        test1.add(2);
        test1.add(3);
        System.out.println("test1 elements :"+test1);

        test.retainAll(test1);
        System.out.println("intersection :"+test);    //intersection //same

       test.containsAll(test1);
        System.out.println(test);  //test1-subset of test
    }
}
