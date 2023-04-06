import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		
		// Solo acceder si el usuario acierta la contraseña
		String password = "daviniel2010*";
		String userPassword = "";
		
		while (userPassword.equals(password) == false) {
			
			userPassword = JOptionPane.showInputDialog("Ingrese la contraseña para ingresar");
			
			if (userPassword.equals(password) == false) {
			
				System.out.println("La contraseña es incorrecta inténtalo de nuevo");
				
			}
		}
		
		System.out.println("¡Bienvenido a la aplicación!!");
		
	}

}
