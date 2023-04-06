import javax.swing.*;

public class EvaluarEmail {

	public static void main(String[] args) {
		
		// Evaluar si una dirección de correo lleva un solo arroba y tiene un punto 
		String email = JOptionPane.showInputDialog("Introduce una dirección de email");
		int arroba = 0;
		boolean punto = false;
		boolean puntoPrincipio = false;
		boolean puntoFinal = false;
				
		for (int i = 0; i < email.length(); i++) {
					
			if (email.charAt(i) == '@') {
						
				arroba++;
						
			}
			
			if (email.charAt(i) == '.') {
				
				punto = true;
				
			}
			
			if (email.charAt(0) == '.') {
				
				puntoPrincipio = true;
				
			}
			
			if (email.charAt(email.length() - 1) == '.') {
				
				puntoFinal = true;
				
			}
					
		}
				
		if (arroba == 1 && punto == true && puntoPrincipio == false && puntoFinal == false) {
					
			System.out.println("La dirección de email es correcta");
					
		} else {
			
			System.out.println("La dirección de email no es válida");
			
		}

	}

}
