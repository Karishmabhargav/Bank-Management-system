
package bank.management.syatem;

import java.awt.*;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.sql.*;
import javax.swing.*;

public class fastcash extends JFrame implements ActionListener {
     JButton one,two,five,ten,one2,five2,ten2,exit;
    String pin;
    private String withdraw;
   fastcash(String pin)
    {
        this.pin=pin;
        setLayout(null);
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,1000,1000);
        add(label);
        
        JLabel text=new JLabel("Select Withdrawal Amount:");
        text.setBounds(230,330,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(text);
        
        one=new JButton("100");
        one.setBounds(190,435,150,30);
        one.addActionListener(this);
        label.add(one);
        two=new JButton("200");
        two.setBounds(375,435,150,30);
        two.addActionListener(this);
        label.add(two);
        five=new JButton("500");
        five.setBounds(190,475,150,30);
         five.addActionListener(this);
        label.add(five);
        ten=new JButton("1000");
        ten.setBounds(375,475,150,30);
        ten.addActionListener(this);
        label.add(ten);
        one2=new JButton("2000");
        one2.setBounds(190,515,150,30);
        one2.addActionListener(this);
        label.add(one2);
        
        five2=new JButton("5000");
        five2.setBounds(375,515,150,30);
        five2.addActionListener(this);
        label.add(five2);
        
        ten2=new JButton("10000");
        ten2.setBounds(190,550,150,30);
        ten2.addActionListener(this);
        label.add(ten2);
        
        exit=new JButton("BACK");
        exit.setBounds(375,550,150,30);
        exit.addActionListener(this);
        label.add(exit);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(1000,1000);
        setVisible(true);
        setLocation(350,200);
        
    }
     public void actionPerformed(ActionEvent a)
     {
         
        if(a.getSource()==exit){
            
                setVisible(false);
                new transtion_1(pin).setVisible(true);
        }else{
            String amount =((JButton)a.getSource()).getText().substring(3);
             connection_t c=new connection_t();
             query=("Select * from bank where pin = '"+pin+"'");
             try{
                ResultSet rs = c.s.executeQuery(query);
                int balance = 0;
                while(rs.next())
                {
                    if(rs.getString ("type").equals("one"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));    
                    }
                    else
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (a.getSource() !=exit && balance <Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query="insert into bank values('"+pin+"','"+date+"','"+withdraw+"','"+amount+"',)"; 
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs"+amount+"Debited Sucessfully");
                setVisible(false);
                new transtion_1(pin).setVisible(true);
                }catch(Exception e)
                    {       
                    System.out.println(e);
                }
        } 
        
     }
   public static void main(String args[])
   {
       new  fastcash("");
   }
    
}

   
