package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewPhoto extends JPanel {
	private JButton btnBack;

	/**
	 * Create the panel.
	 */
	public ViewPhoto() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 0;
		add(verticalStrut_1, gbc_verticalStrut_1);
		
		JTextField txtPhotoname = new JTextField("PhotoName");
		txtPhotoname.setEditable(false);
		txtPhotoname.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtPhotoname = new GridBagConstraints();
		gbc_txtPhotoname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPhotoname.insets = new Insets(0, 0, 5, 5);
		gbc_txtPhotoname.gridx = 1;
		gbc_txtPhotoname.gridy = 1;
		add(txtPhotoname, gbc_txtPhotoname);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 2;
		add(horizontalStrut, gbc_horizontalStrut);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblOwner = new JLabel("Owner:");
		panel.add(lblOwner);
		
		JLabel lblOwnerlabel = new JLabel("ownerLabel");
		panel.add(lblOwnerlabel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 3;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnBack = new JButton("Back");
		panel_1.add(btnBack);
		
		JToggleButton likeToggle = new JToggleButton("Like");
		panel_1.add(likeToggle);
		
		JToggleButton tglbtnEdit = new JToggleButton("Edit");
		
		panel_1.add(tglbtnEdit);
		
		JLabel lblPeopleLike = new JLabel("10 people like this");
		GridBagConstraints gbc_lblPeopleLike = new GridBagConstraints();
		gbc_lblPeopleLike.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeopleLike.gridx = 1;
		gbc_lblPeopleLike.gridy = 4;
		add(lblPeopleLike, gbc_lblPeopleLike);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		JLabel lblPhoto = new JLabel("photo");
		scrollPane.setViewportView(lblPhoto);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 2;
		gbc_horizontalStrut_1.gridy = 5;
		add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 6;
		add(verticalStrut, gbc_verticalStrut);

		tglbtnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPhotoname.setEditable(tglbtnEdit.isSelected());
			}
		});
	}

	public JButton getBtnBack() {
		return btnBack;
	}
}
