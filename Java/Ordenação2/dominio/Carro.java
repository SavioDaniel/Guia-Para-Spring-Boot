package Java.Ordenação2.dominio;

import Java.Ordenação.dominio.Aluno;

public class Carro implements Comparable<Carro>{
    private String nome; 
    private int ano;


    public Carro(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public int compareTo (Carro outro) {
        return Integer.compare(this.ano, outro.ano);
    }
    
    @Override
    public String toString() {
        return "Carro{nome='" + nome + "', ano=" + ano + "}";
    }

}
