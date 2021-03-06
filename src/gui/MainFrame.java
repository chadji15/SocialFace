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
import javax.management.modelmbean.ModelMBean;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import com.team21.ConnectionService;
import com.team21.User;

//import jdk.jfr.internal.tool.Main;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private profile profile_;

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
		setPreferredSize(new Dimension(800, 800));
		setSize(new Dimension(669, 700));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/images/logo16.png")));
		setTitle("Social Face");
		setMinimumSize(new Dimension(10, 10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JButton searchButton = new JButton("Search");
		searchButton.setBackground(SystemColor.activeCaption);
		JPanel cardPanel = new JPanel();
		
		JButton btnHome = new JButton("Home");
		btnHome.setBackground(SystemColor.activeCaption);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setBackground(SystemColor.activeCaption);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(searchButton)
							.addPreferredGap(ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
							.addComponent(btnLogOut)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnHome))
						.addComponent(cardPanel, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(searchButton)
						.addComponent(btnHome)
						.addComponent(btnLogOut))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cardPanel, GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
					.addGap(0))
		);
		cardPanel.setLayout(new CardLayout(0, 0));
		
		profile_ = new profile();
		profile_.setPreferredSize(new Dimension(765, 700));
		profile_.setMinimumSize(new Dimension(10, 10));
		cardPanel.add(profile_, "name_562092603074000");
		
		search search_ = new search();
		
		cardPanel.add(search_, "name_563486844515400");
		
		SearchResults searchResults = new SearchResults();
		cardPanel.add(searchResults, "name_915625734146800");
		contentPane.setLayout(gl_contentPane);
		
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.removeAll();
				cardPanel.add(search_);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionService.getInstance().setVisited(ConnectionService.getInstance().getUser());
				cardPanel.removeAll();
				MainFrame.this.profile_ = new profile();
				cardPanel.add(profile_);
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		
		search_.getBtnSearch().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.removeAll();
				DefaultListModel<User> m = search_.chooseSearch();
				if (m == null) {
					return;
				}
				searchResults.getResList().setModel(m);
				cardPanel.add(searchResults);	
				cardPanel.revalidate();
				cardPanel.repaint();
			}
		});
		searchResults.getResList().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					if (searchResults.getResList().getSelectionModel().isSelectionEmpty())
						return;
					User vUser = (User) searchResults.getResList().getSelectedValue();
					ConnectionService.getInstance().setVisited(vUser);
					MainFrame.this.profile_ = new profile();
					cardPanel.removeAll();
					cardPanel.add(profile_);
					cardPanel.revalidate();
					cardPanel.repaint();
				}
			}
		});
		
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionService.getInstance().setUser(null);
				ConnectionService.getInstance().setVisited(null);
				StartUp startUp = new StartUp();
				startUp.setVisible(true);
				dispose();
			}
		});
		
		
		
		
	}
}
