public class ClaseString_II {

    public static void main(String[] args) {

        // Método substring -> se le dave pasar la posición del primer carácter a mostrar y la posición
        // del caracter que no queremos mostrar
        String frase = "Hoy es un lindo día para aprender a programar en Java";
        String fraseExtraida = frase.substring(25, 53);
        System.out.println(fraseExtraida);

        // Otro ejemplo
        String fraseExtraida2 = frase.substring(0, 25) + "irnos a la playa y relajarnos";
        System.out.println(fraseExtraida2);

        // Método equals -> evalúa si dos cadenas son iguales
        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "David";
        System.out.println(alumno1.equals(alumno2));

        String alumno3, alumno4;
        alumno3 = "Juán";
        alumno4 = "Felipe";
        System.out.println(alumno3.equals(alumno4));

        // Método equalsIgnoreCase -> evalúa si dos cadenas son iguales sin importar las mayúsculas
        String alumno5, alumno6;
        alumno5 = "Daniel";
        alumno6 = "daniel";
        System.out.println(alumno5.equalsIgnoreCase(alumno6));

    }
    
}
