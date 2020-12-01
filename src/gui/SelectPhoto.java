package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.sound.midi.Soundbank;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.User;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectPhoto extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SelectPhoto dialog = new SelectPhoto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SelectPhoto() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SelectPhoto.class.getResource("/images/LOGO.PNG")));
		setTitle("SocialFace");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		contentPanel.add(scrollPane, gbc_scrollPane);

		JList photoList = new JList();
		
		scrollPane.setViewportView(photoList);

		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(SystemColor.activeCaption);
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
		
		okButton.setBackground(SystemColor.activeCaption);
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setBackground(SystemColor.activeCaption);
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
		
		Connection con = ConnectionService.getInstance().getConn();
		IdNamePair album = ConnectionService.getInstance().getAlbum(); 
		User user = ConnectionService.getInstance().getUser();
		
		DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
		String SPsql = "EXEC dbo.searchphoto ?, ?";
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(SPsql);
			ps.setString(1, "");
			ps.setInt(2, user.getId());
			rs = ps.executeQuery();
			while (rs.next()) {
				iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		photoList.setModel(iModel);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (photoList.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(SelectPhoto.this, "No photo selected");
				}
				IdNamePair photo = (IdNamePair) photoList.getSelectedValue();
				String SPsql = "EXEC dbo.insertcontains ?, ?";
				PreparedStatement ps;
				int rs;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, album.getId());
					ps.setInt(2, photo.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println(album.getId());
					System.out.println(photo.getId());
					e1.printStackTrace();
					JOptionPane.showMessageDialog(SelectPhoto.this, "Update was not succesful.");
				}
				dispose();
			}
		});
	}

}
