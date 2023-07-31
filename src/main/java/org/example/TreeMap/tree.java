package org.example.TreeMap;

import java.util.TreeMap;

public class tree {
    public static void main(String []args){
        TreeMap tree = new TreeMap<>();
        tree.put(1,"D");
        tree.put(2,"S");
        tree.put(3,"R");
      //  tree.put(4,"N");
        System.out.println(tree);

        tree.putIfAbsent(5,"L");
        System.out.println(tree);

        System.out.println(tree.entrySet());
        System.out.println("key set :"+tree.keySet());
        System.out.println("value set :"+tree.values());

        System.out.println("getOrDefault"+tree.getOrDefault(2,"not found"));

        System.out.println("first key :" + tree.firstKey());   //1st key
        System.out.println("last key :" + tree.lastKey());     //lastkey

        System.out.println("first entry :"+tree.firstEntry());
        System.out.println("last entry :"+tree.lastEntry());
        
        System.out.println("higher :"+ tree.higherKey(3));




    }
}
