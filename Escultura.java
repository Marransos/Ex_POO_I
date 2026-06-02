
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

    
package exercício11;


public class Escultura extends ObraDeArte {
	public String material;
	public double peso;
	public Escultura(int id,String nomeArte,String titulo,String autor, int ano,String material,double peso,double preco){
		super(id,nomeArte,titulo,autor,ano,preco);
		this.material = material;
		this.peso = peso;
	}
	@Override
	public String toString(){
		return "Id: "+id+" Nome da Arte: "+nomeArte+" Título: "+titulo+" Autor: "+autor+" Ano: "+ano+" Material: "+material+" Peso: "+peso+" Preço: "+preco;
	}
}
