package JAVAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Wedding_HallPhoto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wedding_HallPhoto frame = new Wedding_HallPhoto();
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
	public Wedding_HallPhoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\Classic Romance In The Crystal Ballroom (1).jpg"));
		lblNewLabel.setBounds(42, 59, 267, 360);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\The Springs Home (1).jpg"));
		lblNewLabel_1.setBounds(341, 59, 267, 360);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Next Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Wedding_HallPhoto2 obj=new Wedding_HallPhoto2();
				obj.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		btnNewButton.setBounds(635, 379, 126, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("VENUE PHOTOS");
		lblNewLabel_2.setFont(new Font("Myanmar Text", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(212, 11, 223, 37);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Trident Hall");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(96, 432, 134, 30);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tanishka Hall");
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		chckbxNewCheckBox_1.setBounds(390, 432, 158, 30);
		contentPane.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton_1 = new JButton("Done");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(645, 422, 116, 30);
		contentPane.add(btnNewButton_1);
	}
}
