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
		
		JButton searchbutton = new JButton("EDIT");
		searchbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		searchbutton.setBounds(217, 616, 257, 32);
		add(searchbutton);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setBounds(217, 96, 93, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name:");
		lblNewLabel_2_1.setBounds(217, 141, 93, 32);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Birthday:");
		lblNewLabel_2_2.setBounds(217, 186, 93, 32);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Gender:");
		lblNewLabel_2_2_1.setBounds(217, 231, 93, 32);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Works:");
		lblNewLabel_2_2_1_1.setBounds(217, 276, 93, 32);
		add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Education:");
		lblNewLabel_2_2_1_1_1.setBounds(217, 321, 93, 32);
		add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_2_2_1_1_1_1.setBounds(217, 366, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Location:");
		lblNewLabel_2_2_1_1_1_1_1.setBounds(217, 407, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1 = new JLabel("Hometown:");
		lblNewLabel_2_2_1_1_1_1_1_1.setBounds(217, 452, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2 = new JLabel("Quotes:");
		lblNewLabel_2_2_1_1_1_1_1_2.setBounds(217, 497, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_1 = new JLabel("Website:");
		lblNewLabel_2_2_1_1_1_1_1_2_1.setBounds(217, 542, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2 = new JLabel("Hobbies:");
		lblNewLabel_2_2_1_1_1_1_1_2_2.setBounds(217, 587, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_2);

	}
}