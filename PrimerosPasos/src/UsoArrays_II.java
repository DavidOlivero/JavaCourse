//import javax.swing.JOptionPane;

public class UsoArrays_II {

	public static void main(String[] args) {
		
		//String [] paises = new String[7];
		
		/*paises[0] = "Colombia";
		paises[1] = "Venezuela";
		paises[2] = "Espanña";
		paises[3] = "Argentina";
		paises[4] = "México";
		paises[5] = "Uruguay";
		paises[6] = "Estados Unidos";*/
		
		//String [] paises = {"Colombia", "Venezuela", "España", "Argentina", "México" , "Uruguay", "Estados unidos"};
		
		/*for (int i = 0; i < paises.length; i++) {
			
			System.out.println("País " + (i + 1) + " " + paises[i]);
			
		}*/

		/*int i = 1;
		for (String item:paises) {
			
			paises[(i - 1)] = JOptionPane.showInputDialog("Introduce el país " + i);
			i++;
			
			
		}*/

		int [] numeros = new int[150];
		
		int i = 0;
		for (int item:numeros) {
			
			numeros[i] = (int) Math.round(Math.random() * 100);
			i++;
			
		}
		
		//For each
		int x = 1;
		for (int elemento:numeros) {
			
			System.out.println("El número en el índice " +  + x + " = " + elemento);
			x++;
			
		}

	}

}
