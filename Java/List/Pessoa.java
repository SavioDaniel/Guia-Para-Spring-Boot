package Java.List;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Julia");

        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.remove("Maria");

        System.out.println(nomes);

        System.out.println("Tamanho: " + nomes.size());
    }
    
}
