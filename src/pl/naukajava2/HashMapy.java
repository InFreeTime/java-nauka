package pl.naukajava2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapy {
    public static void main(String[] args) {
        Map<String,String> nameToMeal = new HashMap<>();

        nameToMeal.put("Mariusz", "Pizza");
        nameToMeal.put("Dominik", "Burger");
        nameToMeal.put("Kamil", "Burger");
        nameToMeal.put("Dominik", "Pasta");

        System.out.println(nameToMeal.isEmpty());

        System.out.println(nameToMeal.get("Dominik")); // wyświetla wartość spod klucza Dominik

        Set<String> keys = nameToMeal.keySet();  //wyśwetla wszystkie klucze
        for (String key : keys){
            System.out.println(key);
        }

        Collection<String> values = nameToMeal.values(); // Wyświetla wszystkie wartości
        for (String value : values){
            System.out.println(value);
        }
        System.out.println(nameToMeal.containsKey("Mariusz")); //Czy zawiera klucz/wartość
        System.out.println(nameToMeal.containsValue("Burger"));



    }
}