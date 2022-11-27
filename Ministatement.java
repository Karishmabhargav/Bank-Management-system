
package bank.management.syatem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class Ministatement extends JFrame  implements ActionListener{
    String pin;
    JButton exit;
    Ministatement(String pin)
    {
        this.pin=pin;
        setTitle("Mini Statement");
        setLayout(null);
        
        JLabel mini=new JLabel();
        add(mini);
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,250,50);
        bank.setFont(new Font("Syatem",Font.BOLD,36));
        add(bank);
        JLabel card=new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        conn c=new conn();
             
                try{
                    ResultSet rs = c.s.executeQuery("Select * from Login where pin = '"+pin+"'");
                    while(rs.next())
                    {
                        card.setText("Card Number: "+rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12));
                    }
                }catch(Exception e)
                    {
                     System.out.println(e);
                     }
                try{
                    ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pin+"'");
                    int bal = 0;
                    while(rs.next())
                    {
                        mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+rs.getString("type")+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+rs.getString("amount"));
                        if(rs.getString("type").equals("Deposit"))
                        {
                            bal+=Integer.parseInt(rs.getString("amount"));
                        }
                        else
                        {
                            bal-=Integer.parseInt(rs.getString("amount"));
                        }
                        balance.setText("Your current account balance is Rs.=" + bal);
                    }  
                } catch(Exception e)
                    {
                     System.out.println(e);
                     }
        exit=new JButton("BACK");
        exit.setBounds(375,550,150,30);
        exit.addActionListener(this);
        add(exit);  
        setBounds(20,140,400,200);
        getContentPane().setBackground(Color.WHITE);
        setSize(1000,1000);
        setVisible(true);
        setLocation(150,200);        
        
    }   
    
     public void actionPerformed(ActionEvent a)
     {
         
        if(a.getSource()==exit){
            
                setVisible(false);
                new transtion_1(pin).setVisible(true);
         
        }
     }    
    public static void main(String args[])
    {
       new Ministatement("");
    }
    
}
