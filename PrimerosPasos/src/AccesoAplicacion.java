import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		
		// Solo acceder si el usuario acierta la contrase�a
		String password = "daviniel2010*";
		String userPassword = "";
		
		while (userPassword.equals(password) == false) {
			
			userPassword = JOptionPane.showInputDialog("Ingrese la contrase�a para ingresar");
			
			if (userPassword.equals(password) == false) {
			
				System.out.println("La contrase�a es incorrecta int�ntalo de nuevo");
				
			}
		}
		
		System.out.println("�Bienvenido a la aplicaci�n!!");
		
	}

}
