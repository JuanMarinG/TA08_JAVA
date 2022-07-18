
public class Password {

	
	//Atributos:
	
		private int longitud;
		private String contraseña;
		
		
	//Constructores:
		
	//Constructor por defecto:
	
		public Password() {
			
			this.longitud =8;
			this.contraseña = "";}
		
	//Constructor con longitud aplicada. Genera contraseña aleatoria con longitud definida
		
		public Password(int longitud, String contraseña) {
			
			this.longitud = longitud;
			this.contraseña = contraseña;}

		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		
		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		@Override
		public String toString() {
			return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
		}

		
		  
		 public String generador() {
			 String caracteres="ab157_?!";
			 
			 String num=Math.floor(Math.random()*(8+1);
		
			 return num;
		 }
}
		



		
		
		
		 
	
		
		
	
		
		
			

