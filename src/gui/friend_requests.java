package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;

public class friend_requests {

	private JFrame frmSocialface;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					friend_requests window = new friend_requests();
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
	public friend_requests() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage(friend_requests.class.getResource("/images/logosmall.png")));
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setBounds(100, 100, 450, 300);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel FriendReguestsLabel = new JLabel("Friend Requests");
		FriendReguestsLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		FriendReguestsLabel.setBounds(140, 10, 140, 13);
		frmSocialface.getContentPane().add(FriendReguestsLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 60, 416, 193);
		frmSocialface.getContentPane().add(panel);
	}

}
