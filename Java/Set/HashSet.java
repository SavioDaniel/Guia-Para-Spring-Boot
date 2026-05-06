package Java.Set;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> frutas = new java.util.HashSet<>();

        frutas.add("maça");
        frutas.add("amora");
        frutas.add("perá");
        frutas.add("uva");
        frutas.add("melão");

        System.out.println(frutas);

        System.out.println(frutas.contains("perá"));

        frutas.remove("uva");

        System.out.println(frutas.size());

        for (String string : frutas) {
            System.out.println(string);
        }

    }
    
}
