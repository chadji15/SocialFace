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
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class login extends JPanel {
	int n;
	private JTextField usernametext;
	private JPasswordField passwordField;
	private JButton CreateButton;
	private JButton LoginButton;
	private JButton btnLoginDba;

	/**
	 * Create the panel.sd
	 */
	public login() {
		setBackground(new Color(153, 153, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/images/Webp.net-resizeimage (3).png")));
		lblNewLabel.setBounds(10, 118, 338, 287);
		add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(440, 137, 104, 61);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(440, 204, 80, 61);
		add(lblPassword);
		
		usernametext = new JTextField();
		usernametext.setBounds(527, 157, 182, 22);
		add(usernametext);
		usernametext.setColumns(10);
		
		LoginButton = new JButton("LOGIN");
		LoginButton.setForeground(SystemColor.windowText);
		LoginButton.setBackground(SystemColor.control);
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		LoginButton.setBounds(430, 278, 279, 61);
		add(LoginButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 360, 640);
		add(panel);
		
		btnLoginDba = new JButton("Login as DBA");
		
		btnLoginDba.setForeground(Color.BLACK);
		btnLoginDba.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLoginDba.setBackground(SystemColor.control);
		btnLoginDba.setBounds(501, 352, 143, 29);
		add(btnLoginDba);
		
		CreateButton = new JButton("CREATE ACCOUNT");
		
		CreateButton.setForeground(Color.BLACK);
		CreateButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		CreateButton.setBackground(SystemColor.control);
		CreateButton.setBounds(430, 481, 270, 31);
		add(CreateButton);
		
		JLabel lblDontHaveAccount = new JLabel("Don't have account?");
		lblDontHaveAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDontHaveAccount.setBounds(431, 451, 161, 29);
		add(lblDontHaveAccount);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(527, 224, 182, 22);
		add(passwordField);

	}
	public JButton getCreateButton() {
		return CreateButton;
	}
	public JButton getLoginButton() {
		return LoginButton;
	}
	public JButton getBtnLoginDba() {
		return btnLoginDba;
	}
}
