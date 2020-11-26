package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
					Admin frame = new Admin();
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
	public Admin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Admin.class.getResource("/images/logo16.png")));
		setTitle("SocialFace");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(tabbedPane);
		
		JPanel Import = new JPanel();
		tabbedPane.addTab("Import", null, Import, null);
		GridBagLayout gbl_Import = new GridBagLayout();
		gbl_Import.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_Import.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_Import.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_Import.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Import.setLayout(gbl_Import);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		Import.add(verticalStrut, gbc_verticalStrut);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 1;
		Import.add(horizontalStrut, gbc_horizontalStrut);
		
		JLabel lblTable = new JLabel("Table:");
		GridBagConstraints gbc_lblTable = new GridBagConstraints();
		gbc_lblTable.insets = new Insets(0, 0, 5, 5);
		gbc_lblTable.anchor = GridBagConstraints.EAST;
		gbc_lblTable.gridx = 1;
		gbc_lblTable.gridy = 1;
		Import.add(lblTable, gbc_lblTable);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 1;
		Import.add(comboBox, gbc_comboBox);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 4;
		gbc_horizontalStrut_1.gridy = 1;
		Import.add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		JLabel lblInputFile = new JLabel("Input file:");
		GridBagConstraints gbc_lblInputFile = new GridBagConstraints();
		gbc_lblInputFile.anchor = GridBagConstraints.EAST;
		gbc_lblInputFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblInputFile.gridx = 1;
		gbc_lblInputFile.gridy = 2;
		Import.add(lblInputFile, gbc_lblInputFile);
		
		JButton btnNewButton = new JButton("Choose");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		Import.add(btnNewButton, gbc_btnNewButton);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 2;
		Import.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 3;
		Import.add(verticalStrut_2, gbc_verticalStrut_2);
		
		JButton btnImport = new JButton("Import");
		GridBagConstraints gbc_btnImport = new GridBagConstraints();
		gbc_btnImport.insets = new Insets(0, 0, 5, 5);
		gbc_btnImport.gridx = 1;
		gbc_btnImport.gridy = 4;
		Import.add(btnImport, gbc_btnImport);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 5;
		Import.add(verticalStrut_1, gbc_verticalStrut_1);
		
		JPanel Export = new JPanel();
		tabbedPane.addTab("Export", null, Export, null);
		GridBagLayout gbl_Export = new GridBagLayout();
		gbl_Export.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_Export.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_Export.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_Export.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Export.setLayout(gbl_Export);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 1;
		gbc_verticalStrut_3.gridy = 0;
		Export.add(verticalStrut_3, gbc_verticalStrut_3);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 0;
		gbc_horizontalStrut_2.gridy = 1;
		Export.add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		JButton btnChooseDirectory = new JButton("Choose directory");
		GridBagConstraints gbc_btnChooseDirectory = new GridBagConstraints();
		gbc_btnChooseDirectory.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnChooseDirectory.insets = new Insets(0, 0, 5, 5);
		gbc_btnChooseDirectory.gridx = 1;
		gbc_btnChooseDirectory.gridy = 1;
		Export.add(btnChooseDirectory, gbc_btnChooseDirectory);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		Export.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_3.gridx = 3;
		gbc_horizontalStrut_3.gridy = 1;
		Export.add(horizontalStrut_3, gbc_horizontalStrut_3);
		
		JButton btnExportDatabase = new JButton("Export database");
		GridBagConstraints gbc_btnExportDatabase = new GridBagConstraints();
		gbc_btnExportDatabase.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExportDatabase.insets = new Insets(0, 0, 5, 5);
		gbc_btnExportDatabase.gridx = 1;
		gbc_btnExportDatabase.gridy = 3;
		Export.add(btnExportDatabase, gbc_btnExportDatabase);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_4.gridx = 1;
		gbc_verticalStrut_4.gridy = 4;
		Export.add(verticalStrut_4, gbc_verticalStrut_4);
		
		JPanel Delete = new JPanel();
		tabbedPane.addTab("Delete", null, Delete, null);
		GridBagLayout gbl_Delete = new GridBagLayout();
		gbl_Delete.columnWidths = new int[]{0, 0, 0, 0};
		gbl_Delete.rowHeights = new int[]{0, 0, 0, 0};
		gbl_Delete.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_Delete.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		Delete.setLayout(gbl_Delete);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_4 = new GridBagConstraints();
		gbc_horizontalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_4.gridx = 0;
		gbc_horizontalStrut_4.gridy = 1;
		Delete.add(horizontalStrut_4, gbc_horizontalStrut_4);
		
		JButton btnDeleteDatabase = new JButton("DELETE DATABASE");
		
		btnDeleteDatabase.setIcon(new ImageIcon(Admin.class.getResource("/images/warning16.png")));
		GridBagConstraints gbc_btnDeleteDatabase = new GridBagConstraints();
		gbc_btnDeleteDatabase.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeleteDatabase.gridx = 1;
		gbc_btnDeleteDatabase.gridy = 1;
		Delete.add(btnDeleteDatabase, gbc_btnDeleteDatabase);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
		gbc_horizontalStrut_5.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_5.gridx = 2;
		gbc_horizontalStrut_5.gridy = 1;
		Delete.add(horizontalStrut_5, gbc_horizontalStrut_5);
		
		btnDeleteDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(Admin.this, "Are you sure you want to delete the database?");
			}
		});
	}

}
