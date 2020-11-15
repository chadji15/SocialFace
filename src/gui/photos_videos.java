package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class photos_videos {

	private JFrame frmSocialface;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					photos_videos window = new photos_videos();
					window.frmSocialface.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public photos_videos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage(photos_videos.class.getResource("/images/LOGO.PNG")));
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setBounds(100, 100, 480, 333);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JButton CreateAlbumBtn = new JButton("Create Album");
		CreateAlbumBtn.setBounds(53, 247, 130, 25);
		CreateAlbumBtn.setForeground(SystemColor.desktop);
		CreateAlbumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		CreateAlbumBtn.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAlbumBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmSocialface.getContentPane().add(CreateAlbumBtn);
		
		JButton Uploadpvbtn = new JButton("Upload Photo/Video");
		Uploadpvbtn.setBounds(248, 247, 181, 25);
		Uploadpvbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmSocialface.getContentPane().add(Uploadpvbtn);
		
		JLabel Photos_VideosLabel = new JLabel("Photos and Videos");
		Photos_VideosLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		Photos_VideosLabel.setBounds(141, 10, 201, 13);
		frmSocialface.getContentPane().add(Photos_VideosLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 34, 446, 203);
		frmSocialface.getContentPane().add(panel);
	}
}
