package Java.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        //Criando a lista
        List<Integer> numb = new ArrayList<>();

        numb.add(10);
        numb.add(25);
        numb.add(30);
        numb.add(45);
        numb.add(50);
        numb.add(25);

        //Imprimindo a lista
        for (Integer integer : numb) {
            System.out.println(integer);
        }

        //verificando se existe
        numb.contains( 30);

        //Tamanho da lista
        System.out.println(numb.size());

        //Removendo elemento da lista

        //Maior e Menor numero
        int maior = Collections.max(numb);
        int menor = Collections.min(numb);
        
        System.out.println("O maior numero da lista é: " + maior);
        System.out.println("O menor numero da lista é: " + menor);

        //soma de todos os elementos
        int soma = numb.stream().mapToInt(Integer::intValue).sum();
        System.out.println("A soma total é: " + soma);

        //nova lista com numeros maiores que 30
        List<Integer> maioresQue30 = numb.stream()
                                 .filter(n -> n > 30)
                                 .toList();

        System.out.println("Novos itens: " + maioresQue30);


         
    }        
}
