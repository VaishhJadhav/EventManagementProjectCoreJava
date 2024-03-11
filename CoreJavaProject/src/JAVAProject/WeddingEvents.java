package JAVAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class WeddingEvents extends JFrame {

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
					WeddingEvents frame = new WeddingEvents();
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
	public WeddingEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox ch1 = new JCheckBox("Venue selection and booking");
		ch1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch1.setBounds(133, 162, 514, 34);
		contentPane.add(ch1);
		
		JCheckBox ch2 = new JCheckBox("Decorations (flowers, centerpieces, lighting, etc.)");
		ch2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch2.setBounds(133, 223, 514, 34);
		contentPane.add(ch2);
		
		JCheckBox ch3 = new JCheckBox("Catering (menu selection, food tasting)");
		ch3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch3.setBounds(133, 272, 514, 41);
		contentPane.add(ch3);
		
		JCheckBox ch4 = new JCheckBox("Photography and videography services");
		ch4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch4.setBounds(133, 328, 514, 41);
		contentPane.add(ch4);
		
		JCheckBox ch5 = new JCheckBox("Transportation arrangements");
		ch5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch5.setBounds(133, 383, 515, 34);
		contentPane.add(ch5);
		
		JCheckBox ch6 = new JCheckBox("Music and entertainment (DJ, live band, etc.)");
		ch6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ch6.setBounds(133, 434, 514, 34);
		contentPane.add(ch6);
		
		JLabel lblNewLabel = new JLabel("wedding services");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 25));
		lblNewLabel.setBounds(273, 29, 304, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel(" Select the event you want to organize, and we'll help bring your vision to life.");
		lblNewLabel_2.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblNewLabel_2.setBounds(68, 77, 784, 63);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Hi");
				JDBCConnector obj = new JDBCConnector();
				//String s = obj.readData(1);
				//System.out.println("S : "+s);
				//String res[] = obj.readData(1);
				
				ResultSet res = obj.readData(1,"weddingservices");
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
		btnNewButton.setBounds(704, 393, 163, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_1.setBounds(0, 0, 634, 475);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_3.setBounds(616, 0, 304, 475);
		contentPane.add(lblNewLabel_3);
	}
}
