/**
 * 
 */

/**
 * @author César Moro García
 * @version 2022.04.22
 *
 */
public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 */
	public Alumno(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
}
