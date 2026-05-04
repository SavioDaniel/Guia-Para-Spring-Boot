package Java.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ADD {
    public static void main(String[] args) {
        
        // --- 1. ARRAYLIST (Focado em List) ---
        List<String> arrayList = new ArrayList<>();

        // .add(elemento): Adiciona ao final da lista
        arrayList.add("Java"); 
        arrayList.add("Python"); // Lista: [Java, Python]

        // .add(índice, elemento): Insere em uma posição específica
        // O "C#" vai para o índice 1, e o "Python" é empurrado para o índice 2
        arrayList.add(1, "C#"); // Lista: [Java, C#, Python]

        System.out.println("ArrayList após adições: " + arrayList);


        // --- 2. LINKEDLIST (Focado em Deque/Fila) ---
        // Usamos a declaração específica 'LinkedList' para acessar métodos extras
        LinkedList<String> linkedList = new LinkedList<>();

        // .add(elemento): Funciona igual ao ArrayList (adiciona ao fim)
        linkedList.add("Node 1");
        linkedList.add("Node 2"); // Lista: [Node 1, Node 2]

        // .addFirst(elemento): EXCLUSIVO de LinkedList (ou Deque)
        // Adiciona no início de forma muito rápida
        linkedList.addFirst("Início"); // Lista: [Início, Node 1, Node 2]

        // .addLast(elemento): Mesma coisa que o .add comum, mas deixa o código claro
        linkedList.addLast("Fim"); // Lista: [Início, Node 1, Node 2, Fim]

        System.out.println("LinkedList após adições: " + linkedList);


        // --- 3. ADICIONANDO UMA LISTA EM OUTRA (.addAll) ---
        List<String> listaMestra = new ArrayList<>();
        listaMestra.add("Linguagens:");
        
        // .addAll(coleção): Pega todos os itens de outra lista e joga aqui dentro
        listaMestra.addAll(arrayList); 

        System.out.println("Lista Mestra (addAll): " + listaMestra);
    }    
}
