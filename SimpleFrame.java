import javax.swing.*;

public class SimpleFrame extends JFrame {
	public SimpleFrame() {
		super("My 1st Frame");
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setVisible(true);
	}
	
	private static void setLookAndFeel() {
		try{
			UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
				);
		} catch (Exception exc) {
			// ignore error
		}
	}
	public static void main (String[] arguments) {
		setLookAndFeel();
		SimpleFrame sf = new SimpleFrame();
		 }

}
