
public class OperadoresLogicos {

	public static void main(String[] args) {
		
		/* Los operadores son:
		 * Aritméticos:
		 * 	+ -> suma
		 *  - -> resta
		 *  * -> multiplicación
		 *  / -> división
		 * Lógicos Relacionales boobleanos:
		 * 	> -> mayor que
		 * 	> -> menor que
		 * 	<> -> mayor o menor que
		 *	== -> igual que
		 *	>= -> mayor o igual que
		 *	<= -> menos o igual que
		 *	!= -> diferente a
		 *	&& -> y lógico
		 *	|| -> o lógico
		 * Incremento y decremento:
		 * 	++ -> incrementar en 1
		 * 	-- -> decrementar en 1
		 * 	+= n° -> incrementar en un número
		 * 	-= n° -> decrementar en un número
		 * Concatenación
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
