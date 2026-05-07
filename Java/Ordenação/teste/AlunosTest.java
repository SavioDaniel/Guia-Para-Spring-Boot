package Java.Ordenação.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Java.Ordenação.dominio.Alunos;

public class AlunosTest {
    public static void main(String[] args) {
        List<Alunos> lista = new ArrayList<>();

        lista.add(new Alunos("Sávio", 24, 'M'));
        lista.add(new Alunos("Rebeca", 20, 'F'));
        lista.add(new Alunos("André", 49, 'M'));
        lista.add(new Alunos("Alcirene", 45, 'F'));

        Collections.sort(lista);
        
        for (Alunos alunos : lista) {
            System.out.println(alunos.getNome());
        }
    }
}
