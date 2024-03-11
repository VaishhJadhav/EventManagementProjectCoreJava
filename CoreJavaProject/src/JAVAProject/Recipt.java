package JAVAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Recipt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblbal;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipt frame = new Recipt();
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
	public Recipt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblbal = new JLabel("");
		lblbal.setFont(new Font("Algerian", Font.BOLD, 25));
		lblbal.setBounds(306, 102, 238, 86);
		contentPane.add(lblbal);
		
		JLabel lblNewLabel = new JLabel("The grand total for the event's organization is :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(64, 30, 536, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Payment Options :");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_1.setBounds(64, 261, 245, 52);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Google Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GooglePay g=new GooglePay();
				g.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(64, 337, 204, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Credit/Debit Card");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Debit d=new Debit();
				d.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.setBounds(328, 337, 188, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EMI");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(new Color(240, 240, 240));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_2.setBounds(584, 337, 188, 52);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 729, 427);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_3.setBounds(652, 0, 196, 427);
		contentPane.add(lblNewLabel_3);
	}
}
