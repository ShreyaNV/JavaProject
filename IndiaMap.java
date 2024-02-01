

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;



public class IndiaMap extends JFrame implements ActionListener{
     JLayeredPane p;
     JLabel l;
 
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
     Container c ;
     IndiaMap() {
        p = new JLayeredPane();
        c =  getContentPane();
        c.add(p);
       
        ImageIcon ii = new ImageIcon("C:\\Users\\banvar\\Downloads\\IndiaMap.png");
        l = new JLabel();
        l.setBounds(10, 10, 1500, 770); 
        p.add(l);
        
       
        Image img = ii.getImage();
        Image newImg = img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
        ii = new ImageIcon(newImg);
        l.setIcon(ii);

        initializeButtons();

    }

     void initializeButtons() {
    	 
    	 b1= new JButton("1");
         p.setLayer(b1, JLayeredPane.PALETTE_LAYER);
         b1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
         b1.setBounds(640,600,20,20);
         b1.setToolTipText("Andhra Pradesh");
         b1.setBackground(new Color(255, 99, 71));
         p.add(b1);
         
         b2 = new JButton("2");
         p.setLayer(b2, JLayeredPane.PALETTE_LAYER);
         b2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
         b2.setBounds(1150,240,20,20);
         b2.setToolTipText("Arunachal Pradesh");
         b2.setBackground(new Color(50, 205, 50));
         p.add(b2);
         
         b3 = new JButton("3");
         p.setLayer(b3, JLayeredPane.PALETTE_LAYER);
         b3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
         b3.setBounds(1100,300,20,20);
         b3.setToolTipText("Assam");
         b3.setBackground(new Color(0, 128, 128));
         p.add(b3);
    	 
    	 b4 = new JButton("4");
         p.setLayer(b4, JLayeredPane.PALETTE_LAYER);
         b4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
         b4.setBounds(870,320,20,20);
         b4.setToolTipText("Bihar");
         b4.setBackground(new Color(255, 69, 0));
         p.add(b4);
         
         b5 = new JButton("5");
         p.setLayer(b5, JLayeredPane.PALETTE_LAYER);
         b5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
         b5.setBounds(730,440,20,20);
         b5.setToolTipText("Chattisgarh");
         b5.setBackground(new Color(0, 191, 255));
         p.add(b5);
         
         b6 = new JButton("6");
         p.setLayer(b6, JLayeredPane.PALETTE_LAYER);
         b6.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
         b6.setBounds(485,580 ,20,20);
         b6.setToolTipText("Goa");
         b6.setBackground(new Color(128, 128, 0));
         p.add(b6);
    	 
        b7 = new JButton("7");
        p.setLayer(b7, JLayeredPane.PALETTE_LAYER);
        b7.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b7.setBounds(420,380,20,20);
        b7.setToolTipText("Gujarat");
        b7.setBackground(Color.GREEN);
        p.add(b7);
        
        
        b8 = new JButton("8");
        p.setLayer(b8, JLayeredPane.PALETTE_LAYER);
        b8.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b8.setBounds(580,230,20,20);
        b8.setToolTipText("Haryana");
        b8.setBackground(Color.green);
        p.add(b8);
        
        b9 = new JButton("9");
        p.setLayer(b9, JLayeredPane.PALETTE_LAYER);
        b9.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b9.setBounds(610,160,20,20);
        b9.setToolTipText("Himachal Pradesh");
        b9.setBackground(Color.CYAN);
        p.add(b9);
        
        b10 = new JButton("10");
        p.setLayer(b10, JLayeredPane.PALETTE_LAYER);
        b10.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b10.setBounds(840,380,20,20);
        b10.setToolTipText("Jharkand");
        b10.setBackground(new Color(0, 128, 128));
        p.add(b10);       
        
        b11 = new JButton("11");
        p.setLayer(b11, JLayeredPane.PALETTE_LAYER);
        b11.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b11.setBounds(540,600,20,20);
        b11.setToolTipText("Karnataka");
        b11.setBackground(new Color(128, 0, 128));
        p.add(b11);
        
        b12 = new JButton("12");
        p.setLayer(b12, JLayeredPane.PALETTE_LAYER);
        b12.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b12.setBounds(560,700,20,20);
        b12.setToolTipText("Kerala");
        b12.setBackground(new Color(0, 128, 128));
        p.add(b12);
        
        b13 = new JButton("13");
        p.setLayer(b13, JLayeredPane.PALETTE_LAYER);
        b13.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b13.setBounds(620,390,20,20);
        b13.setToolTipText("Madhya Pradesh");
        b13.setBackground(Color.CYAN);
        p.add(b13);
        
        b14 = new JButton("14");
        p.setLayer(b14, JLayeredPane.PALETTE_LAYER);
        b14.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b14.setBounds(520,490,20,20);
        b14.setToolTipText("Maharashtra");
        b14.setBackground(Color.PINK);
        p.add(b14);      
        
        b15 = new JButton("15");
        p.setLayer(b15, JLayeredPane.PALETTE_LAYER);
        b15.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b15.setBounds(1130,340,20,20);
        b15.setToolTipText("Manipur");
        b15.setBackground(new Color(70, 130, 180));
        p.add(b15);
        
        b16 = new JButton("16");
        p.setLayer(b16, JLayeredPane.PALETTE_LAYER);
        b16.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b16.setBounds(1040,320,20,20);
        b16.setToolTipText("megalaya");
        b16.setBackground(new Color(255, 69, 0));
        p.add(b16);
        
        b17 = new JButton("17");
        p.setLayer(b17, JLayeredPane.PALETTE_LAYER);
        b17.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b17.setBounds(1100,370,20,20);
        b17.setToolTipText("Mizoram");
        b17.setBackground(new Color(255, 215, 0));
        p.add(b17);
        
        b18 = new JButton("18");
        p.setLayer(b18, JLayeredPane.PALETTE_LAYER);
        b18.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b18.setBounds(1140,300,20,20);
        b18.setToolTipText("Nagaland");
        b18.setBackground(new Color(255, 69, 0));
        p.add(b18);
        
        b19 = new JButton("19");
        p.setLayer(b19, JLayeredPane.PALETTE_LAYER);
        b19.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b19.setBounds(840,450,20,20);
        b19.setToolTipText("Odisha");
        b19.setBackground(new Color(255, 182, 193));
        p.add(b19);
        
        b20 = new JButton("20");
        p.setLayer(b20, JLayeredPane.PALETTE_LAYER);
        b20.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b20.setBounds(560,180,20,20);
        b20.setToolTipText("Punjab");
        b20.setBackground(new Color(0, 191, 255));
        p.add(b20);
        
        b21 = new JButton("21");
        p.setLayer(b21, JLayeredPane.PALETTE_LAYER);
        b21.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b21.setBounds(500,280,20,20);
        b21.setToolTipText("Rajathan");
        b21.setBackground(Color.YELLOW);
        p.add(b21);
        
        b22= new JButton("22");
        p.setLayer(b22, JLayeredPane.PALETTE_LAYER);
        b22.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b22.setBounds(950,270,20,20);
        b22.setToolTipText("Sikkim");
        b22.setBackground(new Color(128, 128, 0));
        p.add(b22);
        

        b23 = new JButton("23");
        p.setLayer(b23, JLayeredPane.PALETTE_LAYER);
        b23.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b23.setBounds(630,680,20,20);
        b23.setToolTipText("TamilNadu");
        b23.setBackground(new Color(255, 140, 0));
        p.add(b23);
        
        b24 = new JButton("24");
        p.setLayer(b24, JLayeredPane.PALETTE_LAYER);
        b24.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b24.setBounds(660,520,20,20);
        b24.setToolTipText("Telangana");
        b24.setBackground(new Color(139, 69, 19));
        p.add(b24);
        
        b25 = new JButton("25");
        p.setLayer(b25, JLayeredPane.PALETTE_LAYER);
        b25.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b25.setBounds(1060,370,20,20);
        b25.setToolTipText("Tripura");
        b25.setBackground(new Color(46, 139, 87));
        p.add(b25);
        
        
        b26 = new JButton("26");
        p.setLayer(b26, JLayeredPane.PALETTE_LAYER);
        b26.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b26.setBounds(710,290,20,20);
        b26.setToolTipText("Uttar Pradesh");
        b26.setBackground(new Color(50, 205, 50));
        p.add(b26);
        
        b27 = new JButton("27");
        p.setLayer(b27, JLayeredPane.PALETTE_LAYER);
        b27.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b27.setBounds(660,200,20,20);
        b27.setToolTipText("Uttarakand");
        b27.setBackground(new Color(0, 128, 0));
        p.add(b27);
     
        b28 = new JButton("28");
        p.setLayer(b28, JLayeredPane.PALETTE_LAYER);
        b28.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b28.setBounds(930,380,20,20);
        b28.setToolTipText("West Bengal");
        b28.setBackground(Color.GREEN);
        p.add(b28);
        
        b29 = new JButton("29");
        p.setLayer(b29, JLayeredPane.PALETTE_LAYER);
        b29.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b29.setBounds(580,80,20,20);
        b29.setToolTipText("Jammu & Kashmir");
        b29.setBackground(Color.ORANGE);
        p.add(b29);
        
        b30 = new JButton("30");
        p.setLayer(b30, JLayeredPane.PALETTE_LAYER);
        b30.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        b30.setBounds(600,250,20,20);
        b30.setToolTipText("New Delhi");
        b30.setBackground(new Color(205, 92, 92));
        p.add(b30);
        
        b29.addActionListener(this);
        b24.addActionListener(this);
        b23.addActionListener(this);
        b16.addActionListener(this);
        b15.addActionListener(this);
        b14.addActionListener(this);
        b13.addActionListener(this);
        b12.addActionListener(this);
        b11.addActionListener(this);
        b10.addActionListener(this);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
    }

     public void actionPerformed(ActionEvent ae) {
    	    if (ae.getSource() == b29) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Jammu_and_Kashmir");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(40);                  
                     
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Jammu and kashmir Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }
    	    
    	    
    	    if (ae.getSource() == b24) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Telangana");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
                     
                     
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Telangana Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }
  	    
    	    if (ae.getSource() == b23) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Tamil_Nadu");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
                     
                     
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Tamil Nadu Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    } 
    	    
    	    if (ae.getSource() == b16) {
   	    	 try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery("select * from meghalaya");

                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Location");
                    tableModel.addColumn("Short Description");
                    tableModel.addColumn("Duration");
                    tableModel.addColumn("Best Time to Visit");
                    tableModel.addColumn("Activities");
                    tableModel.addColumn("Accommodation");
                    tableModel.addColumn("Local Cuisine");
                    tableModel.addColumn("Travel Tips");
                    tableModel.addColumn("Features");
                    tableModel.addColumn("Min Budget (INR)");
                    tableModel.addColumn("Max Budget (INR)");

                    while (rs.next()) {
                        Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(11), rs.getString(8),rs.getInt(9), rs.getInt(10) };
                        tableModel.addRow(rowData);
                    }

                    JTable table = new JTable(tableModel);
                    table.setRowHeight(30);
                    
                   
                    JScrollPane scrollPane = new JScrollPane(table);

                    JFrame tableFrame = new JFrame("meghalaya Information");
                    tableFrame.add(scrollPane);
                    tableFrame.setSize(1800, 900);
                    tableFrame.setVisible(true);

                    con.close();
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
   	    }   
    	    
    	    if (ae.getSource() == b15) {
   	    	 try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery("select * from manipur");

                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Location");
                    tableModel.addColumn("Short Description");
                    tableModel.addColumn("Duration");
                    tableModel.addColumn("Best Time to Visit");
                    tableModel.addColumn("Activities");
                    tableModel.addColumn("Accommodation");
                    tableModel.addColumn("Local Cuisine");
                    tableModel.addColumn("Travel Tips");
                    tableModel.addColumn("Features");
                    tableModel.addColumn("Min Budget (INR)");
                    tableModel.addColumn("Max Budget (INR)");

                    while (rs.next()) {
                        Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                        tableModel.addRow(rowData);
                    }

                    JTable table = new JTable(tableModel);
                    table.setRowHeight(30);
                    
                   
                    JScrollPane scrollPane = new JScrollPane(table);

                    JFrame tableFrame = new JFrame("manipur Information");
                    tableFrame.add(scrollPane);
                    tableFrame.setSize(1800, 900);
                    tableFrame.setVisible(true);

                    con.close();
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
   	    }   
    	    
    	    if (ae.getSource() == b14) {
   	    	 try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery("select * from maharashtra");

                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Location");
                    tableModel.addColumn("Short Description");
                    tableModel.addColumn("Duration");
                    tableModel.addColumn("Best Time to Visit");
                    tableModel.addColumn("Activities");
                    tableModel.addColumn("Accommodation");
                    tableModel.addColumn("Local Cuisine");
                    tableModel.addColumn("Travel Tips");
                    tableModel.addColumn("Features");
                    tableModel.addColumn("Min Budget (INR)");
                    tableModel.addColumn("Max Budget (INR)");

                    while (rs.next()) {
                        Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                        tableModel.addRow(rowData);
                    }

                    JTable table = new JTable(tableModel);
                    table.setRowHeight(30);
                    
                   
                    JScrollPane scrollPane = new JScrollPane(table);

                    JFrame tableFrame = new JFrame("maharashtra Information");
                    tableFrame.add(scrollPane);
                    tableFrame.setSize(1800, 900);
                    tableFrame.setVisible(true);

                    con.close();
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
   	    }   
    	    
    	    if (ae.getSource() == b13) {
   	    	 try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery("select * from madhya_pradesh");

                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Location");
                    tableModel.addColumn("Short Description");
                    tableModel.addColumn("Duration");
                    tableModel.addColumn("Best Time to Visit");
                    tableModel.addColumn("Activities");
                    tableModel.addColumn("Accommodation");
                    tableModel.addColumn("Local Cuisine");
                    tableModel.addColumn("Travel Tips");
                    tableModel.addColumn("Features");
                    tableModel.addColumn("Min Budget (INR)");
                    tableModel.addColumn("Max Budget (INR)");

                    while (rs.next()) {
                        Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                        tableModel.addRow(rowData);
                    }

                    JTable table = new JTable(tableModel);
                    table.setRowHeight(30);
                    
                   
                    JScrollPane scrollPane = new JScrollPane(table);

                    JFrame tableFrame = new JFrame("madhya pradesh Information");
                    tableFrame.add(scrollPane);
                    tableFrame.setSize(1800, 900);
                    tableFrame.setVisible(true);

                    con.close();
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
   	    }   
    	    
    	    if (ae.getSource() == b12) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery("select * from Kerala");

                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Location");
                    tableModel.addColumn("Short Description");
                    tableModel.addColumn("Days");
                    tableModel.addColumn("Best Time to Visit");
                    tableModel.addColumn("Activities");
                    tableModel.addColumn("Accommodation");
                    tableModel.addColumn("Local Cuisine");
                    tableModel.addColumn("Travel Tips");
                    tableModel.addColumn("Features");
                    tableModel.addColumn("Min Budget (INR)");
                    tableModel.addColumn("Max Budget (INR)");

                    while (rs.next()) {
                        Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                        tableModel.addRow(rowData);
                    }

                    JTable table = new JTable(tableModel);
                    table.setRowHeight(30);
                 
                    JScrollPane scrollPane = new JScrollPane(table);

                    JFrame tableFrame = new JFrame("Kerala Information");
                    tableFrame.add(scrollPane);
                    tableFrame.setSize(1800, 900);
                    tableFrame.setVisible(true);

                    con.close();
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        
    	    
    	    
    	    if (ae.getSource() == b11) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Karnataka");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
                     
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Karnataka Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }
    	    
    	    if (ae.getSource() == b10) {
   	    	 try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery("select * from jharkhand");

                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Location");
                    tableModel.addColumn("Short Description");
                    tableModel.addColumn("Duration");
                    tableModel.addColumn("Best Time to Visit");
                    tableModel.addColumn("Activities");
                    tableModel.addColumn("Accommodation");
                    tableModel.addColumn("Local Cuisine");
                    tableModel.addColumn("Travel Tips");
                    tableModel.addColumn("Features");
                    tableModel.addColumn("Min Budget (INR)");
                    tableModel.addColumn("Max Budget (INR)");

                    while (rs.next()) {
                        Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                        tableModel.addRow(rowData);
                    }

                    JTable table = new JTable(tableModel);
                    table.setRowHeight(30);
                    
                   
                    JScrollPane scrollPane = new JScrollPane(table);

                    JFrame tableFrame = new JFrame("jharkhand Information");
                    tableFrame.add(scrollPane);
                    tableFrame.setSize(1800, 900);
                    tableFrame.setVisible(true);

                    con.close();
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
   	    }  
    	    if (ae.getSource() == b9) {
   	    	 try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery("select * from himachal_pradesh");

                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Location");
                    tableModel.addColumn("Short Description");
                    tableModel.addColumn("Duration");
                    tableModel.addColumn("Best Time to Visit");
                    tableModel.addColumn("Activities");
                    tableModel.addColumn("Accommodation");
                    tableModel.addColumn("Local Cuisine");
                    tableModel.addColumn("Travel Tips");
                    tableModel.addColumn("Features");
                    tableModel.addColumn("Min Budget (INR)");
                    tableModel.addColumn("Max Budget (INR)");

                    while (rs.next()) {
                        Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                        tableModel.addRow(rowData);
                    }

                    JTable table = new JTable(tableModel);
                    table.setRowHeight(30);
                    
                   
                    JScrollPane scrollPane = new JScrollPane(table);

                    JFrame tableFrame = new JFrame("Himachal Pradesh Information");
                    tableFrame.add(scrollPane);
                    tableFrame.setSize(1800, 900);
                    tableFrame.setVisible(true);

                    con.close();
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
   	    }   
	    
    	    if (ae.getSource() == b8) {
   	    	 try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery("select * from haryana");

                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Location");
                    tableModel.addColumn("Short Description");
                    tableModel.addColumn("Duration");
                    tableModel.addColumn("Best Time to Visit");
                    tableModel.addColumn("Activities");
                    tableModel.addColumn("Accommodation");
                    tableModel.addColumn("Local Cuisine");
                    tableModel.addColumn("Travel Tips");
                    tableModel.addColumn("Features");
                    tableModel.addColumn("Min Budget (INR)");
                    tableModel.addColumn("Max Budget (INR)");

                    while (rs.next()) {
                        Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                        tableModel.addRow(rowData);
                    }

                    JTable table = new JTable(tableModel);
                    table.setRowHeight(30);
                    
                   
                    JScrollPane scrollPane = new JScrollPane(table);

                    JFrame tableFrame = new JFrame("haryana Information");
                    tableFrame.add(scrollPane);
                    tableFrame.setSize(1800, 900);
                    tableFrame.setVisible(true);

                    con.close();
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
   	    }   
    	    
    	    if (ae.getSource() == b6) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Goa");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
                  
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Goa Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }
    	    
    	    
    	    if (ae.getSource() == b5) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Chattisgarh");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Duration");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
                     
                    
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Chattisgarh Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }   	    
    	    
    	    if (ae.getSource() == b4) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Bihar");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
                     
                    
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Bihar Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }
    	    
    	    if (ae.getSource() == b3) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Assam");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
                     
                  
                     
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Assam Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }
    	    
    	    if (ae.getSource() == b2) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Arunachal_Pradesh");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
                     
                     
                     
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Arunachal Pradesh Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }
    	    
    	    if (ae.getSource() == b1) {
    	    	 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Bvrit_Varshini_MySQL_8.33");
                     Statement stmt = con.createStatement();

                     ResultSet rs = stmt.executeQuery("select * from Andhra_Pradesh");

                     DefaultTableModel tableModel = new DefaultTableModel();
                     tableModel.addColumn("Location");
                     tableModel.addColumn("Short Description");
                     tableModel.addColumn("Days");
                     tableModel.addColumn("Best Time to Visit");
                     tableModel.addColumn("Activities");
                     tableModel.addColumn("Accommodation");
                     tableModel.addColumn("Local Cuisine");
                     tableModel.addColumn("Travel Tips");
                     tableModel.addColumn("Features");
                     tableModel.addColumn("Min Budget (INR)");
                     tableModel.addColumn("Max Budget (INR)");

                     while (rs.next()) {
                         Object[] rowData = {  rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10), rs.getInt(11) };
                         tableModel.addRow(rowData);
                     }

                     JTable table = new JTable(tableModel);
                     table.setRowHeight(30);
               
                     JScrollPane scrollPane = new JScrollPane(table);

                     JFrame tableFrame = new JFrame("Andhra Pradesh Information");
                     tableFrame.add(scrollPane);
                     tableFrame.setSize(1800, 900);
                     tableFrame.setVisible(true);

                     con.close();
                 } 
                 catch (Exception e) {
                     System.out.println(e);
                 }
    	    }
    	    
    	}

     
     
    public static void main(String[] args) {
    	IndiaMap ip = new IndiaMap();
        ip.setTitle("Places");
        ip.setSize(1800, 900); 
        ip.setVisible(true);
        ip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

