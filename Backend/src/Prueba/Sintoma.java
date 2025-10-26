package Prueba;

public class Sintoma {
	private  String nombre;
	private String descripcion;
	private String codigo;
	private String especialidad;
	
	public Sintoma(String nombre, String descripcion, String codigo, String especialidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.especialidad = especialidad;
	}
	
	public Sintoma() {
		this.nombre = "";
		this.descripcion = "";
		this.codigo = "";
		this.especialidad = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
