
public class Electrodomestico {

	// ATRIBUTOS

	private double precio_base = 0;
	private String color;
	private String consumo_energetico;
	private double peso = 0;

	private String letras[] = { "A", "B", "C", "D", "E", "F" };
	private String colores[] = { "NEGRO", "BLANCO", "GRIS", "AZUL", "ROJO" };

	// VALOR POR DEFECTO DE LOS ATRIBUTOS

	private final double PRECIO_DEF = 100;
	private final String COLOR_DEF = "BLANCO";
	private final String CONSUM_DEF = "F";
	private final double PESO_DEF = 5;

	// CONSTRUCTORES

	// Constructor por defecto
	
	public Electrodomestico() {
		this.precio_base=0;
		this.color = COLOR_DEF;
		this.consumo_energetico = CONSUM_DEF;
		this.peso = PESO_DEF;
	
	}

	// Constructor con precio y peso. El resto por defecto
	
	public Electrodomestico(double precio_base,  double peso) {
		this.precio_base = precio_base;
		this.color = COLOR_DEF;
		this.consumo_energetico = CONSUM_DEF;
		this.peso = peso;
	}

	// Constructor con todos los atributos

	public Electrodomestico(double precio_base, String color, String consumo_energetico, double peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;

	}
}
