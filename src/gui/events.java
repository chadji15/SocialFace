package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import com.team21.ConnectionService;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class events extends JPanel {
	private JTextField searchEventText;

	/**
	 * Create the panel.
	 */
	public events() {
		setForeground(SystemColor.activeCaption);
		setBackground(SystemColor.activeCaption);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 305, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.gridwidth = 3;
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		add(verticalStrut, gbc_verticalStrut);
		
		JLabel lblEventsYouAre = new JLabel("Events you created");
		lblEventsYouAre.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblEventsYouAre = new GridBagConstraints();
		gbc_lblEventsYouAre.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventsYouAre.gridx = 1;
		gbc_lblEventsYouAre.gridy = 1;
		add(lblEventsYouAre, gbc_lblEventsYouAre);
		
		JLabel lblEventsYouAre_1 = new JLabel("Events you are going");
		lblEventsYouAre_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblEventsYouAre_1 = new GridBagConstraints();
		gbc_lblEventsYouAre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventsYouAre_1.gridx = 3;
		gbc_lblEventsYouAre_1.gridy = 1;
		add(lblEventsYouAre_1, gbc_lblEventsYouAre_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		
		JButton btnCreateEvent = new JButton("Create event");
		btnCreateEvent.setBackground(SystemColor.activeCaption);
		
		panel.add(btnCreateEvent);
		
		JButton btnDeleteEvent = new JButton("Delete event");
		btnDeleteEvent.setBackground(SystemColor.activeCaption);
		panel.add(btnDeleteEvent);
		
		btnCreateEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newEvent n = new newEvent();
				n.setVisible(true);
			}
		});
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 3;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{40, 0, 0};
		gbl_panel_1.rowHeights = new int[]{16, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton searchButton = new JButton("Search");
		searchButton.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_searchButton = new GridBagConstraints();
		gbc_searchButton.insets = new Insets(0, 0, 0, 5);
		gbc_searchButton.gridx = 0;
		gbc_searchButton.gridy = 0;
		panel_1.add(searchButton, gbc_searchButton);
		
		searchEventText = new JTextField();
		GridBagConstraints gbc_searchEventText = new GridBagConstraints();
		gbc_searchEventText.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchEventText.gridx = 1;
		gbc_searchEventText.gridy = 0;
		panel_1.add(searchEventText, gbc_searchEventText);
		searchEventText.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 4;
		add(horizontalStrut, gbc_horizontalStrut);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);
		
		JList myEventsList = new JList();
		
		myEventsList.setModel(new AbstractListModel() {
			String[] values = new String[] {"event1"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(myEventsList);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 2;
		gbc_horizontalStrut_2.gridy = 4;
		add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 3;
		gbc_scrollPane_1.gridy = 4;
		add(scrollPane_1, gbc_scrollPane_1);
		
		JList goingList = new JList();
		scrollPane_1.setViewportView(goingList);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 4;
		gbc_horizontalStrut_1.gridy = 4;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 5;
		add(verticalStrut_1, gbc_verticalStrut_1);

		myEventsList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					displayEvent d = new displayEvent();
					d.setVisible(true);
				}
			}
		});
		
		if (!ConnectionService.isCurrentUser()) {
			btnCreateEvent.setEnabled(false);
			btnDeleteEvent.setEnabled(false);
			lblEventsYouAre.setText("Events " + ConnectionService.getInstance().getVisited() + " created");
			lblEventsYouAre_1.setText("Events you are both attending");
		}
	}
}
