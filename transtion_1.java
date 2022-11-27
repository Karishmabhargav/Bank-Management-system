package bank.management.syatem;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class transtion_1  extends JFrame implements ActionListener {
   JButton deposit,Withdraw,fastcash,mini,pinchange,balance,exit;
    String pin;
   transtion_1(String pin)
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
        
        deposit=new JButton("Deposit");
        deposit.setBounds(190,435,150,30);
        deposit.addActionListener(this);
        label.add(deposit);
        Withdraw=new JButton("Withdraw");
        Withdraw.setBounds(375,435,150,30);
        Withdraw.addActionListener(this);
        label.add(Withdraw);
        fastcash=new JButton("Fastcash");
        fastcash.setBounds(190,475,150,30);
        fastcash.addActionListener(this);
        label.add(fastcash);
        mini=new JButton("Mini Statement");
        mini.setBounds(375,475,150,30);
        mini.addActionListener(this);
        label.add(mini);
        pinchange=new JButton("Pin Change");
        pinchange.setBounds(190,515,150,30);
        pinchange.addActionListener(this);
        label.add(pinchange);
        
        balance=new JButton("Balance Query");
        balance.setBounds(375,515,150,30);
        balance.addActionListener(this);
        label.add(balance);
        
        exit=new JButton("BACK");
        exit.setBounds(375,550,150,30);
        exit.addActionListener(this);
        label.add(exit);
        getContentPane().setBackground(Color.WHITE);
        setSize(1000,1000);
        setVisible(true);
        setLocation(350,200);
        
    }

    transtion_1(JPasswordField repin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void actionPerformed(ActionEvent a)
     {
         
        if(a.getSource()==exit){
            
                setVisible(false);
                new transtion_1(pin).setVisible(true);
        }
        else if(a.getSource()==deposit){
            
                setVisible(false);
                new Deposit(pin).setVisible(true);
        }
         else if(a.getSource()==Withdraw){
            
                setVisible(false);
                new Withdraw(pin).setVisible(true);
        }
         else if(a.getSource()==fastcash){
            
                setVisible(false);
                new fastcash(pin).setVisible(true);
        }
        else if(a.getSource()==pinchange){
            
                setVisible(false);
                new pinchange(pin).setVisible(true);
        }
        else if(a.getSource()==balance){
            
                setVisible(false);
                new Balance(pin).setVisible(true);
        }
        else if(a.getSource()==mini){
            
                setVisible(false);
                new Ministatement(pin).setVisible(true);
        }
     }    
    static public void main(String args[])
    {
        new transtion_1("");
    }
}
