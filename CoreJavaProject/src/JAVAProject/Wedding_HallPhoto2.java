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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Wedding_HallPhoto2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wedding_HallPhoto2 frame = new Wedding_HallPhoto2();
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
	public Wedding_HallPhoto2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\Revelry Event Designers (1).jpg"));
		lblNewLabel.setBounds(117, 70, 257, 326);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\Wedding in the Corinthia Hotel (1).jpg"));
		lblNewLabel_1.setBounds(399, 74, 250, 319);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Wedding_HallPhoto obj2=new Wedding_HallPhoto();
				obj2.setVisible(true);
						
			}
		});
		btnNewButton.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		btnNewButton.setBounds(10, 298, 96, 28);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Orchid Hall");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 17));
		chckbxNewCheckBox.setBounds(164, 403, 150, 31);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dutch Palace");
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		chckbxNewCheckBox_1.setBounds(426, 409, 142, 25);
		contentPane.add(chckbxNewCheckBox_1);
	}

}
