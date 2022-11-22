package fes.aragon;

public class Main {
	public static void main(String[] args) {
		ColasADT<String> col=new ColasADT();
		
		System.out.println(col.isEmpty());
		System.out.println(col.getLenght());
		
		col.enqueue("luis");
		col.enqueue("Angel");
		col.enqueue("jesus");
		
		System.out.println("----------------------");
		
		System.out.println(col.isEmpty());
		System.out.println(col.getLenght());
		System.out.println("----------------------");
		System.out.println(col.toString());
		
		col.dequeue();
		System.out.println(col.toString());
		
	}
}
