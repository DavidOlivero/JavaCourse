
public class OperacionesConMath {

	public static void main(String[] args) {
		
		/* Algunos métodos de la clase Math:
		 * Math.sqrt(n) -> raíces cuadradas
		 * Math.pow(base, exponente) -> potencia de un número
		 * Math.sin(ángulo) -> calcula el seno de un ángulo
		 * Math.tan(ángulo) -> calcula la tangente de un ángulo
		 * Math.atan(ángulo) -> calcula la cotangente de un ángulo
		 * Math.round(decimal) -> redondea un decimal
		 * Math.PI -> constante de clase PI  
		 */
		
		// Raíz cuadrada de un número
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
		
		// Redondear un decimal priemara forma -> recibe un float y devuelve un int
		float num1 = 89.90f;
		int num2 = Math.round(num1);
		System.out.println(num2);
		
		// Redondear un decimal segunda forma -> recibe un double y devuelve un long
		double num3 = 7.89;
		long num4 = Math.round(num3);
		System.out.println(num4);

		// Refundición -> conciste tranformar un valor a otro, pra ello se coloca entre paréntesis el 
		//valor a que se quiere convertir
		double num5 = 7.89;
		int num6 = (int)Math.round(num5);
		System.out.println(num6);

		// Potenciacias -> pow recibe dos datos double como base y exponente y devuelve un double
		double base = 67;
		double exponente = 3;
		double resultado = Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);

		// Potencias con refundición
		double base2 = 67;
		double exponente2 = 3;
		int resultado2 = (int)Math.pow(base2, exponente2);
		System.out.println("El resultado de " + base2 + " elevado a " + exponente2 + " es " + 
						  resultado2);
		
	}

}
