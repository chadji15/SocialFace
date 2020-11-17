package gui;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class aboutedit extends JPanel {
	private JTextField lastnameedit;

	/**
	 * Create the panel.
	 */
	public aboutedit() {
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
		
		JButton submitbutton = new JButton("SUBMIT CHANGES");
		submitbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		submitbutton.setBounds(393, 616, 257, 32);
		add(submitbutton);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setBounds(217, 96, 93, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Last Name:");
		lblNewLabel_2_2.setBounds(217, 137, 93, 32);
		add(lblNewLabel_2_2);
		
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
		
		JTextField firstnameedit = new JTextField("");
		firstnameedit.setBounds(321, 100, 153, 24);
		add(firstnameedit);
		
		JTextField worksedit = new JTextField("");
		worksedit.setBounds(322, 227, 153, 24);
		add(worksedit);
		
		JTextField educationedit = new JTextField("");
		educationedit.setBounds(321, 272, 153, 24);
		add(educationedit);
		
		JTextField emailedit = new JTextField("");
		emailedit.setBounds(322, 317, 153, 24);
		add(emailedit);
		
		JComboBox locationedit = new JComboBox();
		locationedit.setBounds(321, 358, 153, 24);
		add(locationedit);
		
		JComboBox hometownedit = new JComboBox();
		hometownedit.setBounds(321, 403, 153, 24);
		add(hometownedit);
		
		JTextField quotesedit = new JTextField("");
		quotesedit.setBounds(321, 444, 153, 24);
		add(quotesedit);
		
		JTextField websiteedit = new JTextField("");
		websiteedit.setBounds(321, 485, 153, 24);
		add(websiteedit);
		
		JComboBox hobbiesedit = new JComboBox();
		hobbiesedit.setBounds(321, 530, 153, 24);
		add(hobbiesedit);
		
		JDateChooser birthdayedit = new JDateChooser();
		birthdayedit.setBounds(319, 192, 155, 22);
		add(birthdayedit);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Birthday:");
		lblNewLabel_2_2_1.setBounds(217, 182, 93, 32);
		add(lblNewLabel_2_2_1);
		
		lastnameedit = new JTextField("");
		lastnameedit.setBounds(321, 142, 153, 24);
		add(lastnameedit);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2_1 = new JLabel("Verified: ");
		lblNewLabel_2_2_1_1_1_1_1_2_2_1.setBounds(217, 570, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_2_1);
		
		JCheckBox verifiedcheckbox = new JCheckBox("");
		verifiedcheckbox.setBounds(324, 574, 25, 28);
		add(verifiedcheckbox);
		
		JButton verifybutton = new JButton("VERIFY ACCOUNT");
		verifybutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		verifybutton.setBounds(117, 616, 257, 32);
		add(verifybutton);

	}
}