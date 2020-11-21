package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class friends {

	private JFrame frmSocialface;
	private JTextField SearchText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					friends window = new friends();
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
	public friends() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage(friends.class.getResource("/images/logosmall.png")));
		frmSocialface.setBounds(100, 100, 696, 553);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel FriensLabel = new JLabel("Friends");
		FriensLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		FriensLabel.setBounds(142, 9, 73, 13);
		frmSocialface.getContentPane().add(FriensLabel);
		
		JLabel YourFrindsLabel = new JLabel("Your Friends");
		YourFrindsLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		YourFrindsLabel.setBounds(10, 50, 89, 13);
		frmSocialface.getContentPane().add(YourFrindsLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 67, 650, 439);
		frmSocialface.getContentPane().add(panel);
		
		JLabel Searchbtn = new JLabel("Search:");
		Searchbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		Searchbtn.setBounds(275, 11, 62, 13);
		frmSocialface.getContentPane().add(Searchbtn);
		
		SearchText = new JTextField();
		SearchText.setBounds(330, 9, 96, 19);
		frmSocialface.getContentPane().add(SearchText);
		SearchText.setColumns(10);
		
		JButton FriendRequestsbtn = new JButton("Friend Requests");
		FriendRequestsbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		FriendRequestsbtn.setBounds(247, 47, 168, 21);
		frmSocialface.getContentPane().add(FriendRequestsbtn);
	}

}
