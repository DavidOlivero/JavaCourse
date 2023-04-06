package poo;

public class Furgoneta extends Coche {

	private int capacidadCarga;
	private int plazasExtras;
	
	public Furgoneta(int capacidadCarga, int plazasExtras) {
		
		super(); // call the constructor of the parent class
		
		this.capacidadCarga = capacidadCarga;
		this.plazasExtras = plazasExtras;
				
	}
	
	
	public String saydVanData() {
		
		return "La capacidad de carga es de: " + capacidadCarga + " y las plazas son: " + plazasExtras;
		
	}
	
}
