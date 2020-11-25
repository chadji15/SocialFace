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
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class search extends JPanel {
	private JButton btnSearch;
	private JTextField txtEventName;
	private JTextField txtVenue;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public search() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 255));
		panel.add(panel_1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{56, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{60, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(search.class.getResource("/images/logo64.png")));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_1.add(label, gbc_label);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut.gridx = 1;
		gbc_horizontalStrut.gridy = 0;
		panel_1.add(horizontalStrut, gbc_horizontalStrut);
		
		JLabel lblSearch = new JLabel("SEARCH");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.gridx = 2;
		gbc_lblSearch.gridy = 0;
		panel_1.add(lblSearch, gbc_lblSearch);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		JPanel peopleSearch = new JPanel();
		peopleSearch.setBackground(new Color(153, 153, 255));
		tabbedPane.addTab("People", null, peopleSearch, null);
		GridBagLayout gbl_peopleSearch = new GridBagLayout();
		gbl_peopleSearch.columnWidths = new int[]{0, 52, 0, 0, 0};
		gbl_peopleSearch.rowHeights = new int[]{43, 143, 0, 0, 0, 0};
		gbl_peopleSearch.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_peopleSearch.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		peopleSearch.setLayout(gbl_peopleSearch);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_1.gridx = 0;
		gbc_horizontalStrut_1.gridy = 0;
		peopleSearch.add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5 = new GridBagConstraints();
		gbc_verticalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_5.gridx = 1;
		gbc_verticalStrut_5.gridy = 0;
		peopleSearch.add(verticalStrut_5, gbc_verticalStrut_5);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_2.gridx = 3;
		gbc_horizontalStrut_2.gridy = 0;
		peopleSearch.add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		JPanel paramSearch_1_1 = new JPanel();
		paramSearch_1_1.setBackground(new Color(153, 153, 255));
		paramSearch_1_1.setFocusable(false);
		paramSearch_1_1.setEnabled(false);
		GridBagConstraints gbc_paramSearch_1_1 = new GridBagConstraints();
		gbc_paramSearch_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_paramSearch_1_1.fill = GridBagConstraints.BOTH;
		gbc_paramSearch_1_1.gridx = 1;
		gbc_paramSearch_1_1.gridy = 1;
		peopleSearch.add(paramSearch_1_1, gbc_paramSearch_1_1);
		GridBagLayout gbl_paramSearch_1_1 = new GridBagLayout();
		gbl_paramSearch_1_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_paramSearch_1_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_paramSearch_1_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_paramSearch_1_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		paramSearch_1_1.setLayout(gbl_paramSearch_1_1);
		
		Component verticalStrut_4_1_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4_1_1 = new GridBagConstraints();
		gbc_verticalStrut_4_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_4_1_1.gridx = 1;
		gbc_verticalStrut_4_1_1.gridy = 0;
		paramSearch_1_1.add(verticalStrut_4_1_1, gbc_verticalStrut_4_1_1);
		
		JRadioButton rdbtnSeach_1_1 = new JRadioButton("Search:");
		buttonGroup.add(rdbtnSeach_1_1);
		GridBagConstraints gbc_rdbtnSeach_1_1 = new GridBagConstraints();
		gbc_rdbtnSeach_1_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSeach_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSeach_1_1.gridx = 1;
		gbc_rdbtnSeach_1_1.gridy = 1;
		paramSearch_1_1.add(rdbtnSeach_1_1, gbc_rdbtnSeach_1_1);
		
		Component horizontalStrut_5_1_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5_1_1 = new GridBagConstraints();
		gbc_horizontalStrut_5_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_5_1_1.gridx = 0;
		gbc_horizontalStrut_5_1_1.gridy = 2;
		paramSearch_1_1.add(horizontalStrut_5_1_1, gbc_horizontalStrut_5_1_1);
		
		JCheckBox chckbxByName_2_1 = new JCheckBox("By name:");
		GridBagConstraints gbc_chckbxByName_2_1 = new GridBagConstraints();
		gbc_chckbxByName_2_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxByName_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByName_2_1.gridx = 1;
		gbc_chckbxByName_2_1.gridy = 2;
		paramSearch_1_1.add(chckbxByName_2_1, gbc_chckbxByName_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 2;
		paramSearch_1_1.add(textField_4, gbc_textField_4);
		
		Component horizontalStrut_6_1_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_6_1_1 = new GridBagConstraints();
		gbc_horizontalStrut_6_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_6_1_1.gridx = 3;
		gbc_horizontalStrut_6_1_1.gridy = 2;
		paramSearch_1_1.add(horizontalStrut_6_1_1, gbc_horizontalStrut_6_1_1);
		
		JCheckBox chckbxByBirthday_1_1 = new JCheckBox("By birthday:");
		GridBagConstraints gbc_chckbxByBirthday_1_1 = new GridBagConstraints();
		gbc_chckbxByBirthday_1_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxByBirthday_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByBirthday_1_1.gridx = 1;
		gbc_chckbxByBirthday_1_1.gridy = 3;
		paramSearch_1_1.add(chckbxByBirthday_1_1, gbc_chckbxByBirthday_1_1);
		
		JDateChooser dateChooser_2_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_2_1 = new GridBagConstraints();
		gbc_dateChooser_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_2_1.gridx = 2;
		gbc_dateChooser_2_1.gridy = 3;
		paramSearch_1_1.add(dateChooser_2_1, gbc_dateChooser_2_1);
		
		JCheckBox chckbxByLocation_1_1 = new JCheckBox("By location:");
		GridBagConstraints gbc_chckbxByLocation_1_1 = new GridBagConstraints();
		gbc_chckbxByLocation_1_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxByLocation_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByLocation_1_1.gridx = 1;
		gbc_chckbxByLocation_1_1.gridy = 4;
		paramSearch_1_1.add(chckbxByLocation_1_1, gbc_chckbxByLocation_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 4;
		paramSearch_1_1.add(textField_5, gbc_textField_5);
		
		JCheckBox chckbxBySchool_1_1 = new JCheckBox("By education:");
		GridBagConstraints gbc_chckbxBySchool_1_1 = new GridBagConstraints();
		gbc_chckbxBySchool_1_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxBySchool_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxBySchool_1_1.gridx = 1;
		gbc_chckbxBySchool_1_1.gridy = 5;
		paramSearch_1_1.add(chckbxBySchool_1_1, gbc_chckbxBySchool_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 5;
		paramSearch_1_1.add(textField_6, gbc_textField_6);
		
		JCheckBox chckbxByEmployer_1_1 = new JCheckBox("By employer:");
		GridBagConstraints gbc_chckbxByEmployer_1_1 = new GridBagConstraints();
		gbc_chckbxByEmployer_1_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxByEmployer_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByEmployer_1_1.gridx = 1;
		gbc_chckbxByEmployer_1_1.gridy = 6;
		paramSearch_1_1.add(chckbxByEmployer_1_1, gbc_chckbxByEmployer_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.gridx = 2;
		gbc_textField_7.gridy = 6;
		paramSearch_1_1.add(textField_7, gbc_textField_7);
		
		Component verticalStrut_5_1_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5_1_1 = new GridBagConstraints();
		gbc_verticalStrut_5_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_5_1_1.gridx = 1;
		gbc_verticalStrut_5_1_1.gridy = 7;
		paramSearch_1_1.add(verticalStrut_5_1_1, gbc_verticalStrut_5_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 255));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 1;
		peopleSearch.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{34, 83, 30, 42, 0};
		gbl_panel_2.rowHeights = new int[]{0, 25, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		panel_2.add(verticalStrut, gbc_verticalStrut);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
		gbc_horizontalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_5.gridx = 0;
		gbc_horizontalStrut_5.gridy = 1;
		panel_2.add(horizontalStrut_5, gbc_horizontalStrut_5);
		
		JRadioButton rdbtnFind_1_1 = new JRadioButton("Find people with at least:");
		buttonGroup.add(rdbtnFind_1_1);
		GridBagConstraints gbc_rdbtnFind_1_1 = new GridBagConstraints();
		gbc_rdbtnFind_1_1.gridwidth = 2;
		gbc_rdbtnFind_1_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnFind_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnFind_1_1.gridx = 1;
		gbc_rdbtnFind_1_1.gridy = 1;
		panel_2.add(rdbtnFind_1_1, gbc_rdbtnFind_1_1);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_6 = new GridBagConstraints();
		gbc_horizontalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_6.gridx = 3;
		gbc_horizontalStrut_6.gridy = 1;
		panel_2.add(horizontalStrut_6, gbc_horizontalStrut_6);
		
		JSpinner albumSpinner_1_1 = new JSpinner();
		GridBagConstraints gbc_albumSpinner_1_1 = new GridBagConstraints();
		gbc_albumSpinner_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_albumSpinner_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_albumSpinner_1_1.gridx = 1;
		gbc_albumSpinner_1_1.gridy = 2;
		panel_2.add(albumSpinner_1_1, gbc_albumSpinner_1_1);
		
		JLabel lblAlbum_1_1 = new JLabel("Albums");
		GridBagConstraints gbc_lblAlbum_1_1 = new GridBagConstraints();
		gbc_lblAlbum_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblAlbum_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlbum_1_1.gridx = 2;
		gbc_lblAlbum_1_1.gridy = 2;
		panel_2.add(lblAlbum_1_1, gbc_lblAlbum_1_1);
		
		JLabel lblScope_1_1_1 = new JLabel("Scope:");
		GridBagConstraints gbc_lblScope_1_1_1 = new GridBagConstraints();
		gbc_lblScope_1_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblScope_1_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblScope_1_1_1.gridx = 1;
		gbc_lblScope_1_1_1.gridy = 3;
		panel_2.add(lblScope_1_1_1, gbc_lblScope_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Friends", "Network"}));
		GridBagConstraints gbc_comboBox_1_1 = new GridBagConstraints();
		gbc_comboBox_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox_1_1.gridx = 2;
		gbc_comboBox_1_1.gridy = 3;
		panel_2.add(comboBox_1_1, gbc_comboBox_1_1);
		
		btnSearch = new JButton("Search");
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.gridwidth = 2;
		gbc_btnSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSearch.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearch.gridx = 1;
		gbc_btnSearch.gridy = 3;
		peopleSearch.add(btnSearch, gbc_btnSearch);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_4.gridx = 1;
		gbc_verticalStrut_4.gridy = 4;
		peopleSearch.add(verticalStrut_4, gbc_verticalStrut_4);
		
		JPanel eventSearch = new JPanel();
		tabbedPane.addTab("Events", null, eventSearch, null);
		GridBagLayout gbl_eventSearch = new GridBagLayout();
		gbl_eventSearch.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_eventSearch.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_eventSearch.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_eventSearch.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		eventSearch.setLayout(gbl_eventSearch);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 0;
		eventSearch.add(verticalStrut_1, gbc_verticalStrut_1);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_3.gridx = 0;
		gbc_horizontalStrut_3.gridy = 1;
		eventSearch.add(horizontalStrut_3, gbc_horizontalStrut_3);
		
		JCheckBox chckbxByName_1 = new JCheckBox("By name:");
		GridBagConstraints gbc_chckbxByName_1 = new GridBagConstraints();
		gbc_chckbxByName_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxByName_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByName_1.gridx = 1;
		gbc_chckbxByName_1.gridy = 1;
		eventSearch.add(chckbxByName_1, gbc_chckbxByName_1);
		
		txtEventName = new JTextField();
		GridBagConstraints gbc_txtEventName = new GridBagConstraints();
		gbc_txtEventName.gridwidth = 2;
		gbc_txtEventName.anchor = GridBagConstraints.NORTH;
		gbc_txtEventName.insets = new Insets(0, 0, 5, 5);
		gbc_txtEventName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventName.gridx = 2;
		gbc_txtEventName.gridy = 1;
		eventSearch.add(txtEventName, gbc_txtEventName);
		txtEventName.setColumns(10);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_4 = new GridBagConstraints();
		gbc_horizontalStrut_4.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_4.gridx = 4;
		gbc_horizontalStrut_4.gridy = 1;
		eventSearch.add(horizontalStrut_4, gbc_horizontalStrut_4);
		
		JCheckBox chckbxByVenue = new JCheckBox("By venue:");
		GridBagConstraints gbc_chckbxByVenue = new GridBagConstraints();
		gbc_chckbxByVenue.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxByVenue.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByVenue.gridx = 1;
		gbc_chckbxByVenue.gridy = 2;
		eventSearch.add(chckbxByVenue, gbc_chckbxByVenue);
		
		txtVenue = new JTextField();
		GridBagConstraints gbc_txtVenue = new GridBagConstraints();
		gbc_txtVenue.gridwidth = 2;
		gbc_txtVenue.insets = new Insets(0, 0, 5, 5);
		gbc_txtVenue.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtVenue.gridx = 2;
		gbc_txtVenue.gridy = 2;
		eventSearch.add(txtVenue, gbc_txtVenue);
		txtVenue.setColumns(10);
		
		JCheckBox chckbxByDate = new JCheckBox("By date:");
		GridBagConstraints gbc_chckbxByDate = new GridBagConstraints();
		gbc_chckbxByDate.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxByDate.gridx = 1;
		gbc_chckbxByDate.gridy = 3;
		eventSearch.add(chckbxByDate, gbc_chckbxByDate);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.gridwidth = 2;
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.gridx = 2;
		gbc_dateChooser_1.gridy = 3;
		eventSearch.add(dateChooser_1, gbc_dateChooser_1);
		
		JButton btnSearch_1 = new JButton("Search");
		GridBagConstraints gbc_btnSearch_1 = new GridBagConstraints();
		gbc_btnSearch_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSearch_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearch_1.gridx = 1;
		gbc_btnSearch_1.gridy = 4;
		eventSearch.add(btnSearch_1, gbc_btnSearch_1);
		
		JButton btnFindLeastPopular = new JButton("Find least popular");
		GridBagConstraints gbc_btnFindLeastPopular = new GridBagConstraints();
		gbc_btnFindLeastPopular.insets = new Insets(0, 0, 5, 5);
		gbc_btnFindLeastPopular.gridx = 1;
		gbc_btnFindLeastPopular.gridy = 5;
		eventSearch.add(btnFindLeastPopular, gbc_btnFindLeastPopular);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 1;
		gbc_verticalStrut_3.gridy = 6;
		eventSearch.add(verticalStrut_3, gbc_verticalStrut_3);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 7;
		eventSearch.add(scrollPane, gbc_scrollPane);
		
		JList eventList = new JList();
		scrollPane.setViewportView(eventList);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 8;
		eventSearch.add(verticalStrut_2, gbc_verticalStrut_2);

	}
	public JButton getBtnSearch() {
		return btnSearch;
	}
}
