
public class Password {

	// Atributos:

	private static int longitud;
	private String contraseña;

	// Constructores:

	// Constructor por defecto
	public Password() {

		this.longitud = 8;
		this.contraseña = contraseña;
	}

	// Constructor
	public Password(int longitud, String contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	// Generador de contraseña con longitud definida

	public static String genPasswd(int longitud) {
		String resultado="";
		String alfanum = "012345ABCDEabcde";

		for (int i = 0; i < longitud; i++) {
			resultado += alfanum.charAt((int) Math.floor(Math.random() * alfanum.length()));
		}
		return resultado;
	
	}
}
