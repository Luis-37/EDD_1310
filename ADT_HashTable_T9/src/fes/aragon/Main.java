package fes.aragon;

public class Main {
	public static void main(String[] args) {
		HashTableADT<String> hash=new HashTableADT(6);
		hash.add(1, "Luis");
		hash.add(2, "Jesus");
		hash.remove("Luis");
		System.out.println(hash.valueOf(1));
		
	}
}
