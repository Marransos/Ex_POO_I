
package exercício11;

public class Pintura extends ObraDeArte {
	public String tecnica;
	public double altura;
	public Pintura(int id,String nomeArte,String titulo,String autor, int ano,String tecnica,double altura,double preco){
		super(id,nomeArte,titulo,autor,ano,preco);
		this.tecnica = tecnica;
		this.altura = altura;
	}
	@Override
	public String toString(){
		return "Id: "+id+" Nome da Arte: "+nomeArte+" Título: "+titulo+" Autor: "+autor+" Ano: "+ano+" Técnica: "+tecnica+" Altura: "+altura+" Preço: "+preco;
	}	
}
