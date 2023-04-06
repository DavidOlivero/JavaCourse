import javax.swing.*;
import java.util.*;

public class AreasDeFigurasGeometricas {

	public static void main(String[] args) {
		
		// Área de un cuadrado con showInputDialog
		String ladoShow = JOptionPane.showInputDialog("Introduce la medida de uno de los lados del cuadrado para hallar su área");
		double ladoFinalShow = Double.parseDouble(ladoShow);
		double areaShow = Math.sqrt(ladoFinalShow);
		
		System.out.printf("El área del cuadrado es " + "%1.2f", areaShow);
		System.out.print("\n");
		
		// Área de un cuadrado con Scanner
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce la medida de uno de los lados del cuadrado para hallar su área");
		
		double ladoScanner = entrada.nextDouble();
		double areaScanner = Math.sqrt(ladoScanner);
		
		System.out.printf("El área del cuadrado es " + "%1.2f", areaScanner);
		System.out.print("\n");
		entrada.close();
		
		// Área de un rectángulo con showInputDialog
		String ladoRectShow = JOptionPane.showInputDialog("Introduce la medida de uno de los lados del rectángulo");
		String baseRectShow = JOptionPane.showInputDialog("Introduce la base del rectángulo");
		
		double ladoFinalRectShow = Double.parseDouble(ladoRectShow);
		double baseFinalRectShow = Double.parseDouble(baseRectShow);
		double areaDelRectanguloShow = ladoFinalRectShow*baseFinalRectShow;
		
		System.out.printf("El área del rectángulo es " + "%1.2f", areaDelRectanguloShow);
		System.out.println();
		
		// Área de un rectángulo con Scanner
		Scanner entrada2=new Scanner(System.in);
		
		System.out.println("Introduce la medida de uno de los lados del rectángulo");
		double ladoRectScanner = entrada2.nextDouble();
		
		System.out.println("Introduce la base del rectángulo");
		double baseRectScanner = entrada2.nextDouble();
		
		double areaRectScanner = ladoRectScanner*baseRectScanner;
		
		System.out.printf("El área del rectángulo es " + "%1.2f", areaRectScanner);
		System.out.println();
		entrada2.close();
		

	}

}
