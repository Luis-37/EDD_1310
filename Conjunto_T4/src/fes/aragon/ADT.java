package fes.aragon;

import java.util.ArrayList;

public class ADT <T>{
	int tamanioArray;
	ArrayList<T> datos; //conjunto1?
	ArrayList<T> otroConjunto;
	ArrayList<T> conjuntoFinal;
	
	
	public ADT(int tamanioArray) {
		this.tamanioArray=tamanioArray; //para sacar tamaño
		datos=new ArrayList<T>(); //Inicializamos
		otroConjunto=new ArrayList<T>();
		conjuntoFinal=new ArrayList<T>();
		for(int i=0; i<this.tamanioArray; i++) { //calcula tamano del arreglo
			datos.add(i,null);
			otroConjunto.add(i, null);
			conjuntoFinal.add(i, null);
		}
	}
	
	public int getLongitud() {
		return this.tamanioArray;
	}
	
	public boolean contiene(T datos) {
		T tmp=datos;
		if(this.datos.contains(tmp)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void agregar(T datos) {
		T tmp=datos;
		if(this.datos.contains(tmp)) {
			this.datos.add(tmp);
		}else {
			System.out.println("El elemento ya exsite");
		}
	}
	
	public void eliminar(T datos) {
		T tmp=datos;
		if(this.datos.contains(tmp)) {
			this.datos.remove(tmp);
		}else {
			System.out.println("El elemento no existe");
		}
	}
	
	//lo de los otros conjuntos no c si esta bien
	

	public boolean esIgual(ArrayList otroConjunto) {
		this.otroConjunto=otroConjunto;
		boolean contiene=false;
		for(int i= 0; i<tamanioArray; i++) {
			if(datos.get(i).equals(this.otroConjunto.get(i))) {
				contiene=true;
			}else {
				contiene=false;
			}
		}
		return contiene;
	}
	
	
	//igual lo de otro conjunto
	public boolean subConjunto(ArrayList otroConjunto) {
		this.otroConjunto=otroConjunto;
		boolean contiene=false;
		if(datos.contains(datos)==otroConjunto.contains(otroConjunto)) {
			contiene=true;
		}else {
			contiene=false;
		}
		return contiene;
	}
	
	
	
	public void union(ArrayList otroConjunto) {
		this.otroConjunto=otroConjunto;
		this.conjuntoFinal=conjuntoFinal;
		for(int i= 0; i<tamanioArray; i++) {
			//datos.contains(datos.get(i))==otroConjunto.contains(otroConjunto.get(i))
			if(datos.get(i)==otroConjunto.get(i)) {
				datos.contains(datos.remove(i));
				datos=conjuntoFinal;
				otroConjunto=conjuntoFinal;
			}
			System.out.println(conjuntoFinal);
		}
	}
	
	public void interseccion(ArrayList otroConjunto) {
		this.otroConjunto=otroConjunto;
		this.conjuntoFinal=conjuntoFinal;
		for(int i= 0; i<tamanioArray; i++) {
			//datos.contains(datos.get(i))!=otroConjunto.contains(otroConjunto.get(i))
			if(datos.get(i)==otroConjunto.get(i)) {
				datos.remove(i);
				otroConjunto.remove(i);
				datos=conjuntoFinal;
				otroConjunto=conjuntoFinal;
			}else {
				
				System.out.println("No hay datos parecidos");
			}
		}
		
	}
	
	public void diferencia(ArrayList otroConjunto) {
		this.otroConjunto=otroConjunto;
		this.conjuntoFinal=conjuntoFinal;
		for(int i= 0; i<tamanioArray; i++) {
			if(datos.contains(datos.get(i))==otroConjunto.contains(otroConjunto.get(i))) {
				datos.contains(datos.remove(i));
				datos=conjuntoFinal;
			}else {
				System.out.println("No hay diferencia");
			}
		}
	}

	@Override
	public String toString() {
		return "ADT [tamanioArray=" + tamanioArray + ", datos=" + datos + ", otroConjunto=" + otroConjunto
				+ ", conjuntoFinal=" + conjuntoFinal + "]";
	}
	
	

	
}
