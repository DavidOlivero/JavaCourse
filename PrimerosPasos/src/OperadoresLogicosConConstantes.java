
public class OperadoresLogicosConConstantes {

	public static void main(String[] args) {
		
		// Transform centimetros a pulgadas
		
		final double Pulgadas = 2.54;
		double cm = 6;
		double resultado1 = cm/Pulgadas;
		
		System.out.println(cm  + " cm son " + resultado1 + " pulgadas.");
		
		// Transformar pulgadas a centímetros
		final float Cm = 2.54f;
		float pulgadas = 6;
		float resultado2 = pulgadas*Cm;
		
		System.out.println(pulgadas + " pulgadas son " + resultado2 + "cm");
		
		// Transformar pesos a Euros
		final float Euros1 = 0.00024f;
		float pesos = 4000f;
		float resultado3 = pesos*Euros1;
		
		System.out.println(pesos + " pesos son " + resultado3 + " Euros");
		
		// 	Transformar Euros a pesos
		final float Pesos = 4165.27f;
		float euros = 4000f;
		float resultado4 = euros*Pesos;
		
		System.out.println(euros + " euros son " + resultado4 + " pesos");
		
		// pesos a Dólares
		final float Dolar = 0.00026f;
		float pesos2 = 50000;
		float resultado5 = pesos2*Dolar;
		
		System.out.println(pesos2 + " pesos son " + resultado5 + " dólares");
		
		// Dólares a pesos
		final float Peso = 3.79227f;
		float dolar = 50000;
		float resultado6 = dolar*Peso;
				
		System.out.println(dolar + " pesos son " + resultado6 + " dólares");
		

	}

}
