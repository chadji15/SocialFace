package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;
import java.awt.Insets;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.team21.ConnectionService;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

public class ViewFriends extends JPanel {

	/**
	 * Create the panel.
	 */
	public ViewFriends() {
		setPreferredSize(new Dimension(600, 625));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 294, 243, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 27, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		add(verticalStrut, gbc_verticalStrut);
		
		JLabel lblFriends = new JLabel("Friends");
		lblFriends.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblFriends = new GridBagConstraints();
		gbc_lblFriends.insets = new Insets(0, 0, 5, 5);
		gbc_lblFriends.gridx = 1;
		gbc_lblFriends.gridy = 1;
		add(lblFriends, gbc_lblFriends);
		
		JLabel lblFriendRequests = new JLabel("Friend Requests");
		GridBagConstraints gbc_lblFriendRequests = new GridBagConstraints();
		gbc_lblFriendRequests.insets = new Insets(0, 0, 5, 5);
		gbc_lblFriendRequests.gridx = 2;
		gbc_lblFriendRequests.gridy = 1;
		add(lblFriendRequests, gbc_lblFriendRequests);
		
		JButton removeFriendButton = new JButton("Remove friend");
		removeFriendButton.setIcon(null);
		GridBagConstraints gbc_removeFriendButton = new GridBagConstraints();
		gbc_removeFriendButton.insets = new Insets(0, 0, 5, 5);
		gbc_removeFriendButton.gridx = 1;
		gbc_removeFriendButton.gridy = 2;
		add(removeFriendButton, gbc_removeFriendButton);
		
		JPanel buttonPanel = new JPanel();
		GridBagConstraints gbc_buttonPanel = new GridBagConstraints();
		gbc_buttonPanel.insets = new Insets(0, 0, 5, 5);
		gbc_buttonPanel.fill = GridBagConstraints.BOTH;
		gbc_buttonPanel.gridx = 2;
		gbc_buttonPanel.gridy = 2;
		add(buttonPanel, gbc_buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton acceptButton = new JButton("Accept");
		buttonPanel.add(acceptButton);
		
		JButton declineButton = new JButton("Decline");
		buttonPanel.add(declineButton);
		
		JButton ignoreButton = new JButton("Ignore");
		buttonPanel.add(ignoreButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 3;
		add(horizontalStrut, gbc_horizontalStrut);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		add(scrollPane, gbc_scrollPane);
		
		JList friendList = new JList();
		scrollPane.setViewportView(friendList);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 3;
		add(scrollPane_1, gbc_scrollPane_1);
		
		JList friendRequestsList = new JList();
		scrollPane_1.setViewportView(friendRequestsList);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 3;
		gbc_horizontalStrut_1.gridy = 3;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 4;
		add(verticalStrut_1, gbc_verticalStrut_1);

		if (!ConnectionService.isCurrentUser()) {
			removeFriendButton.setEnabled(false);
			lblFriendRequests.setText("Common friends");
			buttonPanel.setVisible(false);
			// populate with common friends: friendRequestsList
		}
	}
}
