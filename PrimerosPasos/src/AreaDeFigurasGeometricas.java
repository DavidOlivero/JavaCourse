import java.util.*;
import javax.swing.*;

public class AreaDeFigurasGeometricas {

    public static void main(String[] args) {

        /*
        Ã�rea de un cudrado
        Ã�rea de un rectÃ¡ngulo
        Ã�rea de un triÃ¡ngulo
        Area de un cÃ­rculo
         */

        // Pedir al usuario que figura decea hallar su Ã¡rea
        Scanner entrada = new Scanner(System.in);

        System.out.print("Eliga la opciÃ³n de decee de la lista:\n   1.)Ã�rea de un cuadrado.\n   2.)Ã�rea de un " +
                "rectÃ¡ngulo.\n   3.)Ã�rea de un triÃ¡ngulo.\n   4.)Ã¡rea de un cÃ­rculo.\nOpciÃ³n > ");

        int opcion = entrada.nextInt();
        entrada.close();

        switch (opcion) {
            case 1:
                // Ã�rea de un cuadrado
                String ladoCuadrado = JOptionPane.showInputDialog("Ingrese la medida de uno de los lados del cuadrado" +
                        " para hallar su Ã¡rea");
                double newLadoCuadrado = Double.parseDouble(ladoCuadrado);
                double areaCuadrado = Math.pow(newLadoCuadrado, 2);
                System.out.printf("El Ã¡rea del cuadrado es " + "%1.2f", areaCuadrado);
                System.out.println();
                break;
            case 2:
                // Ã�rea de un rectÃ¡ngulo
                String baseRectangulo = JOptionPane.showInputDialog("Ingrese la medida de la base del reactÃ¡ngulo");
                String alturaRectangulo = JOptionPane.showInputDialog("Ingresa la altura del rectÃ¡ngulo para hallar " +
                        "Ã¡rea");
                double newBaseRectangulo = Double.parseDouble(baseRectangulo);
                double newAlturaRectangulo = Double.parseDouble(alturaRectangulo);
                double areaRectangulo = newBaseRectangulo * newAlturaRectangulo;
                System.out.printf("El Ã¡rea del rectÃ¡ngulo es " + "%1.2f", areaRectangulo);
                System.out.println();
                break;
            case 3:
                // Ã�rea de un triÃ¡ngulo
                String baseTriangulo = JOptionPane.showInputDialog("Ingrese la medida de la base del triÃ¡ngulo");
                String alturaTriangulo = JOptionPane.showInputDialog("Ingrese la altura del triÃ¡ngulo para hallar su" +
                        " Ã¡rea");
                double newBaseTriangulo = Double.parseDouble(baseTriangulo);
                double newAlturaTriangulo = Double.parseDouble(alturaTriangulo);
                double areaTriangulo = (newBaseTriangulo * newAlturaTriangulo) / 2;
                System.out.printf("El Ã¡rea del triÃ¡ngulo es " + "%1.2f", areaTriangulo);
                System.out.println();
            case 4:
                // Ã�rea de un cÃ­rculo
                String radioCirculo = JOptionPane.showInputDialog("Ingresa el radio del cÃ­rcula para hallar su Ã¡rea");
                double newRadioCirculo = Double.parseDouble(radioCirculo);
                double areaCirculo = Math.PI * (Math.pow(newRadioCirculo, 2));
                System.out.printf("El Ã¡rea del cÃ­rculo es " + "%1.2f", areaCirculo);
                System.out.println();
                break;
            default:
                System.out.println("La opciÃ³n marcada no se encuentra disponible intÃ©ntelo de nuevo");
        }

    }

}