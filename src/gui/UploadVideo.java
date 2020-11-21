package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.Box;

public class UploadVideo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField fileText;
	private JTextField messageText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UploadVideo dialog = new UploadVideo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UploadVideo() {
		setModal(true);
		setTitle("SocialFace");
		setIconImage(Toolkit.getDefaultToolkit().getImage(UploadVideo.class.getResource("/images/logo16.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			Component verticalStrut = Box.createVerticalStrut(20);
			GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
			gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
			gbc_verticalStrut.gridx = 1;
			gbc_verticalStrut.gridy = 0;
			contentPanel.add(verticalStrut, gbc_verticalStrut);
		}
		{
			Component horizontalStrut = Box.createHorizontalStrut(20);
			GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
			gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
			gbc_horizontalStrut.gridx = 0;
			gbc_horizontalStrut.gridy = 1;
			contentPanel.add(horizontalStrut, gbc_horizontalStrut);
		}
		{
			JButton btnChooseFile = new JButton("Choose file");
			GridBagConstraints gbc_btnChooseFile = new GridBagConstraints();
			gbc_btnChooseFile.insets = new Insets(0, 0, 5, 5);
			gbc_btnChooseFile.gridx = 1;
			gbc_btnChooseFile.gridy = 1;
			contentPanel.add(btnChooseFile, gbc_btnChooseFile);
		}
		{
			fileText = new JTextField();
			fileText.setEditable(false);
			GridBagConstraints gbc_fileText = new GridBagConstraints();
			gbc_fileText.gridwidth = 2;
			gbc_fileText.insets = new Insets(0, 0, 5, 5);
			gbc_fileText.fill = GridBagConstraints.HORIZONTAL;
			gbc_fileText.gridx = 2;
			gbc_fileText.gridy = 1;
			contentPanel.add(fileText, gbc_fileText);
			fileText.setColumns(10);
		}
		{
			Component horizontalStrut = Box.createHorizontalStrut(20);
			GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
			gbc_horizontalStrut.insets = new Insets(0, 0, 5, 0);
			gbc_horizontalStrut.gridx = 4;
			gbc_horizontalStrut.gridy = 1;
			contentPanel.add(horizontalStrut, gbc_horizontalStrut);
		}
		{
			JLabel lblMessage = new JLabel("Message:");
			GridBagConstraints gbc_lblMessage = new GridBagConstraints();
			gbc_lblMessage.anchor = GridBagConstraints.EAST;
			gbc_lblMessage.insets = new Insets(0, 0, 5, 5);
			gbc_lblMessage.gridx = 1;
			gbc_lblMessage.gridy = 2;
			contentPanel.add(lblMessage, gbc_lblMessage);
		}
		{
			messageText = new JTextField();
			GridBagConstraints gbc_messageText = new GridBagConstraints();
			gbc_messageText.gridwidth = 2;
			gbc_messageText.insets = new Insets(0, 0, 5, 5);
			gbc_messageText.fill = GridBagConstraints.HORIZONTAL;
			gbc_messageText.gridx = 2;
			gbc_messageText.gridy = 2;
			contentPanel.add(messageText, gbc_messageText);
			messageText.setColumns(10);
		}
		{
			JLabel lblDescription = new JLabel("Description:");
			GridBagConstraints gbc_lblDescription = new GridBagConstraints();
			gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescription.gridx = 1;
			gbc_lblDescription.gridy = 3;
			contentPanel.add(lblDescription, gbc_lblDescription);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 2;
			gbc_scrollPane.gridheight = 2;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 2;
			gbc_scrollPane.gridy = 3;
			contentPanel.add(scrollPane, gbc_scrollPane);
			{
				JTextArea descriptionText = new JTextArea();
				scrollPane.setViewportView(descriptionText);
			}
		}
		{
			Component verticalStrut = Box.createVerticalStrut(20);
			GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
			gbc_verticalStrut.insets = new Insets(0, 0, 0, 5);
			gbc_verticalStrut.gridx = 1;
			gbc_verticalStrut.gridy = 5;
			contentPanel.add(verticalStrut, gbc_verticalStrut);
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
