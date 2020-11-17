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

public class displayEvent extends JDialog {
	private JTextField nameText;
	private JTextField locationText;
	private JTextField startText;
	private JTextField endText;
	private JTextField venueText;
	private JTextField textField_5;
	private JTextField ownerText;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setMinimumSize(new Dimension(710, 370));
		setTitle("View event");
		setIconImage(Toolkit.getDefaultToolkit().getImage(displayEvent.class.getResource("/images/logo16.png")));
		setBounds(100, 100, 721, 370);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JRadioButton goingButton = new JRadioButton("Going");
			buttonGroup.add(goingButton);
			buttonPane.add(goingButton);
			
			JRadioButton notGoingButton = new JRadioButton("Not going");
			buttonGroup.add(notGoingButton);
			buttonPane.add(notGoingButton);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		{
			JPanel privacyText = new JPanel();
			getContentPane().add(privacyText, BorderLayout.NORTH);
			privacyText.setBorder(new EmptyBorder(5, 5, 5, 5));
			JLabel lblName = new JLabel("Name:");
			nameText = new JTextField();
			nameText.setEditable(false);
			nameText.setColumns(10);
			JLabel lblEndTime = new JLabel("Start time:");
			JLabel lblVenue = new JLabel("End time:");
			JLabel lblLocation = new JLabel("Venue:");
			JLabel lblPrivacy = new JLabel("Location:");
			JLabel lblNewLabel = new JLabel("Privacy:");
			locationText = new JTextField();
			locationText.setEditable(false);
			locationText.setColumns(10);
			JLabel lblDescription = new JLabel("Description:");
			JScrollPane scrollPane = new JScrollPane();
			
			startText = new JTextField();
			startText.setEditable(false);
			startText.setColumns(10);
			
			endText = new JTextField();
			endText.setEditable(false);
			endText.setColumns(10);
			
			venueText = new JTextField();
			venueText.setEditable(false);
			venueText.setColumns(10);
			
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setColumns(10);
			
			JLabel lblOwner = new JLabel("Owner:");
			
			ownerText = new JTextField();
			ownerText.setEditable(false);
			ownerText.setColumns(10);
			GroupLayout gl_privacyText = new GroupLayout(privacyText);
			gl_privacyText.setHorizontalGroup(
				gl_privacyText.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_privacyText.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_privacyText.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblEndTime)
							.addComponent(lblVenue)
							.addComponent(lblLocation)
							.addComponent(lblPrivacy)
							.addComponent(lblNewLabel)
							.addComponent(lblName)
							.addComponent(lblOwner))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_privacyText.createParallelGroup(Alignment.LEADING)
							.addComponent(nameText, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
							.addComponent(locationText, 224, 224, Short.MAX_VALUE)
							.addComponent(startText, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
							.addComponent(endText, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
							.addComponent(venueText, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
							.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
							.addComponent(ownerText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
						.addGap(12)
						.addGroup(gl_privacyText.createParallelGroup(Alignment.LEADING)
							.addComponent(lblDescription)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE))
						.addGap(92))
			);
			gl_privacyText.setVerticalGroup(
				gl_privacyText.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_privacyText.createSequentialGroup()
						.addGap(23)
						.addGroup(gl_privacyText.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblDescription)
							.addComponent(ownerText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblOwner))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_privacyText.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_privacyText.createSequentialGroup()
								.addGroup(gl_privacyText.createParallelGroup(Alignment.BASELINE)
									.addComponent(nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblName))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_privacyText.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblEndTime)
									.addComponent(startText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_privacyText.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblVenue)
									.addComponent(endText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_privacyText.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblLocation)
									.addComponent(venueText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_privacyText.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblPrivacy)
									.addComponent(locationText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_privacyText.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGap(15))
			);
			
			JTextArea descriptionText = new JTextArea();
			descriptionText.setBackground(SystemColor.control);
			descriptionText.setEditable(false);
			scrollPane.setViewportView(descriptionText);
			privacyText.setLayout(gl_privacyText);
		}
	}
}
