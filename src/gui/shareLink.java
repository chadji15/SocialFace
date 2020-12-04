package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;
import com.team21.User;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.awt.event.ActionEvent;

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
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblLink = new JLabel("Link:");
		lblLink.setFont(new Font("Tahoma", Font.BOLD, 13));
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		JLabel lblCaption = new JLabel("Caption:");
		lblCaption.setFont(new Font("Tahoma", Font.BOLD, 13));
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 13));
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Tahoma", Font.BOLD, 13));
		linkText = new JTextField();
		linkText.setColumns(10);
		nameText = new JTextField();
		nameText.setColumns(10);
		captionText = new JTextField();
		captionText.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();

		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel
				.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING).addComponent(lblLink)
										.addComponent(lblDescription).addComponent(lblName).addComponent(lblCaption)
										.addComponent(lblMessage))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPanel.createSequentialGroup()
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 325,
														Short.MAX_VALUE)
												.addGap(2))
										.addComponent(linkText, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
										.addComponent(nameText, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
										.addComponent(captionText, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
										.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
								.addGap(10)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblLink).addComponent(
						linkText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblName).addComponent(
						nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblCaption).addComponent(
						captionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(lblDescription)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(lblMessage)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
				.addGap(3)));

		JTextArea txtMessage = new JTextArea();
		txtMessage.setLineWrap(true);
		txtMessage.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane_1.setViewportView(txtMessage);

		JTextArea descriptionText = new JTextArea();
		descriptionText.setLineWrap(true);
		descriptionText.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(descriptionText);
		contentPanel.setLayout(gl_contentPanel);

		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(SystemColor.menu);
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton shareButton = new JButton("Share");
		
		shareButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		shareButton.setBackground(SystemColor.activeCaption);
		shareButton.setActionCommand("OK");
		buttonPane.add(shareButton);
		getRootPane().setDefaultButton(shareButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		cancelButton.setBackground(SystemColor.activeCaption);
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
		
		Connection con = ConnectionService.getInstance().getConn();
		User user = ConnectionService.getInstance().getUser();
		
		shareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (linkText.getText().length() == 0) {
					JOptionPane.showMessageDialog(shareLink.this, "Link cannot be blank was not successful.");
					return;
				}
				
				if (nameText.getText().length() == 0) {
					JOptionPane.showMessageDialog(shareLink.this, "Name cannot be blank was not successful.");
					return;
				}
				
				String SPsql = "EXEC dbo.insertlink ?, ?, ?, ?, ?, ?";
				PreparedStatement ps = null;
				int rs = -1;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setString(1, nameText.getText());
					ps.setInt(2, user.getId());
					ps.setString(3, captionText.getText());
					ps.setString(4, linkText.getText());
					ps.setString(5, descriptionText.getText());
					ps.setString(6, txtMessage.getText());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(shareLink.this, "Link creation was not successful.");
					return;
				}
				dispose();
			}
		});

	}
}
