package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team21.ConnectionService;
import com.team21.User;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class verify extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField codetext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			verify dialog = new verify();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public verify() {
		setTitle("Verify account");
		setIconImage(Toolkit.getDefaultToolkit().getImage(verify.class.getResource("/images/logosmall.png")));
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIsThatReally = new JLabel("Is that really you?");
			lblIsThatReally.setBackground(SystemColor.activeCaption);
			lblIsThatReally.setHorizontalAlignment(SwingConstants.LEFT);
			lblIsThatReally.setForeground(SystemColor.menu);
			lblIsThatReally.setFont(new Font("Tahoma", Font.BOLD, 28));
			lblIsThatReally.setBounds(0, 0, 432, 65);
			contentPanel.add(lblIsThatReally);
		}
		{
			JLabel lblNewLabel = new JLabel("For added security, we need to verify your email address. ");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel.setBounds(0, 55, 432, 55);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblWe = new JLabel("We've sent a verification code to your email.");
			lblWe.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblWe.setBackground(SystemColor.activeCaption);
			lblWe.setBounds(0, 99, 432, 29);
			contentPanel.add(lblWe);
		}
		
		codetext = new JTextField();
		codetext.setBounds(154, 141, 116, 22);
		contentPanel.add(codetext);
		codetext.setColumns(10);
		
		JLabel lblCode = new JLabel("Code:");
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCode.setBounds(112, 141, 42, 22);
		contentPanel.add(lblCode);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 55, 432, -67);
		contentPanel.add(panel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.menu);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						User user = ConnectionService.getInstance().getUser();
						String SPsql = "EXEC dbo.verify ?";
						Connection con = ConnectionService.getInstance().getConn();
						PreparedStatement ps = null;
						int rs = -1;
						try {
							ps = con.prepareStatement(SPsql);
							ps.setInt(1, user.getId());
							rs = ps.executeUpdate();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						dispose();
					}
				});
				okButton.setBackground(SystemColor.activeCaption);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBackground(SystemColor.activeCaption);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
