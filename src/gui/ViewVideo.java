package gui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.team21.ConnectionService;
import com.team21.IdNamePair;
import com.team21.Privacy;

import java.awt.Component;
import java.awt.Desktop;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.print.attribute.standard.Media;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextMeasurer;
import java.io.IOException;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.io.File;
import java.awt.SystemColor;
import java.awt.Font;


public class ViewVideo extends JPanel {
	private JButton btnBack;
	private JTextField videoMessageText;
	private JLabel lblOwnername;
	private JTextArea descriptionText;
	private JTable commentsTable;

	/**
	 * Create the panel.
	 */
	public ViewVideo() {
		setBackground(SystemColor.activeCaption);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 95, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		add(verticalStrut, gbc_verticalStrut);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 1;
		add(horizontalStrut, gbc_horizontalStrut);
		
		videoMessageText = new JTextField("VideoMessage");
		videoMessageText.setFont(new Font("Tahoma", Font.BOLD, 12));
		videoMessageText.setHorizontalAlignment(SwingConstants.CENTER);
		videoMessageText.setEditable(false);
		GridBagConstraints gbc_videoMessageText = new GridBagConstraints();
		gbc_videoMessageText.fill = GridBagConstraints.HORIZONTAL;
		gbc_videoMessageText.gridwidth = 2;
		gbc_videoMessageText.insets = new Insets(0, 0, 5, 5);
		gbc_videoMessageText.gridx = 1;
		gbc_videoMessageText.gridy = 1;
		add(videoMessageText, gbc_videoMessageText);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 3;
		gbc_horizontalStrut_1.gridy = 1;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 2;
		gbc_verticalStrut_3.gridy = 2;
		add(verticalStrut_3, gbc_verticalStrut_3);
		
		JLabel lblOwner = new JLabel("Owner:");
		lblOwner.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblOwner = new GridBagConstraints();
		gbc_lblOwner.anchor = GridBagConstraints.WEST;
		gbc_lblOwner.insets = new Insets(0, 0, 5, 5);
		gbc_lblOwner.gridx = 1;
		gbc_lblOwner.gridy = 3;
		add(lblOwner, gbc_lblOwner);
		
		lblOwnername = new JLabel("ownerName");
		lblOwnername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblOwnername = new GridBagConstraints();
		gbc_lblOwnername.anchor = GridBagConstraints.WEST;
		gbc_lblOwnername.insets = new Insets(0, 0, 5, 5);
		gbc_lblOwnername.gridx = 2;
		gbc_lblOwnername.gridy = 3;
		add(lblOwnername, gbc_lblOwnername);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.WEST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 1;
		gbc_lblDescription.gridy = 4;
		add(lblDescription, gbc_lblDescription);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);
		
		descriptionText = new JTextArea();
		descriptionText.setEditable(false);
		scrollPane.setViewportView(descriptionText);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_4.gridx = 1;
		gbc_verticalStrut_4.gridy = 5;
		add(verticalStrut_4, gbc_verticalStrut_4);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 6;
		add(panel, gbc_panel);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.add(btnBack);
		
		JToggleButton tglbtnEdit = new JToggleButton("Edit");
		tglbtnEdit.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		panel.add(tglbtnEdit);
		
		JButton btnComment = new JButton("Comment");
		btnComment.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		panel.add(btnComment);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		panel.add(btnPlay);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 2;
		gbc_verticalStrut_2.gridy = 7;
		add(verticalStrut_2, gbc_verticalStrut_2);
		
		JLabel lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblComments = new GridBagConstraints();
		gbc_lblComments.anchor = GridBagConstraints.WEST;
		gbc_lblComments.insets = new Insets(0, 0, 5, 5);
		gbc_lblComments.gridx = 1;
		gbc_lblComments.gridy = 8;
		add(lblComments, gbc_lblComments);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 9;
		add(scrollPane_1, gbc_scrollPane_1);
		
		commentsTable = new JTable();
		commentsTable.setEnabled(false);

		commentsTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(commentsTable);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 10;
		add(verticalStrut_1, gbc_verticalStrut_1);
		
		btnComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddComment addComment = new AddComment();
				addComment.setVideoComment();
				addComment.setVisible(true);
				refreshComments();
			}
		});
		
		tglbtnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean bool = tglbtnEdit.isSelected();
				videoMessageText.setEditable(bool);
				descriptionText.setEditable(bool);
				if (!bool) {
					Connection con = ConnectionService.getInstance().getConn();
					IdNamePair video = ConnectionService.getInstance().getVideo();
					String SPsql;
					PreparedStatement ps;
					int rs;
					SPsql = "EXEC dbo.editvideo ?, ?, ?";
					try {
						ps = con.prepareStatement(SPsql);
						ps.setString(1, videoMessageText.getText());
						ps.setString(3, descriptionText.getText());
						ps.setInt(2, video.getId());
						rs = ps.executeUpdate();
					} catch (SQLException e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(ViewVideo.this, "Update was not successful");

					}
				
				}
			}
		});
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = ConnectionService.getInstance().getConn();
				IdNamePair video = ConnectionService.getInstance().getVideo();
				String SPsql = "EXEC dbo.getVideoSource ?";
				PreparedStatement ps;
				ResultSet rs;
				String source = null;
				try {
					ps = con.prepareStatement(SPsql);
					ps.setInt(1, video.getId());
					rs = ps.executeQuery();
					rs.next();
					source = rs.getString(1);
				} catch (SQLException e1) {
					e1.printStackTrace();
					return;
				}
				try {
					Desktop.getDesktop().open(new File(source));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		if (!ConnectionService.isCurrentUser()) {
			tglbtnEdit.setEnabled(false);
		}
	}
	
	public void refreshVideo() {
		Connection con = ConnectionService.getInstance().getConn();
		IdNamePair video = ConnectionService.getInstance().getVideo();

		String SPsql = "EXEC dbo.showvideo ?";
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, video.getId());
			rs = ps.executeQuery();
			rs.next();
			videoMessageText.setText(rs.getString(2));
			descriptionText.setText(rs.getString(3));
			lblOwnername.setText(rs.getString(5));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public void refreshComments() {
		Vector<Vector<String>> rows = new Vector<>();
		String SPsql = "EXEC dbo.showrvideocomments ?";
		Connection con = ConnectionService.getInstance().getConn();
		PreparedStatement ps;
		ResultSet rs;
		IdNamePair video = ConnectionService.getInstance().getVideo(); 
		try {
			ps = con.prepareStatement(SPsql);
			ps.setInt(1, video.getId());
			rs = ps.executeQuery();
			while (rs.next()) {
				Vector<String> row = new Vector<>();
				row.add(rs.getString(1));
				row.add(rs.getString(2));
				rows.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Vector<String> header = new Vector<>();
		header.add("Name");
		header.add("Comment");
		commentsTable.setModel(new DefaultTableModel(rows, header));
	}

	public JButton getBtnBack() {
		return btnBack;
	}
}
