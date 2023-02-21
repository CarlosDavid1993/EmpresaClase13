

package prevencion;
/*@author carlos carrasco
@version21-02-2023 */
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
	//metodo get para nombre
	public String getNombre() {
		return nombre;
	}
	
	//metodo set para establecer fecha nacimiento
	public void SetFecha_nacimiento (String fechaNacimiento) {
		this.fecha_nacimiento = fechaNacimiento;
	}
	
	//metodo get para fecha nacimiento
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	//metodo set para establecer rut
	public void SetRut (int rut) {
		this.rut = rut;
	}
	
	//metodo get para rut 
	public int getRut() {
		return rut;
	}

	@Override 
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", rut=" + rut + "]";
	}
	
	
}
