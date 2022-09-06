package fes.aragon;

public class Main {
	public static void main(String[] args) {
		NominaADT n=new NominaADT("C:\\fes_aragon_2022_2\\ED\\EDD_1310\\Empresa_T3\\Datos\\junio.dat");
		n.obtener_MAX_MIN();
		n.calcularSueldo();
		
	}
}
