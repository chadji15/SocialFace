package gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class login extends JPanel {
	int n;
	private JTextField usernametext;
	private JTextField passwordtext;

	/**
	 * Create the panel.sd
	 */
	public login() {
		setBackground(new Color(153, 153, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/images/Webp.net-resizeimage (3).png")));
		lblNewLabel.setBounds(10, 118, 331, 287);
		add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(390, 137, 104, 61);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(390, 204, 104, 61);
		add(lblPassword);
		
		usernametext = new JTextField();
		usernametext.setBounds(478, 157, 182, 22);
		add(usernametext);
		usernametext.setColumns(10);
		
		passwordtext = new JTextField();
		passwordtext.setColumns(10);
		passwordtext.setBounds(478, 224, 182, 22);
		add(passwordtext);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.setForeground(SystemColor.windowText);
		LoginButton.setBackground(SystemColor.windowBorder);
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		LoginButton.setBounds(390, 278, 270, 61);
		add(LoginButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 352, 521);
		add(panel);
		
		JButton ForgotButton = new JButton("Forgot Password?");
		ForgotButton.setForeground(Color.BLACK);
		ForgotButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ForgotButton.setBackground(SystemColor.windowBorder);
		ForgotButton.setBounds(457, 352, 143, 29);
		add(ForgotButton);
		
		JButton CreateButton = new JButton("CREATE ACCOUNT");
		CreateButton.setForeground(Color.BLACK);
		CreateButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		CreateButton.setBackground(SystemColor.windowBorder);
		CreateButton.setBounds(390, 477, 270, 31);
		add(CreateButton);
		
		JLabel lblDontHaveAccount = new JLabel("Don't have account?");
		lblDontHaveAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDontHaveAccount.setBounds(390, 449, 161, 29);
		add(lblDontHaveAccount);

	}
}
