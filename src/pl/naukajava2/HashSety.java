package pl.naukajava2;

import java.util.HashSet;
import java.util.Set;

public class HashSety {
    public static void main(String[] args) {
        Set<String> meals = new HashSet<>();  // W setach nie ma duplikatów, nie jest gwarantowana kolejsność, w Array listach dodawane sa na końcu.
        meals.add("Pizza");
        meals.add("Burger");
        meals.add("Pizza");
        meals.add("Salad");
        for (String meal : meals) {
            System.out.println(meal);

        }

    }
}