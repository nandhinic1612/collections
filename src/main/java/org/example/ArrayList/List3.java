package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List3 {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        System.out.println("ArrayList: " + aList);

        System.out.println("Size of ArrayList: " + aList.size());

        System.out.println("Element at index 2: " + aList.get(2));

        System.out.println("Updated ArrayList: " + aList.set(3, 8));   //update
        System.out.println("updated: "  +aList);

        if (aList.contains(5)) {
            System.out.println(aList.contains(5) + ": exists in the ArrayList.");
        } else {
            System.out.println(" does not exist in the ArrayList.");
        }

        System.out.println("ArrayList after removing element at index 1: " + aList.remove(1));

        Collections.sort(aList);
        System.out.println("Sorted ArrayList: " + aList);   //ascending order

        Collections.reverse(aList);
        System.out.println("Reversed ArrayList: " + aList);  //descending order

        // Creating a shallow copy of the ArrayList
        ArrayList<Integer> Copy = new ArrayList<>(aList);

       aList.clear();
        System.out.println("ArrayList after clearing: " +  aList);
        System.out.println("Is ArrayList empty? " + aList.isEmpty());

        // Adding elements to the copied ArrayList
        Copy.add(100);  //adding to copied
        Copy.add(200);

        // adding copy to alist
        aList.addAll(Copy);
        System.out.println("ArrayList after adding elements from the copied ArrayList: " + aList);

        System.out.println("Clone :" + aList.clone());  //clone
        System.out.println("Index Of: "+ aList.indexOf(200)); //index
       // System.out.println("Last Index Of: "+aList.lastIndexOf(3)); //index of ele, if not
        System.out.println("SubList: " + aList.subList(0, 3));  //index 0 to 3
      //  System.out.println("Remove All: " + aList.removeAll(aList));  //removeAll

        ArrayList aList1 = new ArrayList();
        aList1.add('D');
        aList1.add('S');
        aList1.add(5);
        aList1.add('N');

      /*  aList.retainAll(aList1);
        System.out.println("retainAll: "+aList);  //same value*/

        aList.addAll(aList1);
        System.out.println("AddAll: "+aList);  //adding 2 list

        Iterator <Integer> itr = aList.iterator();
        System.out.println("Using Iterator: ");
        while(itr.hasNext()){
            System.out.println(" "+itr.next());
        }


        ArrayList<Integer> aList2=new ArrayList();
        aList2.add(3);
        aList2.add(6);
        aList2.add(8);
        System.out.println("aList2: "+aList2);

        aList2.forEach(e ->{
            e=e-1;
            System.out.println(e);
        });
        aList2.removeIf((e -> (e % 2) == 0));
        System.out.println(aList2);
    }
}
