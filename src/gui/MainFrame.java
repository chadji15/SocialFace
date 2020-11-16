package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.ScrollPaneConstants;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setSize(new Dimension(750, 700));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/images/logo16.png")));
		setTitle("Social Face");
		setMinimumSize(new Dimension(20, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);

		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
					.addGap(1))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
		);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		JButton btnSearch = new JButton("Search");
		JButton btnHome = new JButton("Home");
		JButton btnLogOut = new JButton("Log out");
		
		JPanel card_panel = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(card_panel, GroupLayout.PREFERRED_SIZE, 682, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnSearch)
							.addGap(456)
							.addComponent(btnHome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLogOut)))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSearch)
						.addComponent(btnHome)
						.addComponent(btnLogOut))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(card_panel, GroupLayout.PREFERRED_SIZE, 579, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(340, Short.MAX_VALUE))
		);
		card_panel.setLayout(new CardLayout(0, 0));
		
		profile profile_ = new profile();
		card_panel.add(profile_, "name_472557988312400");
		
		search search_ = new search();
		card_panel.add(search_, "name_472560177831700");
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

		
		////////////////////////////////////////////////
		//Event listeners
		////////////////////////////////////////////////
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_panel.removeAll();
				card_panel.add(profile_);
				
				card_panel.repaint();
				card_panel.revalidate();
				
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_panel.removeAll();
				card_panel.add(search_);
				MainFrame.this.pack();
				card_panel.repaint();
				card_panel.revalidate();
				
			}
		});
		
	
	}
}
