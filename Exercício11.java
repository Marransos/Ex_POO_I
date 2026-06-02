 
package exercício11;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
//Proposta das alineas a,b,d,e,f
public class Exercício11 {
 
	public static void main(String[] args) {
		Vector<ObraDeArte> arte = GuardarVector();
		ReceitaPintura(arte);
		MaisBarata(arte);
	}
	public static Vector<ObraDeArte> GuardarVector(){
		//Alinea D
		Vector<ObraDeArte> Arte = new Vector<>();
		try{
			BufferedReader br = new BufferedReader(new FileReader("arte.txt"));
			while(br.ready()){
				String linha = br.readLine();
				StringTokenizer token = new StringTokenizer(linha,"&");
				while(token.hasMoreTokens()){
					int id = Integer.parseInt(token.nextToken());
					String tipo = token.nextToken();
					if(tipo.equals("Pintura")){
						Arte.add(new Pintura(id,tipo,token.nextToken(),token.nextToken(),Integer.parseInt(token.nextToken()),token.nextToken(),Double.parseDouble(token.nextToken()),Double.parseDouble(token.nextToken())));
					} else{if (tipo.equals("Escultura")){
						Arte.add(new Escultura(id,tipo,token.nextToken(),token.nextToken(),Integer.parseInt(token.nextToken()),token.nextToken(),Double.parseDouble(token.nextToken()),Double.parseDouble(token.nextToken())));
					} else{
						Arte.add(new Fotografia(id,tipo,token.nextToken(),token.nextToken(),Integer.parseInt(token.nextToken()),token.nextToken(),token.nextToken(),Double.parseDouble(token.nextToken())));
					}}
					
				}
			}
			br.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		return Arte;
	}
	public static void ReceitaPintura(Vector<ObraDeArte> arte){
		//Alinea E
		double receita = 0;
		for(int i = 0;i < arte.size();i++){
			if(arte.get(i).nomeArte.equals("Pintura")){
				receita += arte.get(i).preco;
			}
		}
		System.out.println("A receita é "+receita);
	}
	public static void MaisBarata(Vector<ObraDeArte> arte){
		//Alinea f
		Vector<ObraDeArte> copia = new Vector<>();
		copia.addAll(arte);
		copia.sort((p1,p2) -> Double.compare(p1.preco,p2.preco));
		int index = arte.indexOf(copia.get(0))+1;
		System.out.println("A arte mais barata está na posição "+index);
	}
}
