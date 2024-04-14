package com.selenium.dropdown;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        // Original ArrayList with duplicates
        List<Integer> originalList = new ArrayList<Integer>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(4);
        originalList.add(1);

        // Remove duplicates
        List<Integer> uniqueList = removeDuplicates(originalList);

        // Print unique elements
        System.out.println("Original List: " + originalList);
        System.out.println("List with Duplicates Removed: " + uniqueList);
    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        // Create a set to store unique elements
        Set<T> set = new HashSet<T>();

        // Create a new list to store unique elements in order
        List<T> uniqueList = new ArrayList<T>();

        // Iterate through the original list
        for (T element : list) {
            // If the element is not already present in the set, add it to the set and new list
            if (!set.contains(element)) {
                set.add(element);
                uniqueList.add(element);
            }
        }

        return uniqueList;
    }
}
