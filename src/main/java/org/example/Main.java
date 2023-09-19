package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> favoriteFruits;
        favoriteFruits = new HashMap<>();

        favoriteFruits.put("Jason", "Banana");
        favoriteFruits.put("Alice", "Apple");
        favoriteFruits.put("Melinda", "Melon");
        favoriteFruits.put("Sarah", "Strawberry");

        System.out.println(favoriteFruits.get("Alice"));
        System.out.println(favoriteFruits.containsKey("Harry"));
        System.out.println(favoriteFruits.containsValue("Melon"));

        favoriteFruits.remove("Sarah");
        System.out.println(favoriteFruits);

        favoriteFruits.clear();
        System.out.println(favoriteFruits);
    }
}