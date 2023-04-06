import javax.swing.*;

public class EntradaNumero {

    public static void main(String[] args) {

        // Formatear valores decimales para controlar cuantos decimales se mostrarán
        double number = 10000.0;
        System.out.printf("%1.2f", number/3);

        //Ejemplo 2:
        String number2 = JOptionPane.showInputDialog("Introduce un número");
        double number3 = Double.parseDouble(number2);
        System.out.println(number3);
        System.out.print("La raíz cuadrada de " + number3 + " es ");
        System.out.printf("%1.2f", Math.sqrt(number3));

    }
    
}
