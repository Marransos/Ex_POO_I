

public class Pintura extends Arte {

    private String tecnica;
    private float altura, preco;


    public Pintura(int id, String nomeArte, String titulo, String autor, int ano, String tecnica, float altura, float preco) {
        super(id, titulo, autor, ano);
        this.tecnica = tecnica;
        this.altura = altura;
        this.preco = preco;
    }
    //Esse nomeArte só vai servir pra ler no ficheiro de texto. Na verdade, é o nome da classe.


    public String getTecnica() {
        return tecnica;
    }


    public float getAltura() {
        return altura;
    }


    public float getPreco() {
        return preco;
    }


    public void setPreco(float preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Pintura [tecnica=" + tecnica + ", altura=" + altura + ", preco=" + preco + "]";
    }

    
    

    }