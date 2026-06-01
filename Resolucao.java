import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Resolucao{
    public static void main(String[] args) throws Exception, IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("artes.txt"));
            String linha;
            // Como não sei o tipo (e não são herdados), o tipo da lista é Object
            ArrayList <Object> lista = new ArrayList<>();

            while ((linha=br.readLine())!= null){
                String dados[]=linha.split("&");

                //Verifico o tipo de objecto
                if (dados[1].equals("Escultura")){
                    Escultura objeto = new Escultura(Integer.parseInt(dados[0]), dados[1], dados[2],dados[3],Integer.parseInt(dados[4]),
                    dados[5],Float.parseFloat(dados[6]),Float.parseFloat(dados[7]));

                    lista.add(objeto);
                } else if (dados[1].equals("Pintura")){
                    Pintura objeto = new Pintura(Integer.parseInt(dados[0]), dados[1], dados[2],dados[3], Integer.parseInt(dados[4]),
                    dados[5],Float.parseFloat(dados[6]),Float.parseFloat(dados[7]));

                    lista.add(objeto);
                } else if (dados[1].equals("Fotografia")){

                    Fotografia objeto = new Fotografia(Integer.parseInt(dados[0]),dados[1], dados[2],dados[3],
                    Integer.parseInt(dados[4]), dados[5], dados[6], Float.parseFloat(dados[7]));

                    lista.add(objeto);

                }
            
                //Guardo a lista como ficheiro
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dados.dat"));

                oos.writeObject(lista);
                oos.close();

            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}