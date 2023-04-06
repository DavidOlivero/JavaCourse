
public class OperadoresLogicos {

	public static void main(String[] args) {
		
		/* Los operadores son:
		 * Aritm�ticos:
		 * 	+ -> suma
		 *  - -> resta
		 *  * -> multiplicaci�n
		 *  / -> divisi�n
		 * L�gicos Relacionales boobleanos:
		 * 	> -> mayor que
		 * 	> -> menor que
		 * 	<> -> mayor o menor que
		 *	== -> igual que
		 *	>= -> mayor o igual que
		 *	<= -> menos o igual que
		 *	!= -> diferente a
		 *	&& -> y l�gico
		 *	|| -> o l�gico
		 * Incremento y decremento:
		 * 	++ -> incrementar en 1
		 * 	-- -> decrementar en 1
		 * 	+= n� -> incrementar en un n�mero
		 * 	-= n� -> decrementar en un n�mero
		 * Concatenaci�n
		 * 	+ -> unir
		 */
		
		// Ejemplo
		
		int a = 7;
		int b;
		b = 5;
		
		int c = a+b; // Sumando la variable a + b
		System.out.println(c); // Mostrar resultado
		
		c++; // Incrementar la variable c en 1
		System.out.println(c); // Mostrar resultado
		
		c += 6; // Incrementar la variable c en 6
		System.out.println(c); // Mostrar resultado
		
		c -= 6; // Decrementar la variable c en 6
		System.out.println(c); // Mostrar resultado
		
		c = a/b; // Dividir a entre c
		System.out.println(c); /* Mostrar resultado (no muestra el resultado decimal 1,4 porque c es una variable
								entera)*/

	}

}
