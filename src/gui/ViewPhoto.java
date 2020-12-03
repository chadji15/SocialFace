package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.ScrollPane;

import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;
import com.team21.User;

import java.awt.SystemColor;
import java.awt.Font;

public class ViewPhoto extends JPanel {
	private JButton btnBack;
	private JTextField txtPhotoname;
	private JLabel lblOwnerlabel;
	private JLabel lblPhoto;
	private JScrollPane scrollPane;
	private JLabel lblPeopleLike;
	private JToggleButton tglbtnEdit;
	private JToggleButton likeToggle;

	/**
	 * Create the panel.
	 */
	public ViewPhoto() {
		setBackground(SystemColor.activeCaption);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 325, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 0;
		add(verticalStrut_1, gbc_verticalStrut_1);
		
		txtPhotoname = new JTextField("PhotoName");
		txtPhotoname.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPhotoname.setBackground(SystemColor.menu);
		txtPhotoname.setEditable(false);
		txtPhotoname.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtPhotoname = new GridBagConstraints();
		gbc_txtPhotoname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPhotoname.insets = new Insets(0, 0, 5, 5);
		gbc_txtPhotoname.gridx = 1;
		gbc_txtPhotoname.gridy = 1;
		add(txtPhotoname, gbc_txtPhotoname);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 2;
		add(horizontalStrut, gbc_horizontalStrut);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblOwner = new JLabel("Owner:");
		lblOwner.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblOwner);
		
		lblOwnerlabel = new JLabel("ownerLabel");
		lblOwnerlabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.add(lblOwnerlabel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 3;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBack.setBackground(SystemColor.activeCaption);
		panel_1.add(btnBack);
		
		likeToggle = new JToggleButton("Like");
		
		likeToggle.setFont(new Font("Tahoma", Font.BOLD, 8));
		likeToggle.setBackground(SystemColor.activeCaption);
		panel_1.add(likeToggle);
		
		tglbtnEdit = new JToggleButton("Edit");
		tglbtnEdit.setSelected(false);
		tglbtnEdit.setBackground(SystemColor.activeCaption);
		tglbtnEdit.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		panel_1.add(tglbtnEdit);
		
		lblPeopleLike = new JLabel("10 people like this");
		lblPeopleLike.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblPeopleLike = new GridBagConstraints();
		gbc_lblPeopleLike.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeopleLike.gridx = 1;
		gbc_lblPeopleLike.gridy = 4;
		add(lblPeopleLike, gbc_lblPeopleLike);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		lblPhoto = new JLabel("");
		lblPhoto.setVerticalAlignment(SwingConstants.TOP);
		lblPhoto.setBackground(SystemColor.menu);
		scrollPane.setViewportView(lblPhoto);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 2;
		gbc_horizontalStrut_1.gridy = 5;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 6;
		add(verticalStrut, gbc_verticalStrut);
		
		
		tglbtnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPhotoname.setEditable(tglbtnEdit.isSelected());
				if (!tglbtnEdit.isSelected() && txtPhotoname.getText().length() > 0) {
					Connection con = ConnectionService.getInstance().getConn();
					IdNamePair photo = ConnectionService.getInstance().getPhoto();
					String SPsql;
					PreparedStatement ps;
					int rs;
					SPsql = "EXEC dbo.editphoto ?, ?";
					try {
						ps = con.prepareStatement(SPsql);
						ps.setString(1, txtPhotoname.getText());
						ps.setInt(2, photo.getId());
						rs = ps.executeUpdate();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		likeToggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = ConnectionService.getInstance().getConn();
				IdNamePair photo = ConnectionService.getInstance().getPhoto();
				String SPsql;
				PreparedStatement ps;
				int rs;
				User user = ConnectionService.getInstance().getUser();

				if (likeToggle.isSelected()) {
					SPsql = "EXEC dbo.insertlike ?, ?";
					try {
						ps = con.prepareStatement(SPsql);
						ps.setInt(1, photo.getId());
						ps.setInt(2, user.getId());
						rs = ps.executeUpdate();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				} else {
					SPsql = "EXEC dbo.deletelikes ?, ?";
					try {
						ps = con.prepareStatement(SPsql);
						ps.setInt(1, user.getId());
						ps.setInt(2, photo.getId());
						rs = ps.executeUpdate();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
				refresh();
			}
		});
	}

	public JButton getBtnBack() {
		return btnBack;
	}
	
	public void refresh() {
		Connection con = ConnectionService.getInstance().getConn();
		IdNamePair photo = ConnectionService.getInstance().getPhoto();
		String path = null;
		String SPsql = "EXEC dbo.showphoto ?";
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, photo.getId());
			rs = ps.executeQuery();
			rs.next();
			txtPhotoname.setText(rs.getString(2));
			lblPhoto.setSize(new Dimension(rs.getInt(4), rs.getInt(3)));
			scrollPane.setSize(new Dimension(rs.getInt(4), rs.getInt(3))); 
			path = rs.getString(5);
			lblOwnerlabel.setText(rs.getString(6));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		lblPhoto.setIcon(new ImageIcon(path));
		
		SPsql = "EXEC dbo.showlikes ?";
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, photo.getId());
			rs = ps.executeQuery();
			rs.next();
			lblPeopleLike.setText(rs.getString(1) + " people like this photo"); 
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		SPsql = "EXEC dbo.doesUserLike ?, ?, ?";
		try {
			CallableStatement cs = con.prepareCall(SPsql);
			cs.setInt(1, ConnectionService.getInstance().getUser().getId());
			cs.setInt(2, photo.getId());
			cs.registerOutParameter(3, Types.INTEGER);
			boolean t = cs.execute();
			likeToggle.setSelected(cs.getInt(3) == 1);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		tglbtnEdit.setEnabled(ConnectionService.isCurrentUser());
	}
}
