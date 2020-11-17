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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

	public class profile extends JPanel {

		/**
		 * Create the panel.
		 */
		public profile() {
			setPreferredSize(new Dimension(765, 650));
			setMinimumSize(new Dimension(700, 580));
			setBackground(new Color(204, 204, 255));
			setLayout(new GridLayout(1, 0, 0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			add(scrollPane);
			
			JPanel panel = new JPanel();
			scrollPane.setViewportView(panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{602, 0};
			gbl_panel.rowHeights = new int[]{91, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			
			JPanel panel_1 = new JPanel();
			GridBagConstraints gbc_panel_1 = new GridBagConstraints();
			gbc_panel_1.insets = new Insets(0, 0, 5, 0);
			gbc_panel_1.fill = GridBagConstraints.BOTH;
			gbc_panel_1.gridx = 0;
			gbc_panel_1.gridy = 0;
			panel.add(panel_1, gbc_panel_1);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
			gbc_tabbedPane.insets = new Insets(0, 0, 5, 0);
			gbc_tabbedPane.fill = GridBagConstraints.BOTH;
			gbc_tabbedPane.gridx = 0;
			gbc_tabbedPane.gridy = 1;
			panel.add(tabbedPane, gbc_tabbedPane);
			
			about about_ = new about();
			tabbedPane.addTab("New tab", null, about_, null);
			
			events events_ = new events();
			tabbedPane.addTab("New tab", null, events_, null);
			
			ViewFriends viewFriends = new ViewFriends();
			tabbedPane.addTab("New tab", null, viewFriends, null);
			
			PhotosVideos photosVideos = new PhotosVideos();
			tabbedPane.addTab("New tab", null, photosVideos, null);

		}
	}