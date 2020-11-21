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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class aboutedit extends JPanel {
	private JTextField lastnameedit;
	private JTextField addWorkText;
	private JTextField addEducationText;
	private JButton btnCancel;
	private JButton submitbutton;

	/**
	 * Create the panel.
	 */
	public aboutedit() {
		setPreferredSize(new Dimension(750, 1200));
		setSize(new Dimension(765, 1200));
		setBackground(new Color(204, 204, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
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
		
		submitbutton = new JButton("SUBMIT CHANGES");
		submitbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		
		JLabel lblNewLabel_2_2 = new JLabel("Last Name:");
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Worked at:");
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Education:");
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Email:");
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Location:");
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1 = new JLabel("Hometown:");
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_1 = new JLabel("Website:");
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2 = new JLabel("Hobbies:");
		
		JTextField firstnameedit = new JTextField("");
		
		JTextField emailedit = new JTextField("");
		
		JComboBox locationedit = new JComboBox();
		
		JComboBox hometownedit = new JComboBox();
		
		JTextField websiteedit = new JTextField("");
		
		JDateChooser birthdayedit = new JDateChooser();
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Birthday:");
		
		lastnameedit = new JTextField("");
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2_1 = new JLabel("Verified: ");
		
		JCheckBox verifiedcheckbox = new JCheckBox("");
		verifiedcheckbox.setEnabled(false);
		
		JButton verifybutton = new JButton("VERIFY ACCOUNT");
		
		verifybutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JList worksList = new JList();
		scrollPane.setViewportView(worksList);
		
		JButton btnAddworkbutton = new JButton("");
		btnAddworkbutton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/plus16.png")));
		
		JButton removeWorkButton = new JButton("");
		removeWorkButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/minus16.png")));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JList educationList = new JList();
		scrollPane_1.setViewportView(educationList);
		
		JButton addEducationButton = new JButton("");
		addEducationButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/plus16.png")));
		
		JButton removeEducationButton = new JButton("");
		removeEducationButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/minus16.png")));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JList hobbiesList = new JList();
		scrollPane_2.setViewportView(hobbiesList);
		
		JButton addHobbieButton = new JButton("");
		addHobbieButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/plus16.png")));
		
		JButton removeHobbieButton = new JButton("");
		removeHobbieButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/minus16.png")));
		
		addWorkText = new JTextField();
		addWorkText.setColumns(10);
		
		addEducationText = new JTextField();
		addEducationText.setColumns(10);
		
		JComboBox hobbiesCombo = new JComboBox();
		
		JTextArea txtrFavoriteQuotes = new JTextArea();
		txtrFavoriteQuotes.setBackground(new Color(204, 204, 255));
		txtrFavoriteQuotes.setFocusable(false);
		txtrFavoriteQuotes.setEditable(false);
		txtrFavoriteQuotes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrFavoriteQuotes.setLineWrap(true);
		txtrFavoriteQuotes.setWrapStyleWord(true);
		txtrFavoriteQuotes.setText("Favorite quotes:");
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		JTextArea quoteText = new JTextArea();
		scrollPane_3.setViewportView(quoteText);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		
		JList quotesList = new JList();
		scrollPane_4.setViewportView(quotesList);
		
		JButton addQuoteButton = new JButton("");
		addQuoteButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/plus16.png")));
		
		JButton removeQuoteButton = new JButton("");
		removeQuoteButton.setIcon(new ImageIcon(aboutedit.class.getResource("/images/minus16.png")));
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lastnameedit, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(birthdayedit, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(emailedit, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(locationedit, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(hometownedit, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(websiteedit, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(addWorkText, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnAddworkbutton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(removeWorkButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(addEducationText, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(addEducationButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(removeEducationButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(hobbiesCombo, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(addHobbieButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(removeHobbieButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_2_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(verifiedcheckbox))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addComponent(verifybutton, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(submitbutton, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(firstnameedit, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtrFavoriteQuotes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(addQuoteButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(removeQuoteButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(71))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(firstnameedit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lastnameedit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(birthdayedit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(emailedit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(locationedit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(hometownedit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(websiteedit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(addWorkText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(13)
							.addComponent(btnAddworkbutton)))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(removeWorkButton)))
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(addEducationText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(addEducationButton))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(removeEducationButton))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(hobbiesCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(addHobbieButton)))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addComponent(removeHobbieButton))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtrFavoriteQuotes, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addComponent(addQuoteButton))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(4)
									.addComponent(verifiedcheckbox, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
						.addComponent(removeQuoteButton))
					.addGap(110)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(verifybutton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(submitbutton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
		);
		setLayout(groupLayout);

		verifybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verify ver = new verify();
				ver.setVisible(true);
			}
		});
	}
	public JButton getBtnCancel() {
		return btnCancel;
	}
	public JButton getSubmitbutton() {
		return submitbutton;
	}
}