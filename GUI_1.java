import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_1 implements ActionListener {
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passLabel;
	private static JLabel success;
	private static JPasswordField passText;
	private static JButton button;
	

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350 , 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10 ,20 ,80 ,25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passLabel = new JLabel("Password");
		passLabel.setBounds(10, 50, 80, 25);
		panel.add(passLabel);
		
		passText = new JPasswordField();
		passText.setBounds(100 ,50 ,165 ,25);
		panel.add(passText);
		
		button = new JButton("Login");
		button.setBounds(10 ,80 ,80 ,25);
		button.addActionListener(new GUI_1());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String pass = passText.getText();
		System.out.println(user + "," + pass);
		
		if(user.equals("Prateek") && pass.equals("GUI123")) {
			success.setText("Login_Successfull");
		}
		else if(user!=("Prateek") && pass!=("GUI123")){
			success.setText("Login_Failed");
		}
		
		
	}

}
