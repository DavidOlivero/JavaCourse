import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int numeroAleatorio = (int)(Math.random() * 100);
		Scanner entrada = new Scanner(System.in);
		int numeroDeUsuario = 0;
		int numeroDeIntentos = 0;
		
		System.out.println("Adivina el n�mero correcto");
		
		/*while (numeroDeUsuario != numeroAleatorio) {
			
			numeroDeUsuario = entrada.nextInt();
			
			if (numeroAleatorio < numeroDeUsuario) {
				
				System.out.println("M�s bajo");
				numeroDeIntentos++;
				
			} else if (numeroAleatorio > numeroDeUsuario) {
				
				System.out.println("M�s alto");
				numeroDeIntentos++;
				
			}
			
		}*/
		
		// Bucle do while
		
		do {
			
			numeroDeUsuario = entrada.nextInt();
			
			if (numeroAleatorio < numeroDeUsuario) {
				
				System.out.println("M�s bajo");
				numeroDeIntentos++;
				
			} else if (numeroAleatorio > numeroDeUsuario) {
				
				System.out.println("M�s alto");
				numeroDeIntentos++;
				
			}
			
		} while (numeroDeUsuario != numeroAleatorio);
		
		System.out.println("Muy bien el n�mero correcto era " + numeroAleatorio +   ". Tus intentos han sido " + numeroDeIntentos);
		entrada.close();

	}

}
