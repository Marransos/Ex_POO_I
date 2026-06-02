
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
