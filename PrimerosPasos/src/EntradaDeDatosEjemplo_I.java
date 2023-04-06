import java.util.*;

public class EntradaDeDatosEjemplo_I {

    public static void main(String[] args) {

        /* Scanner -> sirve para resivir un valor por medio de la consola
         * La clase Scanner requiere que instanciemos o ejmplarizemos la clase (crear un nuevo objeto de tipo Scanner), para ello usamos la instrucción new
         * Luego debemos usar un método constructor, este recibe como parámetro el lugar de donde extraerá la información en este caso la consola
         * La consola de entrada se especifica como System.in 
         */

        // Scanner
    	Scanner entrada=new Scanner(System.in);
    	
    	System.out.println("Introduce tu nombre, por favor");
    	String username1 = entrada.nextLine();
    	
    	System.out.println("Introduce tue edad, por favor");
    	int yearsOld1 = entrada.nextInt();
    	
    	System.out.println("Saludos " + username1 + ". El año que viene tendras " + (yearsOld1+1) + " años de edad");
    	entrada.close();

    }

}