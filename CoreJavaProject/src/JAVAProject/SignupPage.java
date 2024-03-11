package JAVAProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class SignupPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textname;
	private JTextField textemailid;
	private JTextField textusername;
	private JLabel lblpassword;
	private JTextField textpassword;
	private JButton btnsignup;
	private JLabel lblNewLabel_1;
	private JTextField textmobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupPage frame = new SignupPage();
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
	public SignupPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 478);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Signup Page");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(274, 30, 242, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblname = new JLabel("Full Name");
		lblname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblname.setBounds(114, 97, 119, 37);
		contentPane.add(lblname);
		
		textname = new JTextField();
		textname.setBounds(310, 95, 459, 38);
		contentPane.add(textname);
		textname.setColumns(10);
		
		JLabel lblemailid = new JLabel("Email Id");
		lblemailid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblemailid.setBounds(114, 147, 131, 37);
		contentPane.add(lblemailid);
		
		textemailid = new JTextField();
		textemailid.setBounds(310, 144, 459, 40);
		contentPane.add(textemailid);
		textemailid.setColumns(10);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblusername.setBounds(114, 195, 131, 37);
		contentPane.add(lblusername);
		
		textusername = new JTextField();
		textusername.setBounds(310, 195, 459, 40);
		contentPane.add(textusername);
		textusername.setColumns(10);
		
		lblpassword = new JLabel("Password");
		lblpassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblpassword.setBounds(114, 315, 119, 37);
		contentPane.add(lblpassword);
		
		textpassword = new JTextField();
		textpassword.setBounds(310, 312, 459, 40);
		contentPane.add(textpassword);
		textpassword.setColumns(10);
		
		btnsignup = new JButton("Signup");
		btnsignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//	
//				String name= textname.getText();
//				String emailid= textemailid.getText();
//				String username= textusername.getText();
//				String password= textpassword.getText();
//				int mobile = Integer.parseInt(textmobile.getText());
				
				JDBCConnector jd= new JDBCConnector();
				//jd.connectDB();
				//jd.createDB();
				//jd.createTable();
				//jd.insertData(name,emailid,username,password,mobile);
				
				
				
				
				
				String name = textname.getText();
				//String prn = txtPRN.getText();
				String email = textemailid.getText();
				String userName = textusername.getText();
				String password = textpassword.getText();
				//int mobile = Integer.parseInt(textmobile.getText());
				String mobile = textmobile.getText();
				
				System.out.println("Name: "+name);
				//System.out.println("PRN No. : "+prn);
				System.out.println("Email Id: "+email);
				System.out.println("User Name: "+userName);
				System.out.println("Password: "+password);
				System.out.println("Mobile: "+mobile);
				
				if(mobile.length() != 10) 
	            {
	            	JOptionPane.showMessageDialog(lblNewLabel_1,"please enter 10 digit mobile number.");
	            }
	         
	            if(email.contains("@gmail.com") == false) 
	            {
	            	JOptionPane.showMessageDialog(lblemailid,"please enter valid email id");
	            }
	            
			    int flag = 1;
				
				int a=0 , b=0 , c=0 , d=0 , e1=0;
				
				if(password.length() >= 6)
				{
					for(int i = 0 ; i < password.length() ; i++)
					{
						if(password.charAt(i) >= 'A' && password.charAt(i)<='Z')
						{
							a++;
						}
						else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
						{
							b++;
						}
						else if(password.charAt(i) >= 48 && password.charAt(i) <= 57)
						{
							c++;
						}
						else if(password.charAt(i) >= 33 && password.charAt(i) <= 47 || password.charAt(i)>=58 && password.charAt(i)<=64)
						{
							d++;
						}
						
						if(a >= 1 && b >= 1 && c >= 1 && d >= 1)
						{
							flag = 0;
							break;
						}
							
					}
					
				}
				else
				{
					e1 = 1;
					flag = 1;
					JOptionPane.showMessageDialog(lblpassword, "Plese enter Strong Password");
				}
				
				if(flag ==0)
				{
					//JDBCConnector obj2 = new JDBCConnector();
					//obj2.createDB();
					//obj2.createRegTable();
					int res = jd.insertData(name,email,userName,password,mobile);
					
					if(res == 1)
					{
						JOptionPane.showMessageDialog(btnsignup, " Registration Successfull..");
						LoginPage obj = new LoginPage();
						obj.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(btnsignup, " Registration UnSuccessfull..123");
					}
			
					
					
					
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(lblpassword, "Plese enter Strong Password");
					SignupPage obj3 = new SignupPage();
					obj3.setVisible(true);
					dispose();
					
				}
				
				
			}
				
				
				
				
				
				
				

//				
//				if(name.isEmpty() || emailid.isEmpty() || username.isEmpty() || password.isEmpty()   )
//				{
//					JOptionPane.showMessageDialog(btnsignup, "Fill all the details");
//					
//					if(mobile ==10 )
//						{
//						System.out.println("mobile "+mobile);
//							//textmobile.set(mobile);
//						}
//						else
//						{
//							JOptionPane.showMessageDialog(textmobile, "enter 10 digit number");
//						}
//
//		            
////		           
//		            if(emailid.contains("@gmail.com") == false) 
//		            {
//		            	JOptionPane.showMessageDialog(textemailid,"please enter @gmail.com");
//		            }
//		            int flag = 1;
//		    		int a = 0, b = 0, c = 0, d = 0;
//		    		
//		    		if(password.length() >= 6)
//		    		{
//		    			for(int i = 0; i < password.length(); i++)
//		    			{
//		    				if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
//		    				{
//		    					a++;
//		    				}
//		    				 if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
//		    				{
//		    					b++;
//		    				}
//		    				if(password.charAt(i) >= 48 && password.charAt(i) <= 57)
//		    				{
//		    					c++;
//		    				}
//		    				if((password.charAt(i) >= 33 && password.charAt(i) <= 47) || (password.charAt(i) >= 58 && password.charAt(i) <= 64))
//		    				{
//		    					d++;
//		    				}
//		    			}
//		    		}
//		    		else
//		    		{
//		    			JOptionPane.showMessageDialog(textemailid,"please enter Strong password");
//		    		}
//				}
//				else
//				{
//					
//						
////						
//					
//				}
////					
////				
//				
//		
//				
//					System.out.println("name "+name);
//					System.out.println("emailid "+emailid);
//					System.out.println("username "+username);
//					System.out.println("password "+password);
//					System.out.println("mobile "+mobile);
//				
//			
			
			
				
//				LoginPage lp =new LoginPage();
//				lp.setVisible(true);
//			    dispose();
				
				
				
				
//				 if(aadhar.length() > 12 || aadhar.length() < 12) 
//			            {
//			            	JOptionPane.showMessageDialog(add,"please enter 12 digit");
//			            }
				
				
//				if(mobile ==10 )
//					{
//						textmobile.set(mobile);
//					}
//					else
//					{
//						JOptionPane.showMessageDialog(textmobile, "enter 10 digit number");
//					}
//					
			         
			
		
		});
		btnsignup.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnsignup.setBounds(310, 382, 188, 48);
		contentPane.add(btnsignup);
		
		lblNewLabel_1 = new JLabel("Mobile No");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(114, 258, 131, 37);
		contentPane.add(lblNewLabel_1);
		
		textmobile = new JTextField();
		textmobile.setBounds(310, 255, 459, 40);
		contentPane.add(textmobile);
		textmobile.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 842, 441);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\img (1).jpg"));
		lblNewLabel_3.setBounds(665, 0, 177, 441);
		contentPane.add(lblNewLabel_3);
	}
}
