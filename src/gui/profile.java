	package gui;

	import javax.swing.JPanel;
	import javax.swing.JLabel;
	import java.awt.Font;
	import java.awt.Color;
	import javax.swing.JTextField;
	import javax.swing.JRadioButton;
	import com.toedter.calendar.JDateChooser;
	import javax.swing.SwingConstants;
	import javax.swing.JPasswordField;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeListener;
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

	public class profile extends JPanel {

		/**
		 * Create the panel.
		 */
		public profile() {
			setPreferredSize(new Dimension(825, 543));
			setMinimumSize(new Dimension(700, 580));
			setBackground(new Color(204, 204, 255));
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{0, 0};
			gridBagLayout.rowHeights = new int[]{38, 0, 0};
			gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			setLayout(gridBagLayout);
			
			JPanel panel_1 = new JPanel();
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
			scrollPane.setViewportView(tabbedPane);
			
			
			JPanel home = new JPanel();
			tabbedPane.addTab("About", null, home, null);
			home.setLayout(new CardLayout(0, 0));
			
			ViewFriends viewFriends = new ViewFriends();
			tabbedPane.addTab("Friends", null, viewFriends, null);
			
			about about_ = new about();
			
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
			tabbedPane.addTab("Updates", null, viewUpdates_, null);
			
			scrollPane.getViewport().setViewPosition(new Point(0,0));
			
			about_.getEditbutton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					home.removeAll();
					home.add(aboutedit_);
					home.revalidate();
					home.repaint();
				}
			});
			
			aboutedit_.getBtnCancel().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					home.removeAll();
					home.add(about_);
					home.revalidate();
					home.repaint();
				}
			});
			
			aboutedit_.getSubmitbutton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					home.removeAll();
					home.add(about_);
					home.revalidate();
					home.repaint();
				}
			});
			

		}
	}