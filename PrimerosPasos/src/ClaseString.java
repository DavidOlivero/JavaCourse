public class ClaseString {

    public static void main(String[] args) {

        /* La clase String sirve para manipular cadenas de caracterestiene varios métodos como:
         * length() -> devuelve la longitud de una cadena de carácteres
         * charAt(n) -> devuelve el caracter que se encuentra en la posición dada
         * substring(x, y) -> devuelve una subcadena con los caracteres substraidos en las posociones dadas
         * equals(cadena) -> evalúa si dos cadenas de caracteres son iguales devuelve un dato boolean
         * equalsIgnoreCase(cadena) -> igual al anterior pero no tiene en cuenta la mayúsculas ni minúsculas 
         */

        // Definir un objeto de la clase String
        String name = "David";
        System.out.println("Mi nombre es " + name);

        // Método length()
        System.out.println("Mi nombre tiene " + name.length() + " letras.");

        // Método charAt
        System.out.println("La primera letra de mi nombre es " + name.charAt(0));

        // Para que me devuelva la última letra de cualquier número
        System.out.println("La última letra de " + name  + " es la " + name.charAt(name.length()-1));

        // Segunda forma
        int ultimaLetra;
        ultimaLetra = name.length()-1;
        System.out.println("La última letra de " + name  + " es la " + name.charAt(ultimaLetra));

    }
    
}
