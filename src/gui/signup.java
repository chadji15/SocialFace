package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class signup extends JPanel {
	private JTextField firstnametext;
	private JTextField lastnametext;
	private JTextField emailtext;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;

	/**
	 * Create the panel.
	 */
	public signup() {
		setBackground(new Color(204, 204, 255));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 703, 83);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setForeground(new Color(0, 102, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(289, 13, 145, 65);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(signup.class.getResource("/images/logosmall.png")));
		lblNewLabel_1.setBounds(0, 0, 187, 140);
		panel.add(lblNewLabel_1);
		
		JLabel lblUsername = new JLabel("First Name:");
		lblUsername.setBounds(186, 96, 97, 36);
		add(lblUsername);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(186, 145, 97, 36);
		add(lblLastName);
		
		JLabel lblUsername_1_1 = new JLabel("Gender:");
		lblUsername_1_1.setBounds(186, 194, 97, 36);
		add(lblUsername_1_1);
		
		firstnametext = new JTextField();
		firstnametext.setBounds(277, 103, 230, 22);
		add(firstnametext);
		firstnametext.setColumns(10);
		
		lastnametext = new JTextField();
		lastnametext.setColumns(10);
		lastnametext.setBounds(277, 152, 230, 22);
		add(lastnametext);
		
		JRadioButton malebutton = new JRadioButton("Male");
		malebutton.setBackground(new Color(204, 204, 255));
		malebutton.setBounds(277, 200, 65, 25);
		add(malebutton);
		
		JRadioButton femalebutton = new JRadioButton("Female");
		femalebutton.setBackground(new Color(204, 204, 255));
		femalebutton.setBounds(346, 200, 78, 25);
		add(femalebutton);
		
		JRadioButton otherbutton = new JRadioButton("Other");
		otherbutton.setBackground(new Color(204, 204, 255));
		otherbutton.setBounds(428, 200, 127, 25);
		add(otherbutton);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(186, 243, 97, 36);
		add(lblEmail);
		
		emailtext = new JTextField();
		emailtext.setColumns(10);
		emailtext.setBounds(277, 250, 230, 22);
		add(emailtext);
		
		JLabel lblBirthday = new JLabel("Birthday:");
		lblBirthday.setBounds(186, 292, 97, 36);
		add(lblBirthday);
		
		JDateChooser choosedate = new JDateChooser();
		choosedate.setBounds(277, 298, 230, 22);
		add(choosedate);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setBounds(186, 341, 97, 36);
		add(lblPassword);
		
		JLabel lblComfirmPassword = new JLabel("Comfirm password:");
		lblComfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblComfirmPassword.setBounds(186, 390, 113, 36);
		add(lblComfirmPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(311, 348, 196, 22);
		add(passwordField);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(311, 397, 196, 22);
		add(passwordField2);
		
		JButton createaccountbutton = new JButton("CREATE MY ACCOUNT!");
		createaccountbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		createaccountbutton.setBounds(217, 484, 262, 63);
		add(createaccountbutton);

	}
}
