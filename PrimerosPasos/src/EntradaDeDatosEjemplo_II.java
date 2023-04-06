import javax.swing.JOptionPane;

public class EntradaDeDatosEjemplo_II {

	public static void main(String[] args) {
		
		// Scanner -> sirve para resivir un valor por medio de la consola
		
		// ShowInputDialog()
        String username = JOptionPane.showInputDialog("Introduce tu nombre, porfavor");
        String yearsOld = JOptionPane.showInputDialog("Introduce tu edad, porfavor");
        
        // Se utiliza el método parseInt de la clase Integer para convertir el dato String que devuelve shoeInputDialog en int
        int yearsOldInTheNextYear = Integer.parseInt(yearsOld);
        yearsOldInTheNextYear++;
        System.out.println("Hola " + username + ". El año que viene tendras " + yearsOldInTheNextYear + 
                           " años de edad");

	}

}
