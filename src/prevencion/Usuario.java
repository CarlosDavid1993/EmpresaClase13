package prevencion;

public class Usuario {

	private String nombre;
	private String fecha_nacimiento;
	private int rut;
	
	//constructor sin parametros
	public Usuario() {
		
	}
	
	//constructor 
	public Usuario(String nombre, String fecha_nacimiento, int rut) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.rut = rut;
		
	}
	//metodo set para establecer nombre
	public void SetNombre (String nombre) {
		this.nombre = nombre;
	}
	
	//metodo set para establecer fecha nacimiento
	private void SetFecha_nacimiento (String fechaNacimiento) {
		this.fecha_nacimiento = fechaNacimiento;
	}
	
	//metodo set para establecer rut
	private void SetRut (int rut) {
		this.rut = rut;
	}

	@Override 
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", rut=" + rut + "]";
	}
	
	
}
