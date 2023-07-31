package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<>();

        Name.add("Ram");
        Name.add("Sita");
        Name.add("Adhi");
        Name.add("Sanju");
        Name.add("Saran");

        System.out.println("Name ArrayList: " + Name);

        System.out.println("Is Name ArrayList empty? " + Name.isEmpty());

        System.out.println("Size of Name ArrayList: " + Name.size());

        if (Name.contains("Sita")) {
            System.out.println(Name.contains("Sita") + " exists in the Name ArrayList.");
        } else {
            System.out.println(Name.contains("Sita")  + " does not exist in the Name ArrayList.");
        }

        // Accessing elements in the ArrayList using for-each loop
        System.out.println("Name in the ArrayList:");
        for (String person : Name) {
            System.out.println(person);
        }

        System.out.println("Name ArrayList after removing Saran: " + Name.remove("Saran"));

        Collections.sort(Name);
        System.out.println("Sorted Name ArrayList: " + Name);

        // Reversing the ArrayList
        Collections.reverse(Name);
        System.out.println("Reversed Name ArrayList: " + Name);

        // Creating a shallow copy of the ArrayList
        ArrayList<String> NameCopy = new ArrayList<>(Name);

        NameCopy.add("Sneha");
        NameCopy.add("Vishnu");

        Name.addAll(NameCopy);
        System.out.println("Name ArrayList after adding elements from the copied ArrayList: " + Name);

        Name.clear();
        System.out.println("Name ArrayList after clearing: " + Name);
    }
}

