package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.Component;
import javax.swing.Box;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import com.microsoft.sqlserver.jdbc.dataclassification.ColumnSensitivity;
import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;
import com.team21.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.Painter;
import javax.swing.event.ChangeListener;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.IDN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class ViewAlbum extends JPanel {
	private JTable commentsTable;
	private JButton backButton;
	private JTextField searchPhotoText;
	private JList photoList;
	private JTextField txtAlbumName;
	private JLabel lblOwner;
	private JLabel ownerLabel;
	private JTextArea descriptionText;
	private JComboBox locationCombo;
	private JComboBox privacyCombo;
	private JLabel lblTotalPhotos;

	/**
	 * Create the panel.
	 */
	public ViewAlbum() {
		setBackground(SystemColor.activeCaption);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 152, 381, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 30, 0, 0, 0, 0, 0, 0, 0, 277, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		add(verticalStrut, gbc_verticalStrut);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 1;
		add(horizontalStrut, gbc_horizontalStrut);
		
		txtAlbumName = new JTextField("Album Title");
		txtAlbumName.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtAlbumName = new GridBagConstraints();
		gbc_txtAlbumName.fill = GridBagConstraints.BOTH;
		gbc_txtAlbumName.gridwidth = 2;
		gbc_txtAlbumName.insets = new Insets(0, 0, 5, 5);
		gbc_txtAlbumName.gridx = 1;
		gbc_txtAlbumName.gridy = 1;
		add(txtAlbumName, gbc_txtAlbumName);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 3;
		gbc_horizontalStrut_1.gridy = 1;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		lblOwner = new JLabel("Owner:");
		lblOwner.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblOwner = new GridBagConstraints();
		gbc_lblOwner.anchor = GridBagConstraints.EAST;
		gbc_lblOwner.insets = new Insets(0, 0, 5, 5);
		gbc_lblOwner.gridx = 1;
		gbc_lblOwner.gridy = 2;
		add(lblOwner, gbc_lblOwner);
		
		ownerLabel = new JLabel("Owner User");
		ownerLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_ownerLabel = new GridBagConstraints();
		gbc_ownerLabel.anchor = GridBagConstraints.WEST;
		gbc_ownerLabel.insets = new Insets(0, 0, 5, 5);
		gbc_ownerLabel.gridx = 2;
		gbc_ownerLabel.gridy = 2;
		add(ownerLabel, gbc_ownerLabel);
		
		JLabel lblNewLabel = new JLabel("Description:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 3;
		add(scrollPane_1, gbc_scrollPane_1);
		
		descriptionText = new JTextArea();
		descriptionText.setEditable(false);
		scrollPane_1.setViewportView(descriptionText);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 4;
		add(verticalStrut_2, gbc_verticalStrut_2);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblLocation = new GridBagConstraints();
		gbc_lblLocation.anchor = GridBagConstraints.EAST;
		gbc_lblLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocation.gridx = 1;
		gbc_lblLocation.gridy = 5;
		add(lblLocation, gbc_lblLocation);
		
		locationCombo = new JComboBox();
		locationCombo.setBackground(SystemColor.menu);
		locationCombo.setEnabled(false);
		GridBagConstraints gbc_locationCombo = new GridBagConstraints();
		gbc_locationCombo.insets = new Insets(0, 0, 5, 5);
		gbc_locationCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_locationCombo.gridx = 2;
		gbc_locationCombo.gridy = 5;
		add(locationCombo, gbc_locationCombo);
		
		JLabel lblNewLabel_1 = new JLabel("Privacy:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 6;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		privacyCombo = new JComboBox();
		privacyCombo.setEnabled(false);
		privacyCombo.setModel(new DefaultComboBoxModel(Privacy.values()));
		GridBagConstraints gbc_privacyCombo = new GridBagConstraints();
		gbc_privacyCombo.insets = new Insets(0, 0, 5, 5);
		gbc_privacyCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_privacyCombo.gridx = 2;
		gbc_privacyCombo.gridy = 6;
		add(privacyCombo, gbc_privacyCombo);
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 7;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{59, 91, 115, 87, 53, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{25, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		backButton = new JButton("Back");

		GridBagConstraints gbc_backButton = new GridBagConstraints();
		gbc_backButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_backButton.insets = new Insets(0, 0, 0, 5);
		gbc_backButton.gridx = 0;
		gbc_backButton.gridy = 0;
		panel.add(backButton, gbc_backButton);
		
		JButton btnAddPhoto = new JButton("Add photo");
		btnAddPhoto.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		GridBagConstraints gbc_btnAddPhoto = new GridBagConstraints();
		gbc_btnAddPhoto.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddPhoto.gridx = 1;
		gbc_btnAddPhoto.gridy = 0;
		panel.add(btnAddPhoto, gbc_btnAddPhoto);
		
		
		JButton btnRemovePhoto = new JButton("Remove photo");
		
		btnRemovePhoto.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_btnRemovePhoto = new GridBagConstraints();
		gbc_btnRemovePhoto.insets = new Insets(0, 0, 0, 5);
		gbc_btnRemovePhoto.gridx = 2;
		gbc_btnRemovePhoto.gridy = 0;
		panel.add(btnRemovePhoto, gbc_btnRemovePhoto);
		
		JButton commentButton = new JButton("Comment");
		commentButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		GridBagConstraints gbc_commentButton = new GridBagConstraints();
		gbc_commentButton.insets = new Insets(0, 0, 0, 5);
		gbc_commentButton.gridx = 3;
		gbc_commentButton.gridy = 0;
		panel.add(commentButton, gbc_commentButton);
		
		
		
		JToggleButton editToggle = new JToggleButton("Edit");
		editToggle.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		GridBagConstraints gbc_editToggle = new GridBagConstraints();
		gbc_editToggle.fill = GridBagConstraints.VERTICAL;
		gbc_editToggle.insets = new Insets(0, 0, 0, 5);
		gbc_editToggle.gridx = 4;
		gbc_editToggle.gridy = 0;
		panel.add(editToggle, gbc_editToggle);
		
		JButton btnSearch = new JButton("Search");
		
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 0, 5);
		gbc_btnSearch.gridx = 5;
		gbc_btnSearch.gridy = 0;
		panel.add(btnSearch, gbc_btnSearch);
		
		searchPhotoText = new JTextField();
		GridBagConstraints gbc_searchPhotoText = new GridBagConstraints();
		gbc_searchPhotoText.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchPhotoText.gridx = 6;
		gbc_searchPhotoText.gridy = 0;
		panel.add(searchPhotoText, gbc_searchPhotoText);
		searchPhotoText.setColumns(10);
		
		lblTotalPhotos = new JLabel("Total: 10 photographs");
		lblTotalPhotos.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblTotalPhotos = new GridBagConstraints();
		gbc_lblTotalPhotos.anchor = GridBagConstraints.WEST;
		gbc_lblTotalPhotos.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalPhotos.gridx = 1;
		gbc_lblTotalPhotos.gridy = 8;
		add(lblTotalPhotos, gbc_lblTotalPhotos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(SystemColor.menu);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 9;
		add(scrollPane, gbc_scrollPane);
		
		photoList = new JList();
		scrollPane.setViewportView(photoList);
		
		JLabel lblComments = new JLabel("Comments:");
		GridBagConstraints gbc_lblComments = new GridBagConstraints();
		gbc_lblComments.anchor = GridBagConstraints.WEST;
		gbc_lblComments.insets = new Insets(0, 0, 5, 5);
		gbc_lblComments.gridx = 1;
		gbc_lblComments.gridy = 10;
		add(lblComments, gbc_lblComments);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.gridwidth = 2;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 11;
		add(scrollPane_2, gbc_scrollPane_2);
		
		commentsTable = new JTable();
		commentsTable.setEnabled(false);
		commentsTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		commentsTable.setTableHeader(null);
		scrollPane_2.setViewportView(commentsTable);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 12;
		add(verticalStrut_1, gbc_verticalStrut_1);
		txtAlbumName.setEditable(false);
		
		Connection con = ConnectionService.getInstance().getConn();
		
		if (!ConnectionService.isCurrentUser()) {
			btnAddPhoto.setEnabled(false);
			btnRemovePhoto.setEnabled(false);
			editToggle.setEnabled(false);
		}
		
		
		editToggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (editToggle.isSelected()) {
					locationCombo.setEnabled(true);
					privacyCombo.setEnabled(true);
					descriptionText.setEditable(true);
					txtAlbumName.setEditable(true);
				}
				else {
					locationCombo.setEnabled(false);
					privacyCombo.setEnabled(false);
					descriptionText.setEditable(false);
					txtAlbumName.setEditable(false);
					User visited = ConnectionService.getInstance().getVisited();
					IdNamePair album = ConnectionService.getInstance().getAlbum();
					String SPsql = "EXEC dbo.editalbum ?, ?, ?, ?, ?, ?";
					Connection con = ConnectionService.getInstance().getConn();
					PreparedStatement ps;
					int rs = -1;
					try {
						ps = con.prepareStatement(SPsql);
						ps.setInt(1, visited.getId());
						ps.setInt(2, album.getId());
						ps.setString(3, txtAlbumName.getText());
						ps.setString(4, ((Privacy)privacyCombo.getSelectedItem()).toChar());
						ps.setString(5, descriptionText.getText());
						IdNamePair city = (IdNamePair)locationCombo.getSelectedItem();
						ps.setInt(6, city.getId());
						rs = ps.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(ViewAlbum.this, "Update was not successful");
						refreshAlbum();
						return;
					}
				}
			}
		});
		
		DefaultComboBoxModel<IdNamePair> iModel = new DefaultComboBoxModel<>();
		iModel.addElement(new IdNamePair(-1, null));
		String SPsql = "EXEC dbo.getAllCities";
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(SPsql);
			rs = ps.executeQuery();
			while(rs.next()) {
				iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		locationCombo.setModel(iModel);
		
		commentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddComment addComment = new AddComment();
				addComment.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosed(java.awt.event.WindowEvent windowEvent) {
						ViewAlbum.this.populateComments();
					}
				});
				addComment.setVisible(true);
			}
		});
		
		btnAddPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectPhoto selectPhoto = new SelectPhoto();
				selectPhoto.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosed(java.awt.event.WindowEvent windowEvent) {
						ViewAlbum.this.refreshPhotos();
					}
				});
				selectPhoto.setVisible(true);
			}
		});
		
		btnRemovePhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (photoList.isSelectionEmpty())
					return;
				IdNamePair album = ConnectionService.getInstance().getAlbum();
				IdNamePair photo = (IdNamePair) photoList.getSelectedValue();
				String SPsql = "EXEC dbo.deletecontains ?, ?";
				PreparedStatement ps = null;
				int rs = -1;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, album.getId());
					ps.setInt(2, photo.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(ViewAlbum.this, "Update was not succesful.");
				}
		
				DefaultListModel<String> lModel = (DefaultListModel<String>) photoList.getModel();
				lModel.removeElement(photo);
				photoList.setSelectedIndex(-1);
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (searchPhotoText.getText().length() == 0) {
					refreshPhotos();
					return;
				}
				DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
				String SPsql = "EXEC dbo.searchphoto ?, ?";
				Connection con = ConnectionService.getInstance().getConn();
				PreparedStatement ps;
				ResultSet rs;
				User visited = ConnectionService.getInstance().getVisited();
				try {
					ps = con.prepareStatement(SPsql);
					ps.setString(1, searchPhotoText.getText());
					ps.setInt(2, visited.getId());
					rs = ps.executeQuery();
					while (rs.next()) {
						iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				photoList.setModel(iModel);
			}
		});
		
	}
	
	public void refreshAlbum() {
		Connection con = ConnectionService.getInstance().getConn();
		IdNamePair album = ConnectionService.getInstance().getAlbum();

		String SPsql = "EXEC dbo.showalbum ?";
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, album.getId());
			rs = ps.executeQuery();
			rs.next();
			txtAlbumName.setText(rs.getString(2));
			privacyCombo.setSelectedItem(Privacy.toPrivacy(rs.getString(3)));
			descriptionText.setText(rs.getString(4));
			locationCombo.setSelectedItem(new IdNamePair(rs.getString(5)));
			ownerLabel.setText(rs.getString(6));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
	
	public void refreshPhotos() {
		DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
		String SPsql = "EXEC dbo.getAlbumPhotos ?";
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		IdNamePair album = ConnectionService.getInstance().getAlbum(); 
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, album.getId());
			rs = ps.executeQuery();
			while (rs.next()) {
				iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		photoList.setModel(iModel);
	}
	
	public void populateComments() {
		Vector<Vector<String>> rows = new Vector<>();
		String SPsql = "EXEC dbo.showalbumcomments ?";
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		IdNamePair album = ConnectionService.getInstance().getAlbum(); 
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, album.getId());
			rs = ps.executeQuery();
			while (rs.next()) {
				Vector<String> row = new Vector<>();
				row.add(rs.getString(1));
				row.add(rs.getString(2));
				rows.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Vector<String> header = new Vector<>();
		header.add("Name");
		header.add("Comment");
		commentsTable.setModel(new DefaultTableModel(rows, header));
	}

	public JButton getBackButton() {
		return backButton;
	}
	
	public JList getPhotoList() {
		return photoList;
	}
}
