package poo;


// Coche es el objeto en com�n
public class Coche {
	
	// Caracter�sticas en comun de todos los objetos coche
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	// Caracter�sticas que van a cambiar dependiendo del objeto
	private String color;
	private int peso_total;
	private boolean asientosCuero;
	private boolean climatizador;
	
	// M�todo constructor = dar estado inicial a la clase, es decir iniciar las variables
	public Coche() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		
	}
	
	// Debido a que las propiedades del objeto Coche no son accesibles al la clase Uso_Coche se deben usar los m�todos para comunicar las dos clases entre
	// si
	
	/* M�todo getter: Muestra las propiedades de un objetos
	 * Sintaxis: public tipoDeDatoADevolver nombreDelMetodo() {c�digo; return}
	 */
	
	/* M�todo setter: Modifica las propiedades de un objetos
	 * Sintaxis: public void nombreDelMetodo() {c�digo}
	 */
	
	// M�todo getter
	public String dimeDatosGenerales() {
		
		return "La plataforma del veh�culo tiene " + ruedas + " ruedas. Mide " + largo/1000 + " metros con un ancho de " + ancho  + " cm y un peso de "
				+ peso_plataforma + " kg.";
		
	}
	
	//M�todo setter
	public void estableceColor(String colorCoche) {
		
		color = colorCoche;
		
	}
	
	public String dimeColor() {
		
		return "El coche es de color " + color + ".";
		
	}
	
	public void ConfiguraAsientos(String asientosCuero) {
		
		//this.asientosCuero = asientosCuero; -> el this se usa para hacer referencia a las variables de clase
		if (asientosCuero.equalsIgnoreCase("S")) {
			
			this.asientosCuero = true;
			
		} else {
			
			this.asientosCuero = false;
			
		}
		
	}
	
	public String dimeConfiguraionDeAsientos() {
		
		if (asientosCuero) {
			
			return "El coche tiene asientos de cuero.";
			
		} else {
			
			return "El coche tiene asientos de serie.";
			
		}
		
	}
	
	public void EstablecerClimatizador(String climatizador) {
		
		if (climatizador.equalsIgnoreCase("S")) {
			
			this.climatizador = true;
			
		} else {
			
			this.climatizador = false;
			
		}
		
	}
	
	public String dimeClimatizador() {
		
		if (climatizador) {
			
			return "El coche tiene climatizador.";
			
		} else {
			
			return "El choche tiene aire acondicionado.";
			
		}
		
	}
	
	public String dimeMotor() {
		
		return "El motor del coche tiene una capacidad de " + motor + " metros c�bicos.";
		
	}
	
	public String totalWeight() {
		
		int pesoCarroceria = 500;
		peso_total = peso_plataforma + pesoCarroceria;
		
		if (asientosCuero && climatizador) {
			
			peso_total += 70;
			
		}
		
		return "El peso del coche es " + peso_total + " kg";
		
	}
	
	public int price() {
		
		int finishedPrice = 10000;
		
		if (asientosCuero && climatizador) {
			
			finishedPrice += 3500;
			
		}
		
		return finishedPrice;
		
	}
	
}













