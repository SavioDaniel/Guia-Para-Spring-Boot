package Java.Ordenação.teste;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList; // Faltava este!
import Java.Ordenação.dominio.Aluno; // Nome correto da classe
import Java.Ordenação.dominio.CompararPorNome;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Savio", 22));
        alunos.add(new Aluno("Daniel", 19));
        alunos.add(new Aluno("Beatriz", 25));

        // 1. Ordenação Padrão (Comparable - Idade)
        Collections.sort(alunos);
        System.out.println("Por Idade: " + alunos);

        // 2. Ordenação Específica (Comparator - Nome)
        Collections.sort(alunos, new CompararPorNome());
        System.out.println("Por Nome: " + alunos);
        
        // Dica Extra: Usando Lambda (Java 8+)
        alunos.sort((a1, a2) -> Integer.compare(a1.getIdade(), a2.getIdade()));
    }
}
