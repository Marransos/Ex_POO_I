
package exercício11;

public class Fotografia extends ObraDeArte {
	public String resolucao;
	public String tipoCamera;
	public Fotografia(int id,String nomeArte,String titulo,String autor, int ano,String resolucao,String tipoCamera,double preco){
		super(id,nomeArte,titulo,autor,ano,preco);
		this.resolucao = resolucao;
		this.tipoCamera = tipoCamera;
	}
	@Override
	public String toString(){
		return "Id: "+id+" Nome da Arte: "+nomeArte+" Título: "+titulo+" Autor: "+autor+" Ano: "+ano+" Resolução: "+resolucao+" Tipo de Camera: "+tipoCamera+" Preço: "+preco;
	}	
}
