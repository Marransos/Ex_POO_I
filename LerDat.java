import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LerDat {
    public static void main(String[] args) throws Exception, IOException {
        String caminho = "dados.dat"; 

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            
            ArrayList<Object> lista = (ArrayList<Object>) ois.readObject();
            
            for (Object item : lista) {
                System.out.println(item);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
