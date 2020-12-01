package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;
import java.util.Vector;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;
import com.team21.User;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class create_album extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nameText;

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
			create_album dialog = new create_album();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public create_album() {
		setModal(true);
		setTitle("SocialFace");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Katerinatz\\Desktop\\125302082_369991734446627_3387089125455958246_n.png"));
		setBounds(100, 100, 738, 402);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.menu);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);

		JLabel lblCreateAlbum = new JLabel("Create album");
		lblCreateAlbum.setForeground(SystemColor.activeCaption);
		lblCreateAlbum.setFont(new Font("Tahoma", Font.BOLD, 28));
		GridBagConstraints gbc_lblCreateAlbum = new GridBagConstraints();
		gbc_lblCreateAlbum.gridwidth = 2;
		gbc_lblCreateAlbum.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreateAlbum.gridx = 1;
		gbc_lblCreateAlbum.gridy = 0;
		contentPanel.add(lblCreateAlbum, gbc_lblCreateAlbum);

		JLabel lblAlbumName = new JLabel("Album name:");
		lblAlbumName.setForeground(SystemColor.desktop);
		lblAlbumName.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblAlbumName = new GridBagConstraints();
		gbc_lblAlbumName.anchor = GridBagConstraints.EAST;
		gbc_lblAlbumName.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlbumName.gridx = 1;
		gbc_lblAlbumName.gridy = 2;
		contentPanel.add(lblAlbumName, gbc_lblAlbumName);

		nameText = new JTextField();
		GridBagConstraints gbc_nameText = new GridBagConstraints();
		gbc_nameText.insets = new Insets(0, 0, 5, 5);
		gbc_nameText.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameText.gridx = 2;
		gbc_nameText.gridy = 2;
		contentPanel.add(nameText, gbc_nameText);
		nameText.setColumns(10);

		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(SystemColor.desktop);
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 1;
		gbc_lblDescription.gridy = 3;
		contentPanel.add(lblDescription, gbc_lblDescription);

		JTextArea txtDescription = new JTextArea();
		GridBagConstraints gbc_txtDescription = new GridBagConstraints();
		gbc_txtDescription.gridheight = 2;
		gbc_txtDescription.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescription.fill = GridBagConstraints.BOTH;
		gbc_txtDescription.gridx = 2;
		gbc_txtDescription.gridy = 3;
		contentPanel.add(txtDescription, gbc_txtDescription);

		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblLocation = new GridBagConstraints();
		gbc_lblLocation.anchor = GridBagConstraints.EAST;
		gbc_lblLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocation.gridx = 1;
		gbc_lblLocation.gridy = 5;
		contentPanel.add(lblLocation, gbc_lblLocation);

		JComboBox locationCombo = new JComboBox();
		GridBagConstraints gbc_locationCombo = new GridBagConstraints();
		gbc_locationCombo.insets = new Insets(0, 0, 5, 5);
		gbc_locationCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_locationCombo.gridx = 2;
		gbc_locationCombo.gridy = 5;
		contentPanel.add(locationCombo, gbc_locationCombo);

		JLabel lblPrivacy = new JLabel("Privacy:");
		lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblPrivacy = new GridBagConstraints();
		gbc_lblPrivacy.anchor = GridBagConstraints.EAST;
		gbc_lblPrivacy.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrivacy.gridx = 1;
		gbc_lblPrivacy.gridy = 6;
		contentPanel.add(lblPrivacy, gbc_lblPrivacy);

		JComboBox privacyCombo = new JComboBox();
		privacyCombo.setModel(new DefaultComboBoxModel(Privacy.values()));
		GridBagConstraints gbc_privacyCombo = new GridBagConstraints();
		gbc_privacyCombo.insets = new Insets(0, 0, 0, 5);
		gbc_privacyCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_privacyCombo.gridx = 2;
		gbc_privacyCombo.gridy = 6;
		contentPanel.add(privacyCombo, gbc_privacyCombo);

		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(SystemColor.activeCaption);
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
		
		okButton.setBackground(SystemColor.activeCaption);
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("Cancel");
		
		cancelButton.setBackground(SystemColor.activeCaption);
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
		
		User visited = ConnectionService.getInstance().getVisited();
		Connection con = ConnectionService.getInstance().getConn();

		Vector<IdNamePair> vector = new Vector<>();
		vector.add(new IdNamePair(-1, null));
		String SPsql = "EXEC dbo.getAllCities";
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
		locationCombo.setModel(new DefaultComboBoxModel<IdNamePair>(vector));
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nameText.getText().length() == 0) {
					JOptionPane.showMessageDialog(create_album.this, "Album name cannot be empty");
					return;
				}
				
				String SPsql = "EXEC dbo.insertalbum ?, ?, ?, ?, ?";
				PreparedStatement ps = null;
				int rs = -1;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setString(1, nameText.getText());
					ps.setString(2, ((Privacy )privacyCombo.getSelectedItem()).toChar());
					if (txtDescription.getText().length()==0)
						ps.setNull(3, Types.VARCHAR);
					else
						ps.setString(3, txtDescription.getText());
					if (locationCombo.getSelectedIndex() == 0)
						ps.setNull(4, Types.INTEGER);
					else {
						IdNamePair city = (IdNamePair) locationCombo.getSelectedItem();
						ps.setInt(4, city.getId());
					}
					ps.setInt(5, visited.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (rs > 0) {
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(create_album.this, "Album creation was not successful.");
				}
				
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
