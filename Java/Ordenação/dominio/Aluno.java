package Java.Ordenação.dominio;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    // Implementação da ordenação padrão (por idade)
    @Override
    public int compareTo(Aluno outro) {
        return Integer.compare(this.idade, outro.idade);
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}