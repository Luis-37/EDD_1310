package fes.aragon;

import java.util.ArrayList;
import java.util.HashMap;

public class HashTableADT <T> extends Nodo<T>{
	HashMap diccionario;
    ArrayList arreglo;
    Nodo node;
    int table_size;
    T key;
    T value;
    int indice;
    
    public HashTableADT(int table_size) {
    	this.table_size=table_size;
    	arreglo=new ArrayList(table_size);
    	for(int i=0; i<arreglo.size()-1; i++) {
    		diccionario=new HashMap();
    	}
    }
    
    public void add(int key, T value) {
    	//lo que vimos en clase
    	indice=key % table_size;
    	node=new Nodo(diccionario.put(key, value),null);
    	arreglo.add(indice,node);
    }
    
    public void remove(T key) {
    	diccionario.remove(key);
    }
    
    public T valueOf(int key) {
    	T valor;
    	valor=(T)diccionario.get(key).toString();
    	return valor;
    }

	public HashMap getDiccionario() {
		return diccionario;
	}

	
	//se saca get/set de los valores que se piden o se modifican en tiempo de ejecucion
	
	
	public void setDiccionario(HashMap diccionario) {
		this.diccionario = diccionario;
	}

	public ArrayList getArreglo() {
		return arreglo;
	}

	public void setArreglo(ArrayList arreglo) {
		this.arreglo = arreglo;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
    
	//confundi key con value, creo que uno tiene que ser int en vez de <T>
    
    
}
