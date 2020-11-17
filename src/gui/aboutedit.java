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
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;

public class aboutedit extends JPanel {
	private JTextField lastnameedit;
	private JTextField addWorkText;
	private JTextField addEducationText;

	/**
	 * Create the panel.
	 */
	public aboutedit() {
		setSize(new Dimension(765, 650));
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
		
		JButton submitbutton = new JButton("SUBMIT CHANGES");
		submitbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		submitbutton.setBounds(392, 605, 257, 32);
		add(submitbutton);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setBounds(12, 96, 93, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Last Name:");
		lblNewLabel_2_2.setBounds(12, 137, 93, 32);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Worked at:");
		lblNewLabel_2_2_1_1.setBounds(12, 412, 93, 32);
		add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Education:");
		lblNewLabel_2_2_1_1_1.setBounds(335, 96, 93, 32);
		add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_2_2_1_1_1_1.setBounds(12, 227, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Location:");
		lblNewLabel_2_2_1_1_1_1_1.setBounds(12, 268, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1 = new JLabel("Hometown:");
		lblNewLabel_2_2_1_1_1_1_1_1.setBounds(12, 313, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_1 = new JLabel("Website:");
		lblNewLabel_2_2_1_1_1_1_1_2_1.setBounds(12, 358, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2 = new JLabel("Hobbies:");
		lblNewLabel_2_2_1_1_1_1_1_2_2.setBounds(335, 220, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_2);
		
		JTextField firstnameedit = new JTextField("");
		firstnameedit.setBounds(116, 100, 153, 24);
		add(firstnameedit);
		
		JTextField emailedit = new JTextField("");
		emailedit.setBounds(117, 231, 153, 24);
		add(emailedit);
		
		JComboBox locationedit = new JComboBox();
		locationedit.setBounds(116, 272, 153, 24);
		add(locationedit);
		
		JComboBox hometownedit = new JComboBox();
		hometownedit.setBounds(116, 317, 153, 24);
		add(hometownedit);
		
		JTextField websiteedit = new JTextField("");
		websiteedit.setBounds(116, 362, 153, 24);
		add(websiteedit);
		
		JDateChooser birthdayedit = new JDateChooser();
		birthdayedit.setBounds(116, 192, 153, 22);
		add(birthdayedit);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Birthday:");
		lblNewLabel_2_2_1.setBounds(12, 182, 93, 32);
		add(lblNewLabel_2_2_1);
		
		lastnameedit = new JTextField("");
		lastnameedit.setBounds(116, 142, 153, 24);
		add(lastnameedit);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2_1 = new JLabel("Verified: ");
		lblNewLabel_2_2_1_1_1_1_1_2_2_1.setBounds(22, 545, 93, 32);
		add(lblNewLabel_2_2_1_1_1_1_1_2_2_1);
		
		JCheckBox verifiedcheckbox = new JCheckBox("");
		verifiedcheckbox.setEnabled(false);
		verifiedcheckbox.setBounds(129, 549, 25, 28);
		add(verifiedcheckbox);
		
		JButton verifybutton = new JButton("VERIFY ACCOUNT");
		verifybutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		verifybutton.setBounds(116, 605, 257, 32);
		add(verifybutton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 453, 257, 70);
		add(scrollPane);
		
		JList worksList = new JList();
		scrollPane.setViewportView(worksList);
		
		JButton btnAddworkbutton = new JButton("");
		btnAddworkbutton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/plus16.png")));
		btnAddworkbutton.setBounds(277, 417, 25, 25);
		add(btnAddworkbutton);
		
		JButton removeWorkButton = new JButton("");
		removeWorkButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/minus16.png")));
		removeWorkButton.setBounds(277, 455, 25, 25);
		add(removeWorkButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(335, 137, 354, 70);
		add(scrollPane_1);
		
		JList educationList = new JList();
		scrollPane_1.setViewportView(educationList);
		
		JButton addEducationButton = new JButton("");
		addEducationButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/plus16.png")));
		addEducationButton.setBounds(701, 96, 25, 25);
		add(addEducationButton);
		
		JButton removeEducationButton = new JButton("");
		removeEducationButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/minus16.png")));
		removeEducationButton.setBounds(701, 137, 25, 25);
		add(removeEducationButton);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(335, 265, 354, 70);
		add(scrollPane_2);
		
		JList hobbiesList = new JList();
		scrollPane_2.setViewportView(hobbiesList);
		
		JButton addHobbieButton = new JButton("");
		addHobbieButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/plus16.png")));
		addHobbieButton.setBounds(701, 224, 25, 25);
		add(addHobbieButton);
		
		JButton removeHobbieButton = new JButton("");
		removeHobbieButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/minus16.png")));
		removeHobbieButton.setBounds(701, 262, 25, 25);
		add(removeHobbieButton);
		
		addWorkText = new JTextField();
		addWorkText.setBounds(117, 417, 152, 22);
		add(addWorkText);
		addWorkText.setColumns(10);
		
		addEducationText = new JTextField();
		addEducationText.setBounds(432, 101, 257, 22);
		add(addEducationText);
		addEducationText.setColumns(10);
		
		JComboBox hobbiesCombo = new JComboBox();
		hobbiesCombo.setBounds(432, 225, 257, 22);
		add(hobbiesCombo);
		
		JTextArea txtrFavoriteQuotes = new JTextArea();
		txtrFavoriteQuotes.setBackground(new Color(204, 204, 255));
		txtrFavoriteQuotes.setFocusable(false);
		txtrFavoriteQuotes.setEditable(false);
		txtrFavoriteQuotes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrFavoriteQuotes.setLineWrap(true);
		txtrFavoriteQuotes.setWrapStyleWord(true);
		txtrFavoriteQuotes.setText("Favorite quotes:");
		txtrFavoriteQuotes.setBounds(335, 358, 76, 44);
		add(txtrFavoriteQuotes);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(432, 358, 257, 44);
		add(scrollPane_3);
		
		JTextArea quoteText = new JTextArea();
		scrollPane_3.setViewportView(quoteText);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(335, 412, 354, 111);
		add(scrollPane_4);
		
		JList quotesList = new JList();
		scrollPane_4.setViewportView(quotesList);
		
		JButton addQuoteButton = new JButton("");
		addQuoteButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/plus16.png")));
		addQuoteButton.setBounds(701, 358, 25, 25);
		add(addQuoteButton);
		
		JButton removeQuoteButton = new JButton("");
		removeQuoteButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/minus16.png")));
		removeQuoteButton.setBounds(701, 412, 25, 25);
		add(removeQuoteButton);

	}
}