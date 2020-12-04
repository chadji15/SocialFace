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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Vector;
import java.util.Calendar;
import java.awt.Dialog.ModalityType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.SystemColor;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;
import com.team21.User;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newEvent extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nameText;
	private JTextField locationText;

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
			newEvent dialog = new newEvent();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public newEvent() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(newEvent.class.getResource("/images/logosmall.png")));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Create new event");
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 692, 334);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		JLabel lblEndTime = new JLabel("Start time:");
		lblEndTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		JLabel lblVenue = new JLabel("End time:");
		lblVenue.setFont(new Font("Tahoma", Font.BOLD, 13));
		JLabel lblLocation = new JLabel("Venue:");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 13));
		JLabel lblPrivacy = new JLabel("Location:");
		lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 13));

		nameText = new JTextField();
		nameText.setColumns(10);

		JLabel lblNewLabel = new JLabel("Privacy:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));

		JSpinner startSpinner = new JSpinner();
		startSpinner.setModel(
				new SpinnerDateModel(new Date(1605391200000L), new Date(1605391200000L), null, Calendar.DAY_OF_YEAR));
		startSpinner.setEditor(new JSpinner.DateEditor(startSpinner, "dd-MM-yyyy HH:mm"));

		JSpinner endSpinner = new JSpinner();
		
		endSpinner.setModel(
				new SpinnerDateModel(new Date(1605391200000L), new Date(1605391200000L), null, Calendar.DAY_OF_YEAR));
		endSpinner.setEditor(new JSpinner.DateEditor(endSpinner, "dd-MM-yyyy HH:mm"));
		
		JComboBox venueCombo = new JComboBox();

		locationText = new JTextField();
		locationText.setColumns(10);

		JComboBox privacyCombo = new JComboBox();
		privacyCombo.setModel(new DefaultComboBoxModel(Privacy.values()));

		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 15));

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addGroup(gl_contentPanel
						.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPanel.createSequentialGroup().addGap(36).addComponent(lblName)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(nameText))
						.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblEndTime).addComponent(lblVenue).addComponent(lblLocation)
										.addComponent(lblPrivacy).addComponent(lblNewLabel))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(privacyCombo, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(endSpinner, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(venueCombo, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(startSpinner, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(locationText)))))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(lblDescription)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(23)
						.addGroup(
								gl_contentPanel
										.createParallelGroup(Alignment.BASELINE).addComponent(lblName)
										.addComponent(nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDescription))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
								.createSequentialGroup().addGroup(gl_contentPanel.createParallelGroup(
										Alignment.BASELINE).addComponent(lblEndTime).addComponent(
												startSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPanel.createSequentialGroup()
												.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblVenue).addComponent(endSpinner,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblLocation))
										.addGroup(gl_contentPanel.createSequentialGroup().addGap(29).addComponent(
												venueCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPrivacy).addComponent(locationText, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel).addComponent(privacyCombo,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		JTextArea descriptionText = new JTextArea();
		descriptionText.setBorder(new CompoundBorder());
		scrollPane.setViewportView(descriptionText);
		contentPanel.setLayout(gl_contentPanel);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
	
		okButton.setBackground(SystemColor.activeCaption);
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setBackground(SystemColor.activeCaption);
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);

		User user = ConnectionService.getInstance().getUser();
		Vector<IdNamePair> vector = new Vector<>();
		vector.add(new IdNamePair(-1, null));
		String SPsql = "EXEC dbo.getAllCities";
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(SPsql);
			rs = ps.executeQuery();
			while (rs.next()) {
				vector.add(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		venueCombo.setModel(new DefaultComboBoxModel<IdNamePair>(vector));
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (nameText.getText().length() == 0) {
					JOptionPane.showMessageDialog(newEvent.this, "Event name cannot be blank");
					return;
				}
				String SPsql = "EXEC dbo.insertevents ?, ?, ?, ?, ?, ?, ?, ?";
				PreparedStatement ps = null;
				int rs = -1;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setString(1, nameText.getText());
					ps.setString(2, ((Privacy )privacyCombo.getSelectedItem()).toChar());
					ps.setString(3, locationText.getText());
					if (venueCombo.getSelectedIndex() == 0)
						ps.setNull(8, Types.INTEGER);
					else {
						IdNamePair city = (IdNamePair) venueCombo.getSelectedItem();
						ps.setInt(8, city.getId());
					}
					ps.setDate(4, new java.sql.Date(((java.util.Date)startSpinner.getValue()).getTime()));
					ps.setDate(5, new java.sql.Date(((java.util.Date)endSpinner.getValue()).getTime()));
					ps.setString(6, descriptionText.getText());
					ps.setInt(7, user.getId());			
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(newEvent.this, "Event creation was not successful.");
					return;
				}
			
				dispose();
			}
		});
	}
}
