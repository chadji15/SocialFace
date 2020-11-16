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

	public class profile extends JPanel {

		/**
		 * Create the panel.
		 */
		public profile() {
			setMinimumSize(new Dimension(700, 580));
			setBackground(new Color(204, 204, 255));
			setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(204, 204, 255));
			panel_1.setForeground(new Color(0, 0, 0));
			panel_1.setBounds(0, 0, 703, 129);
			add(panel_1);
			panel_1.setLayout(null);
			
			JLabel profilename = new JLabel("Profile Name");
			profilename.setFont(new Font("Tahoma", Font.BOLD, 15));
			profilename.setHorizontalAlignment(SwingConstants.CENTER);
			profilename.setBounds(244, 83, 209, 46);
			panel_1.add(profilename);
			
			JLabel profilepicture = new JLabel("");
			profilepicture.setBounds(244, 0, 209, 129);
			panel_1.add(profilepicture);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					profile.this.repaint();
					profile.this.revalidate();
				}
			});
			tabbedPane.setBounds(0, 131, 696, 742);
			add(tabbedPane);
			
			about about_ = new about();
			tabbedPane.addTab("About", null, about_, null);
			
			events events_ = new events();
			tabbedPane.addTab("Events", null, events_, null);
			
			JPanel friends_ = new JPanel();
			tabbedPane.addTab("Friends", null, friends_, null);

		}
	}