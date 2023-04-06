package poo;

import javax.swing.JOptionPane;

public class Uso_vehiculo {

	public static void main(String[] args) {
		
		//Coche
		Coche Renault = new Coche(); // Ejemplarizar instanciar o crear un ejemplar de clase
		Renault.estableceColor(JOptionPane.showInputDialog("Introduzca el color del coche"));
		Renault.ConfiguraAsientos(JOptionPane.showInputDialog("¿El coche tiene acientos de cuero(S/N)?"));
		Renault.EstablecerClimatizador(JOptionPane.showInputDialog("¿El coche tiene climatizador(S/N)?"));
		
		System.out.println(Renault.dimeDatosGenerales());
		System.out.println(Renault.dimeColor());
		System.out.println(Renault.dimeConfiguraionDeAsientos());
		System.out.println(Renault.dimeClimatizador());
		System.out.println(Renault.dimeMotor());
		System.out.println(Renault.totalWeight());
		System.out.println("El precio del coche es " + Renault.price());
		
	
		//Furgoneta
		
		Furgoneta Van = new Furgoneta(580, 7);
		Van.estableceColor(JOptionPane.showInputDialog("Introduzca el color de la furgoneta"));
		Van.ConfiguraAsientos(JOptionPane.showInputDialog("¿La furgoneta tiene acientos de cuero(S/N)?"));
		Van.EstablecerClimatizador(JOptionPane.showInputDialog("¿La furgoneta tiene climatizador(S/N)?"));
		
		System.out.println(Van.dimeDatosGenerales() + " " + Van.saydVanData());
		
	}

}
