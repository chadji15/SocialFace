package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JSplitPane;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.Box;
import com.team21.Privacy;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class displayEvent extends JDialog {
	private JTextField nameText;
	private JTextField locationText;
	private JTextField ownerText;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private boolean toEdit = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			displayEvent dialog = new displayEvent();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public displayEvent() {
		setModal(true);
		setMinimumSize(new Dimension(710, 370));
		setTitle("View event");
		setIconImage(Toolkit.getDefaultToolkit().getImage(displayEvent.class.getResource("/images/logo16.png")));
		setBounds(100, 100, 730, 370);
		getContentPane().setLayout(new BorderLayout());
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		JRadioButton goingButton = new JRadioButton("Going");
		goingButton.setSelected(true);
		goingButton.setEnabled(false);
		buttonGroup.add(goingButton);
		buttonPane.add(goingButton);
		
		JRadioButton notGoingButton = new JRadioButton("Not going");
		notGoingButton.setEnabled(false);
		buttonGroup.add(notGoingButton);
		buttonPane.add(notGoingButton);
		
		JToggleButton tglbtnEdit = new JToggleButton("Edit");
		
		buttonPane.add(tglbtnEdit);
	
		JButton okButton = new JButton("OK");
		
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
	
		
		JPanel privacyText = new JPanel();
		getContentPane().add(privacyText, BorderLayout.NORTH);
		privacyText.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_privacyText = new GridBagLayout();
		gbl_privacyText.columnWidths = new int[]{62, 224, 0, 367, 0};
		gbl_privacyText.rowHeights = new int[]{0, 22, 22, 22, 22, 22, 22, 40, 0, 0};
		gbl_privacyText.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_privacyText.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		privacyText.setLayout(gbl_privacyText);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		privacyText.add(verticalStrut, gbc_verticalStrut);
		
		JLabel lblOwner = new JLabel("Owner:");
		GridBagConstraints gbc_lblOwner = new GridBagConstraints();
		gbc_lblOwner.anchor = GridBagConstraints.EAST;
		gbc_lblOwner.insets = new Insets(0, 0, 5, 5);
		gbc_lblOwner.gridx = 0;
		gbc_lblOwner.gridy = 1;
		privacyText.add(lblOwner, gbc_lblOwner);
		
		ownerText = new JTextField();
		ownerText.setEditable(false);
		ownerText.setColumns(10);
		GridBagConstraints gbc_ownerText = new GridBagConstraints();
		gbc_ownerText.anchor = GridBagConstraints.NORTH;
		gbc_ownerText.fill = GridBagConstraints.HORIZONTAL;
		gbc_ownerText.insets = new Insets(0, 0, 5, 5);
		gbc_ownerText.gridx = 1;
		gbc_ownerText.gridy = 1;
		privacyText.add(ownerText, gbc_ownerText);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 2;
		gbc_horizontalStrut.gridy = 1;
		privacyText.add(horizontalStrut, gbc_horizontalStrut);
		JLabel lblDescription = new JLabel("Description:");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.WEST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 0);
		gbc_lblDescription.gridx = 3;
		gbc_lblDescription.gridy = 1;
		privacyText.add(lblDescription, gbc_lblDescription);
		JLabel lblName = new JLabel("Name:");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 2;
		privacyText.add(lblName, gbc_lblName);
		nameText = new JTextField();
		nameText.setEditable(false);
		nameText.setColumns(10);
		GridBagConstraints gbc_nameText = new GridBagConstraints();
		gbc_nameText.anchor = GridBagConstraints.NORTH;
		gbc_nameText.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameText.insets = new Insets(0, 0, 5, 5);
		gbc_nameText.gridx = 1;
		gbc_nameText.gridy = 2;
		privacyText.add(nameText, gbc_nameText);
		JScrollPane scrollPane = new JScrollPane();
		
		JTextArea descriptionText = new JTextArea();
		descriptionText.setBackground(SystemColor.control);
		descriptionText.setEditable(false);
		scrollPane.setViewportView(descriptionText);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 7;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 2;
		privacyText.add(scrollPane, gbc_scrollPane);
		JLabel lblEndTime = new JLabel("Start time:");
		GridBagConstraints gbc_lblEndTime = new GridBagConstraints();
		gbc_lblEndTime.anchor = GridBagConstraints.WEST;
		gbc_lblEndTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndTime.gridx = 0;
		gbc_lblEndTime.gridy = 3;
		privacyText.add(lblEndTime, gbc_lblEndTime);
		
		JSpinner startSpinner = new JSpinner();
		startSpinner.setEnabled(false);
		startSpinner.setModel(new SpinnerDateModel(new Date(1605823200000L), new Date(1605823200000L), null, Calendar.DAY_OF_YEAR));
		GridBagConstraints gbc_startSpinner = new GridBagConstraints();
		gbc_startSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_startSpinner.gridx = 1;
		gbc_startSpinner.gridy = 3;
		privacyText.add(startSpinner, gbc_startSpinner);
		JLabel lblVenue = new JLabel("End time:");
		GridBagConstraints gbc_lblVenue = new GridBagConstraints();
		gbc_lblVenue.anchor = GridBagConstraints.EAST;
		gbc_lblVenue.insets = new Insets(0, 0, 5, 5);
		gbc_lblVenue.gridx = 0;
		gbc_lblVenue.gridy = 4;
		privacyText.add(lblVenue, gbc_lblVenue);
		
		JSpinner endSpinner = new JSpinner();
		endSpinner.setEnabled(false);
		endSpinner.setModel(new SpinnerDateModel(new Date(1605823200000L), new Date(1605823200000L), null, Calendar.DAY_OF_YEAR));
		GridBagConstraints gbc_endSpinner = new GridBagConstraints();
		gbc_endSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_endSpinner.gridx = 1;
		gbc_endSpinner.gridy = 4;
		privacyText.add(endSpinner, gbc_endSpinner);
		JLabel lblLocation = new JLabel("Venue:");
		GridBagConstraints gbc_lblLocation = new GridBagConstraints();
		gbc_lblLocation.anchor = GridBagConstraints.EAST;
		gbc_lblLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocation.gridx = 0;
		gbc_lblLocation.gridy = 5;
		privacyText.add(lblLocation, gbc_lblLocation);
		
		JComboBox venueCombo = new JComboBox();
		venueCombo.setEnabled(false);
		GridBagConstraints gbc_venueCombo = new GridBagConstraints();
		gbc_venueCombo.insets = new Insets(0, 0, 5, 5);
		gbc_venueCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_venueCombo.gridx = 1;
		gbc_venueCombo.gridy = 5;
		privacyText.add(venueCombo, gbc_venueCombo);
		JLabel lblPrivacy = new JLabel("Location:");
		GridBagConstraints gbc_lblPrivacy = new GridBagConstraints();
		gbc_lblPrivacy.anchor = GridBagConstraints.EAST;
		gbc_lblPrivacy.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrivacy.gridx = 0;
		gbc_lblPrivacy.gridy = 6;
		privacyText.add(lblPrivacy, gbc_lblPrivacy);
		locationText = new JTextField();
		locationText.setEditable(false);
		locationText.setColumns(10);
		GridBagConstraints gbc_locationText = new GridBagConstraints();
		gbc_locationText.anchor = GridBagConstraints.NORTH;
		gbc_locationText.fill = GridBagConstraints.HORIZONTAL;
		gbc_locationText.insets = new Insets(0, 0, 5, 5);
		gbc_locationText.gridx = 1;
		gbc_locationText.gridy = 6;
		privacyText.add(locationText, gbc_locationText);
		JLabel lblNewLabel = new JLabel("Privacy:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 7;
		privacyText.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox privacyCombo = new JComboBox();
		privacyCombo.setEnabled(false);
		privacyCombo.setModel(new DefaultComboBoxModel(Privacy.values()));
		GridBagConstraints gbc_privacyCombo = new GridBagConstraints();
		gbc_privacyCombo.insets = new Insets(0, 0, 5, 5);
		gbc_privacyCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_privacyCombo.gridx = 1;
		gbc_privacyCombo.gridy = 7;
		privacyText.add(privacyCombo, gbc_privacyCombo);
		

		tglbtnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnEdit.isSelected()) {
					nameText.setEditable(true);
					startSpinner.setEnabled(true);
					endSpinner.setEnabled(true);
					venueCombo.setEnabled(true);
					locationText.setEditable(true);
					privacyCombo.setEnabled(true);
					descriptionText.setEditable(true);
					goingButton.setEnabled(true);
					notGoingButton.setEnabled(true);
				}
				else {
					nameText.setEditable(false);
					startSpinner.setEnabled(false);
					endSpinner.setEnabled(false);
					venueCombo.setEnabled(false);
					locationText.setEditable(false);
					privacyCombo.setEnabled(false);
					descriptionText.setEditable(false);
					goingButton.setEnabled(false);
					notGoingButton.setEnabled(false);
				}
			}
		});
	}
}
