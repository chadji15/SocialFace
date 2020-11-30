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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signup extends JPanel {
	private JTextField firstnametext;
	private JTextField lastnametext;
	private JTextField emailtext;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton createaccountbutton;
	private JRadioButton malebutton;
	private JRadioButton femalebutton;
	private JDateChooser choosedate;
	private JButton btnBack;

	/**
	 * Create the panel.
	 */
	public signup() {
		setBackground(SystemColor.activeCaption);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
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
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblUsername_1_1 = new JLabel("Gender:");
		lblUsername_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		firstnametext = new JTextField();
		firstnametext.setColumns(10);
		
		lastnametext = new JTextField();
		lastnametext.setColumns(10);
		
		malebutton = new JRadioButton("Male");
		malebutton.setSelected(true);
		malebutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup.add(malebutton);
		malebutton.setBackground(new Color(204, 204, 255));
		
		femalebutton = new JRadioButton("Female");
		femalebutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup.add(femalebutton);
		femalebutton.setBackground(new Color(204, 204, 255));
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		emailtext = new JTextField();
		emailtext.setColumns(10);
		
		JLabel lblBirthday = new JLabel("Birthday:");
		lblBirthday.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		choosedate = new JDateChooser();
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblComfirmPassword = new JLabel("Comfirm password:");
		lblComfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblComfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
		
		passwordField = new JPasswordField();
		
		passwordField2 = new JPasswordField();
		
		createaccountbutton = new JButton("CREATE MY ACCOUNT!");
	
		createaccountbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		btnBack = new JButton("Back");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(91)
									.addComponent(firstnametext, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(91)
									.addComponent(lastnametext, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUsername_1_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(91)
									.addComponent(malebutton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
							.addGap(4)
							.addComponent(femalebutton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(91)
									.addComponent(emailtext, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(91)
									.addComponent(choosedate, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblBirthday, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addComponent(lblComfirmPassword)
							.addGap(12)
							.addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addComponent(btnBack)
							.addGap(69)
							.addComponent(createaccountbutton, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(152, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addComponent(firstnametext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addComponent(lastnametext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUsername_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(malebutton))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(femalebutton)))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addComponent(emailtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(choosedate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblBirthday, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblComfirmPassword, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(58)
							.addComponent(createaccountbutton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnBack)))
		);
		setLayout(groupLayout);

	}
	public JButton getCreateaccountbutton() {
		return createaccountbutton;
	}
	public JRadioButton getMalebutton() {
		return malebutton;
	}
	public JRadioButton getFemalebutton() {
		return femalebutton;
	}
	public JTextField getFirstnametext() {
		return firstnametext;
	}
	public JTextField getLastnametext() {
		return lastnametext;
	}
	public JTextField getEmailtext() {
		return emailtext;
	}
	public JPasswordField getPasswordField2() {
		return passwordField2;
	}
	public JPasswordField getPasswordField() {
		return passwordField;
	}
	public JDateChooser getChoosedate() {
		return choosedate;
	}
	public JButton getBtnBack() {
		return btnBack;
	}
}
