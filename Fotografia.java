

public class Fotografia extends Arte {
    
    private String resolucao, tipoCamera;
    private float preco;

    public Fotografia(int id, String nomeArte, String titulo, String autor, int ano, String resolucao, String tipoCamera, float preco) {
        super(id, titulo, autor, ano);
        this.resolucao = resolucao;
        this.tipoCamera = tipoCamera;
        this.preco = preco;
    }

    public String getResolucao() {
        return resolucao;
    }

    public String getTipoCamera() {
        return tipoCamera;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Fotografia [resolucao=" + resolucao + ", tipoCamera=" + tipoCamera + ", preco=" + preco + ", getId()="
                + getId() + ", getAno()=" + getAno() + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor()
                + "]";
    }

    
    

}
