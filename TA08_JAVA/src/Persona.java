
public class Persona {

	//Crear atributos nombre, edad, DNI, sexo (hombre por defecto), peso y altura
	
	
	//Atributos:
	
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;
	
	
	//Constructores:
	
	//Constructor por defecto:
	
	public Persona(String dni) {
		
		this.nombre="";
		this.edad=0;
		this.dni=dni;
		this.sexo="H";
		this.peso=0;
		this.altura=0;
	}

	//Constructor con 3 parametros (DNI, PESO Y ALTURA por defecto)
	
	public Persona(String nombre, int edad, String dni, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	
	//Constructor con todos los atributos por parametro

	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
}
