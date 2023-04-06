package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		
		Persona lasPersonas[] = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Lucas", 2000300, 2000, 8, 21);
		lasPersonas[1] = new Estudiante("David", "Ingeniería en software");
		
		for(Persona info: lasPersonas) {
			
			System.out.println(info.getName() + ", " + info.getDescription());
			
		}

	}

}

// Esta clase debe ser abstracta porque cuenta con un método abstracto
abstract class Persona {
	
	public Persona(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	// A los métodos abstractos no se les debe especificar un cuerpo, además obliga a que todas las clases que hereden de esta deban llevar un método
	// con el mismo nombre
	public abstract String getDescription();
	
	String name;
	
}

class Empleado2 extends Persona {
	
	public Empleado2(String name, double sueldo, int year, int month, int day) {
		
		super(name);
		this.sueldo = sueldo;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		altaContrato = calendar.getTime();
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	public String getDescription() {
		
		return "Este empleado tiene un Id= " + id + " con un sueldo de " + sueldo + " pesos";
		
	}
	
	public String getId() {
		
		return "Id=" + id;
		
	}
	
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
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;
	
}


class Estudiante extends Persona {
	
	public Estudiante(String name, String carrera) {
		
		super(name);
		this.name = name;
		this.carrera = carrera;
		
	}
	
	public String getDescription() {
		
		return "Este estudiante estudia " + carrera;
		
	}
	
	String name;
	String carrera;
	
}
