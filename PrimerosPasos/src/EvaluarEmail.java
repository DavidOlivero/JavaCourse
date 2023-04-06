import javax.swing.*;

public class EvaluarEmail {

	public static void main(String[] args) {
		
		// Evaluar si una direcci�n de correo lleva un solo arroba y tiene un punto 
		String email = JOptionPane.showInputDialog("Introduce una direcci�n de email");
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
					
			System.out.println("La direcci�n de email es correcta");
					
		} else {
			
			System.out.println("La direcci�n de email no es v�lida");
			
		}

	}

}
