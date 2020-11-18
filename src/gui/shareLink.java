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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Dimension;

public class shareLink extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField linkText;
	private JTextField nameText;
	private JTextField captionText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			shareLink dialog = new shareLink();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public shareLink() {
		setResizable(false);
		setMinimumSize(new Dimension(450, 460));
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(shareLink.class.getResource("/images/logo16.png")));
		setTitle("Share link");
		setBounds(100, 100, 449, 465);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblLink = new JLabel("Link:");
		JLabel lblName = new JLabel("Name:");
		JLabel lblCaption = new JLabel("Caption:");
		JLabel lblDescription = new JLabel("Description:");
		JLabel lblMessage = new JLabel("Message:");
		linkText = new JTextField();
		linkText.setColumns(10);
		nameText = new JTextField();
		nameText.setColumns(10);
		captionText = new JTextField();
		captionText.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblLink)
						.addComponent(lblDescription)
						.addComponent(lblName)
						.addComponent(lblCaption)
						.addComponent(lblMessage))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
							.addGap(2))
						.addComponent(linkText, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
						.addComponent(nameText, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
						.addComponent(captionText, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
					.addGap(10))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLink)
						.addComponent(linkText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCaption)
						.addComponent(captionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescription)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMessage)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
					.addGap(3))
		);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane_1.setViewportView(textArea);
		
		JTextArea descriptionText = new JTextArea();
		descriptionText.setLineWrap(true);
		descriptionText.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(descriptionText);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton shareButton = new JButton("Share");
				shareButton.setActionCommand("OK");
				buttonPane.add(shareButton);
				getRootPane().setDefaultButton(shareButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
