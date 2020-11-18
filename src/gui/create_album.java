package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(create_album.class.getResource("/images/logo16.png")));
		setBounds(100, 100, 450, 206);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblCreateAlbum = new JLabel("Create album");
			lblCreateAlbum.setFont(new Font("Tahoma", Font.BOLD, 13));
			GridBagConstraints gbc_lblCreateAlbum = new GridBagConstraints();
			gbc_lblCreateAlbum.gridwidth = 2;
			gbc_lblCreateAlbum.insets = new Insets(0, 0, 5, 5);
			gbc_lblCreateAlbum.gridx = 1;
			gbc_lblCreateAlbum.gridy = 0;
			contentPanel.add(lblCreateAlbum, gbc_lblCreateAlbum);
		}
		{
			JLabel lblAlbumName = new JLabel("Album name:");
			lblAlbumName.setFont(new Font("Tahoma", Font.BOLD, 13));
			GridBagConstraints gbc_lblAlbumName = new GridBagConstraints();
			gbc_lblAlbumName.anchor = GridBagConstraints.EAST;
			gbc_lblAlbumName.insets = new Insets(0, 0, 5, 5);
			gbc_lblAlbumName.gridx = 1;
			gbc_lblAlbumName.gridy = 2;
			contentPanel.add(lblAlbumName, gbc_lblAlbumName);
		}
		{
			nameText = new JTextField();
			GridBagConstraints gbc_nameText = new GridBagConstraints();
			gbc_nameText.insets = new Insets(0, 0, 5, 5);
			gbc_nameText.fill = GridBagConstraints.HORIZONTAL;
			gbc_nameText.gridx = 2;
			gbc_nameText.gridy = 2;
			contentPanel.add(nameText, gbc_nameText);
			nameText.setColumns(10);
		}
		{
			JLabel lblPrivacy = new JLabel("Privacy:");
			lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 13));
			GridBagConstraints gbc_lblPrivacy = new GridBagConstraints();
			gbc_lblPrivacy.anchor = GridBagConstraints.EAST;
			gbc_lblPrivacy.insets = new Insets(0, 0, 0, 5);
			gbc_lblPrivacy.gridx = 1;
			gbc_lblPrivacy.gridy = 3;
			contentPanel.add(lblPrivacy, gbc_lblPrivacy);
		}
		{
			JComboBox privaceCombo = new JComboBox();
			GridBagConstraints gbc_privaceCombo = new GridBagConstraints();
			gbc_privaceCombo.insets = new Insets(0, 0, 0, 5);
			gbc_privaceCombo.fill = GridBagConstraints.HORIZONTAL;
			gbc_privaceCombo.gridx = 2;
			gbc_privaceCombo.gridy = 3;
			contentPanel.add(privaceCombo, gbc_privaceCombo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
