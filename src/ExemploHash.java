import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class ExemploHash {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> tabelaHash = new HashMap<>();
		
		tabelaHash.put("br", new ArrayList<>());
		tabelaHash.get("br").add("com");//br.com
		tabelaHash.get("br").add("gov");//br.gov
		tabelaHash.get("br").add("eti");//br.eti
		tabelaHash.put("com", new ArrayList<>());
		tabelaHash.get("com").add("cnn");//com.cnn
		tabelaHash.get("com").add("google");//com.google
		
		for (String brs : tabelaHash.get("br")){
			System.out.println(brs);
		}
		
		HashMap<String, ArrayList<String>> listaContato = new HashMap<>();
		
		if(!listaContato.containsKey("A")){
			listaContato.put("A", new ArrayList<>());
		}
		listaContato.get("A").add("Amanda");
		listaContato.get("A").add("Adalberto");
		listaContato.get("A").add("Adalberto");
		
		if(!listaContato.containsKey("B")){
			listaContato.put("B", new ArrayList<>());
		}
		listaContato.get("B").add("Barão");
		listaContato.get("B").add("Bia");

	}

}
