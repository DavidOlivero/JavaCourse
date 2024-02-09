package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class TimerTest {

	public static void main(String[] args) {
		TakemeHoure listening = new TakemeHoure();
		
		Timer myTimer = new Timer(5000, listening);
		
		myTimer.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);
	}
	
	
}


class TakemeHoure implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		Date now = new Date();
		
		System.out.println("Te pongo la hora cada 5 segundos: " + now);
		
		Toolkit.getDefaultToolkit().beep();
	}
}