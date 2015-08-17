import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FeedBar extends JFrame {

	public FeedBar() {
		super("Feebar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		// create icons
		ImageIcon loadIcon = new ImageIcon("C:/Users/Grand/AppData/Local/Temp/Temp1_Attachments_2015729.zip/load.gif");
		ImageIcon saveIcon = new ImageIcon("C:/Users/Grand/AppData/Local/Temp/Temp1_Attachments_2015729.zip/save.gif/");
		ImageIcon subscribeIcon = new ImageIcon("C:/Users/Grand/AppData/Local/Temp/Temp1_Attachments_2015729.zip/subscribe.gif");
		ImageIcon unsubscribeIcon = new ImageIcon ("C:/Users/Grand/AppData/Local/Temp/Temp1_Attachments_2015729.zip/unsubscribe.gif");
		// create buttons
		JButton load = new JButton("Load", loadIcon);
		JButton save = new JButton("Save", saveIcon);
		JButton subscribe = new JButton("Subscribe", subscribeIcon);
		JButton unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
		// add buttons to toolbar
		JToolBar bar = new JToolBar();
		bar.add(load);
		bar.add(save);
		bar.add(subscribe);
		bar.add(unsubscribe);
		// prepare user interface
		JTextArea edit = new JTextArea (8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		add("North", bar);
		add("Center", scroll);
		pack();
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
					);
					SwingUtilities.updateComponentTreeUI(this);
		}catch (Exception e) {
			System.err.println("Couldn't use the sysytem "
				+ "look and feel: " + e);
			}
	}
	public static void main(String[] arguments) {
		FeedBar frame = new FeedBar();
		
	}

}
