package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JButton;

public class PhotosVideos extends JPanel {
	private JTable albumTable;

	/**
	 * Create the panel.
	 */
	public PhotosVideos() {
		setPreferredSize(new Dimension(765, 650));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 760, 0, 0};
		gridBagLayout.rowHeights = new int[]{33, 568, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblAlbums = new JLabel("Albums");
		GridBagConstraints gbc_lblAlbums = new GridBagConstraints();
		gbc_lblAlbums.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlbums.gridx = 1;
		gbc_lblAlbums.gridy = 0;
		add(lblAlbums, gbc_lblAlbums);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		albumTable = new JTable();
		scrollPane.setViewportView(albumTable);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		
		JButton createAlbumButton = new JButton("Create album");
		panel.add(createAlbumButton);
		
		JButton deleteAlbumButton = new JButton("Delete album");
		panel.add(deleteAlbumButton);
		
		JButton btnUploadPhoto = new JButton("Upload photo");
		panel.add(btnUploadPhoto);

	}

}
