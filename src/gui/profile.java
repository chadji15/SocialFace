	package gui;

	import javax.swing.JPanel;
	import javax.swing.JLabel;
	import java.awt.Font;
	import java.awt.Color;
	import com.jgoodies.forms.factories.DefaultComponentFactory;
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

	public class profile extends JPanel {

		/**
		 * Create the panel.
		 */
		public profile() {
			setBackground(new Color(204, 204, 255));
			setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255));
			panel.setBounds(0, 0, 703, 72);
			add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(signup.class.getResource("/images/logosmall.png")));
			lblNewLabel_1.setBounds(516, -13, 187, 140);
			panel.add(lblNewLabel_1);
			
			JButton btnNewButton = new JButton("SEARCH");
			btnNewButton.setForeground(new Color(102, 102, 255));
			btnNewButton.setBackground(new Color(255, 255, 255));
			btnNewButton.setBounds(-14, 0, 228, 72);
			panel.add(btnNewButton);
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 27));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNewButton.setIcon(new ImageIcon(profile.class.getResource("/images/Webp.net-resizeimage (1).gif")));
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(204, 204, 255));
			panel_1.setForeground(new Color(0, 0, 0));
			panel_1.setBounds(0, 71, 703, 129);
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
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(0, 200, 703, 32);
			add(panel_2);
			panel_2.setLayout(new GridLayout(0, 5, 0, 0));
			
			JToggleButton timetable = new JToggleButton("Timetable");
			panel_2.add(timetable);
			
			JToggleButton about = new JToggleButton("About");
			panel_2.add(about);
			
			JToggleButton photosvideos = new JToggleButton("Photos/Videos");
			panel_2.add(photosvideos);
			
			JToggleButton friends = new JToggleButton("Friends");
			panel_2.add(friends);
			
			JToggleButton events = new JToggleButton("Events");
			panel_2.add(events);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(new Color(204, 204, 255));
			panel_3.setBounds(0, 230, 703, 386);
			add(panel_3);

		}
	}