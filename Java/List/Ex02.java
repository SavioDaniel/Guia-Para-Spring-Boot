package Java.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> lingua = new ArrayList<>();
        
        lingua.add("C");
        lingua.add("Python");

        lingua.add(1, "Java");

        System.out.println("Lista após adição: " + lingua);

        ////////////////////////////////////////////////////////
        
        List<String> link = new LinkedList<>();
        
        link.add("Node 1");
        link.add("Note 2");

        link.addFirst("Inicio");
        link.addLast("Fim");

        System.out.println("\n\nLink após atualizações: " + link);

        ////////////////////////////////////////////////////////
         
        List<String> neutra = new ArrayList<>();

        neutra.add("Linguagem");

        neutra.addAll(lingua);

        System.out.println("lista Mestra (addALL): " + neutra);
    }
}
