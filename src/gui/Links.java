package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

import com.team21.ConnectionService;
import java.awt.SystemColor;

public class Links extends JPanel {
	private JTextField searchLink;

	/**
	 * Create the panel.
	 */
	public Links() {
		setBackground(SystemColor.activeCaption);
		setPreferredSize(new Dimension(765, 510));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 383, -156, 0};
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
		panel.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{89, 145, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{25, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnShareLink = new JButton("Share link");
		btnShareLink.setBackground(SystemColor.activeCaption);
		
		GridBagConstraints gbc_btnShareLink = new GridBagConstraints();
		gbc_btnShareLink.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnShareLink.insets = new Insets(0, 0, 0, 5);
		gbc_btnShareLink.gridx = 0;
		gbc_btnShareLink.gridy = 0;
		panel.add(btnShareLink, gbc_btnShareLink);
		
		btnShareLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shareLink s = new shareLink();
				s.setVisible(true);
			}
		});
		
		JButton btnRemoveSharedLink = new JButton("Remove shared link");
		btnRemoveSharedLink.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnRemoveSharedLink = new GridBagConstraints();
		gbc_btnRemoveSharedLink.insets = new Insets(0, 0, 0, 5);
		gbc_btnRemoveSharedLink.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnRemoveSharedLink.gridx = 1;
		gbc_btnRemoveSharedLink.gridy = 0;
		panel.add(btnRemoveSharedLink, gbc_btnRemoveSharedLink);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 0, 5);
		gbc_btnSearch.gridx = 2;
		gbc_btnSearch.gridy = 0;
		panel.add(btnSearch, gbc_btnSearch);
		
		searchLink = new JTextField();
		GridBagConstraints gbc_searchLink = new GridBagConstraints();
		gbc_searchLink.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchLink.gridx = 3;
		gbc_searchLink.gridy = 0;
		panel.add(searchLink, gbc_searchLink);
		searchLink.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 2;
		add(horizontalStrut, gbc_horizontalStrut);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		JList linksList = new JList();
		
		linksList.setModel(new AbstractListModel() {
			String[] values = new String[] {"link"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(linksList);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 2;
		gbc_horizontalStrut_1.gridy = 2;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 3;
		add(verticalStrut_1, gbc_verticalStrut_1);

		linksList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					if (linksList.isSelectionEmpty())
						return;
					viewLink v = new viewLink();
					v.setVisible(true);
				}
			}
		});
		
		if (!ConnectionService.isCurrentUser()) {
			btnShareLink.setEnabled(false);
			btnRemoveSharedLink.setEnabled(false);
		}
	}

}
