package fes.aragon;

import java.util.ArrayList;

public class StrackADT <T> {
	ArrayList<T> datos;
	int tope;
	
	public StrackADT() {
		datos=new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return datos.size()==0;
	}
	
	public int getLenght() {
		return datos.size();
	}
	
	public T pop() {
		T sacado=datos.remove(tope);
		tope--;
		return sacado;
	}
	
	//esto estara bien?
	public T peek() {
		T sacado=datos.get(tope);
		tope--;
		return sacado;
	}
	
	public void push(T dato) {
		datos.add(dato);
		tope++;
	}
	
	public String toString() {
		String edo="";
		for (int i = datos.size()-1; i>=0; i--) {
			edo+=datos.get(i)+"\n";
		}
		return edo;
	}
}
