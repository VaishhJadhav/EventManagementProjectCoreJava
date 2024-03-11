package JAVAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class EngagementEvents extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	static int balance = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EngagementEvents frame = new EngagementEvents();
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
	public EngagementEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Engagement Services");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 25));
		lblNewLabel.setBounds(323, 34, 331, 42);
		contentPane.add(lblNewLabel);
		
		JCheckBox ch1 = new JCheckBox("Venue selection");
		ch1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch1.setForeground(new Color(0, 0, 0));
		ch1.setBounds(93, 134, 553, 42);
		contentPane.add(ch1);
		
		JCheckBox ch2 = new JCheckBox("Decorations ");
		ch2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch2.setBounds(93, 191, 553, 42);
		contentPane.add(ch2);
		
		JCheckBox ch3 = new JCheckBox("Catering or dining arrangements");
		ch3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch3.setBounds(93, 249, 557, 42);
		contentPane.add(ch3);
		
		JCheckBox ch4 = new JCheckBox("Cake or dessert selection");
		ch4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch4.setBounds(93, 306, 557, 42);
		contentPane.add(ch4);
		
		JCheckBox ch5 = new JCheckBox("Entertainment or special activities (speeches, slideshow, etc.)");
		ch5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch5.setBounds(93, 359, 557, 42);
		contentPane.add(ch5);
		
		JCheckBox ch6 = new JCheckBox("Photography or videography ");
		ch6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch6.setBounds(93, 414, 557, 42);
		contentPane.add(ch6);
		
		JLabel lblNewLabel_1 = new JLabel(" Select the event you want to organize, and we'll help bring your vision to life.");
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblNewLabel_1.setBounds(83, 87, 768, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Hi");
				JDBCConnector obj = new JDBCConnector();
				
				
				ResultSet res = obj.readData(1,"engagementsevices");
				System.out.println(res);
				
				System.out.println("ajay");
				
				String s1=null,s2=null,s3=null,s4=null,s5=null,s6=null;
				
				
				try
				{
					System.out.println("aap");
					while(res.next())
					{
						System.out.println("rushi");
						s1=res.getString(2);
						s2=res.getString(3);
						s3=res.getString(4);
						s4=res.getString(5);
						s5=res.getString(6);
						s6=res.getString(7);
												
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				
				
				System.out.println("******");
			
				
				if(ch1.isSelected())
				{
					int v = Integer.parseInt(s1);
					
					balance = balance + v;
					System.out.println(balance);
				}
				
				if(ch2.isSelected())
				{
					int v = Integer.parseInt(s2);
					
					balance = balance + v;
					System.out.println(balance);
				}
				
				if(ch3.isSelected())
				{
					int v = Integer.parseInt(s3);
					
					balance = balance + v;
					System.out.println(balance);
				}
				
				if(ch4.isSelected())
				{
					int v = Integer.parseInt(s4);
					
					balance = balance + v;
					System.out.println(balance);
				}
				
				if(ch5.isSelected())
				{
					int v = Integer.parseInt(s5);
					
					balance = balance + v;
					System.out.println(balance);
				}
				
				if(ch6.isSelected())
				{
					int v = Integer.parseInt(s6);
					
					balance = balance + v;
					System.out.println(balance);
				}
				
				System.out.println("balance "+balance);
				Recipt rc=new  Recipt();
				rc.setVisible(true);
				dispose();
				String vaish=balance+"";
				rc.lblbal.setText(vaish);
				
				
			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(724, 401, 145, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 654, 472);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_3.setBounds(644, 0, 275, 472);
		contentPane.add(lblNewLabel_3);
	}
}
