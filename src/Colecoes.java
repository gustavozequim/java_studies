import java.util.Map;
import java.util.HashMap;


public class Colecoes{
    public static void main(String[] args) {
        Map<String, String> listaTelMap = new HashMap<>();
        listaTelMap.put("Jonas", "43985232541");
        listaTelMap.put("Jonas1", "43985232541");
        listaTelMap.put("Jonas2", "43985232541");
        listaTelMap.put("Jonas3", "43985232541");
        listaTelMap.put("Jonas4", "43985232541");
        for (Map.Entry<String, String> entry : listaTelMap.entrySet()) {
            String nome = entry.getKey();
            String tel = entry.getValue();
            System.out.println("Nome: " + nome + ", Fone: " + tel);

        }
    }
}