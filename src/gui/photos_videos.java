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

public class photos_videos {

	private JFrame frmSocialface;
	private JTextField txtPhotesAndVideos;

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
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Katerinatz\\Desktop\\125302082_369991734446627_3387089125455958246_n.png"));
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setBounds(100, 100, 480, 333);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		txtPhotesAndVideos = new JTextField();
		txtPhotesAndVideos.setBounds(0, 0, 466, 25);
		txtPhotesAndVideos.setForeground(SystemColor.activeCaptionText);
		txtPhotesAndVideos.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		txtPhotesAndVideos.setText("                                      Photes and Videos");
		frmSocialface.getContentPane().add(txtPhotesAndVideos);
		txtPhotesAndVideos.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Album");
		btnNewButton.setBounds(0, 247, 99, 25);
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		frmSocialface.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Upload Photo/Video");
		btnNewButton_1.setBounds(230, 187, 133, 121);
		btnNewButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		frmSocialface.getContentPane().add(btnNewButton_1);
	}

}
