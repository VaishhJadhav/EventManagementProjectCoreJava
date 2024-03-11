package JAVAProject;

import java.awt.BorderLayout;
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
import java.sql.ResultSet;
import javax.swing.JPasswordField;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel loginpage;
	private JTextField textField;
	private JPasswordField pass1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 526);
		loginpage = new JPanel();
		loginpage.setBackground(new Color(192, 192, 192));
		loginpage.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(loginpage);
		loginpage.setLayout(null);
		
		JLabel lbllogin = new JLabel("Login ");
		lbllogin.setForeground(new Color(255, 255, 255));
		lbllogin.setFont(new Font("Rockwell", Font.BOLD, 34));
		lbllogin.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogin.setBounds(301, 35, 309, 65);
		loginpage.add(lbllogin);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setForeground(new Color(255, 255, 255));
		lblusername.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblusername.setHorizontalAlignment(SwingConstants.CENTER);
		lblusername.setBounds(569, 146, 158, 38);
		loginpage.add(lblusername);
		
		textField = new JTextField();
		textField.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		textField.setBounds(464, 206, 364, 42);
		loginpage.add(textField);
		textField.setColumns(10);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setForeground(new Color(255, 255, 255));
		lblpassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblpassword.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblpassword.setBounds(574, 259, 138, 38);
		loginpage.add(lblpassword);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setBackground(new Color(255, 255, 255));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname = textField.getText();
				String pass = pass1.getText();
			
				
				JDBCConnector obj2 = new  JDBCConnector();
				
				ResultSet rs = obj2.readSingleData(uname);
				
				String dname = null,dpass = null;
				try
				{
					while(rs.next())
					{
						
						dname = rs.getString(3);
						dpass = rs.getString(5);
						
					}
				}
				
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				System.out.println("name : "+uname);
				System.out.println("pass : "+pass);
			
				System.out.println("dname : "+dname);
				System.out.println("dpass : "+dpass);
				
				
				if((uname.equals(dname)) && (pass.equals(dpass)) )
				{
				
					JOptionPane.showMessageDialog(btnlogin, "Login Successful");
					
					Events obj3=new Events();
					obj3.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(btnlogin, "Login UnSuccessfully!!! plz enter valid details!!!");
				}
				
			}
		});
		
	
				
			
		
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnlogin.setBounds(460, 379, 158, 46);
		loginpage.add(btnlogin);
		
		JButton btnregistration = new JButton("Signup");
		btnregistration.setBackground(new Color(255, 255, 255));
		btnregistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignupPage obj2=new SignupPage();
				obj2.setVisible(true);
				dispose();
				
				}
		});
		btnregistration.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnregistration.setBounds(657, 379, 171, 46);
		loginpage.add(btnregistration);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome To");
		lblNewLabel_3.setForeground(new Color(222, 18, 125));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Algerian", Font.BOLD, 35));
		lblNewLabel_3.setBounds(48, 146, 261, 86);
		loginpage.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("EVENTSYNC");
		lblNewLabel_4.setForeground(new Color(222, 18, 125));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Algerian", Font.BOLD, 35));
		lblNewLabel_4.setBounds(64, 230, 247, 86);
		loginpage.add(lblNewLabel_4);
		
		pass1 = new JPasswordField();
		pass1.setBounds(464, 307, 364, 42);
		loginpage.add(pass1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Shree\\Downloads\\WhatsApp Image 2024-02-26 at 2.31.04 PM.jpeg"));
		lblNewLabel.setBounds(0, 0, 961, 478);
		loginpage.add(lblNewLabel);
	}
}
