package org.example.TreeSet;

import java.util.TreeSet;

public class tree {
    public static void main(String []args){
        TreeSet tree= new TreeSet();
        tree.add("D");
        tree.add("A");
        tree.add("F");
        tree.add("C");
        tree.add("E");
        System.out.println(tree);

        System.out.println("First element :"+tree.first());  //first
        System.out.println("First element :"+tree.last());   //last

        System.out.println("Higher :"+tree.higher("E"));  //higher
        System.out.println("Higher :"+tree.higher("F"));
//        System.out.println("Higher :"+tree.higher("B"));

        System.out.println("Lower :"+tree.lower("C"));  //lower
        System.out.println("Lower :"+tree.lower("F"));

        System.out.println("Ceiling :"+tree.ceiling("E"));  //celing
        System.out.println("Ceiling :"+tree.ceiling("B"));

        System.out.println("Floor :"+tree.floor("B"));   //floor
        System.out.println("Floor :"+tree.floor("D"));



        System.out.println("HeadSet :"+tree.headSet("E"));  //before E without boolean
        System.out.println("HeadSet :"+tree.headSet("E",true));  //upto E with boolean

        System.out.println("TailSet :"+tree.tailSet("E")); //E to end
        System.out.println("TailSet :"+tree.tailSet("E",false)); //after E with boolean

        System.out.println("SubSet :"+tree.subSet("C", "E")); //bt cToe incl c
        System.out.println("Subset :"+tree.subSet("C" ,true, "E" ,true));
    }
}
