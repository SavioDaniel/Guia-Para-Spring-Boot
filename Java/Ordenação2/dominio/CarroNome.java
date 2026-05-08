package Java.Ordenação2.dominio;

import java.util.Comparator;

import Java.Ordenação.dominio.Aluno;

public class CarroNome implements Comparator <Carro>{

    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getNome().compareTo(c2.getNome());
    }

    
}
