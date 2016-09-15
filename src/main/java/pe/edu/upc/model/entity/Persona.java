package pe.edu.upc.model.entity;

public class Persona {
	private String DNI;
	private String Nombre;
	private String Genero;
	
	private GrupoVotacion oGrupo;//Ref a GrupoVotacion

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public GrupoVotacion getoGrupo() {
		return oGrupo;
	}

	public void setoGrupo(GrupoVotacion oGrupo) {
		this.oGrupo = oGrupo;
	}
	
	
	
}
