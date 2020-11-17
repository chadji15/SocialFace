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
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class about extends JPanel {

	/**
	 * Create the panel.
	 */
	public about() {
		setMinimumSize(new Dimension(765, 1000));
		setPreferredSize(new Dimension(765, 1000));
		setSize(new Dimension(765, 1000));
		setBackground(new Color(204, 204, 255));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 765, 83);
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
		editbutton.setBounds(265, 944, 257, 32);
		add(editbutton);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setBounds(212, 96, 93, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Birthday:");
		lblNewLabel_2_2.setBounds(212, 137, 93, 32);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Gender:");
		lblNewLabel_2_2_1.setBounds(212, 182, 93, 32);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Worked at:");
		lblNewLabel_2_2_1_1.setBounds(212, 545, 93, 32);
		add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Education:");
		lblNewLabel_2_2_1_1_1.setBounds(212, 672, 93, 32);
		add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_2_2_1_1_1_1.setBounds(212, 227, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Location:");
		lblNewLabel_2_2_1_1_1_1_1.setBounds(212, 268, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1 = new JLabel("Hometown:");
		lblNewLabel_2_2_1_1_1_1_1_1.setBounds(212, 313, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2 = new JLabel("Favorite quotes:");
		lblNewLabel_2_2_1_1_1_1_1_2.setBounds(212, 803, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_1 = new JLabel("Website:");
		lblNewLabel_2_2_1_1_1_1_1_2_1.setBounds(212, 358, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2 = new JLabel("Hobbies:");
		lblNewLabel_2_2_1_1_1_1_1_2_2.setBounds(212, 403, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_2);
		
		JLabel namelabel = new JLabel("");
		namelabel.setBounds(316, 100, 264, 24);
		add(namelabel);
		
		JLabel birthdaylabel = new JLabel("");
		birthdaylabel.setBounds(317, 141, 263, 24);
		add(birthdaylabel);
		
		JLabel genderlabel = new JLabel("");
		genderlabel.setBounds(316, 186, 264, 24);
		add(genderlabel);
		
		JLabel emailabel = new JLabel("");
		emailabel.setBounds(316, 231, 264, 24);
		add(emailabel);
		
		JLabel locationlabel = new JLabel("");
		locationlabel.setBounds(316, 272, 264, 24);
		add(locationlabel);
		
		JLabel hometownlabel = new JLabel("");
		hometownlabel.setBounds(316, 317, 264, 24);
		add(hometownlabel);
		
		JLabel websitelabel = new JLabel("");
		websitelabel.setBounds(316, 362, 264, 24);
		add(websitelabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(212, 575, 368, 84);
		add(scrollPane);
		
		JList worksList = new JList();
		scrollPane.setViewportView(worksList);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(212, 717, 368, 83);
		add(scrollPane_1);
		
		JList educationList = new JList();
		scrollPane_1.setViewportView(educationList);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(212, 848, 368, 83);
		add(scrollPane_2);
		
		JList quotesList = new JList();
		scrollPane_2.setViewportView(quotesList);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(212, 433, 368, 99);
		add(scrollPane_3);
		
		JList list = new JList();
		scrollPane_3.setViewportView(list);

	}
}