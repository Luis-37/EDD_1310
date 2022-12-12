package fes.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		Map<String, Integer> linkedmap= new LinkedHashMap<>();
		linkedmap.put("D", 100);
		linkedmap.put("A", 108);
		linkedmap.put("B", 40);
		linkedmap.put("C", 30000);
		linkedmap.put("E", 500);
		linkedmap.put("A", 2000);
		linkedmap.put("C", 30);
		
		//for para imprimir un poco en orden
		for(Entry<String, Integer> entry : linkedmap.entrySet()) {
			System.out.println("Clave: "+entry.getKey()+" - "+"Valor: "+entry.getValue());
		}
		
	}
}
