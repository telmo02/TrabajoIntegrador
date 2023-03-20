package trabajo;

public class Equipo {
	
	String equipo;
	String descripcion;
	
	/**
	 * public Equipo(String equipo, String descripcion) {
		this.setEquipo(equipo);
		this.setDescripcion(descripcion);
	}
	 * 
	 */
	
	public void getInformacion() {
		System.out.println("Equipo="+equipo+ ". Descripcion="+descripcion);
	}
	
	
	
	
	
	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
