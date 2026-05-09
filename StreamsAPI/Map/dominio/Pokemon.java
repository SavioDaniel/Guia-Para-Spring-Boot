package StreamsAPI.Map.dominio;

public class Pokemon {
    private String nome; 
    private String tipo;
    private int nivel;


    public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return nome + " - " + tipo + " - Lv." + nivel;
    }
    
}
