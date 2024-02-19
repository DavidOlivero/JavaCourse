package grafic;

import java.awt.Frame;

import javax.swing.*;

public class MakeFrame {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MyFrame extends JFrame {
	public MyFrame() {
		// setSize(500, 300);
		// setLocation(500, 300);
		setBounds(500, 300, 550, 550);
		// setResizable(true);
		// setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("My window");
	}
}
