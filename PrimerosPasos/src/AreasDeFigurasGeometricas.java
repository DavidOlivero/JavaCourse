import javax.swing.*;
import java.util.*;

public class AreasDeFigurasGeometricas {

	public static void main(String[] args) {
		
		// �rea de un cuadrado con showInputDialog
		String ladoShow = JOptionPane.showInputDialog("Introduce la medida de uno de los lados del cuadrado para hallar su �rea");
		double ladoFinalShow = Double.parseDouble(ladoShow);
		double areaShow = Math.sqrt(ladoFinalShow);
		
		System.out.printf("El �rea del cuadrado es " + "%1.2f", areaShow);
		System.out.print("\n");
		
		// �rea de un cuadrado con Scanner
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce la medida de uno de los lados del cuadrado para hallar su �rea");
		
		double ladoScanner = entrada.nextDouble();
		double areaScanner = Math.sqrt(ladoScanner);
		
		System.out.printf("El �rea del cuadrado es " + "%1.2f", areaScanner);
		System.out.print("\n");
		entrada.close();
		
		// �rea de un rect�ngulo con showInputDialog
		String ladoRectShow = JOptionPane.showInputDialog("Introduce la medida de uno de los lados del rect�ngulo");
		String baseRectShow = JOptionPane.showInputDialog("Introduce la base del rect�ngulo");
		
		double ladoFinalRectShow = Double.parseDouble(ladoRectShow);
		double baseFinalRectShow = Double.parseDouble(baseRectShow);
		double areaDelRectanguloShow = ladoFinalRectShow*baseFinalRectShow;
		
		System.out.printf("El �rea del rect�ngulo es " + "%1.2f", areaDelRectanguloShow);
		System.out.println();
		
		// �rea de un rect�ngulo con Scanner
		Scanner entrada2=new Scanner(System.in);
		
		System.out.println("Introduce la medida de uno de los lados del rect�ngulo");
		double ladoRectScanner = entrada2.nextDouble();
		
		System.out.println("Introduce la base del rect�ngulo");
		double baseRectScanner = entrada2.nextDouble();
		
		double areaRectScanner = ladoRectScanner*baseRectScanner;
		
		System.out.printf("El �rea del rect�ngulo es " + "%1.2f", areaRectScanner);
		System.out.println();
		entrada2.close();
		

	}

}
