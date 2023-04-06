package modificadoresDeAcceso;

import poo.Clase1;

public class Clase4 {
	
	public static void main(String[] args) {
		
		Clase1 MiObjeto = new Clase1();
		
		// Por defecto no son visibles
		// private no son visibles
		// protected son visibles
		// public son visibles
		System.out.println(MiObjeto.mivar);
		
	}
	
}
