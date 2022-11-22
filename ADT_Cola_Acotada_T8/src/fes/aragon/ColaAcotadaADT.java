package fes.aragon;

import java.util.ArrayList;

public class ColaAcotadaADT <T> extends ColasADT<T>{
	ArrayList prioridad;
	
	public ColaAcotadaADT(int nivel) {
		prioridad=new ArrayList(nivel);
		for (int i = 0; i < prioridad.size()-1; i++) {
			ColasADT<T> cola=new ColasADT();
			prioridad.add(cola);
		}
	}
	
	public boolean isEmpty() {
		boolean estado=true;
		//revisa de prioridad
		for (int i = 0; i < prioridad.size()-1; i++) {
			prioridad.get(i);
			//revia los datos
			for (int j = 0; j < datos.size()-1 ; j++) {
				if (datos.get(j)==null) {
					estado=true;
				}
			}
		}
		return estado;
	}
	
	public int getLenght() {
		return datos.size();
	}
	
	public void enqueue(T dato, int priorida) {
		for (int i = 0; i < priorida; i++) {
			prioridad.get(i);
			datos.add(dato);
		}
	}
	
	public T dequeue() {
		//0 es la de mayor prioridad
		prioridad.get(0);
		T sacar=(T) datos.remove(0);
		return sacar;
	}
	
	public String toString() {
		String edo="";
		for (int i = datos.size()-1; i>=0; i--) {
			edo+=datos.get(i)+" | ";
		}
		return edo;
	}
	
}
