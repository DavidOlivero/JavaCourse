
public class InteresCapital {

	public static void main(String[] args) {
		
		double acumulado;
		double interes = 0.10;
		double[][] saldo = new double[6][5];
		
		for (int i = 0; i < saldo.length; i++) {
			
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			for (int z = 1; z < saldo[i].length; z++) {
				
				acumulado = acumulado + (acumulado * interes);
				saldo[i][z] = acumulado;
				
			}
			
			interes += 0.01;
			
		}
		
		for (int i = 0; i < saldo.length; i++) {
			
			System.out.println();
			
			for (int z = 0; z < saldo[i].length; z ++) {
				
				System.out.printf("%1.2f", saldo[i][z]);
				System.out.print(" ");
				
			}
			
		}

	}

}
