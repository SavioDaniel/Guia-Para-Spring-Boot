package StreamsAPI.test;

import java.util.ArrayList;
import java.util.List;

import StreamsAPI.dominio.Carro;

public class CarrosTest {
    public static void main(String[] args) {
        List<Carro> carro = new ArrayList<>();

        carro.add(new Carro("Celta", 2022));
        carro.add(new Carro("Palio", 2012));
        carro.add(new Carro("Civíc", 2014));
        carro.add(new Carro("Corolla", 2009));
        carro.add(new Carro("Puro-Sangue", 2026));
        carro.add(new Carro("BMW", 2000));


        carro.stream().
            filter(c -> c.getAno() < 2010).
            forEach(System.out::println);
        
    }
}
