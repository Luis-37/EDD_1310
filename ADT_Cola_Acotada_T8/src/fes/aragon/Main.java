package fes.aragon;

public class Main {
	public static void main(String[] args) {
		ColaAcotadaADT<String> colas=new ColaAcotadaADT(5);
		
		System.out.println(colas.isEmpty());
		System.out.println(colas.getLenght());
		
		colas.enqueue("Luis", 1);
		colas.enqueue("Jesus", 1);
		colas.enqueue("Chucho", 1);
		
		System.out.println("----------------------");
		
		System.out.println(colas.isEmpty());
		System.out.println(colas.getLenght());
		System.out.println("----------------------");
		System.out.println(colas.toString());
		
		colas.dequeue();
		System.out.println(colas.toString());
	}
}
