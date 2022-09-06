package fes.aragon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NominaADT {
	String nombreCompania;
	Arreglo<Empleado> nomina;
	String rutaArchivo;
	
	
	public NominaADT(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
		String linea=" ";
		try {
			BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
			linea=br.readLine();
			
			while(linea !=null) {
				String datos[]=linea.split(",");
				int numEmpleado=Integer.parseInt(datos[0]);
				String nombre=datos[1].trim();
				String paterno=datos[2].trim();
				String materno=datos[3].trim();
				int hrExtra=Integer.parseInt(datos[4]);
				double sueldoBase=Double.parseDouble(datos[5]);
				int anioIngreso=Integer.parseInt(datos[6]);
				Empleado a=new Empleado(numEmpleado, nombre, paterno, materno, hrExtra, sueldoBase, anioIngreso);
				//esto esta bien?
				a.setNumEmpleado(numEmpleado);
				a.setNombre(nombre);
				a.setPaterno(paterno);
				a.setMaterno(materno);
				a.setHrExtra(hrExtra);
				a.setSueldoBase(sueldoBase);
				a.setAnioIngreso(anioIngreso);
				//me da error de que no lee datos
				this.nomina.datos.add(a);
				
				System.out.println(linea);
				linea=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			//catch para reader
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			//catch para readline
		}
		
	}
	
	public void calcularSueldo() {
		for(int i=0; i<nomina.getLongitud() ;i++) {
			System.out.println(nomina.getElemento(i));
			System.out.println(nomina.getElemento(i).calcularSueldo());
		}
	}
	
	public void obtener_MAX_MIN() {
		int min=299;
		int max=0;
		Empleado trabMAX = null;
		Empleado trabMIN = null;
		
		//error en nomina? que va? 
		for (Empleado t : nomina.datos) {
			if(t.getAnioIngreso()>max) {
				max=t.getAnioIngreso();
				trabMAX=t;
			}
			if(t.getAnioIngreso()<min) {
				min=t.getAnioIngreso();
				trabMIN=t;
			}
			
			System.out.println(trabMAX);
			System.out.println(trabMIN);
		}
		
		
	}
	
	
	
}
	
	