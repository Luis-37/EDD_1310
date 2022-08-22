package fes.aragon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerCSV {
	
	private String nombreLeerArchivoCSV;
	private String nombreEscribirArchivoCSV;
	private ArrayList<Redes> redes1;
	
	public LeerCSV(String nombreLeerArchivoCSV, String nombreEscribirArchivoCSV, ArrayList<Redes> redes1) {
		this.nombreLeerArchivoCSV = nombreLeerArchivoCSV;
		this.nombreEscribirArchivoCSV = nombreEscribirArchivoCSV;
		if(redes1==null) 
		{
			this.redes1 = new ArrayList<Redes>();
		}
		else {
			this.redes1=redes1;
		}
	}
	
	public void mostrarRedes() {
		for(Redes a: this.redes1) {
			System.out.println(a.toString());
		}
	}
	
	
	public String getNombreLeerArchivoCSV() {
		return nombreLeerArchivoCSV;
	}




	public void setNombreLeerArchivoCSV(String nombreLeerArchivoCSV) {
		this.nombreLeerArchivoCSV = nombreLeerArchivoCSV;
	}




	public String getNombreEscribirArchivoCSV() {
		return nombreEscribirArchivoCSV;
	}




	public void setNombreEscribirArchivoCSV(String nombreEscribirArchivoCSV) {
		this.nombreEscribirArchivoCSV = nombreEscribirArchivoCSV;
	}




	public ArrayList<Redes> getRedes1() {
		return redes1;
	}




	public void setRedes1(ArrayList<Redes> redes1) {
		this.redes1 = redes1;
	}

	


	public void leerArchivoSCV() {
		FileReader fr;
		try {
			fr=new FileReader(this.nombreLeerArchivoCSV);
			String linea="";
			BufferedReader br = new BufferedReader(fr);
			while((linea = br.readLine()) !=null) {
				String [] datoslinea=linea.split(",");
				String RedSocial = datoslinea[0].trim();
				String Concepto = datoslinea[1].trim();
				String anio = datoslinea[2].trim();
			    String enero = datoslinea[3].trim();
				String febrero = datoslinea[4].trim();
				String marzo = datoslinea[5].trim();
				String abril = datoslinea[6].trim();
				String mayo = datoslinea[7].trim();
				String junio = datoslinea[8].trim();
				String julio = datoslinea[9].trim();
				String agosto = datoslinea[10].trim();
				String septiembre = datoslinea[11].trim();
				String octubre = datoslinea[12].trim();
				String noviembre = datoslinea[13].trim();
				String diciembre = datoslinea[14].trim();
				Redes a = new Redes(RedSocial, Concepto, anio, enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre);
				this.redes1.add(a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
}
