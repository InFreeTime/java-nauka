package pl.naukajava2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLista {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mariusz");
        names.add("Dominik");
        names.add("Błażej");
        names.add("Mariusz");

        Collections.sort(names); // Sortowanie. W ArrayList możliwe jest występowanie duplikatów

        System.out.println(names.isEmpty()); // Czy lista jest pusta?

//      names.remove("Błażej");
        System.out.println(names.contains("Dominik"));
        System.out.println(names.contains("Kamil"));


        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.get(0));

    }
}