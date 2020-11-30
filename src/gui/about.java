package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.color.ProfileDataException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.User;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.net.IDN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class about extends JPanel {
	private JButton editbutton;
	private JLabel namelabel;
	private JLabel birthdaylabel;
	private JLabel genderlabel;
	private JLabel locationlabel;
	private JLabel emailabel;
	private JLabel hometownlabel;
	private JLabel websitelabel;
	private JList interestsList;
	private JList worksList;
	private JList quotesList;
	private JList educationList;

	/**
	 * Create the panel.
	 */
	public about() {
		setMinimumSize(new Dimension(765, 1000));
		setPreferredSize(new Dimension(765, 1000));
		setSize(new Dimension(765, 1000));
		setBackground(SystemColor.activeCaption);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(289, 13, 145, 65);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(signup.class.getResource("/images/logosmall.png")));
		lblNewLabel_1.setBounds(0, 0, 187, 140);
		panel.add(lblNewLabel_1);
		
		editbutton = new JButton("EDIT");
		editbutton.setFont(new Font("Tahoma", Font.BOLD, 17));

		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2 = new JLabel("Birthday:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Gender:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Worked at:");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Education:");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Location:");
		lblNewLabel_2_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1 = new JLabel("Hometown:");
		lblNewLabel_2_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2 = new JLabel("Favorite quotes:");
		lblNewLabel_2_2_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_1 = new JLabel("Website:");
		lblNewLabel_2_2_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_2_2 = new JLabel("Hobbies:");
		lblNewLabel_2_2_1_1_1_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		namelabel = new JLabel("");
		
		 birthdaylabel = new JLabel("");
		
		 genderlabel = new JLabel("");
		
		 emailabel = new JLabel("");
		
		 locationlabel = new JLabel("");
		
		 hometownlabel = new JLabel("");
		
		 websitelabel = new JLabel("");
		
		JScrollPane scrollPane = new JScrollPane();
		
		worksList = new JList();
		scrollPane.setViewportView(worksList);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		educationList = new JList();
		scrollPane_1.setViewportView(educationList);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		quotesList = new JList();
		scrollPane_2.setViewportView(quotesList);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		interestsList = new JList();
		scrollPane_3.setViewportView(interestsList);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(genderlabel, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(lblNewLabel_2_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(emailabel, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(lblNewLabel_2_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(locationlabel, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(lblNewLabel_2_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(hometownlabel, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(websitelabel, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_2_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(lblNewLabel_2_2_1_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(lblNewLabel_2_2_1_1_1_1_1_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(265)
							.addComponent(editbutton, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(212)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(namelabel, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(birthdaylabel, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(185, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(namelabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(birthdaylabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(genderlabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(emailabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(locationlabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(hometownlabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(websitelabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2_1_1_1_1_1_2_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_2_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addComponent(lblNewLabel_2_2_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(lblNewLabel_2_2_1_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(editbutton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnAddFriend = new JButton("Add friend");
		btnAddFriend.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddFriend.setBackground(SystemColor.activeCaption);
		btnAddFriend.setBounds(160, 53, 91, 25);
		panel.add(btnAddFriend);
		btnAddFriend.setVisible(!ConnectionService.isCurrentUser());
		setLayout(groupLayout);
		
		editbutton.setEnabled(ConnectionService.isCurrentUser());
		
		refresh();
	}
	
	public JButton getEditbutton() {
		return editbutton;
	}

	public void refresh() {
		// TODO Auto-generated method stub
		User visited = ConnectionService.getInstance().getVisited();
		String SPsql = "EXEC dbo.showprofile ?";
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, visited.getId());
			rs = ps.executeQuery();
			rs.next();
			namelabel.setText(rs.getString(3));
			visited.setFirstName(rs.getString(2));
			visited.setLastName(rs.getString(1));
			birthdaylabel.setText(rs.getString(4));
			genderlabel.setText((rs.getString(9).equals("M")? "Male":"Female"));
			emailabel.setText(rs.getString(6));
			locationlabel.setText(rs.getString(8));
			hometownlabel.setText(rs.getString(7));
			websitelabel.setText(rs.getString(5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DefaultListModel<IdNamePair> iModel = new DefaultListModel<>();
		SPsql = "EXEC dbo.showinsterests ?";
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, visited.getId());
			rs = ps.executeQuery();
			while(rs.next()) {
				iModel.addElement(new IdNamePair(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		interestsList.setModel(iModel);
		
		DefaultListModel<String> sModel = new DefaultListModel<>();
		SPsql = "EXEC dbo.showrstudies ?";
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, visited.getId());
			rs = ps.executeQuery();
			while(rs.next()) {
				sModel.addElement(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		educationList.setModel(sModel);
		
		DefaultListModel<String> wModel = new DefaultListModel<>();
		SPsql = "EXEC dbo.showrworked ?";
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, visited.getId());
			rs = ps.executeQuery();
			while(rs.next()) {
				wModel.addElement(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		worksList.setModel(wModel);
		
		DefaultListModel<String> qModel = new DefaultListModel<>();
		SPsql = "EXEC dbo.showquotes ?";
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, visited.getId());
			rs = ps.executeQuery();
			while(rs.next()) {
				qModel.addElement(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quotesList.setModel(qModel);
	}
}