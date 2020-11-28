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
import javax.swing.DefaultComboBoxModel;
import com.team21.Privacy;
import javax.swing.JTextArea;
import java.awt.SystemColor;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Katerinatz\\Desktop\\125302082_369991734446627_3387089125455958246_n.png"));
		setBounds(100, 100, 738, 402);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.menu);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblCreateAlbum = new JLabel("Create album");
			lblCreateAlbum.setForeground(SystemColor.activeCaption);
			lblCreateAlbum.setFont(new Font("Tahoma", Font.BOLD, 28));
			GridBagConstraints gbc_lblCreateAlbum = new GridBagConstraints();
			gbc_lblCreateAlbum.gridwidth = 2;
			gbc_lblCreateAlbum.insets = new Insets(0, 0, 5, 5);
			gbc_lblCreateAlbum.gridx = 1;
			gbc_lblCreateAlbum.gridy = 0;
			contentPanel.add(lblCreateAlbum, gbc_lblCreateAlbum);
		}
		{
			JLabel lblAlbumName = new JLabel("Album name:");
			lblAlbumName.setForeground(SystemColor.desktop);
			lblAlbumName.setFont(new Font("Tahoma", Font.BOLD, 15));
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
			JLabel lblDescription = new JLabel("Description:");
			lblDescription.setForeground(SystemColor.desktop);
			lblDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
			GridBagConstraints gbc_lblDescription = new GridBagConstraints();
			gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescription.gridx = 1;
			gbc_lblDescription.gridy = 3;
			contentPanel.add(lblDescription, gbc_lblDescription);
		}
		{
			JTextArea textArea = new JTextArea();
			GridBagConstraints gbc_textArea = new GridBagConstraints();
			gbc_textArea.gridheight = 2;
			gbc_textArea.insets = new Insets(0, 0, 5, 5);
			gbc_textArea.fill = GridBagConstraints.BOTH;
			gbc_textArea.gridx = 2;
			gbc_textArea.gridy = 3;
			contentPanel.add(textArea, gbc_textArea);
		}
		{
			JLabel lblLocation = new JLabel("Location:");
			lblLocation.setFont(new Font("Tahoma", Font.BOLD, 15));
			GridBagConstraints gbc_lblLocation = new GridBagConstraints();
			gbc_lblLocation.anchor = GridBagConstraints.EAST;
			gbc_lblLocation.insets = new Insets(0, 0, 5, 5);
			gbc_lblLocation.gridx = 1;
			gbc_lblLocation.gridy = 5;
			contentPanel.add(lblLocation, gbc_lblLocation);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 2;
			gbc_comboBox.gridy = 5;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblPrivacy = new JLabel("Privacy:");
			lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
			GridBagConstraints gbc_lblPrivacy = new GridBagConstraints();
			gbc_lblPrivacy.anchor = GridBagConstraints.EAST;
			gbc_lblPrivacy.insets = new Insets(0, 0, 0, 5);
			gbc_lblPrivacy.gridx = 1;
			gbc_lblPrivacy.gridy = 6;
			contentPanel.add(lblPrivacy, gbc_lblPrivacy);
		}
		{
			JComboBox privaceCombo = new JComboBox();
			privaceCombo.setModel(new DefaultComboBoxModel(Privacy.values()));
			GridBagConstraints gbc_privaceCombo = new GridBagConstraints();
			gbc_privaceCombo.insets = new Insets(0, 0, 0, 5);
			gbc_privaceCombo.fill = GridBagConstraints.HORIZONTAL;
			gbc_privaceCombo.gridx = 2;
			gbc_privaceCombo.gridy = 6;
			contentPanel.add(privaceCombo, gbc_privaceCombo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.activeCaption);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(SystemColor.activeCaption);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(SystemColor.activeCaption);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
