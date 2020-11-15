package gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class viewUpdates extends JPanel {

	/**
	 * Create the panel.
	 */
	public viewUpdates() {
		
		JLabel lblViewLatestUpdates = new JLabel("View latest updates");
		lblViewLatestUpdates.setFont(new Font("Tahoma", Font.BOLD, 42));
		
		JLabel lblCategory = new JLabel("Category:");
		
		JComboBox categoryCombo = new JComboBox();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblItems = new JLabel("Items:");
		
		JSpinner itemsSpinner = new JSpinner();
		itemsSpinner.setModel(new SpinnerNumberModel(new Integer(10), new Integer(1), null, new Integer(1)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblViewLatestUpdates)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCategory)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(categoryCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(127)
							.addComponent(lblItems)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(itemsSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
					.addGap(20))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblViewLatestUpdates)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategory)
						.addComponent(categoryCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblItems)
						.addComponent(itemsSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
					.addGap(16))
		);
		
		JList updatesList = new JList();
		scrollPane.setViewportView(updatesList);
		setLayout(groupLayout);

	}
}
