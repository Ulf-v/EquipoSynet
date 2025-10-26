package Prueba;

public class Paciente {
	private int id;
	private String nombre;
	private int  edad;
	private String sintoma;
	
	public Paciente(int id, String nombre, int edad, String sintoma) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.sintoma = sintoma;
	}
	
	public Paciente() {
		this.id = 0;
		this.nombre = "";
		this.edad = 0;
		this.sintoma = "";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
	
}
