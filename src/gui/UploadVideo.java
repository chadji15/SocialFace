package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(UploadVideo.class.getResource("/images/LOGO.PNG")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		contentPanel.add(verticalStrut, gbc_verticalStrut);
	
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 1;
		contentPanel.add(horizontalStrut, gbc_horizontalStrut);
	
		JButton btnChooseFile = new JButton("Choose file");
		btnChooseFile.setBackground(SystemColor.activeCaption);
		btnChooseFile.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		GridBagConstraints gbc_btnChooseFile = new GridBagConstraints();
		gbc_btnChooseFile.insets = new Insets(0, 0, 5, 5);
		gbc_btnChooseFile.gridx = 1;
		gbc_btnChooseFile.gridy = 1;
		contentPanel.add(btnChooseFile, gbc_btnChooseFile);
	
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
	
		Component horizontalStrut1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut1 = new GridBagConstraints();
		gbc_horizontalStrut1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut1.gridx = 4;
		gbc_horizontalStrut1.gridy = 1;
		contentPanel.add(horizontalStrut1, gbc_horizontalStrut1);
	
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblMessage = new GridBagConstraints();
		gbc_lblMessage.anchor = GridBagConstraints.EAST;
		gbc_lblMessage.insets = new Insets(0, 0, 5, 5);
		gbc_lblMessage.gridx = 1;
		gbc_lblMessage.gridy = 2;
		contentPanel.add(lblMessage, gbc_lblMessage);
	
	
		messageText = new JTextField();
		GridBagConstraints gbc_messageText = new GridBagConstraints();
		gbc_messageText.gridwidth = 2;
		gbc_messageText.insets = new Insets(0, 0, 5, 5);
		gbc_messageText.fill = GridBagConstraints.HORIZONTAL;
		gbc_messageText.gridx = 2;
		gbc_messageText.gridy = 2;
		contentPanel.add(messageText, gbc_messageText);
		messageText.setColumns(10);
	
	
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 1;
		gbc_lblDescription.gridy = 3;
		contentPanel.add(lblDescription, gbc_lblDescription);
	
	
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		contentPanel.add(scrollPane, gbc_scrollPane);
		
		JTextArea descriptionText = new JTextArea();
		scrollPane.setViewportView(descriptionText);
	
	
	
		Component verticalStrut1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut1 = new GridBagConstraints();
		gbc_verticalStrut1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut1.gridx = 1;
		gbc_verticalStrut1.gridy = 5;
		contentPanel.add(verticalStrut1, gbc_verticalStrut1);
	
	
		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(SystemColor.menu);
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		JButton okButton = new JButton("OK");
		okButton.setBackground(SystemColor.activeCaption);
		okButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
	
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBackground(SystemColor.activeCaption);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
			
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		        jfc.setDialogTitle("Select an image");
		        jfc.setAcceptAllFileFilterUsed(false);
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.mp4", "mp4");
		        jfc.addChoosableFileFilter(filter);

		        int returnValue = jfc.showOpenDialog(null);
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		            fileText.setText(jfc.getSelectedFile().getPath());
		        }
			}
		});
	}

}
