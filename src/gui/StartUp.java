package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class StartUp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUp frame = new StartUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartUp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartUp.class.getResource("/images/logo16.png")));
		setTitle("SocialFace");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		JPanel cardPanel = new JPanel();
		scrollPane.setViewportView(cardPanel);
		cardPanel.setLayout(new CardLayout(0, 0));
		
		login login_ = new login();
	
		
		cardPanel.add(login_, "name_798910024845900");
		
		signup signup_ = new signup();
		
		cardPanel.add(signup_, "name_799110305448300");
		
		login_.getCreateButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.removeAll();
				cardPanel.add(signup_);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		
		signup_.getCreateaccountbutton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.removeAll();
				cardPanel.add(login_);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		
		login_.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame main = new MainFrame();
				main.setVisible(true);
				dispose();
			}
		});
	}
}
