package fes.aragon;

public class Arreglo {
		public static void main(String[] args) {
			
			Alumno a1=new Alumno();
			Alumno a2=new Alumno();
			Alumno[] a3=new Alumno[2];
			
			a1.setEdad("19");
			a1.setNombre("Luis");
			
			a2.setEdad("20");
			a2.setNombre("Chuy");
			
			a3[0]=a1;
			a3[1]=a2;			
			
			for (int i = 0; i < a3.length; i++) {
				System.out.println(a3.length);
				System.out.println(a3[i]);
			}
			
			
			System.out.println(a1.toString());
			
			
			
		}
		
		
		
	
}
