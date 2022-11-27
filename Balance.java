
package bank.management.syatem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Balance extends JFrame implements ActionListener{
    JButton Back;
    JLabel text;
    String pin;
    Balance(String pin)
    {
        this.pin=pin;
        setLayout(null);
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,1000,1000);
        add(label);
        Back=new JButton("Back");
        Back.setBounds(380,550,150,30);
        Back.addActionListener(this);
        label.add(Back);
            conn c=new conn();
             int balance = 0;
                try{
                    ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+balance+"'");
                   
                     while(rs.next())
                        {
                            if(rs.getString ("type").equals("Deposit"))
                            {
                                balance += Integer.parseInt(rs.getString("balance"));    
                            }
                            else
                            {
                                balance -= Integer.parseInt(rs.getString("balance"));
                             }
                        }
                }catch(Exception e)
                    {
                     System.out.println(e);
                     }
        text=new JLabel("Your Current Balance is:"+balance);
        text.setBounds(230,330,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(text);
                
        getContentPane().setBackground(Color.WHITE);
        setSize(1000,1000);
        setVisible(true);
        setUndecorated(true);
        setLocation(350,200);

    }

    public void actionPerformed(ActionEvent a)
     {
            setVisible(false);
            new transtion_1(pin).setVisible(true);
     }
    public static void main(String args[]) 
    {
        new Balance("");
    }
    
}
