package gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.User;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewUpdates extends JPanel {
	private JSpinner spinner;
	private JTable updateTable;

	/**
	 * Create the panel.
	 */
	public viewUpdates() {
		setBackground(SystemColor.activeCaption);
		setPreferredSize(new Dimension(765, 650));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 33, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		add(verticalStrut, gbc_verticalStrut);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCategory = new JLabel("Category:");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblCategory);
		
		JComboBox categoryCombo = new JComboBox();
		categoryCombo.setFont(new Font("Tahoma", Font.BOLD, 10));
		categoryCombo.setModel(new DefaultComboBoxModel(new String[] {"All", "Albums", "Photos", "Videos", "Links", "Events"}));
		panel.add(categoryCombo);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);
		
		JLabel lblNumberOfItems = new JLabel("Number of items:");
		lblNumberOfItems.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblNumberOfItems);
		
		spinner = new JSpinner();
		spinner.setMinimumSize(new Dimension(40, 22));
		spinner.setModel(new SpinnerNumberModel(new Integer(10), new Integer(1), null, new Integer(1)));
		panel.add(spinner);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3);
		
		JButton btnSearch = new JButton("Search");
		
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.add(btnSearch);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_1.gridx = 0;
		gbc_horizontalStrut_1.gridy = 2;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		updateTable = new JTable();
		scrollPane.setViewportView(updateTable);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_2.gridx = 2;
		gbc_horizontalStrut_2.gridy = 2;
		add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 3;
		add(verticalStrut_1, gbc_verticalStrut_1);
		
	
		String sql  =  "EXEC dbo.showalbumcomments ?, ?";

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (Integer) spinner.getValue();
				if (n < 1)
					return;
				switch (((String)categoryCombo.getSelectedItem())) {
				case "All":
					fillTable( "EXEC dbo.getUpdatesAll ?, ?");
					break;
				case "Albums":
					fillTable( "EXEC dbo.getUpdatesAlbum ?, ?");
					break;
				case "Events":
					fillTable( "EXEC dbo.getUpdatesEvents ?, ?");
					break;
				case "Photos":
					fillTable( "EXEC dbo.getUpdatesPhotos ?, ?");
					break;
				case "Videos":
					fillTable( "EXEC dbo.getUpdatesVideos ?, ?");
					break;
				case "Links":
					fillTable( "EXEC dbo.getUpdatesLinks ?, ?");
					break;
				default:
					break;
				}
			}
		});
	}
	
	public void fillTable(String SPsql) {
		int n = (Integer) spinner.getValue();
		Vector<Vector<String>> rows = new Vector<>();
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		User user = ConnectionService.getInstance().getVisited();
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, user.getId());
			ps.setInt(2, n);
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
		header.add("Updated at");
		updateTable.setModel(new DefaultTableModel(rows, header) {
			@Override
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});
		
	}
}
