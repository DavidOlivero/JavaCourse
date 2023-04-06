package modificadoresDeAcceso;

import poo.Clase1;

public class Clase3 extends Clase1 {
	
	/* Modificadores de acceso
	 * private -> Permitido(propia clase) No permitido(subclase del mismo paquete, otra clase del mismo 
	 * paquete, subclase de otro paquete diferente, otra clase de otro paquete diferente)
	 * public -> Permitido(propia clase, subclase del mismo paquete, otra clase del mismo paquete,
	 * subclase de otro paquete diferente, otra clase de un paquete diferente)
	 * protected -> Permitido(propia clase, subclase del mismo paquete, otra clase del mismo paquete, 
	 * subclase de otro paquete diferente) No permitido(clase de otro paquete diferente)
	 * por defecto -> Permitido(propia clase, subclase del mismo paquete, otra clase del mismo paquete) 
	 * No permitido(subclase de otro paquete diferente, otra clase de un paquete diferent) */
	
	// por defecto no son visibles
	// private no son visibles
	// protectes son visibles
	// public son visibles
	int variable = mivar;
	
}
