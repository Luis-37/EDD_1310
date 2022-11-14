package fes.aragon;

public class Main {
	public static void main(String[] args) {
		StrackADT<String> ref=new StrackADT();
		
		System.out.println(ref.isEmpty());
		System.out.println(ref.getLenght());
		
		ref.push("angel");
		ref.push("Luis");
		ref.push("Jesus");
		
		System.out.println(ref.isEmpty());
		System.out.println(ref.getLenght());
		System.out.println("----------------------");
		System.out.println(ref.toString());
		
	}
}
