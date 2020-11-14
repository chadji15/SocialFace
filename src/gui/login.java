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
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
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
		
		textField = new JTextField();
		textField.setBounds(478, 157, 182, 22);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(478, 224, 182, 22);
		add(textField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setBackground(SystemColor.windowBorder);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(390, 278, 270, 61);
		add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 352, 521);
		add(panel);
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.setForeground(Color.BLACK);
		btnForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnForgotPassword.setBackground(SystemColor.windowBorder);
		btnForgotPassword.setBounds(457, 352, 143, 29);
		add(btnForgotPassword);
		
		JButton btnCreateAccount = new JButton("CREATE ACCOUNT");
		btnCreateAccount.setForeground(Color.BLACK);
		btnCreateAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCreateAccount.setBackground(SystemColor.windowBorder);
		btnCreateAccount.setBounds(390, 477, 270, 31);
		add(btnCreateAccount);
		
		JLabel lblDontHaveAccount = new JLabel("Don't have account?");
		lblDontHaveAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDontHaveAccount.setBounds(390, 449, 161, 29);
		add(lblDontHaveAccount);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(153, 153, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(655, 0, 45, 36);
		add(btnNewButton_1);

	}
}
