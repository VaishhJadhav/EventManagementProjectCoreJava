package JAVAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class FirstPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEventsync;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage obj=new LoginPage();
				obj.setVisible(true);
				dispose();
			}
		});
		
		
		btnNewButton.setFont(new Font("Myanmar Text", Font.BOLD, 25));
		btnNewButton.setBounds(364, 332, 33, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Get Started");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Imprint MT Shadow", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(202, 324, 160, 41);
		contentPane.add(lblNewLabel_2);
		
		txtEventsync = new JTextField();
		txtEventsync.setEditable(false);
		txtEventsync.setFont(new Font("Algerian", Font.BOLD, 30));
		txtEventsync.setHorizontalAlignment(SwingConstants.CENTER);
		txtEventsync.setText("EVENTSYNC");
		txtEventsync.setBounds(218, 48, 257, 58);
		contentPane.add(txtEventsync);
		txtEventsync.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\"Step into the world of EventSync, where we turn your visions into unforgettable experiences.\"");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 131, 680, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\WhatsApp Image 2024-02-21 at 11.24.16 PM (1).jpeg"));
		lblNewLabel_1.setBounds(0, 0, 700, 433);
		contentPane.add(lblNewLabel_1);
	}
}
