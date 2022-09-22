package fes.aragon;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ADT<Integer> adt=new ADT<Integer>(4);
		adt.datos.set(0, 2);
		adt.datos.set(1, 3);
		adt.datos.set(2, 6);
		adt.datos.set(3, 9);
		
		adt.otroConjunto.set(0, 1);
		adt.otroConjunto.set(1, 5);
		adt.otroConjunto.set(2, 6);
		adt.otroConjunto.set(3, 9);
		
		System.out.println(adt.esIgual(adt.otroConjunto));
		
		System.out.println(adt.subConjunto(adt.otroConjunto));
		
		adt.union(adt.otroConjunto);
		
		adt.interseccion(adt.otroConjunto);
		
		adt.diferencia(adt.otroConjunto);
		
		adt.toString();
		
	}
}
