import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SignUpPage extends JFrame implements ActionListener{
	JTextField t1;
	JButton b1,b2;
	JPasswordField p1,p2;
	JLabel l1,l2,l3;
	SignUpPage(){
		Container c = getContentPane();
		ImageIcon background=new ImageIcon("C:\\Users\\banvar\\Downloads\\WhatsApp Image 2023-09-10 at 11.13.41 PM.jpeg");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(1800,900,Image.SCALE_SMOOTH);
        background=new ImageIcon(temp);
        JLabel back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,1800,900);
		
		t1 = new JTextField();
		t1.setEditable(true);
		p1 = new JPasswordField();
		p1.setEditable(true);
		p2 = new JPasswordField();
		p2.setEditable(true);
		
		b2 = new JButton("←");
		b1 = new JButton("Sign Up");
		l1 = new JLabel("Email ID : ");
		l2 = new JLabel("Password : ");
		l3 = new JLabel("Confirm Password : ");
		p1.setEchoChar('*');
		p2.setEchoChar('*');
		
		b1.setBounds(350,300,100,50);
		b2.setBounds(30, 590, 55, 35);
		
		l1.setBounds(100, 150, 100, 50);
        t1.setBounds(250, 160, 200, 35);
        l2.setBounds(100, 200, 100, 50);
        p1.setBounds(250, 210, 200, 35);
        l3.setBounds(100, 250, 120, 50);
		p2.setBounds(250, 260, 200, 35);
		
		 l1.setForeground(Color.WHITE);
	     l2.setForeground(Color.WHITE);
	     l3.setForeground(Color.WHITE);
		
		back.add(b1);
		back.add(t1);
		back.add(p1);
		back.add(l1);
		back.add(l2);
		back.add(l3);
		back.add(p2);
		back.add(b2);
		
		c.add(back);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		p1.addActionListener(this);
		p2.addActionListener(this);
		
		Font buttonFont = b2.getFont();
        b2.setFont(new Font(buttonFont.getName(), Font.PLAIN, 20));
        
	}
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str == "←") {
        	CoverPage l = new CoverPage();
        	l.setTitle("Travel Diaries");
            l.setSize(1800, 900);
            l.setVisible(true);
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if(str == "Sign Up") {
     		IndiaMap s = new IndiaMap();
     		s.setTitle("Indian Places");
     		s.setBounds(0,0,1800,900);
     		s.setVisible(true);
     		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignUpPage s = new SignUpPage();
		s.setTitle("Sign Up Page");
		s.setSize(1800,900);
		s.setVisible(true);
		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}