package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.event.ChangeEvent;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.SystemColor;

public class profile extends JPanel {

	private about about_;
	/**
	 * Create the panel.
	 */
	public profile() {
		setPreferredSize(new Dimension(825, 543));
		setMinimumSize(new Dimension(700, 580));
		setBackground(new Color(204, 204, 255));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 38, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel photoLabel = new JLabel("");
		
		photoLabel.setIcon(new ImageIcon(profile.class.getResource("/images/avatar100.png")));
		panel_1.add(photoLabel);

		JLabel nameLabel = new JLabel("Firstname Lastname");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(nameLabel);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.menu);
		scrollPane.setViewportView(tabbedPane);

		JPanel home = new JPanel();
		tabbedPane.addTab("About", null, home, null);
		home.setLayout(new CardLayout(0, 0));

		ViewFriends viewFriends = new ViewFriends();
		tabbedPane.addTab("Friends", null, viewFriends, null);

		about_ = new about();
		nameLabel.setText(ConnectionService.getInstance().getVisited().getFullName());
		home.add(about_, "name_636468128325600");

		aboutedit aboutedit_ = new aboutedit();
		home.add(aboutedit_, "name_636475357202700");

		PhotosVideos photosVideos = new PhotosVideos();
		tabbedPane.addTab("Photos/ Videos", null, photosVideos, null);

		events events_ = new events();
		tabbedPane.addTab("Events", null, events_, null);

		Links links = new Links();
		tabbedPane.addTab("Links", null, links, null);

		viewUpdates viewUpdates_ = new viewUpdates();
		if (ConnectionService.isCurrentUser())
			tabbedPane.addTab("Updates", null, viewUpdates_, null);

		scrollPane.getViewport().setViewPosition(new Point(0, 0));

		about_.getEditbutton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home.removeAll();
				aboutedit_.refresh();
				home.add(aboutedit_);
				home.revalidate();
				home.repaint();
			}
		});

		aboutedit_.getBtnCancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home.removeAll();
				about_.refresh();
				home.add(about_);
				home.revalidate();
				home.repaint();
			}
		});

		aboutedit_.getSubmitbutton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User visited = ConnectionService.getInstance().getVisited();
				String SPsql = "EXEC dbo.editprofile ?, ?, ?, ?, ?, ?, ?, ? ";
				Connection con = ConnectionService.getInstance().getConn();
				PreparedStatement ps;
				int rs = -1;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, visited.getId());
					ps.setString(2, aboutedit_.getFirstnameedit().getText());
					ps.setString(3, aboutedit_.getLastnameedit().getText());
					String date = new SimpleDateFormat("yyyy-MM-dd").format(aboutedit_.getBirthdayedit().getDate());
					ps.setString(4, date);
					ps.setString(5, aboutedit_.getWebsiteedit().getText());
					ps.setString(6, aboutedit_.getEmailedit().getText());
					IdNamePair location = (IdNamePair) aboutedit_.getLocationedit().getSelectedItem();
					if (location.getName() == null) 
						ps.setObject(8, null);
					else
						ps.setInt(8,  location.getId());
					IdNamePair hometown = (IdNamePair) aboutedit_.getHometownedit().getSelectedItem();
					if (hometown.getName() == null)
						ps.setObject(7, null);
					else
						ps.setInt(7, hometown.getId());
					rs = ps.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (rs > 0) {
					home.removeAll();
					about_.refresh();
					home.add(about_);
					home.revalidate();
					home.repaint();
				}
				else {
					JOptionPane.showMessageDialog(profile.this, "Update was not succesful. Please check that you email address is valid and not used"
							+ " twice. Check that your birthday is a valid date.");
				}
			}
		});

		/*photoLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ConnectionService.isCurrentUser() && e.getClickCount() == 2) {
					JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			        jfc.setDialogTitle("Select an image");
			        jfc.setAcceptAllFileFilterUsed(false);
			        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.jpeg", "jpg");
			        jfc.addChoosableFileFilter(filter);
	
			        int returnValue = jfc.showOpenDialog(null);
			        if (returnValue == JFileChooser.APPROVE_OPTION) {
			            //TODO upload pic and set as profile pic
			        }
				}
			}
		});*/
	}
}