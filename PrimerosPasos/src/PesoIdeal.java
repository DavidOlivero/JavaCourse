import javax.swing.*;

public class PesoIdeal {

	public static void main(String[] args) {
		
		// Peso ideal de un hombre -> altura - 110
		// Peso ideal de una mujer -> altura - 120
		
		String genero = "";
		int altura;
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduce tu género (M/F)");
			
		} while (genero.equalsIgnoreCase("M") == false && genero.equalsIgnoreCase("F") == false);
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu estatura en centímetros"));
		
		if (genero.equalsIgnoreCase("m")) {
			
			System.out.println("Tu peso ideal es " + (altura - 110) + "kg");
			
		} else {
			
			System.out.println("Tu peso ideal es " + (altura - 120) + "kg");
			
		}

	}

}
