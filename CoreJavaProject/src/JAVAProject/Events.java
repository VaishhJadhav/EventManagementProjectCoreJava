package JAVAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Events extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtwereHereTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Events frame = new Events();
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
	public Events() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtwereHereTo = new JTextField();
		txtwereHereTo.setForeground(new Color(255, 128, 128));
		txtwereHereTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtwereHereTo.setBounds(10, 45, 821, 36);
		txtwereHereTo.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		txtwereHereTo.setText("Select the type of event you're interested in planning to begin your journey with us :");
		contentPane.add(txtwereHereTo);
		txtwereHereTo.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WeddingEvents obj3=new WeddingEvents();
				obj3.setVisible(true);
			}
		});
		btnNewButton.setBounds(72, 110, 149, 92);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\WhatsApp Image 2024-02-21 at 10.36.11 PM (1).jpeg"));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EngagementEvents obj2=new EngagementEvents();
				obj2.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\WhatsApp Image 2024-02-21 at 10.43.32 PM (1).jpeg"));
		btnNewButton_1.setBounds(329, 110, 159, 92);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BirthdayEvents obj2=new BirthdayEvents();
				obj2.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\WhatsApp Image 2024-02-21 at 10.50.31 PM (1).jpeg"));
		btnNewButton_2.setBounds(591, 110, 159, 92);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GraduationEvents obj2=new GraduationEvents();
				obj2.setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\WhatsApp Image 2024-02-21 at 10.59.44 PM (1).jpeg"));
		btnNewButton_3.setBounds(329, 308, 159, 92);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AnniversariesEvents obj4= new AnniversariesEvents();
				obj4.setVisible(true);
				
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\WhatsApp Image 2024-02-21 at 10.56.39 PM (1).jpeg"));
		btnNewButton_4.setBounds(62, 308, 159, 92);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BabyShowerEvents obj6 = new BabyShowerEvents();
				obj6.setVisible(true);
				
				
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\WhatsApp Image 2024-02-21 at 11.04.48 PM (1).jpeg"));
		btnNewButton_5.setBounds(591, 315, 159, 85);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Wedding");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WeddingEvents obj3=new WeddingEvents();
				obj3.setVisible(true);
			}
		});
		btnNewButton_6.setForeground(new Color(255, 128, 128));
		btnNewButton_6.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		btnNewButton_6.setBounds(83, 228, 119, 28);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Engagement");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EngagementEvents obj2=new EngagementEvents();
				obj2.setVisible(true);
				
			}
		});
		btnNewButton_7.setForeground(new Color(255, 128, 128));
		btnNewButton_7.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		btnNewButton_7.setBounds(329, 227, 142, 30);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Birthday Parties");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BirthdayEvents obj2=new BirthdayEvents();
				obj2.setVisible(true);
			}
		});
		btnNewButton_8.setForeground(new Color(255, 128, 128));
		btnNewButton_8.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		btnNewButton_8.setBounds(599, 224, 142, 36);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Anniversaries");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AnniversariesEvents obj4= new AnniversariesEvents();
				obj4.setVisible(true);
				
				
			}
		});
		btnNewButton_9.setForeground(new Color(255, 128, 128));
		btnNewButton_9.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		btnNewButton_9.setBounds(71, 431, 131, 36);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Graduation Parties");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GraduationEvents obj2=new GraduationEvents();
				obj2.setVisible(true);
				
			}
		});
		btnNewButton_10.setForeground(new Color(255, 128, 128));
		btnNewButton_10.setFont(new Font("Myanmar Text", Font.BOLD, 11));
		btnNewButton_10.setBounds(329, 432, 159, 36);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Baby Showers");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BabyShowerEvents obj6 = new BabyShowerEvents();
				obj6.setVisible(true);
				
				
			}
		});
		btnNewButton_11.setForeground(new Color(255, 128, 128));
		btnNewButton_11.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnNewButton_11.setBounds(610, 431, 131, 36);
		contentPane.add(btnNewButton_11);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 128, 128));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\Christmas iPhone Wallpaper_ 50+ Free Xmas Backgrounds to Download!.jpg"));
		lblNewLabel.setBounds(0, 0, 870, 511);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\Christmas iPhone Wallpaper_ 50+ Free Xmas Backgrounds to Download!.jpg"));
		lblNewLabel_1.setBounds(728, 0, 142, 511);
		contentPane.add(lblNewLabel_1);
	}
}
