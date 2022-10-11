package fes.aragon;

public class ListaLigadaADT <T> {
	private Nodo<T> head;
	private int tamanio;
	private int referencia;
	
	//constructor vacio
	public ListaLigadaADT(){
		
	}
	
	public boolean estaVacio() {
		return this.head==null;
	}
	
	public int getTamanio() {
		return this.tamanio;
	}
	
	public void agregarAlFinal(T valor) {
		if(this.head==null) {
			head=new Nodo<T>(valor);
		}else {
			Nodo<T> nuevo=new Nodo<T>(valor);
			Nodo<T> aux=this.head;
			while(aux.getSiguiente()!=null) {
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
	}
	
	public void agregarAlInicio(T valor) {
		if(head==null) {
			head=new Nodo<T>(valor);
		}else {
			Nodo<T> nuevo=new Nodo<T>(valor);
			nuevo.setSiguiente(head);
			head=nuevo;
		}
	}
	
	public void agregarDespuesDe(int referencia, T valor) {
		this.referencia=referencia;
		for(int i=0; i<referencia; i++) {
			head.getSiguiente();
		}
		Nodo<T> nuevo= new Nodo<T>(valor);
		head.setSiguiente(nuevo);
	}
	
	public void eliminar(int referencia) {
		//le faltan cosas
		this.referencia=referencia;
		for (int i=0; i<referencia; i++) {
			head.getSiguiente();
		}
		head.setSiguiente(null);
	}
	
	public void eliminarElPrimero() {
		Nodo<T> aux=this.head;
		aux.getSiguiente();
		head=null;
		head=aux;
	}
	
	public void eliminarElFinal() {
		Nodo<T> aux=this.head;
		while(aux.getSiguiente()!=null) {
			aux=aux.getSiguiente();
		}
		aux.setSiguiente(null);
	}
	
	public int buscar(T valor) {
		int posicion=0;
		Nodo<T> aux=this.head;
		while(aux.getSiguiente()==valor) {
			aux=new Nodo<T>(aux.getDato());
			posicion+=1;
		}
		aux.getDato();
		return posicion;
	}
	
	public void actualizar(T datoBuscar, T valor) {
		int posicion;
		posicion=0;
		Nodo<T> aux=this.head;
		while(aux.getDato()==valor) {
			aux=new Nodo<T>(aux.getDato());
			posicion+=1;
		}
		aux.setDato(valor);
		this.head=aux;
	}
	
	public void transversal() {
		Nodo<T> aux=head;
		while(aux!=null) {
			System.out.println(aux);
			aux=aux.getSiguiente();
		}
	}
}
