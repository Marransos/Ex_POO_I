
public class Escultura extends Arte {
    
    private String  material;
    private float  preco, peso;

   

    public Escultura(int id, String nomeArte, String titulo, String autor, int ano, String material, float preco, float peso) {
        super(id, titulo, autor, ano);
        this.material = material;
        this.preco = preco;
        this.peso = peso;
    }



    public String getMaterial() {
        return material;
    }



    public float getPreco() {
        return preco;
    }



    public float getPeso() {
        return peso;
    }



    public void setPreco(float preco) {
        this.preco = preco;
    }



    @Override
    public String toString() {
        return "Escultura [material=" + material + ", preco=" + preco + ", peso=" + peso + "]";
    }

    
}
