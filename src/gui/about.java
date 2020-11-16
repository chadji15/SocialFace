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

public class about extends JPanel {

	/**
	 * Create the panel.
	 */
	public about() {
		setBackground(new Color(204, 204, 255));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 703, 83);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT");
		lblNewLabel.setForeground(new Color(0, 102, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(289, 13, 145, 65);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(signup.class.getResource("/images/logosmall.png")));
		lblNewLabel_1.setBounds(0, 0, 187, 140);
		panel.add(lblNewLabel_1);
		
		JButton editbutton = new JButton("EDIT");
		editbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		editbutton.setBounds(217, 603, 257, 32);
		add(editbutton);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setBounds(217, 96, 93, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Birthday:");
		lblNewLabel_2_2.setBounds(217, 137, 93, 32);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Gender:");
		lblNewLabel_2_2_1.setBounds(217, 182, 93, 32);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Works:");
		lblNewLabel_2_2_1_1.setBounds(217, 223, 93, 32);
		add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Education:");
		lblNewLabel_2_2_1_1_1.setBounds(217, 268, 93, 32);
		add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_2_2_1_1_1_1.setBounds(217, 313, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Location:");
		lblNewLabel_2_2_1_1_1_1_1.setBounds(217, 354, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1 = new JLabel("Hometown:");
		lblNewLabel_2_2_1_1_1_1_1_1.setBounds(217, 399, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2 = new JLabel("Quotes:");
		lblNewLabel_2_2_1_1_1_1_1_2.setBounds(217, 440, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_1 = new JLabel("Website:");
		lblNewLabel_2_2_1_1_1_1_1_2_1.setBounds(217, 481, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2 = new JLabel("Hobbies:");
		lblNewLabel_2_2_1_1_1_1_1_2_2.setBounds(217, 526, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_2);
		
		JLabel namelabel = new JLabel("");
		namelabel.setBounds(321, 100, 153, 24);
		add(namelabel);
		
		JLabel birthdaylabel = new JLabel("");
		birthdaylabel.setBounds(322, 141, 153, 24);
		add(birthdaylabel);
		
		JLabel genderlabel = new JLabel("");
		genderlabel.setBounds(321, 186, 153, 24);
		add(genderlabel);
		
		JLabel workslabel = new JLabel("");
		workslabel.setBounds(322, 227, 153, 24);
		add(workslabel);
		
		JLabel educationlabel = new JLabel("");
		educationlabel.setBounds(321, 272, 153, 24);
		add(educationlabel);
		
		JLabel emailabel = new JLabel("");
		emailabel.setBounds(321, 317, 153, 24);
		add(emailabel);
		
		JLabel locationlabel = new JLabel("");
		locationlabel.setBounds(321, 358, 153, 24);
		add(locationlabel);
		
		JLabel hometownlabel = new JLabel("");
		hometownlabel.setBounds(321, 403, 153, 24);
		add(hometownlabel);
		
		JLabel quoteslabel = new JLabel("");
		quoteslabel.setBounds(321, 444, 153, 24);
		add(quoteslabel);
		
		JLabel websitelabel = new JLabel("");
		websitelabel.setBounds(321, 485, 153, 24);
		add(websitelabel);
		
		JLabel hobbieslabel = new JLabel("");
		hobbieslabel.setBounds(321, 530, 153, 24);
		add(hobbieslabel);

	}
}