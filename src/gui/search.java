package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class search extends JPanel {
	private JTextField locationsearch;
	private JTextField namesearch;
	private JTextField worksearch;
	private JTextField educationsearch;
	private JTextField hometownsearch;

	/**
	 * Create the panel.
	 */
	public search() {
		setBackground(new Color(204, 204, 255));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 703, 83);
		add(panel);
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
		searchbutton.setBounds(217, 484, 262, 63);
		add(searchbutton);
		
		JRadioButton ByLocation = new JRadioButton("By location:");
		ByLocation.setBackground(new Color(204, 204, 255));
		ByLocation.setBounds(217, 95, 127, 25);
		add(ByLocation);
		
		JRadioButton ByName = new JRadioButton("By Name:");
		ByName.setBackground(new Color(204, 204, 255));
		ByName.setBounds(217, 125, 127, 25);
		add(ByName);
		
		JRadioButton ByDate = new JRadioButton("By Birth date:");
		ByDate.setBackground(new Color(204, 204, 255));
		ByDate.setBounds(217, 155, 127, 25);
		add(ByDate);
		
		locationsearch = new JTextField();
		locationsearch.setBounds(352, 96, 127, 22);
		add(locationsearch);
		locationsearch.setColumns(10);
		
		namesearch = new JTextField();
		namesearch.setColumns(10);
		namesearch.setBounds(352, 126, 127, 22);
		add(namesearch);
		
		JDateChooser datesearch = new JDateChooser();
		datesearch.setBounds(351, 161, 128, 22);
		add(datesearch);
		
		JRadioButton rdbtnSeeMoreOptions = new JRadioButton("See more options...");
		rdbtnSeeMoreOptions.setBackground(new Color(204, 204, 255));
		rdbtnSeeMoreOptions.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnSeeMoreOptions.setBounds(217, 201, 169, 25);
		add(rdbtnSeeMoreOptions);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(217, 235, 262, 239);
		add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton ByWork = new JRadioButton("By Work:");
		ByWork.setBounds(0, 9, 105, 25);
		ByWork.setBackground(new Color(204, 204, 255));
		panel_1.add(ByWork);
		
		JRadioButton ByEducation = new JRadioButton("By Education:");
		ByEducation.setBackground(new Color(204, 204, 255));
		ByEducation.setBounds(0, 39, 105, 25);
		panel_1.add(ByEducation);
		
		JRadioButton ByHometown = new JRadioButton("By Hometown:");
		ByHometown.setBackground(new Color(204, 204, 255));
		ByHometown.setBounds(0, 69, 105, 25);
		panel_1.add(ByHometown);
		
		worksearch = new JTextField();
		worksearch.setColumns(10);
		worksearch.setBounds(135, 10, 127, 22);
		panel_1.add(worksearch);
		
		educationsearch = new JTextField();
		educationsearch.setColumns(10);
		educationsearch.setBounds(135, 40, 127, 22);
		panel_1.add(educationsearch);
		
		hometownsearch = new JTextField();
		hometownsearch.setColumns(10);
		hometownsearch.setBounds(135, 70, 127, 22);
		panel_1.add(hometownsearch);

	}
}
