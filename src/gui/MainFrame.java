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
		setMinimumSize(new Dimension(5, 5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel card_panel = new JPanel();
		card_panel.setLayout(new CardLayout(0, 0));
		JButton btnSearch = new JButton("Search");
		
		JButton btnLogOut = new JButton("Log out");
		JButton btnHome = new JButton("Home");
		
		profile profile_ = new profile();
		card_panel.add(profile_, "name_468328363740900");
		profile_.setMinimumSize(new Dimension(0, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSearch)
							.addGap(478)
							.addComponent(btnHome)
							.addGap(7)
							.addComponent(btnLogOut))
						.addComponent(card_panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSearch)
						.addComponent(btnHome)
						.addComponent(btnLogOut))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(card_panel, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		search search_ = new search();
		card_panel.add(search_, "name_468514580131200");
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
				card_panel.repaint();
				card_panel.revalidate();
			}
		});
	}
}
