public class Serie {

	
	//ATRIBUTOS
	
	private String titulo;
	private int num_temp;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//ATRIBUTOS PÒR DEFECTO
	
	private final int NUM_TEMP_DEF=3;
	private final boolean ENTREGADO_DEF=false;
	
	
	//CONSTRUCTORES
	
	//Constructor por defecto
	
	public Serie() {
		this.titulo ="";
		this.num_temp = NUM_TEMP_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero ="";
		this.creador ="";
	}
	
	//Constructor con titulo y creador. El resto por defecto.
	
	public Serie( int num_temp, boolean entregado, String genero) {

		this.titulo = titulo;
		this.num_temp = NUM_TEMP_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = genero;
		this.creador = creador;
	}
	
	//Constructor con todos los atributos, excepto entregado.
	
	public Serie(String titulo, int num_temp, String genero, String creador) {
		this.titulo = titulo;
		this.num_temp = num_temp;
		this.genero = genero;
		this.creador = creador;
	}
}
