package fes.aragon;

import java.util.ArrayList;

public class Arreglo <T>{
	int tamanio;
	ArrayList<T> datos;
	
	public Arreglo(int tam) {
		this.tamanio=tam;
		datos=new ArrayList<>();
		for (int i=0; i<this.tamanio; i++) {
			datos.add(null);
		}
	}
	
	public int getLongitud() {
		return this.tamanio;
	}
	
	public T getElemento(int indice) throws IndexOutOfBoundsException{
		return datos.get(indice);
	}
	
	public void setElemento(int indice, T dato)throws IndexOutOfBoundsException{
		this.datos.set(indice, dato);
	}
	
	public void limpiar(T element) {
		for(int i=0; i<datos.size(); i++) {
			datos.set(i, element);
		}
	}

	@Override
	public String toString() {
		String estado="";
		for(T element : datos) {
			if(element !=null) {
				estado+=element.toString()+"\n";
			}
		}
		return estado;
	}
	
}
