package fes.aragon;

import java.io.Serializable;
import java.util.Objects;

public class Redes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4686650863743924989L;
	private String RedSocial;
	private String Concepto;
	private String anio;
	private String enero;
	private String febrero;
	private String marzo;
	private String abril;
	private String mayo;
	private String junio;
	private String julio;
	private String agosto;
	private String septiembre;
	private String octubre;
	private String noviembre;
	private String diciembre;
	
	public Redes(String redSocial, String concepto, String anio, String enero, String febrero, String marzo, String abril,
			String mayo, String junio, String julio, String agosto, String septiembre, String octubre, String noviembre, String diciembre) {
		RedSocial = redSocial;
		Concepto = concepto;
		this.anio = anio;
		this.enero = enero;
		this.febrero = febrero;
		this.marzo = marzo;
		this.abril = abril;
		this.mayo = mayo;
		this.junio = junio;
		this.julio = julio;
		this.agosto = agosto;
		this.septiembre = septiembre;
		this.octubre = octubre;
		this.noviembre = noviembre;
		this.diciembre = diciembre;
	}

	
	//En esto tengo duda
		@Override
		public int hashCode() {
			return Objects.hash(Concepto, RedSocial);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Redes other = (Redes) obj;
			return Objects.equals(Concepto, other.Concepto) && Objects.equals(RedSocial, other.RedSocial);
		}
	
	
	public String getRedSocial() {
		return RedSocial;
	}

	public void setRedSocial(String redSocial) {
		RedSocial = redSocial;
	}

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getEnero() {
		return enero;
	}

	public void setEnero(String enero) {
		this.enero = enero;
	}

	public String getFebrero() {
		return febrero;
	}

	public void setFebrero(String febrero) {
		this.febrero = febrero;
	}

	public String getMarzo() {
		return marzo;
	}

	public void setMarzo(String marzo) {
		this.marzo = marzo;
	}

	public String getAbril() {
		return abril;
	}

	public void setAbril(String abril) {
		this.abril = abril;
	}

	public String getMayo() {
		return mayo;
	}

	public void setMayo(String mayo) {
		this.mayo = mayo;
	}

	public String getJunio() {
		return junio;
	}

	public void setJunio(String junio) {
		this.junio = junio;
	}

	public String getJulio() {
		return julio;
	}

	public void setJulio(String julio) {
		this.julio = julio;
	}

	public String getAgosto() {
		return agosto;
	}

	public void setAgosto(String agosto) {
		this.agosto = agosto;
	}

	public String getSeptiembre() {
		return septiembre;
	}

	public void setSeptiembre(String septiembre) {
		this.septiembre = septiembre;
	}

	public String getOctubre() {
		return octubre;
	}

	public void setOctubre(String octubre) {
		this.octubre = octubre;
	}

	public String getNoviembre() {
		return noviembre;
	}

	public void setNoviembre(String noviembre) {
		this.noviembre = noviembre;
	}

	public String getDiciembre() {
		return diciembre;
	}

	public void setDiciembre(String diciembre) {
		this.diciembre = diciembre;
	}


	@Override
	public String toString() {
		return "Redes [RedSocial=" + RedSocial + ", Concepto=" + Concepto + ", anio=" + anio + ", enero=" + enero
				+ ", febrero=" + febrero + ", marzo=" + marzo + ", abril=" + abril + ", mayo=" + mayo + ", junio="
				+ junio + ", julio=" + julio + ", agosto=" + agosto + ", septiembre=" + septiembre + ", octubre="
				+ octubre + ", noviembre=" + noviembre + ", diciembre=" + diciembre + "]";
	}


	
	
	
	
}
