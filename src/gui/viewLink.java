package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JToggleButton;

public class viewLink extends JDialog {
	private JTextField captionText;
	private JTextField linkText;
	private JTextField nameText;
	private JTextField fromText;

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
			viewLink dialog = new viewLink();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public viewLink() {
		setModal(true);
		setTitle("View link");
		setIconImage(Toolkit.getDefaultToolkit().getImage(viewLink.class.getResource("/images/logo16.png")));
		setBounds(100, 100, 482, 480);
		getContentPane().setLayout(new BorderLayout());
		
		JPanel contentPanel_1 = new JPanel();
		contentPanel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel_1, BorderLayout.CENTER);
		JLabel lblDescription = new JLabel("Description:");
		JLabel lblCaption = new JLabel("Caption:");
		JLabel lblMessage = new JLabel("Message:");
		JScrollPane scrollPane = new JScrollPane();
		captionText = new JTextField();
		captionText.setEditable(false);
		captionText.setColumns(10);
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblLink = new JLabel("Link:");
		
		linkText = new JTextField();
		linkText.setEditable(false);
		linkText.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		
		nameText = new JTextField();
		nameText.setEditable(false);
		nameText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("From:");
		
		fromText = new JTextField();
		fromText.setEditable(false);
		fromText.setColumns(10);
		GroupLayout gl_contentPanel_1 = new GroupLayout(contentPanel_1);
		gl_contentPanel_1.setHorizontalGroup(
			gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel_1.createSequentialGroup()
							.addGap(6)
							.addComponent(lblMessage)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
						.addGroup(gl_contentPanel_1.createSequentialGroup()
							.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel)
								.addComponent(lblLink, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDescription)
								.addComponent(lblCaption))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(linkText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
								.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
								.addComponent(captionText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
								.addComponent(nameText, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
								.addComponent(fromText, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))))
					.addGap(37))
		);
		gl_contentPanel_1.setVerticalGroup(
			gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(fromText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(linkText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLink))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(captionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCaption))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDescription))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMessage)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JTextArea messageText = new JTextArea();
		messageText.setBackground(SystemColor.control);
		messageText.setEditable(false);
		scrollPane_1.setViewportView(messageText);
		
		JTextArea descriptionText = new JTextArea();
		descriptionText.setBackground(SystemColor.control);
		descriptionText.setEditable(false);
		scrollPane.setViewportView(descriptionText);
		contentPanel_1.setLayout(gl_contentPanel_1);
	
	
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		JToggleButton tglbtnEdit = new JToggleButton("Edit");
		
		buttonPane.add(tglbtnEdit);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
	
	
		JButton okButton = new JButton("OK");
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
		
	
		tglbtnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnEdit.isSelected()) {
					linkText.setEditable(true);
					nameText.setEditable(true);
					descriptionText.setEditable(true);
					descriptionText.setBackground(new Color(255,255,255));
					messageText.setEditable(true);
					messageText.setBackground(new Color(255,255,255));
					captionText.setEditable(true);
				}
				else {
					linkText.setEditable(false);
					nameText.setEditable(false);
					descriptionText.setEditable(false);
					descriptionText.setBackground(new Color(240,240,240));
					messageText.setEditable(false);
					messageText.setBackground(new Color(240,240,240));
					captionText.setEditable(false);
				}
			}
		});
	}
}
