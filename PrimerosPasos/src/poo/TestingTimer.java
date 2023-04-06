package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class TestingTimer {
	public static void main(String[] args) {
		// Defining Timer
		// ActionListener listener = new TakeHour();
		TakeHour listener = new TakeHour();
		
		Timer myTimer = new Timer(5000, listener);
		myTimer.start();
		JOptionPane.showInternalMessageDialog(null, "Preciona aceptar para detener");
		
		System.exit(0);
	}
}

class TakeHour implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		Date now = new Date();
		System.out.println("Cada 5 segundos te doy la hora: " + now);
	}
}
