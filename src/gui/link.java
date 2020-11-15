package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;

public class link {

	private JFrame frmSocialface;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					link window = new link();
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
	public link() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage(link.class.getResource("/images/logosmall.png")));
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setBounds(100, 100, 450, 300);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel LinksLabel = new JLabel("Links");
		LinksLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		LinksLabel.setBounds(177, 10, 45, 13);
		frmSocialface.getContentPane().add(LinksLabel);
		
		JLabel YourLinksLabel = new JLabel("Your Links");
		YourLinksLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		YourLinksLabel.setBounds(10, 79, 77, 13);
		frmSocialface.getContentPane().add(YourLinksLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 93, 426, 160);
		frmSocialface.getContentPane().add(panel);
		
		JButton ShareLinkbtn = new JButton("Share Link");
		ShareLinkbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		ShareLinkbtn.setBounds(321, 76, 105, 21);
		frmSocialface.getContentPane().add(ShareLinkbtn);
	}

}
