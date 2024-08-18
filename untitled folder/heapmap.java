package filehandling;

import java.util.HashMap;

public class heapmap {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 15);
        hashMap.put("Mango", 25);

        // Accessing elements using for-each loop
        System.out.println("Key-Value pairs in the HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        // Getting the size of the HashMap
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // Removing a key-value pair
        hashMap.remove("Orange");
        System.out.println("After removing Orange:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        // Checking if a key exists
        boolean containsBanana = hashMap.containsKey("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("After clearing the HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key)); // This loop won't execute as the HashMap is empty
        }

        // Checking if HashMap is empty
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);
    }
}