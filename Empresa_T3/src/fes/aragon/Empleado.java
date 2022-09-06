package fes.aragon;

public class Empleado {
	private int numEmpleado;
	private String nombre;
	private String paterno;
	private String materno;
	private int hrExtra;
	private double sueldoBase;
	private int anioIngreso;
	public static final double MONTO_H_EXTRA=527.5;
	public static final double PRESTACION_ANT=0.03;
	
	public Empleado(int numEmpleado, String nombre, String paterno, String materno, int hrExtra, double sueldoBase,
			int anioIngreso) {
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.hrExtra = hrExtra;
		this.sueldoBase = sueldoBase;
		this.anioIngreso = anioIngreso;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public int getHrExtra() {
		return hrExtra;
	}

	public void setHrExtra(int hrExtra) {
		this.hrExtra = hrExtra;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", paterno=" + paterno + ", materno="
				+ materno + ", hrExtra=" + hrExtra + ", sueldoBase=" + sueldoBase + ", anioIngreso=" + anioIngreso
				+ "]";
	}
	
	public double calcularSueldo() {
		double prestacion=(2022-this.anioIngreso)*this.PRESTACION_ANT;
		//he=horas extra
		double he=this.hrExtra*this.MONTO_H_EXTRA;
		return this.sueldoBase+prestacion+he;
	}
	
	
	
}
