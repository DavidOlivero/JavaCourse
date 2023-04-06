import java.util.*;

public class Condicionales {
    
    public static void main(String[] args) {

        /*
         *Pedir La edad al usuario
         *Evaluar si la edad introducida es mayor igual a 18, si la condición se cumple se mostrará el mensaje eres mayor de edad en la consola
         *Si la condición no se cumple mostrar el mensaje no eres mayor de edad 
         */
    	
    	Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tue edad, por favor");
        int edad = entrada.nextInt();
        
        if(edad >= 18) {
        	System.out.println("Eres mayor de edad");
        } else {
        	System.out.println("No eres mayor de edad");
        }
        
        if(edad >= 11 && edad < 18) {
        	
        	System.out.println("Eres adolescente");
        	
        } else if(edad >= 18 && edad <= 40) {
        	
        	System.out.println("Eres Joven");
        	
        } else if(edad > 40 && edad <=60) {
        	
        	System.out.println("Eres Maduro");
        	
        } else if(edad > 60) {
        	
        	System.out.println("Eres de la tercera edad");
        	
        } else {
        	
        	System.out.println("Eres un niño que haces acá");
        	
        }
        
        entrada.close();

    }

}
