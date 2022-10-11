package fes.aragon;

public class Main {
	public static void main(String[] args) {
		ListaLigadaADT<Integer> head=new ListaLigadaADT();
		System.out.println(head.estaVacio());
		System.out.println(head.getTamanio());
		head.agregarAlFinal(20);
		head.agregarAlFinal(30);
		head.agregarAlFinal(10);
		head.agregarAlInicio(40);
		System.out.println(head.estaVacio());
		head.agregarDespuesDe(30, 3);
		head.eliminarElPrimero();
		head.eliminar(3);
		head.eliminarElFinal();
		System.out.println(head.buscar(20));
		head.actualizar(40, 50);
		head.toString();
	}
}
