package poo;

public class EjemploEmpleado {

	public static void main(String[] args) {
		
		Empleados [] misEmpleados = {
				
				new Empleados("Pedro"),
				new Empleados("Juán"),
				new Empleados("Pepe")
				
		};
		
		misEmpleados[0].sectionChange("Recursos humanos");
		
		int i = 1;
		for (Empleados x: misEmpleados) {
			
			System.out.println(i + ".) " + x.getDates());
			i++;
			
			// Debido a que id pertenece a la propia clase se debe usar el nombre de la clase antes de la variable a invocar
			//Empleados.id++;
			
		}
		
		System.out.println(Empleados.getNextId());

	}

}


class Empleados {
	
	public Empleados(String name) {
		
		this.name = name;
		this.section = "administración";
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	public void sectionChange(String newSection) {
		
		section = newSection;
		
	}
	
	public String getDates() {
		
		return "Nombre: " + name + ". Sección: " + section + ". Id = " + id;
		
	}
	
	public static String getNextId() {
		
		return "El Id siguiente es " + idSiguiente;
				
	}
	
	private final String name;
	private String section;
	
	// El operador static permite que una variable, clase o método pertenesca directamente a la propia clase por lo que al instanciar una clase
	// el método, constante o variable estática no pertenese a la instancia, de esta forma abra una sola copia de estas.
	//public static int id;
	private int id;
	private static int idSiguiente = 1;
	
}
