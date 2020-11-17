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
import java.awt.SystemColor;

public class ViewAlbum extends JPanel {
	private JTable photoTable;

	/**
	 * Create the panel.
	 */
	public ViewAlbum() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{762, 0};
		gridBagLayout.rowHeights = new int[]{30, 569, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblAlbumTitle = new JLabel("Album Title");
		GridBagConstraints gbc_lblAlbumTitle = new GridBagConstraints();
		gbc_lblAlbumTitle.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlbumTitle.gridx = 0;
		gbc_lblAlbumTitle.gridy = 0;
		add(lblAlbumTitle, gbc_lblAlbumTitle);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		photoTable = new JTable();
		photoTable.setBackground(SystemColor.control);
		photoTable.setRowSelectionAllowed(false);
		photoTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(photoTable);
		photoTable.setTableHeader(null);
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		
		JButton btnAddPhoto = new JButton("Add photo");
		panel.add(btnAddPhoto);
		
		JButton btnRemovePhoto = new JButton("Remove photo");
		panel.add(btnRemovePhoto);

	}

}
