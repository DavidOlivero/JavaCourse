import java.util.*;

public class EntradaDeDatosEjemplo_I {

    public static void main(String[] args) {

        /* Scanner -> sirve para resivir un valor por medio de la consola
         * La clase Scanner requiere que instanciemos o ejmplarizemos la clase (crear un nuevo objeto de tipo Scanner), para ello usamos la instrucci�n new
         * Luego debemos usar un m�todo constructor, este recibe como par�metro el lugar de donde extraer� la informaci�n en este caso la consola
         * La consola de entrada se especifica como System.in 
         */

        // Scanner
    	Scanner entrada=new Scanner(System.in);
    	
    	System.out.println("Introduce tu nombre, por favor");
    	String username1 = entrada.nextLine();
    	
    	System.out.println("Introduce tue edad, por favor");
    	int yearsOld1 = entrada.nextInt();
    	
    	System.out.println("Saludos " + username1 + ". El a�o que viene tendras " + (yearsOld1+1) + " a�os de edad");
    	entrada.close();

    }

}