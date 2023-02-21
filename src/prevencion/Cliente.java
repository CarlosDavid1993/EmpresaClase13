

package prevencion;
/* @author david morales
 * @version 21-02-2023 */
public class Cliente {

	private int rut;
	private String nombres;
	private String apellidos;
	private String teléfono;
	private String afp;
	private int sistemaSalud;
	private String comuna;
	private int edad;
	

	
	//constructor sin parametros
	public Cliente() {

	}
	
	//constructor parametros
	public Cliente(int rut, String nombres, String apellidos, String teléfono, String afp, int sistemaSalud,
			String comuna, int edad) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.teléfono = teléfono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.comuna = comuna;
		this.edad = edad;
	}


	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", teléfono=" + teléfono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", comuna=" + comuna + ", edad=" + edad + "]";
	}



}
