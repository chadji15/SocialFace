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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class search extends JPanel {
	private JTextField locationsearch;
	private JTextField namesearch;
	private JTextField workText;
	private JTextField educationText;
	private JTextField hometownText;

	/**
	 * Create the panel.
	 */
	public search() {
		setPreferredSize(new Dimension(760, 570));
		setSize(new Dimension(760, 570));
		setBackground(new Color(204, 204, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SEARCH");
		lblNewLabel.setForeground(new Color(0, 102, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(289, 13, 145, 65);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(signup.class.getResource("/images/logosmall.png")));
		lblNewLabel_1.setBounds(0, 0, 187, 140);
		panel.add(lblNewLabel_1);
		
		JButton searchbutton = new JButton("SEARCH");
		searchbutton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JRadioButton ByLocation = new JRadioButton("By location:");
		ByLocation.setBackground(new Color(204, 204, 255));
		
		JRadioButton ByName = new JRadioButton("By Name:");
		ByName.setBackground(new Color(204, 204, 255));
		
		JRadioButton ByDate = new JRadioButton("By Birth date:");
		ByDate.setBackground(new Color(204, 204, 255));
		
		locationsearch = new JTextField();
		locationsearch.setColumns(10);
		
		namesearch = new JTextField();
		namesearch.setColumns(10);
		
		JDateChooser datesearch = new JDateChooser();
		
		JRadioButton ByWork = new JRadioButton("By Work:");
		ByWork.setBackground(new Color(204, 204, 255));
		
		workText = new JTextField();
		workText.setColumns(10);
		
		JRadioButton ByEducation = new JRadioButton("By Education:");
		ByEducation.setBackground(new Color(204, 204, 255));
		
		educationText = new JTextField();
		educationText.setColumns(10);
		
		JRadioButton ByHometown = new JRadioButton("By Hometown:");
		ByHometown.setBackground(new Color(204, 204, 255));
		
		hometownText = new JTextField();
		hometownText.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(217)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ByWork, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(workText, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ByEducation, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(educationText, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ByHometown, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(hometownText, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
						.addComponent(searchbutton, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ByLocation, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(locationsearch, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ByName, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(namesearch, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ByDate, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(datesearch, GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ByLocation)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(locationsearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ByName)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(namesearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ByDate)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(datesearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ByWork)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(workText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ByEducation)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(educationText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(hometownText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(ByHometown)))
					.addGap(37)
					.addComponent(searchbutton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(203, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
