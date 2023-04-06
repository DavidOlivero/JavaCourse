package poo;
import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		// Quedé por el vídeo 51
		
		/*Empleado empleado1 = new Empleado("Juan Matinez", 3000000, 1996, 11, 20);
		Empleado empleado2 = new Empleado("Laura P�rez", 3600000, 1999, 3, 17);
		Empleado empleado3 = new Empleado("Pepe Sapata", 5000000, 2005, 10, 30);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(3);
		empleado3.subeSueldo(10);
		
		System.out.println("Nombre: " + empleado1.getName() + ". Sueldo: " + empleado1.getSueldo() 
		+ ". Fecha de alta: " + empleado1.getAltaContrato());
		
		System.out.println("Nombre: " + empleado2.getName() + ". Sueldo: " + empleado2.getSueldo() 
		+ ". Fecha de alta: " + empleado2.getAltaContrato());
		
		System.out.println("Nombre: " + empleado3.getName() + ". Sueldo: " + empleado3.getSueldo() 
		+ ". Fecha de alta: " + empleado3.getAltaContrato());*/
		
		Jefatura jefeDevelopment = new Jefatura("David Olivero", 5000000, 4, 8, 2014);
		
		jefeDevelopment.estableceIncentivo(600000);
		
		Empleado [] empleados = new Empleado[6];
		
		empleados[0] = new Empleado("Juan Matinez", 3000000, 1996, 11, 20);
		empleados[1] = new Empleado("Laura P�rez", 3600000, 1999, 3, 17);
		empleados[2] = new Empleado("Pepe Sapata", 5000000, 2005, 10, 30);
		empleados[3] = new Empleado("Luis Fern�ndez");
		empleados[4] = jefeDevelopment;  // Polimofirmo -> principio de sustituci�n: El array empleados, en esta posici�n perteneciente a la clase padre 
										// toma la forma de la clase hijo.
		empleados[5] = new Jefatura("Mar�a", 4000000, 7, 12, 2016);
		
		System.out.println("El jefe de desarrollo " + jefeDevelopment.getName() + 
				" tiene un bonus de " + jefeDevelopment.estableceBonus(10000000));
		
		/*Empleado directorComercial = new Empleado("Fabián", 3000000, 2005, 4, 25);
		// No se puede crear instancias de interfaces pero si por medio del principio de sustitución
		Comparable example = new Empleado("Martín", 2000000, 2016, 5, 5);
		
		// Evaluar de que tipo es una instancia
		if(directorComercial instanceof Empleado) {
			
			System.out.println("Es de tipo Jefatura");
			
		}
		
		if(example instanceof Comparable) {
			
			System.out.println("Implementa la interfaz comparale");
			
		}*/
		
		// Refundici�n o casting con clases
		Jefatura jefaIngenieria = (Jefatura) empleados[5];
		jefaIngenieria.estableceIncentivo(500000);
		
		/*for (int i = 0; i < empleados.length; i++) {
			
			empleados[i] .subeSueldo(5);
			
		}*/
		
		System.out.println(jefaIngenieria.tomarDecisiones("Subir el sueldo un 5%"));
		
		for (Empleado idEmpleado: empleados) {
			
			idEmpleado.subeSueldo(5);
			
		}
		
		/*for (int i = 0; i < empleados.length; i++) {
			
			System.out.println("Nombre: " + empleados[i].getName() + ". Sueldo: " + empleados[i].getSueldo() 
		+ ". Fecha de alta: " + empleados[i].getAltaContrato());
			
		}*/
		
		Arrays.sort(empleados);
		
		for (Empleado datosEmpleado : empleados) {
			
			System.out.println(datosEmpleado.getId() + " nombre: " + datosEmpleado.getName()
			+ ". Sueldo: " + datosEmpleado.getSueldo() // Depende de la clase se llama a uno u otro
																											  // m�tod getSueldo
					+ ". Fecha de alta: " + datosEmpleado.getAltaContrato());
			
		}

	}

}


class Empleado implements Comparable, Trabajadores {
	
	public Empleado(String name, double sueldo, int year, int month, int day) {
		
		this.name = name;
		this.sueldo = sueldo;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		altaContrato = calendar.getTime();
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	
	public Empleado(String name) {
		
		this(name, 1000000, 2018, 1, 1);
				
	}
	
	public String getId() {
		
		return "Id=" + id;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	// El que un m�todo sea final impkica que no puede haber otro m�todo que sobre escriba a este por medio de una herencia
	public double getSueldo() {
		
		return sueldo;
		
	}
	
	public Date getAltaContrato() {
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
		
	}
	
	public int compareTo(Object myObject) {
		
		Empleado otherEmployee= (Empleado) myObject;
		
		if(this.id < otherEmployee.id) {
			
			return -1;
			
		} else if(this.id > otherEmployee.id) {
			
			return 1;
			
		}
			
		return 0;
		
	}
	
	public double estableceBonus(double bonus) {
		return Trabajadores.bonusBase + bonus;
	}
	
	private final String name;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;
	
}


// El que una clase sea final implica que hast� all� ser� la linea de la herencia
final class Jefatura extends Empleado implements Jefe {
	
	public Jefatura(String name, double sueldo, int year, int month, int day) {
		
		super(name, sueldo, year, month, day);
		
	}
	
	public void estableceIncentivo(double incentivo) {
		
		this.incentivo = incentivo;
		
	}
	
	public double getSueldo() {
		
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
		
	}
	
	public String tomarDecisiones(String desicion) {
		
		return "Un miembtro de la dirección ha tomado la desición de: " + desicion;
		
	}
	
	public double estableceBonus(double bonus) {
		double prima = 200000;
		return Trabajadores.bonusBase + prima + bonus;
	}
	
	private double incentivo;
		
}

// No puede heredar de la clase Jefatura porque esa clase es final
/*class Director extends Jefatura {
	
	public Director(String name, double sueldo, int year, int month, int day) {
		
		super(name, sueldo, year, month, day);		
		
	}
	
}*/
