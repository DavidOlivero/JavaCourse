
public class UsoArrays {

	public static void main(String[] args) {
		
		/*int [] array = new int[5];
		//int array[] = new int[5];
		
		array[0] = 5;
		array[1] = -45;
		array[2] = 30;
		array[3] = 20;
		array[4] = 8;
		
		// Forma 1 de imprimir todos los valores del array
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);*/
		
		int [] array = {5, -45, 30, 20, 8, 45, 65, 75, 0, 90, 124, 56, 32, 84, 60, 70, 100};
		
		// Forma 2 de imprimir todos los valores del array
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Valor del índice " + i + " = " + array[i]);
			
		}

	}

}
