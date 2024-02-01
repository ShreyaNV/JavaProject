
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CoverPage extends JFrame implements ActionListener{
	JLabel bg;
	JButton b1,b2;
	public CoverPage() {
		Container c = getContentPane();
		ImageIcon bg=new ImageIcon("C:\\Users\\banvar\\Downloads\\WhatsApp Image 2023-09-10 at 11.13.00 PM.jpeg");
	    Image img=bg.getImage();
	    Image temp=img.getScaledInstance(1600,900,Image.SCALE_SMOOTH);
	    bg=new ImageIcon(temp);
	    JLabel back=new JLabel(bg);
	    back.setLayout(null);
	    //back.setBounds(0,0,500,600);
	    
	    b1 = new JButton("LogIn");
		b2 = new JButton("SignUp");
		
		b1.setBounds(120, 580, 100, 50);
		b2.setBounds(280, 580, 100, 50);
		
		//b1.setBackground(Color.WHITE);
		//b2.setBackground(Color.WHITE); 
		
		c.add(b1);
		c.add(b2);
		
		c.add(back);
		b1.addActionListener(this);
		b2.addActionListener(this);
	    
	}
	public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str == "LogIn") {
        	LoginPage l = new LoginPage();
            l.setTitle("Login Page");
            l.setSize(1800, 900);
            l.setVisible(true);
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
        if(str == "SignUp") {
        	SignUpPage s = new SignUpPage();
    		s.setTitle("Sign Up Page");
    		s.setSize(1800,900);
    		s.setVisible(true);
    		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }
	
	public static void main(String args[]) {
        CoverPage l = new CoverPage();
        l.setTitle("Travel Diaries");
        l.setSize(1800, 900);
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
