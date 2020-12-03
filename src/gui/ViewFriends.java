package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import org.omg.CORBA.FREE_MEM;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.User;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.net.IDN;
import java.awt.event.ActionEvent;

public class ViewFriends extends JPanel {

	/**
	 * Create the panel.
	 */
	public ViewFriends() {
		setBackground(SystemColor.activeCaption);
		setPreferredSize(new Dimension(600, 625));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 294, 243, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 27, 30, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		add(verticalStrut, gbc_verticalStrut);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		add(panel_1, gbc_panel_1);
		
		JLabel lblAverageAgeOf = new JLabel("Average age of your network:");
		lblAverageAgeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblAverageAgeOf);
		
		JLabel lblAge = new JLabel("20");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(lblAge);
		
		JLabel lblFriends = new JLabel("Friends");
		lblFriends.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFriends.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblFriends = new GridBagConstraints();
		gbc_lblFriends.insets = new Insets(0, 0, 5, 5);
		gbc_lblFriends.gridx = 1;
		gbc_lblFriends.gridy = 2;
		add(lblFriends, gbc_lblFriends);
		
		JLabel lblFriendRequests = new JLabel("Friend Requests");
		lblFriendRequests.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblFriendRequests = new GridBagConstraints();
		gbc_lblFriendRequests.insets = new Insets(0, 0, 5, 5);
		gbc_lblFriendRequests.gridx = 2;
		gbc_lblFriendRequests.gridy = 2;
		add(lblFriendRequests, gbc_lblFriendRequests);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 3;
		add(panel_2, gbc_panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnShowAll = new JButton("Show all");
		
		btnShowAll.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_2.add(btnShowAll);
		
		JButton btnShowFriendsWith = new JButton("Show friends with common interests");
		
		panel_2.add(btnShowFriendsWith);
		btnShowFriendsWith.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 3;
		add(panel_3, gbc_panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JToggleButton btnShowIgnored = new JToggleButton("Show ignored");
		
		panel_3.add(btnShowIgnored);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 4;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnShowMostPopular = new JButton("Show most popular");
		
		btnShowMostPopular.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.add(btnShowMostPopular);
		
		JButton removeFriendButton = new JButton("Remove friend");
		
		removeFriendButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.add(removeFriendButton);
		removeFriendButton.setIcon(null);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(SystemColor.menu);
		GridBagConstraints gbc_buttonPanel = new GridBagConstraints();
		gbc_buttonPanel.insets = new Insets(0, 0, 5, 5);
		gbc_buttonPanel.fill = GridBagConstraints.BOTH;
		gbc_buttonPanel.gridx = 2;
		gbc_buttonPanel.gridy = 4;
		add(buttonPanel, gbc_buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton acceptButton = new JButton("Accept");
		
		acceptButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		buttonPanel.add(acceptButton);
		
		JButton declineButton = new JButton("Decline");
		
		declineButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		buttonPanel.add(declineButton);
		
		JButton ignoreButton = new JButton("Ignore");
		
		ignoreButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		buttonPanel.add(ignoreButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 5;
		add(horizontalStrut, gbc_horizontalStrut);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		JList friendList = new JList();
		scrollPane.setViewportView(friendList);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 5;
		add(scrollPane_1, gbc_scrollPane_1);
		
		JList friendRequestsList = new JList();
		scrollPane_1.setViewportView(friendRequestsList);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 3;
		gbc_horizontalStrut_1.gridy = 5;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 6;
		add(verticalStrut_1, gbc_verticalStrut_1);
		
		User visited = ConnectionService.getInstance().getVisited();
		User user = ConnectionService.getInstance().getUser();
		Connection con = ConnectionService.getInstance().getConn();
		
		DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
		String SPsql = "EXEC dbo.findfriendsnames ?";
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, visited.getId());
			rs = ps.executeQuery();
			while(rs.next()) {
				iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		friendList.setModel(iModel);

		if (!ConnectionService.isCurrentUser()) {
			panel_1.setVisible(false);
			removeFriendButton.setEnabled(false);
			btnShowFriendsWith.setEnabled(false);
			btnShowMostPopular.setEnabled(false);
			lblFriendRequests.setVisible(false);
			buttonPanel.setVisible(false);
			panel_3.setVisible(false);
			friendRequestsList.setVisible(false);
			scrollPane_1.setVisible(false);
			// populate with common friends: friendRequestsList
		}
		else {
			
			 SPsql = "EXEC dbo.avgage ?";
			try {
				ps = con.prepareStatement(SPsql);
				ps.setInt(1, visited.getId());
				rs = ps.executeQuery();
				rs.next();
				lblAge.setText(rs.getString(1));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 SPsql = "EXEC dbo.showNotIgnored ?";
			 DefaultListModel<IdNamePair> rModel = new DefaultListModel<>();
			 try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, user.getId());
					rs = ps.executeQuery();
					while(rs.next()) {
						rModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 friendRequestsList.setModel(rModel);
		}
		
		
		btnShowAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
				String SPsql = "EXEC dbo.findfriendsnames ?";
				PreparedStatement ps;
				ResultSet rs;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, visited.getId());
					rs = ps.executeQuery();
					while(rs.next()) {
						iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				friendList.setModel(iModel);
			}
		});
		
		btnShowFriendsWith.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
				String SPsql = "EXEC dbo.friendsWithSameInterest ?";
				PreparedStatement ps;
				ResultSet rs;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, visited.getId());
					rs = ps.executeQuery();
					while(rs.next()) {
						iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				friendList.setModel(iModel);
			}
		});
		
		btnShowMostPopular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
				String SPsql = "EXEC dbo.mostPopularFriends ?";
				PreparedStatement ps;
				ResultSet rs;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, visited.getId());
					rs = ps.executeQuery();
					while(rs.next()) {
						iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				friendList.setModel(iModel);
			}
		});
		
		removeFriendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (friendList.isSelectionEmpty()) return;
				IdNamePair friend = (IdNamePair) friendList.getSelectedValue();
				String SPsql = "EXEC dbo.deletefriend ?, ?";
				PreparedStatement ps;
				int rs = -1;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, visited.getId());
					ps.setInt(2, friend.getId());
					rs = ps.executeUpdate();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (rs > 0) {
					DefaultListModel<IdNamePair> rModel = (DefaultListModel<IdNamePair>) friendList.getModel();
					rModel.removeElement(friend);
				}
				else {
					JOptionPane.showMessageDialog(ViewFriends.this, "Update was not succesful.");
				}
				friendList.setSelectedIndex(-1);
			}
		});
		
		acceptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (friendRequestsList.isSelectionEmpty()) return;
				IdNamePair request = (IdNamePair) friendRequestsList.getSelectedValue();
				String SPsql = "EXEC dbo.insertFriends ?, ?";
				PreparedStatement ps;
				int rs = -1;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, user.getId());
					ps.setInt(2, request.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(ViewFriends.this, "Update was not succesful.");
					return;
				}
				
				SPsql = "EXEC dbo.deleterequests ?, ?";
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, request.getId());
					ps.setInt(2, user.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(ViewFriends.this, "Update was not succesful.");
					return;
				}
				
				friendRequestsList.setSelectedIndex(-1);
				
				DefaultListModel<IdNamePair> rModel = (DefaultListModel<IdNamePair>) friendRequestsList.getModel();
				rModel.removeElement(request);
				DefaultListModel<IdNamePair> fModel = (DefaultListModel<IdNamePair>) friendList.getModel();
				fModel.addElement(request);

			}
		});
		
		declineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (friendRequestsList.isSelectionEmpty()) return;
				IdNamePair request = (IdNamePair) friendRequestsList.getSelectedValue();
				String SPsql;
				PreparedStatement ps;
				int rs = -1;
				SPsql = "EXEC dbo.deleterequests ?, ?";
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, request.getId());
					ps.setInt(2, user.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(ViewFriends.this, "Update was not succesful.");
					return;
				}
				friendRequestsList.setSelectedIndex(-1);
				
				DefaultListModel<IdNamePair> rModel = (DefaultListModel<IdNamePair>) friendRequestsList.getModel();
				rModel.removeElement(request);
			}
		});
		
		ignoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (friendRequestsList.isSelectionEmpty()) return;
				IdNamePair request = (IdNamePair) friendRequestsList.getSelectedValue();
				String SPsql;
				PreparedStatement ps;
				int rs = -1;
				SPsql = "EXEC dbo.ignoreRequest ?, ?";
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, request.getId());
					ps.setInt(2, user.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(ViewFriends.this, "Update was not succesful.");
					return;
				}
				friendRequestsList.setSelectedIndex(-1);
				
				DefaultListModel<IdNamePair> rModel = (DefaultListModel<IdNamePair>) friendRequestsList.getModel();
				rModel.removeElement(request);
			}
		});
		
		btnShowIgnored.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SPsql;
				PreparedStatement ps;
				Connection con = ConnectionService.getInstance().getConn();
				ResultSet rs;
 				if (btnShowIgnored.isSelected()) {
 					 SPsql = "EXEC dbo.showrequests ?";
 					 DefaultListModel<IdNamePair> rModel = new DefaultListModel<>();
 					 try {
 							ps = con.prepareStatement(SPsql);
 							ps.setInt(1, user.getId());
 							rs = ps.executeQuery();
 							while(rs.next()) {
 								rModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
 							}
 						} catch (SQLException e1) {
 							// TODO Auto-generated catch block
 							e1.printStackTrace();
 						}
 					 friendRequestsList.setModel(rModel);
				}
				else {
					 SPsql = "EXEC dbo.showNotIgnored ?";
					 DefaultListModel<IdNamePair> rModel = new DefaultListModel<>();
					 try {
							ps = con.prepareStatement(SPsql);
							ps.setInt(1, user.getId());
							rs = ps.executeQuery();
							while(rs.next()) {
								rModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					 friendRequestsList.setModel(rModel);
				}
			}
		});
	}
}
