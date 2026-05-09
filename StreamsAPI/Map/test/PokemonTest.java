package StreamsAPI.Map.test;

import java.util.ArrayList;
import java.util.List;

import StreamsAPI.Map.dominio.Pokemon;

public class PokemonTest {
   public static void main(String[] args) {

        List<Pokemon> pokemons = List.of(
                new Pokemon("Pikachu", "Elétrico", 25),
                new Pokemon("Charizard", "Fogo", 50),
                new Pokemon("Bulbasaur", "Planta", 18),
                new Pokemon("Squirtle", "Água", 15),
                new Pokemon("Arcanine", "Fogo", 45)
        );

        // Pegando apenas os nomes
        List<String> nomes = pokemons.stream()
                .map(Pokemon::getNome)
                .toList();

        System.out.println("Nomes:");
        System.out.println(nomes);

        // Nomes em maiúsculo
        List<String> nomesMaiusculos = pokemons.stream()
                .map(Pokemon::getNome)
                .map(String::toUpperCase)
                .toList();

        System.out.println("\nNomes em maiúsculo:");
        System.out.println(nomesMaiusculos);

        // Apenas pokémons de fogo
        List<Pokemon> fogo = pokemons.stream()
                .filter(p -> p.getTipo().equals("Fogo"))
                .toList();

        System.out.println("\nPokémons de fogo:");
        System.out.println(fogo);

        // Pegando apenas os níveis
        List<Integer> niveis = pokemons.stream()
                .map(Pokemon::getNivel)
                .toList();

        System.out.println("\nNíveis:");
        System.out.println(niveis);
    }
}
