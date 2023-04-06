import javax.swing.*;

public class FactorialNumero {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		long factorial = 1l;
		
		for (int i = numero; i > 0; i--) {
			
			factorial = factorial * i;
			
		}
		
		System.out.println("El factorial de " + numero + " es " + factorial);

	}

}
