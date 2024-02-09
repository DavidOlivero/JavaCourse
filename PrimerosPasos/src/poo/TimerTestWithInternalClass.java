package poo;

import javax.swing.Timer;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class TimerTestWithInternalClass {
	public static void Main(String[] args) {
		// Clook myClook = new Clook(3000, true);
		
		Clook myClook = new Clook();
		
		myClook.StartClook(3000, true);
	}
}


class Clook {
	/* private int frequency;
	private boolean sound;
	
	public Clook(int frequency, boolean sound) {
		this.frequency = frequency;
		this.sound = sound;
	} */
	
	public void StartClook(int frequency, boolean sound) {
		class GetHoure implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				
				System.out.println("Te doy la hora en " + frequency + " segundos, son las: " + now);
				
				if (sound) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		} // <- This is a local internal class
		
		
		ActionListener listener = new GetHoure();
		
		Timer myTimer = new Timer(frequency, listener);
		
		myTimer.start();
		JOptionPane.showMessageDialog(null, "Dele aceptar para cerrar");
		
		System.exit(0);
	}
	
	/* private class GetHoure implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			
			System.out.println("Te doy la hora en " + frequency + " segundos, son las: " + now);
			
			if (sound) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	} <- This is a internal class */
}
