package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.User;
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
import javax.swing.DefaultListModel;
import javax.swing.ButtonGroup;
import javax.swing.SpinnerNumberModel;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;

public class search extends JPanel {
	private JButton btnSearch;
	private JTextField txtEventName;
	private JTextField txtVenue;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chckbxByName_2;
	private JCheckBox chckbxByBirthday_1;
	private JCheckBox chckbxByLocation_1;
	private JCheckBox chckbxBySchool_1;
	private JCheckBox chckbxByEmployer_1;
	private JDateChooser birthdayLine;
	private JRadioButton rdbtnFindFriends;
	private JRadioButton rdbtnSearch;
	private JRadioButton rdbtnFindFriendsWith;
	private JSpinner albumSpinner_1;
	private JComboBox scopeCombo;
	private JTextField txtname;
	private JComboBox comboLocation;
	private JTextField txtEducation;
	private JTextField txtemployer;

	/**
	 * Create the panel.
	 */
	public search() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
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
		lblSearch.setBackground(SystemColor.activeCaption);
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.gridx = 2;
		gbc_lblSearch.gridy = 0;
		panel_1.add(lblSearch, gbc_lblSearch);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		JPanel peopleSearch = new JPanel();
		peopleSearch.setBackground(SystemColor.menu);
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
		paramSearch_1_1.setBackground(SystemColor.menu);
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
		
		rdbtnSearch = new JRadioButton("Search:");
		rdbtnSearch.setSelected(true);
		buttonGroup.add(rdbtnSearch);
		GridBagConstraints gbc_rdbtnSearch = new GridBagConstraints();
		gbc_rdbtnSearch.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSearch.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSearch.gridx = 1;
		gbc_rdbtnSearch.gridy = 1;
		paramSearch_1_1.add(rdbtnSearch, gbc_rdbtnSearch);
		
		Component horizontalStrut_5_1_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5_1_1 = new GridBagConstraints();
		gbc_horizontalStrut_5_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_5_1_1.gridx = 0;
		gbc_horizontalStrut_5_1_1.gridy = 2;
		paramSearch_1_1.add(horizontalStrut_5_1_1, gbc_horizontalStrut_5_1_1);
		
		chckbxByName_2 = new JCheckBox("By name:");
		chckbxByName_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxByName_2.setBackground(SystemColor.menu);
		GridBagConstraints gbc_chckbxByName_2 = new GridBagConstraints();
		gbc_chckbxByName_2.anchor = GridBagConstraints.WEST;
		gbc_chckbxByName_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByName_2.gridx = 1;
		gbc_chckbxByName_2.gridy = 2;
		paramSearch_1_1.add(chckbxByName_2, gbc_chckbxByName_2);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		GridBagConstraints gbc_txtname = new GridBagConstraints();
		gbc_txtname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtname.insets = new Insets(0, 0, 5, 5);
		gbc_txtname.gridx = 2;
		gbc_txtname.gridy = 2;
		paramSearch_1_1.add(txtname, gbc_txtname);
		
		Component horizontalStrut_6_1_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_6_1_1 = new GridBagConstraints();
		gbc_horizontalStrut_6_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_6_1_1.gridx = 3;
		gbc_horizontalStrut_6_1_1.gridy = 2;
		paramSearch_1_1.add(horizontalStrut_6_1_1, gbc_horizontalStrut_6_1_1);
		
		chckbxByBirthday_1 = new JCheckBox("By birthday:");
		chckbxByBirthday_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxByBirthday_1.setBackground(SystemColor.menu);
		GridBagConstraints gbc_chckbxByBirthday_1 = new GridBagConstraints();
		gbc_chckbxByBirthday_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxByBirthday_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByBirthday_1.gridx = 1;
		gbc_chckbxByBirthday_1.gridy = 3;
		paramSearch_1_1.add(chckbxByBirthday_1, gbc_chckbxByBirthday_1);
		
		birthdayLine = new JDateChooser();
		birthdayLine.getCalendarButton().setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_birthdayLine = new GridBagConstraints();
		gbc_birthdayLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_birthdayLine.insets = new Insets(0, 0, 5, 5);
		gbc_birthdayLine.gridx = 2;
		gbc_birthdayLine.gridy = 3;
		paramSearch_1_1.add(birthdayLine, gbc_birthdayLine);
		
		chckbxByLocation_1 = new JCheckBox("By location:");
		chckbxByLocation_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_chckbxByLocation_1 = new GridBagConstraints();
		gbc_chckbxByLocation_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxByLocation_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByLocation_1.gridx = 1;
		gbc_chckbxByLocation_1.gridy = 4;
		paramSearch_1_1.add(chckbxByLocation_1, gbc_chckbxByLocation_1);
		
		comboLocation = new JComboBox();
		GridBagConstraints gbc_comboLocation = new GridBagConstraints();
		gbc_comboLocation.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboLocation.insets = new Insets(0, 0, 5, 5);
		gbc_comboLocation.gridx = 2;
		gbc_comboLocation.gridy = 4;
		paramSearch_1_1.add(comboLocation, gbc_comboLocation);
		
		chckbxBySchool_1 = new JCheckBox("By education:");
		chckbxBySchool_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_chckbxBySchool_1 = new GridBagConstraints();
		gbc_chckbxBySchool_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxBySchool_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxBySchool_1.gridx = 1;
		gbc_chckbxBySchool_1.gridy = 5;
		paramSearch_1_1.add(chckbxBySchool_1, gbc_chckbxBySchool_1);
		
		txtEducation = new JTextField();
		txtEducation.setColumns(10);
		GridBagConstraints gbc_txtEducation = new GridBagConstraints();
		gbc_txtEducation.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEducation.insets = new Insets(0, 0, 5, 5);
		gbc_txtEducation.gridx = 2;
		gbc_txtEducation.gridy = 5;
		paramSearch_1_1.add(txtEducation, gbc_txtEducation);
		
		chckbxByEmployer_1 = new JCheckBox("By employer:");
		GridBagConstraints gbc_chckbxByEmployer_1 = new GridBagConstraints();
		gbc_chckbxByEmployer_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxByEmployer_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxByEmployer_1.gridx = 1;
		gbc_chckbxByEmployer_1.gridy = 6;
		paramSearch_1_1.add(chckbxByEmployer_1, gbc_chckbxByEmployer_1);
		
		txtemployer = new JTextField();
		txtemployer.setColumns(10);
		GridBagConstraints gbc_txtemployer = new GridBagConstraints();
		gbc_txtemployer.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtemployer.insets = new Insets(0, 0, 5, 5);
		gbc_txtemployer.gridx = 2;
		gbc_txtemployer.gridy = 6;
		paramSearch_1_1.add(txtemployer, gbc_txtemployer);
		
		Component verticalStrut_5_1_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5_1_1 = new GridBagConstraints();
		gbc_verticalStrut_5_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_5_1_1.gridx = 1;
		gbc_verticalStrut_5_1_1.gridy = 7;
		paramSearch_1_1.add(verticalStrut_5_1_1, gbc_verticalStrut_5_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.menu);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 1;
		peopleSearch.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{34, 83, 30, 42, 0};
		gbl_panel_2.rowHeights = new int[]{0, 25, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		rdbtnFindFriends = new JRadioButton("Find people with albums with al least:");
		rdbtnFindFriends.setFont(new Font("Tahoma", Font.BOLD, 10));
		buttonGroup.add(rdbtnFindFriends);
		GridBagConstraints gbc_rdbtnFindFriends = new GridBagConstraints();
		gbc_rdbtnFindFriends.gridwidth = 2;
		gbc_rdbtnFindFriends.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnFindFriends.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnFindFriends.gridx = 1;
		gbc_rdbtnFindFriends.gridy = 1;
		panel_2.add(rdbtnFindFriends, gbc_rdbtnFindFriends);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_6 = new GridBagConstraints();
		gbc_horizontalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_6.gridx = 3;
		gbc_horizontalStrut_6.gridy = 1;
		panel_2.add(horizontalStrut_6, gbc_horizontalStrut_6);
		
		albumSpinner_1 = new JSpinner();
		albumSpinner_1.setBackground(SystemColor.activeCaption);
		albumSpinner_1.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		GridBagConstraints gbc_albumSpinner_1 = new GridBagConstraints();
		gbc_albumSpinner_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_albumSpinner_1.insets = new Insets(0, 0, 5, 5);
		gbc_albumSpinner_1.gridx = 1;
		gbc_albumSpinner_1.gridy = 2;
		panel_2.add(albumSpinner_1, gbc_albumSpinner_1);
		
		JLabel lblAlbum_1_1 = new JLabel("photos");
		lblAlbum_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblAlbum_1_1 = new GridBagConstraints();
		gbc_lblAlbum_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblAlbum_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlbum_1_1.gridx = 2;
		gbc_lblAlbum_1_1.gridy = 2;
		panel_2.add(lblAlbum_1_1, gbc_lblAlbum_1_1);
		
		JLabel lblScope_1_1_1 = new JLabel("Scope:");
		lblScope_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblScope_1_1_1 = new GridBagConstraints();
		gbc_lblScope_1_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblScope_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblScope_1_1_1.gridx = 1;
		gbc_lblScope_1_1_1.gridy = 3;
		panel_2.add(lblScope_1_1_1, gbc_lblScope_1_1_1);
		
		scopeCombo = new JComboBox();
		scopeCombo.setBackground(SystemColor.activeCaption);
		scopeCombo.setModel(new DefaultComboBoxModel(new String[] {"Friends", "Network"}));
		GridBagConstraints gbc_scopeCombo = new GridBagConstraints();
		gbc_scopeCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_scopeCombo.insets = new Insets(0, 0, 5, 5);
		gbc_scopeCombo.gridx = 2;
		gbc_scopeCombo.gridy = 3;
		panel_2.add(scopeCombo, gbc_scopeCombo);
		
		rdbtnFindFriendsWith = new JRadioButton("Find friends with common friends");
		buttonGroup.add(rdbtnFindFriendsWith);
		GridBagConstraints gbc_rdbtnFindFriendsWith = new GridBagConstraints();
		gbc_rdbtnFindFriendsWith.gridwidth = 2;
		gbc_rdbtnFindFriendsWith.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnFindFriendsWith.gridx = 1;
		gbc_rdbtnFindFriendsWith.gridy = 5;
		panel_2.add(rdbtnFindFriendsWith, gbc_rdbtnFindFriendsWith);
		
		btnSearch = new JButton("Search");
		btnSearch.setBackground(SystemColor.activeCaption);
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
	
	public DefaultListModel<IdNamePair> searchPeople() {
		if (!chckbxByBirthday_1.isSelected() && !chckbxByEmployer_1.isSelected() && !chckbxByLocation_1.isSelected() && !chckbxByName_2.isSelected()
				&& !chckbxBySchool_1.isSelected())
			return null;
		DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
		String SPsql = "EXEC dbo.searchPeople ?, ?, ?, ?, ?, ?";
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		User user = ConnectionService.getInstance().getUser();
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, user.getId());
			ps.setString(2, txtname.getText() );
			if (birthdayLine.getDate() == null)
				ps.setNull(3, Types.VARCHAR);
			else {
				String date = new SimpleDateFormat("yyyy-MM-dd").format(birthdayLine.getDate());
				ps.setString(3, date);
			}
			if (comboLocation.getSelectedIndex() == 0)
				ps.setNull(4, Types.INTEGER);
			else
				ps.setInt(4, comboLocation.getSelectedIndex());
			ps.setString(5, txtEducation.getText());
			ps.setString(6, txtemployer.getText());
			rs = ps.executeQuery();
			while (rs.next()) {
				iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return iModel;
	}
	
	
	public JButton getBtnSearch() {
		return btnSearch;
	}
}
