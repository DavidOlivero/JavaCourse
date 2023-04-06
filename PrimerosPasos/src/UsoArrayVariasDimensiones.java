
public class UsoArrayVariasDimensiones {

	public static void main(String[] args) {
		
		// Un array de dos dimensiones es un array dentro de cada posición de otro array
		int [][] array = {
				{15, 43, 80, -12, 30},
				{60, 2, 8, 20, 50},
				{600, 300, 40, 78, 90},
				{78, 89, 67, 50, 42},
		};
		//int array2[][] = new int [4][5];
		
		/*
		// Posición 0 del array
		array[0][0] = 15;
		array[0][1] = 43;
		array[0][2] = 80;
		array[0][3] = -12;
		array[0][4] = 30;
		
		// Posición 1 del array
		array[1][0] = 60;
		array[1][1] = 2;
		array[1][2] = 8;
		array[1][3] = 20;
		array[1][4] = 50;
		
		// Posición 2 del array
		array[2][0] = 600;
		array[2][1] = 300;
		array[2][2] = 40;
		array[2][3] = 78;
		array[2][4] = 90;
		
		// Posición 3 del array
		array[3][0] = 78;
		array[3][1] = 89;
		array[3][2] = 67;
		array[3][3] = 50;
		array[3][4] = 42;
		*/
		
		//System.out.println(array[2][0]);
		
		// Mostrar todos los elementos de ese array
		/*for (int i = 0; i < array.length; i++) {
			
			for (int x = 0; x < array[i].length; x++) {
				
				System.out.println("El numero de la posición " + i + ", "  + x + " es " + array[i][x]);
				
			}
			
		}*/
		
		// Con for each
		for (int[] fila:array) {
			
			System.out.println();
			
			for (int z:fila) {
				
				System.out.print(z + " ");
				
			}
						
		}

	}

}
