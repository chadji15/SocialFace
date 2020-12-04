package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;
import com.team21.User;

import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JToggleButton;
import java.awt.Font;

public class viewLink extends JDialog {
	private JTextField captionText;
	private JTextField linkText;
	private JTextField nameText;
	private JTextArea descriptionText;
	private JTextArea messageText;

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
		contentPanel_1.setBackground(SystemColor.activeCaption);
		contentPanel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel_1, BorderLayout.CENTER);
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 11));
		JLabel lblCaption = new JLabel("Caption:");
		lblCaption.setFont(new Font("Tahoma", Font.BOLD, 11));
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Tahoma", Font.BOLD, 12));
		JScrollPane scrollPane = new JScrollPane();
		captionText = new JTextField();
		captionText.setEditable(false);
		captionText.setColumns(10);
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblLink = new JLabel("Link:");
		lblLink.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		linkText = new JTextField();
		linkText.setEditable(false);
		linkText.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		nameText = new JTextField();
		nameText.setEditable(false);
		nameText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("From:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JTextField fromText = new JTextField();
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
		
		messageText = new JTextArea();
		messageText.setBackground(SystemColor.control);
		messageText.setEditable(false);
		scrollPane_1.setViewportView(messageText);
		
		descriptionText = new JTextArea();
		descriptionText.setBackground(SystemColor.control);
		descriptionText.setEditable(false);
		scrollPane.setViewportView(descriptionText);
		contentPanel_1.setLayout(gl_contentPanel_1);
	
	
		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(SystemColor.menu);
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		JToggleButton tglbtnEdit = new JToggleButton("Edit");
		tglbtnEdit.setFont(new Font("Tahoma", Font.BOLD, 10));
		tglbtnEdit.setBackground(SystemColor.activeCaption);
		
		buttonPane.add(tglbtnEdit);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
	
	
		JButton okButton = new JButton("OK");
		
		okButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
		
		User user = ConnectionService.getInstance().getVisited();
		User visited = ConnectionService.getInstance().getVisited();
		IdNamePair link = ConnectionService.getInstance().getLink();
		String SPsql;
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps = null;
		ResultSet rs;
	
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
					editLink();
				}
			}
		});
		
		if (!ConnectionService.isCurrentUser()){
			tglbtnEdit.setVisible(false);
		}
		
		SPsql = "EXEC dbo.showlink ?";
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, link.getId());
			rs = ps.executeQuery();
			rs.next();
			linkText.setText(rs.getString(1));
			nameText.setText(rs.getString(2));
			captionText.setText(rs.getString(3));
			descriptionText.setText(rs.getString(4));
			messageText.setText(rs.getString(5));
			fromText.setText(rs.getString(6));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rs = editLink();
				if (rs == 0) dispose();
			}
		});
	}
	
	public int editLink() {
		IdNamePair link = ConnectionService.getInstance().getLink();
		String SPsql;
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps = null;
		int rs;

		SPsql = "EXEC dbo.editlink ?, ?, ?, ?, ?, ?";
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, link.getId());
			ps.setString(2, linkText.getText());
			ps.setString(3, nameText.getText());
			ps.setString(4, captionText.getText());
			ps.setString(5, descriptionText.getText());
			ps.setString(6, messageText.getText());
			rs = ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(viewLink.this, "Update was not succesful.");
			return 1;
		}
		return 0;
	}
}
