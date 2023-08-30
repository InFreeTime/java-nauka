package pl.naukajava2;

public class Tablice {

    public static void main(String[] args) {
        String[] names = new String [4];

        names [0] = "Mariusz";
        names [1] = "Dominik";
        names [2] = "Kasia";
        names [3] = "Asia";

        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Albo:");

        for (String name : names){
            System.out.println(name);
        }

    }
}