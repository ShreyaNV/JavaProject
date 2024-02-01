
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
    Container c = getContentPane();
    JTextField name;
    JPasswordField pwd;
    JLabel l1, l2, background; 
    JButton b1,b2;

    public LoginPage() {
    	ImageIcon background=new ImageIcon("C:\\Users\\banvar\\Downloads\\WhatsApp Image 2023-09-10 at 11.13.41 PM.jpeg");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(1800,900,Image.SCALE_SMOOTH);
        background=new ImageIcon(temp);
        JLabel back=new JLabel(background);
        back.setLayout(null);
        //back.setBounds(0,0,500,600);

        name = new JTextField(40);
        pwd = new JPasswordField(20);
        pwd.setEchoChar('*');
        l1 = new JLabel("     Mail-id : ");
        l2 = new JLabel("password : ");
        b1 = new JButton("Login");
        b2 = new JButton("←");

        b1.setBounds(300, 250, 100, 50);
        b2.setBounds(30, 590, 55, 35);
        
        l1.setBounds(100, 150, 100, 50);
        name.setBounds(200, 160, 200, 35);
        l2.setBounds(100, 200, 100, 50);
        pwd.setBounds(200, 210, 200, 35);
        
        l1.setForeground(Color.WHITE); 
        l2.setForeground(Color.WHITE);

        back.add(l1); 
        back.add(name);
        back.add(l2);
        back.add(pwd);
        back.add(b1);
        back.add(b2);

        c.add(back);

        name.addActionListener(this);
        pwd.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
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
        if(str == "Login") {
         		IndiaMap s = new IndiaMap();
         		s.setTitle("Indian Places");
         		s.setBounds(0,0,1800,900);
         		s.setVisible(true);
         		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }

    public static void main(String args[]) {
        LoginPage l = new LoginPage();
        l.setTitle("Login Page");
        l.setSize(1800, 900);
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
