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

//        System.out.println(favoriteFruits.get("Alice"));
//        System.out.println(favoriteFruits.containsKey("Harry"));
//        System.out.println(favoriteFruits.containsValue("Melon"));

        favoriteFruits.remove("Sarah");
//        System.out.println(favoriteFruits);

        favoriteFruits.clear();
//        System.out.println(favoriteFruits);
    /*
        1. Create a HashMap of keys and values for the populations of
         some countries. Here is some sample data (don't forget to
          think about the types of your keys and values!):
        UK: 64,100,000
        Germany: 80,620,000
        France: 66,030,000
        Japan: 127,300,000

        2. Output some values from the HashMap using .get(key) and system.out.println().
        3. Investigate the use of the .values() and .keySet() methods on HashMap.
        4. Alongside the population, try to store the continent and
         capital for each country. Make a function that outputs: In
           + country + there are + population + people. The capital of
            + country + is + capital + and it is in + continent
             + .  . Hint: you will want to create a Country class.
     */
        HashMap<String, Integer> populations;
        populations = new HashMap<>();
        populations.put("UK", 64_100_000);
        populations.put("Germany", 80_620_000);
        populations.put("France", 66_030_000);
        populations.put("Japan", 127_300_000);

        System.out.println(populations.get("Germany"));
        System.out.println(populations.values());
        System.out.println(populations);
        System.out.println(populations.keySet());

    }
}