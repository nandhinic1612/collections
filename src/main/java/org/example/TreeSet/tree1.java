package org.example.TreeSet;

import java.util.TreeSet;

class tree1 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        System.out.println("TreeSet: " + numbers);

        // Using higher()
        System.out.println("Using higher: " + numbers.higher(5));

        // Using lower()
        System.out.println("Using lower: " + numbers.lower(10));

        // Using ceiling()
        System.out.println("Using ceiling: " + numbers.ceiling(1));

        // Using floor()
        System.out.println("Using floor: " + numbers.floor(10));

        System.out.println("Using headSet without boolean value: " + numbers.headSet(4));

    }
}
