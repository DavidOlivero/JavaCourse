package poo;

public class Clase2 {

	public static void main(String[] args) {
		
		Clase1 MiObjeto = new Clase1();
		
		// Por defecto son visbles
		// private no son visibles
		// protected son visibles
		// public son visibles
		System.out.println(MiObjeto.mivar);

	}

}

class Miclase extends Clase1 {
	
	// Por defecto son visibles
	// private no son visibles
	// protected son visibles
	// public son visibles
	void suma() {
		
		suma = mivar + mivar2;
		
	}
	
	int dimeSuma() {
		
		return suma;
		
	}
	
	int suma;
		
}
