package Java.Ordenação2.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Java.Ordenação2.dominio.Carro;
import Java.Ordenação2.dominio.CarroNome;

import Java.Ordenação2.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();


    carros.add(new Carro("Fusca", 2001));
    carros.add(new Carro("Camaro", 2018));
    carros.add(new Carro("Jeep", 2022));
    carros.add(new Carro("Lamburgn", 2020));
    carros.add(new Carro("Opala", 1987));
    carros.add(new Carro("BMW", 2013));
    carros.add(new Carro("SW4", 2011));

    Collections.sort(carros);
    System.out.println();

    for (Carro carroImprimir : carros) {
        System.out.println(carroImprimir);
    }

    }
}
