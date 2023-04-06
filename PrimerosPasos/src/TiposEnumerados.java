import java.util.*;

public class TiposEnumerados {
	
	// Son variables objetos que solo pueden tomar una serie determinada de valores
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			
			this.abreviatura = abreviatura;
			
		}
		
		public String dameAbreviatura() {
			
			return abreviatura;
					
		}
		
		private String abreviatura;
		
	}

	public static void main(String[] args) {
		
		/*Talla s = Talla.MINI;
		Talla x = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;
		
		System.out.println(s);*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE Y MUY_GRANDE");
		String date = input.nextLine().toUpperCase();
		Talla laTalla = Enum.valueOf(Talla.class, date);
		System.out.println("Talla = " + laTalla);
		System.out.println("Abreviatura = " + laTalla.dameAbreviatura());
		
		input.close();

	}

}
