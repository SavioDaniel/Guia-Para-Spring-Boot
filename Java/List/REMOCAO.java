package Java.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class REMOCAO {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        List<String> nomes = new LinkedList<>();
        
        lista.add("Java");
        lista.add("Ruby");
        lista.add("C#");
        lista.add("C");

        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
        lista.remove("Java");
        System.out.println(lista);
    

    }
}
