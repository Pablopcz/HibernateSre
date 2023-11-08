package entidades_sre;


public class Login {   //En esta línea, la primera palabra reservada, public, es un modificador de acceso//

	
	// Atributtos caracterísiticas individuales que diferencian un objeto de otro//
	private int UsuarioCodigo;
	private String SeleccionarInstitucion;
	private String Contraseña;
	
	
	
	/*El constructor sin parámetros es llamado constructor vacío. Si no 
	 * se define ningún constructor, el compilador crea un constructor por defecto
	 */
	
	public Login() {  
	
	}

	public Login(String seleccionarInstitucion, String contraseña) {
		super();
		SeleccionarInstitucion = seleccionarInstitucion;
		Contraseña = contraseña;
	}

	
	/*set y get son utilizados para establecer y obtener los valores de las variables 
	de una clase de manera controlada, evitando que los valores sean modificados directamente 
	desde fuera de la clase*/
	
	public int getUsuarioCodigo() {
		return UsuarioCodigo;
	}

	public void setUsuarioCodigo(int usuarioCodigo) {
		UsuarioCodigo = usuarioCodigo;
	}

	public String getSeleccionarInstitucion() {
		return SeleccionarInstitucion;
	}

	public void setSeleccionarInstitucion(String seleccionarInstitucion) {
		SeleccionarInstitucion = seleccionarInstitucion;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	
	/*String toString te devuelve una representación en cadena de texto del objeto sobre el 
	 * cual lo invoques. Es muy útil cuando quieres devolver 
	 */
	
	@Override
	public String toString() {
		return "Login [UsuarioCodigo=" + UsuarioCodigo + ", SeleccionarInstitucion=" + SeleccionarInstitucion
				+ ", Contraseña=" + Contraseña + "]";
	}
	
	
		
}
