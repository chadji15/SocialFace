package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.IDN;
import java.nio.file.Path;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Vector;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;
import com.team21.User;

import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;

public class PhotosVideos extends JPanel {
	private JTable videoTables;
	private JTextField searchText;
	private JTextField searchVideoText;
	private JList albumList;
	private int albumid = -1;
	private JList allPhotosList;
	/**
	 * Create the panel.
	 */
	public PhotosVideos() {
		setPreferredSize(new Dimension(764, 661));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		JPanel cardPanel = new JPanel();
		add(cardPanel);
		cardPanel.setLayout(new CardLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.menu);
		cardPanel.add(tabbedPane, "name_1005769202871000");

		JPanel albumPanel = new JPanel();
		albumPanel.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Photos", null, albumPanel, null);
		GridBagLayout gbl_albumPanel = new GridBagLayout();
		gbl_albumPanel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_albumPanel.rowHeights = new int[] { 0, 0, 572, 41, 0 };
		gbl_albumPanel.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_albumPanel.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		albumPanel.setLayout(gbl_albumPanel);

		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		albumPanel.add(verticalStrut, gbc_verticalStrut);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 1;
		albumPanel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 109, 109, 0, 107, 73, 116, 0 };
		gbl_panel_2.rowHeights = new int[] { 25, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JButton btnCreateAlbum = new JButton("Create album");
		btnCreateAlbum.setBackground(SystemColor.activeCaption);

		GridBagConstraints gbc_btnCreateAlbum = new GridBagConstraints();
		gbc_btnCreateAlbum.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnCreateAlbum.insets = new Insets(0, 0, 0, 5);
		gbc_btnCreateAlbum.gridx = 0;
		gbc_btnCreateAlbum.gridy = 0;
		panel_2.add(btnCreateAlbum, gbc_btnCreateAlbum);

		btnCreateAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				create_album c = new create_album();
				c.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosed(java.awt.event.WindowEvent windowEvent) {
						PhotosVideos.this.refresh();
					}
				});
				c.setVisible(true);
			}
		});

		JButton btnDeleteAlbum = new JButton("Delete Album");

		btnDeleteAlbum.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnDeleteAlbum = new GridBagConstraints();
		gbc_btnDeleteAlbum.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnDeleteAlbum.insets = new Insets(0, 0, 0, 5);
		gbc_btnDeleteAlbum.gridx = 1;
		gbc_btnDeleteAlbum.gridy = 0;
		panel_2.add(btnDeleteAlbum, gbc_btnDeleteAlbum);
		
		JButton btnAllPhotos = new JButton("All photos");
		
		GridBagConstraints gbc_btnAllPhotos = new GridBagConstraints();
		gbc_btnAllPhotos.insets = new Insets(0, 0, 0, 5);
		gbc_btnAllPhotos.gridx = 2;
		gbc_btnAllPhotos.gridy = 0;
		panel_2.add(btnAllPhotos, gbc_btnAllPhotos);

		JButton btnUploadPhoto = new JButton("Upload photo");
		btnUploadPhoto.setBackground(SystemColor.activeCaption);

		GridBagConstraints gbc_btnUploadPhoto = new GridBagConstraints();
		gbc_btnUploadPhoto.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnUploadPhoto.insets = new Insets(0, 0, 0, 5);
		gbc_btnUploadPhoto.gridx = 3;
		gbc_btnUploadPhoto.gridy = 0;
		panel_2.add(btnUploadPhoto, gbc_btnUploadPhoto);
		
		Connection con = ConnectionService.getInstance().getConn();
		User visited = ConnectionService.getInstance().getVisited();

		btnUploadPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				jfc.setDialogTitle("Select an image");
				jfc.setAcceptAllFileFilterUsed(false);
				FileNameExtensionFilter filter = new FileNameExtensionFilter("jpeg images", "jpg");
				jfc.addChoosableFileFilter(filter);

				int returnValue = jfc.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					// upload photo and refresh
					String path = jfc.getSelectedFile().getPath();
					String filename = jfc.getSelectedFile().getName();
					String SPsql = "EXEC dbo.insertphoto ?, ?, ?";
					PreparedStatement ps = null;
					int rs = -1;
					try {
						ps = con.prepareStatement(SPsql);
						ps.setString(1, filename);
						ps.setString(2, path);
						ps.setInt(3, visited.getId());
						rs = ps.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (rs > 0) {
						return;
					} else {
						JOptionPane.showMessageDialog(PhotosVideos.this, "Photo upload was not successful");
					}
				}
			}
		});

		JButton btnSearch = new JButton("Search");
		
		btnSearch.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnSearch.insets = new Insets(0, 0, 0, 5);
		gbc_btnSearch.gridx = 4;
		gbc_btnSearch.gridy = 0;
		panel_2.add(btnSearch, gbc_btnSearch);

		searchText = new JTextField();
		GridBagConstraints gbc_searchText = new GridBagConstraints();
		gbc_searchText.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchText.gridx = 5;
		gbc_searchText.gridy = 0;
		panel_2.add(searchText, gbc_searchText);
		searchText.setColumns(10);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 2;
		albumPanel.add(horizontalStrut, gbc_horizontalStrut);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		albumPanel.add(scrollPane, gbc_scrollPane);

		albumList = new JList();

		scrollPane.setViewportView(albumList);

		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 2;
		gbc_horizontalStrut_1.gridy = 2;
		albumPanel.add(horizontalStrut_1, gbc_horizontalStrut_1);

		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 3;
		albumPanel.add(verticalStrut_1, gbc_verticalStrut_1);

		JPanel videoPanel = new JPanel();
		tabbedPane.addTab("Videos", null, videoPanel, null);
		GridBagLayout gbl_videoPanel = new GridBagLayout();
		gbl_videoPanel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_videoPanel.rowHeights = new int[] { 0, 0, 556, 0, 0 };
		gbl_videoPanel.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_videoPanel.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		videoPanel.setLayout(gbl_videoPanel);

		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 0;
		videoPanel.add(verticalStrut_2, gbc_verticalStrut_2);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		videoPanel.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 105, 103, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 25, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton btnUploadVideo = new JButton("Upload video");

		GridBagConstraints gbc_btnUploadVideo = new GridBagConstraints();
		gbc_btnUploadVideo.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnUploadVideo.insets = new Insets(0, 0, 0, 5);
		gbc_btnUploadVideo.gridx = 0;
		gbc_btnUploadVideo.gridy = 0;
		panel.add(btnUploadVideo, gbc_btnUploadVideo);

		btnUploadVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UploadVideo uploadVideo = new UploadVideo();
				uploadVideo.setVisible(true);

			}
		});

		JButton btnDeleteVideo = new JButton("Delete video");
		GridBagConstraints gbc_btnDeleteVideo = new GridBagConstraints();
		gbc_btnDeleteVideo.insets = new Insets(0, 0, 0, 5);
		gbc_btnDeleteVideo.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnDeleteVideo.gridx = 1;
		gbc_btnDeleteVideo.gridy = 0;
		panel.add(btnDeleteVideo, gbc_btnDeleteVideo);

		JButton btnSearch_1 = new JButton("Search");
		GridBagConstraints gbc_btnSearch_1 = new GridBagConstraints();
		gbc_btnSearch_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnSearch_1.gridx = 2;
		gbc_btnSearch_1.gridy = 0;
		panel.add(btnSearch_1, gbc_btnSearch_1);

		searchVideoText = new JTextField();
		GridBagConstraints gbc_searchVideoText = new GridBagConstraints();
		gbc_searchVideoText.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchVideoText.gridx = 3;
		gbc_searchVideoText.gridy = 0;
		panel.add(searchVideoText, gbc_searchVideoText);
		searchVideoText.setColumns(10);

		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 0;
		gbc_horizontalStrut_2.gridy = 2;
		videoPanel.add(horizontalStrut_2, gbc_horizontalStrut_2);

		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 2;
		videoPanel.add(scrollPane_1, gbc_scrollPane_1);

		videoTables = new JTable();

		videoTables.setTableHeader(null);
		videoTables.setRowSelectionAllowed(false);
		videoTables.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, },
				new String[] { "New column", "New column", "New column" }) {
			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(videoTables);

		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_3.gridx = 2;
		gbc_horizontalStrut_3.gridy = 2;
		videoPanel.add(horizontalStrut_3, gbc_horizontalStrut_3);

		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_3.gridx = 1;
		gbc_verticalStrut_3.gridy = 3;
		videoPanel.add(verticalStrut_3, gbc_verticalStrut_3);

		ViewAlbum viewAlbum = new ViewAlbum();

		cardPanel.add(viewAlbum, "name_1005784265800700");

		ViewPhoto viewPhoto = new ViewPhoto();

		cardPanel.add(viewPhoto, "name_1070336682238700");

		ViewVideo viewVideo = new ViewVideo();
		cardPanel.add(viewVideo, "name_1079679262988400");
		
		JPanel viewAllPhotos = new JPanel();
		viewAllPhotos.setBackground(new Color(153, 180, 209));
		viewAllPhotos.setForeground(Color.BLACK);
		cardPanel.add(viewAllPhotos, "name_1770702880330300");
		GridBagLayout gbl_viewAllPhotos = new GridBagLayout();
		gbl_viewAllPhotos.columnWidths = new int[]{0, 241, 0, 0};
		gbl_viewAllPhotos.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_viewAllPhotos.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_viewAllPhotos.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		viewAllPhotos.setLayout(gbl_viewAllPhotos);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_4.gridx = 1;
		gbc_verticalStrut_4.gridy = 0;
		viewAllPhotos.add(verticalStrut_4, gbc_verticalStrut_4);
		
		JButton btnBack = new JButton("Back");
		
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.WEST;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 1;
		viewAllPhotos.add(btnBack, gbc_btnBack);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_4 = new GridBagConstraints();
		gbc_horizontalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_4.gridx = 0;
		gbc_horizontalStrut_4.gridy = 2;
		viewAllPhotos.add(horizontalStrut_4, gbc_horizontalStrut_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 2;
		viewAllPhotos.add(scrollPane_2, gbc_scrollPane_2);
		
		allPhotosList = new JList();
		
		scrollPane_2.setViewportView(allPhotosList);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
		gbc_horizontalStrut_5.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_5.gridx = 2;
		gbc_horizontalStrut_5.gridy = 2;
		viewAllPhotos.add(horizontalStrut_5, gbc_horizontalStrut_5);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5 = new GridBagConstraints();
		gbc_verticalStrut_5.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_5.gridx = 1;
		gbc_verticalStrut_5.gridy = 3;
		viewAllPhotos.add(verticalStrut_5, gbc_verticalStrut_5);
		

		albumList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					if (albumList.isSelectionEmpty())
						return;
					IdNamePair album = (IdNamePair) albumList.getSelectedValue();
					ConnectionService.getInstance().setAlbum(album);
					cardPanel.removeAll();
					cardPanel.add(viewAlbum);
					viewAlbum.refreshAlbum();
					viewAlbum.refreshPhotos();
					viewAlbum.populateComments();
					cardPanel.revalidate();
					cardPanel.repaint();
				}
			}
		});

		viewAlbum.getBackButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh();
				cardPanel.removeAll();
				cardPanel.add(tabbedPane);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		viewAlbum.getPhotoList().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					if (viewAlbum.getPhotoList().isSelectionEmpty())
						return;
					cardPanel.removeAll();
					cardPanel.add(viewPhoto);
					cardPanel.revalidate();
					cardPanel.repaint();
				}
			}
		});
		viewPhoto.getBtnBack().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.removeAll();
				if (ConnectionService.getInstance().getAlbum().getId() == -1)
					cardPanel.add(viewAllPhotos);
				else
					cardPanel.add(viewAlbum);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		videoTables.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					if (videoTables.getSelectionModel().isSelectionEmpty()) 
						return;
					
					cardPanel.removeAll();
					cardPanel.add(viewVideo);
					cardPanel.revalidate();
					cardPanel.repaint();
				}
			}
		});

		viewVideo.getBtnBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardPanel.removeAll();
				cardPanel.add(tabbedPane);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});

		if (!ConnectionService.isCurrentUser()) {
			btnCreateAlbum.setEnabled(false);
			btnDeleteAlbum.setEnabled(false);
			btnDeleteVideo.setEnabled(false);
			btnUploadPhoto.setEnabled(false);
			btnUploadVideo.setEnabled(false);
		}

		btnDeleteAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (albumList.isSelectionEmpty())
					return;
				IdNamePair album = (IdNamePair) albumList.getSelectedValue();
				String SPsql = "EXEC dbo.deletealbum ?";
				PreparedStatement ps = null;
				int rs = -1;
				try {
					ps = con.prepareStatement(SPsql);

					ps.setInt(1, album.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (rs > 0) {
					DefaultListModel<String> lModel = (DefaultListModel<String>) albumList.getModel();
					lModel.removeElement(album);
				} else {
					JOptionPane.showMessageDialog(PhotosVideos.this, "Update was not succesful.");
				}
				albumList.setSelectedIndex(-1);
			}
		});
		
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchstr = searchText.getText();
				if (searchstr.length() == 0) {
					refresh();
					return;
				}
				DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
				String SPsql = "EXEC dbo.searchalbum ?, ?";
				Connection con = ConnectionService.getInstance().getConn();
				PreparedStatement ps;
				ResultSet rs;
				User visited = ConnectionService.getInstance().getVisited();
				try {
					ps = con.prepareStatement(SPsql);
					ps.setString(1, searchstr);
					ps.setInt(2, visited.getId());
					rs = ps.executeQuery();
					while (rs.next()) {
						iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
					}
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(PhotosVideos.this, "Search failed");
					
				}
				albumList.setModel(iModel);
			}
		});
		
		btnAllPhotos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionService.getInstance().setAlbum(new IdNamePair(-1));
				loadAllPhotos();
				cardPanel.removeAll();
				cardPanel.add(viewAllPhotos);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.removeAll();
				cardPanel.add(tabbedPane);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		
		allPhotosList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (allPhotosList.isSelectionEmpty())
					return;
				if (e.getClickCount() < 2)
					return;
				cardPanel.removeAll();
				cardPanel.add(viewPhoto);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});

		refresh();
	}

	public void refresh() {
		if (ConnectionService.isCurrentUser())
			refreshCurr();
	}

	private void refreshCurr() {
		DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
		String SPsql = "EXEC dbo.getUserAlbums ?";
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		User visited = ConnectionService.getInstance().getVisited();

		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, visited.getId());
			rs = ps.executeQuery();
			while (rs.next()) {
				iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		albumList.setModel(iModel);
		
	}
	
	public void loadAllPhotos() {
		DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
		String SPsql = "EXEC dbo.searchphoto ?, ?";
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		User visited = ConnectionService.getInstance().getVisited();
		try {
			ps = con.prepareStatement(SPsql);
			ps.setString(1, "");
			ps.setInt(2, visited.getId());
			rs = ps.executeQuery();
			while (rs.next()) {
				iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		allPhotosList.setModel(iModel);
	}

}
