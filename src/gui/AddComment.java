package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;
import com.team21.User;

import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.net.IDN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AddComment extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField commentText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddComment dialog = new AddComment();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddComment() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddComment.class.getResource("/images/logosmall.png")));
		setTitle("SocialFace");
		setBounds(100, 100, 450, 159);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.menu);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
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
			gbc_horizontalStrut.insets = new Insets(0, 0, 0, 5);
			gbc_horizontalStrut.gridx = 0;
			gbc_horizontalStrut.gridy = 1;
			contentPanel.add(horizontalStrut, gbc_horizontalStrut);
		}
		{
			JLabel lblComment = new JLabel("Comment:");
			GridBagConstraints gbc_lblComment = new GridBagConstraints();
			gbc_lblComment.insets = new Insets(0, 0, 0, 5);
			gbc_lblComment.anchor = GridBagConstraints.EAST;
			gbc_lblComment.gridx = 1;
			gbc_lblComment.gridy = 1;
			contentPanel.add(lblComment, gbc_lblComment);
		}
		{
			commentText = new JTextField();
			GridBagConstraints gbc_commentText = new GridBagConstraints();
			gbc_commentText.insets = new Insets(0, 0, 0, 5);
			gbc_commentText.fill = GridBagConstraints.HORIZONTAL;
			gbc_commentText.gridx = 2;
			gbc_commentText.gridy = 1;
			contentPanel.add(commentText, gbc_commentText);
			commentText.setColumns(10);
		}
		{
			Component horizontalStrut = Box.createHorizontalStrut(20);
			GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
			gbc_horizontalStrut.gridx = 3;
			gbc_horizontalStrut.gridy = 1;
			contentPanel.add(horizontalStrut, gbc_horizontalStrut);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.activeCaption);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(SystemColor.activeCaption);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String comment = commentText.getText();
						if (comment.length()==0)
							dispose();
						Connection con = ConnectionService.getInstance().getConn();
						IdNamePair album = ConnectionService.getInstance().getAlbum();
						User user = ConnectionService.getInstance().getUser();
						String SPsql = "EXEC dbo.insertalbumcomments ?, ?, ?";
						PreparedStatement ps;
						int rs;
						try {
							ps = con.prepareStatement(SPsql);
							ps.setInt(1, album.getId());
							ps.setInt(2, user.getId());
							ps.setString(3, comment);
							rs = ps.executeUpdate();
						} catch (SQLException e1) {
							e1.printStackTrace();
							JOptionPane.showMessageDialog(AddComment.this, "Adding comment was not successful");
							
						} finally {
							dispose();
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(SystemColor.activeCaption);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
