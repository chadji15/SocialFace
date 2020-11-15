package gui;

import java.awt.BorderLayout;
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

public class viewLink extends JDialog {
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setTitle("View link");
		setIconImage(Toolkit.getDefaultToolkit().getImage(viewLink.class.getResource("/images/logo16.png")));
		setBounds(100, 100, 482, 480);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel contentPanel_1 = new JPanel();
			contentPanel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel_1, BorderLayout.CENTER);
			JLabel lblDescription = new JLabel("Description:");
			JLabel lblCaption = new JLabel("Caption:");
			JLabel lblMessage = new JLabel("Message:");
			JScrollPane scrollPane = new JScrollPane();
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			JScrollPane scrollPane_1 = new JScrollPane();
			
			JLabel lblLink = new JLabel("Link:");
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setColumns(10);
			
			JLabel lblName = new JLabel("Name:");
			
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("From:");
			
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setColumns(10);
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
									.addComponent(textField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
									.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
									.addComponent(textField_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
									.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))))
						.addGap(37))
			);
			gl_contentPanel_1.setVerticalGroup(
				gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPanel_1.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblLink))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblName)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
			
			JTextArea textArea_1 = new JTextArea();
			textArea_1.setBackground(SystemColor.control);
			textArea_1.setEditable(false);
			scrollPane_1.setViewportView(textArea_1);
			
			JTextArea textArea = new JTextArea();
			textArea.setBackground(SystemColor.control);
			textArea.setEditable(false);
			scrollPane.setViewportView(textArea);
			contentPanel_1.setLayout(gl_contentPanel_1);
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
