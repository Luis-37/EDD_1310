package fes.aragon;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		String nombreLeerArchivoCSV ="C:\\fes_aragon_2022_2\\ED\\EDD_1310\\Redes_Sociales\\Datos\\presenciaredes.csv";
		String nombreEscribirArchivoCSV ="C:\\fes_aragon_2022_2\\ED\\EDD_1310\\Redes_Sociales\\Datos\\presenciaredes1.csv";
		ArrayList<Redes> redes1 = new ArrayList<Redes>();
		LeerCSV f = new LeerCSV(nombreLeerArchivoCSV, nombreEscribirArchivoCSV, redes1);
		f.leerArchivoSCV();
		f.mostrarRedes();
		
		
	}
}
