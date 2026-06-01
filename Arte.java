import java.io.Serializable;

public class Arte implements Serializable {
    private int id, ano;
    private String titulo, autor;

    public Arte(int id, String titulo, String autor, int ano) {
        this.id = id;
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Arte [id=" + id + ", ano=" + ano + ", titulo=" + titulo + ", autor=" + autor + "]";
    }

    
}