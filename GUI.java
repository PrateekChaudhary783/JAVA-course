import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	private int count=0;//increment count in Action performed override
	private JLabel label;//defining outside the constructer for Actnprmed to recognize
	private JFrame frame;
	private JButton button;
	private JPanel panel;
	//implementing constructor GUI
	public GUI() {
		frame= new JFrame();
		
		button = new JButton("Click_Me");
		button.addActionListener(this);//implement action listener to the class 
		label = new JLabel("Number_of_Clicks");
		
		panel = new JPanel();
		//calling panel to set .... 
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		//regular setup for GUI
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI_1");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		//constructor
		new GUI();

	}
	//action performed method

	@Override
	public void actionPerformed(ActionEvent e) {
		count ++;
		label.setText("Number_of_Clicks = " + count);
		
		
	}

}
