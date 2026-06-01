
package exercício11;

public class ObraDeArte {
	public int id;
	public String nomeArte;
	public String titulo;
	public String autor;
	public int ano;
	public double preco;
	public ObraDeArte(int id,String nomeArte,String titulo,String autor,int ano,double preco){
		this.id = id;
		this.nomeArte = nomeArte;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.preco = preco;
	}
	
	public String toString(){
		return "Id: "+id+" Nome da Arte: "+nomeArte+" Título: "+titulo+" Autor: "+autor+" Ano: "+ano+" Preço: "+preco;
	}
}
