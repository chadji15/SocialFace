package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(verify.class.getResource("/images/logo16.png")));
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 204, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIsThatReally = new JLabel("Is that really you?");
			lblIsThatReally.setBackground(new Color(255, 255, 255));
			lblIsThatReally.setHorizontalAlignment(SwingConstants.LEFT);
			lblIsThatReally.setForeground(new Color(0, 102, 153));
			lblIsThatReally.setFont(new Font("Tahoma", Font.BOLD, 28));
			lblIsThatReally.setBounds(0, 0, 432, 65);
			contentPanel.add(lblIsThatReally);
		}
		{
			JLabel lblNewLabel = new JLabel("For added security, we need to verify your email address. ");
			lblNewLabel.setBounds(0, 55, 432, 55);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblWe = new JLabel("We've sent a verification code to your email.");
			lblWe.setBounds(0, 99, 432, 29);
			contentPanel.add(lblWe);
		}
		
		codetext = new JTextField();
		codetext.setBounds(154, 141, 116, 22);
		contentPanel.add(codetext);
		codetext.setColumns(10);
		
		JLabel lblCode = new JLabel("Code:");
		lblCode.setBounds(112, 141, 42, 22);
		contentPanel.add(lblCode);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 55, 432, -67);
		contentPanel.add(panel);
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
