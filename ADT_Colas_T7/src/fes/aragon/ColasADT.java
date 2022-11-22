package fes.aragon;

import java.util.ArrayList;

public class ColasADT <T> {
	ArrayList<T> datos;
	int tope;
	int base;
	
	public ColasADT() {
		datos=new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return datos.size()==0;
	}
	
	public int getLenght() {
		return datos.size();
	}
	
	public void enqueue(T dato) {
		datos.add(dato);
		base--;
	}
	
	public T dequeue() {
		T sacado=datos.remove(tope);
		tope++;
		return sacado;
	}
	
	public String toString() {
		String edo="";
		for (int i = datos.size()-1; i>=0; i--) {
			edo+=datos.get(i)+" | ";
		}
		return edo;
	}
	
}
