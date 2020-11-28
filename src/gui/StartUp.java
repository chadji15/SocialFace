package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team21.ConnectionService;
import com.team21.User;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
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
				CallableStatement cs = null;
				ResultSet rs = null;
				int id = -1;
				try {
					cs = ConnectionService.getInstance().getConn().
							prepareCall("{call dbo.checkLogin (?,?,?)}");
					cs.setString(1, login_.getUsernametext().getText());
					cs.setString(2, login_.getPasswordField().getText());
					cs.registerOutParameter(3, java.sql.Types.INTEGER);
					cs.execute();
					id = cs.getInt(3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				/*if (id < 1) {
					JOptionPane.showMessageDialog(StartUp.this, "Email or password is incorrect. Please try again.");
					return;
				}*/
				User currUser = new User(id);
				ConnectionService.getInstance().setUser(User.dummy1);
				ConnectionService.getInstance().setVisited(User.dummy1);
				JFrame main = new MainFrame();
				main.setVisible(true);
				dispose();
			}
		});
	
	}
	
}
