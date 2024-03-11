package JAVAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class BirthdayEvents extends JFrame {

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
					BirthdayEvents frame = new BirthdayEvents();
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
	public BirthdayEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Birthday Services");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(329, 31, 358, 37);
		contentPane.add(lblNewLabel);
		
		JCheckBox ch1 = new JCheckBox("Venue selection (home, restaurant, event space, etc.)");
		ch1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch1.setBounds(116, 120, 499, 37);
		contentPane.add(ch1);
		
		JCheckBox ch2 = new JCheckBox("Theme selection and decorations");
		ch2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch2.setBounds(116, 172, 499, 37);
		contentPane.add(ch2);
		
		JCheckBox ch3 = new JCheckBox("Cake and desserts");
		ch3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch3.setBounds(116, 225, 499, 37);
		contentPane.add(ch3);
		
		JCheckBox ch4 = new JCheckBox("Catering or food preparation");
		ch4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch4.setBounds(116, 288, 499, 37);
		contentPane.add(ch4);
		
		JCheckBox ch5 = new JCheckBox("Entertainment (games, activities, performers)");
		ch5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch5.setBounds(116, 340, 500, 37);
		contentPane.add(ch5);
		
		JCheckBox ch6 = new JCheckBox("Photography or videography ");
		ch6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch6.setBounds(116, 391, 492, 37);
		contentPane.add(ch6);
		
		JLabel lblNewLabel_1 = new JLabel(" Select the event you want to organize, and we'll help bring your vision to life.");
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(74, 76, 826, 37);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Hi");
				JDBCConnector obj = new JDBCConnector();
				//String s = obj.readData(1);
				//System.out.println("S : "+s);
				//String res[] = obj.readData(1);
				
				ResultSet res = obj.readData(1,"birthdayservices");
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
						//System.out.println("player number "+res.getInt(1)+"\tplayer name "+res.getString(2)+"\tplayer rank "+res.getInt(3));
						
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				
				/*
				for(int i = 0; i < res.length; i++)
				{
					System.out.println(res[i]);
				}
				*/
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
		btnNewButton.setBounds(759, 386, 147, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 637, 482);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_3.setBounds(631, 0, 358, 482);
		contentPane.add(lblNewLabel_3);
	}
}
