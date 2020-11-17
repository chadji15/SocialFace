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
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class ViewFriends extends JPanel {

	/**
	 * Create the panel.
	 */
	public ViewFriends() {
		setPreferredSize(new Dimension(530, 746));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 383, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 369, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblFriends = new JLabel("Friends");
		GridBagConstraints gbc_lblFriends = new GridBagConstraints();
		gbc_lblFriends.anchor = GridBagConstraints.WEST;
		gbc_lblFriends.insets = new Insets(0, 0, 5, 5);
		gbc_lblFriends.gridx = 1;
		gbc_lblFriends.gridy = 1;
		add(lblFriends, gbc_lblFriends);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		JList friendList = new JList();
		scrollPane.setViewportView(friendList);
		
		JButton removeFriendButton = new JButton("");
		removeFriendButton.setIcon(new ImageIcon(ViewFriends.class.getResource("/images/minus16.png")));
		GridBagConstraints gbc_removeFriendButton = new GridBagConstraints();
		gbc_removeFriendButton.insets = new Insets(0, 0, 5, 5);
		gbc_removeFriendButton.gridx = 2;
		gbc_removeFriendButton.gridy = 2;
		add(removeFriendButton, gbc_removeFriendButton);
		
		JLabel lblFriendRequests = new JLabel("Friend Requests");
		GridBagConstraints gbc_lblFriendRequests = new GridBagConstraints();
		gbc_lblFriendRequests.anchor = GridBagConstraints.WEST;
		gbc_lblFriendRequests.insets = new Insets(0, 0, 5, 5);
		gbc_lblFriendRequests.gridx = 1;
		gbc_lblFriendRequests.gridy = 6;
		add(lblFriendRequests, gbc_lblFriendRequests);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 4;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 7;
		add(scrollPane_1, gbc_scrollPane_1);
		
		JList friendRequestsList = new JList();
		scrollPane_1.setViewportView(friendRequestsList);
		
		JButton acceptButton = new JButton("Accept");
		GridBagConstraints gbc_acceptButton = new GridBagConstraints();
		gbc_acceptButton.insets = new Insets(0, 0, 5, 5);
		gbc_acceptButton.gridx = 2;
		gbc_acceptButton.gridy = 7;
		add(acceptButton, gbc_acceptButton);
		
		JButton declineButton = new JButton("Decline");
		GridBagConstraints gbc_declineButton = new GridBagConstraints();
		gbc_declineButton.insets = new Insets(0, 0, 5, 5);
		gbc_declineButton.gridx = 2;
		gbc_declineButton.gridy = 8;
		add(declineButton, gbc_declineButton);
		
		JButton ignoreButton = new JButton("Ignore");
		GridBagConstraints gbc_ignoreButton = new GridBagConstraints();
		gbc_ignoreButton.insets = new Insets(0, 0, 5, 5);
		gbc_ignoreButton.gridx = 2;
		gbc_ignoreButton.gridy = 9;
		add(ignoreButton, gbc_ignoreButton);

	}
}
