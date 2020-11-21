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

public class signup extends JPanel {
	private JTextField firstnametext;
	private JTextField lastnametext;
	private JTextField emailtext;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton createaccountbutton;

	/**
	 * Create the panel.
	 */
	public signup() {
		setBackground(new Color(204, 204, 255));
		
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
		
		JLabel lblLastName = new JLabel("Last Name:");
		
		JLabel lblUsername_1_1 = new JLabel("Gender:");
		
		firstnametext = new JTextField();
		firstnametext.setColumns(10);
		
		lastnametext = new JTextField();
		lastnametext.setColumns(10);
		
		JRadioButton malebutton = new JRadioButton("Male");
		buttonGroup.add(malebutton);
		malebutton.setBackground(new Color(204, 204, 255));
		
		JRadioButton femalebutton = new JRadioButton("Female");
		buttonGroup.add(femalebutton);
		femalebutton.setBackground(new Color(204, 204, 255));
		
		JRadioButton otherbutton = new JRadioButton("Other");
		buttonGroup.add(otherbutton);
		otherbutton.setBackground(new Color(204, 204, 255));
		
		JLabel lblEmail = new JLabel("Email:");
		
		emailtext = new JTextField();
		emailtext.setColumns(10);
		
		JLabel lblBirthday = new JLabel("Birthday:");
		
		JDateChooser choosedate = new JDateChooser();
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblComfirmPassword = new JLabel("Comfirm password:");
		lblComfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
		
		passwordField = new JPasswordField();
		
		passwordField2 = new JPasswordField();
		
		createaccountbutton = new JButton("CREATE MY ACCOUNT!");
		createaccountbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
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
							.addComponent(femalebutton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(otherbutton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
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
							.addGap(217)
							.addComponent(createaccountbutton, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(115, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
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
							.addComponent(femalebutton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(otherbutton)))
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
		);
		setLayout(groupLayout);

	}
	public JButton getCreateaccountbutton() {
		return createaccountbutton;
	}
}
