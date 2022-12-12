package fes.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> treemap= new TreeMap<>();
		treemap.put(4, "Luis");
		treemap.put(1, "Angel");
		treemap.put(2, "Jesus");
		treemap.put(3, "Edith");
		treemap.put(5, "Gonzalo");
		
		//for para imprimir un poco en orden
		for(Entry<Integer, String> entry : treemap.entrySet()) {
			System.out.println("Clave: "+entry.getKey()+" - "+"Valor: "+entry.getValue());
		}
		
	}
}
