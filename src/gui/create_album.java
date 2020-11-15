package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class create_album {

	private JFrame frmSocialface;
	private JTextField nameofalbumtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create_album window = new create_album();
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
	public create_album() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 13));
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage(create_album.class.getResource("/images/logosmall.png")));
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setBounds(100, 100, 450, 300);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel CreateAlbumLabel = new JLabel("Create Album");
		CreateAlbumLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		CreateAlbumLabel.setBounds(150, 10, 117, 34);
		frmSocialface.getContentPane().add(CreateAlbumLabel);
		
		JLabel nameofalbumlabel = new JLabel("Name:");
		nameofalbumlabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		nameofalbumlabel.setBounds(22, 75, 48, 24);
		frmSocialface.getContentPane().add(nameofalbumlabel);
		
		nameofalbumtext = new JTextField();
		nameofalbumtext.setBounds(76, 79, 96, 19);
		frmSocialface.getContentPane().add(nameofalbumtext);
		nameofalbumtext.setColumns(10);
		
		JRadioButton PublicRadioButton = new JRadioButton("Public");
		PublicRadioButton.setBounds(76, 113, 103, 21);
		frmSocialface.getContentPane().add(PublicRadioButton);
		
		JLabel typeofalbumlabel = new JLabel("Type:");
		typeofalbumlabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		typeofalbumlabel.setBounds(22, 110, 48, 24);
		frmSocialface.getContentPane().add(typeofalbumlabel);
		
		JRadioButton OnlyFriendsRadioButton = new JRadioButton("Only Friends");
		OnlyFriendsRadioButton.setBounds(76, 136, 103, 21);
		frmSocialface.getContentPane().add(OnlyFriendsRadioButton);
		
		JButton Uploadpvbtn2 = new JButton("Upload Photo/Video");
		Uploadpvbtn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		Uploadpvbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Uploadpvbtn2.setBounds(127, 199, 184, 21);
		frmSocialface.getContentPane().add(Uploadpvbtn2);
	}
}
