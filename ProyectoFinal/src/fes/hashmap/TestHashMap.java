package fes.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {
	public static void main(String[] args) {
		Map<Integer, String> hashmap= new HashMap<>();
		hashmap.put(1, "Luis");
		hashmap.put(3, "Angel");
		hashmap.put(2, "Jesus");
		hashmap.put(4, "Edith");
		hashmap.put(5, "Gonzalo");
		
		//for para imprimir un poco en orden
		for(Entry<Integer, String> entry : hashmap.entrySet()) {
			System.out.println("Clave: "+entry.getKey()+" - "+"Valor: "+entry.getValue());
		}
		
	}
}
