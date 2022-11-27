
package bank.management.syatem;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class Withdraw extends JFrame implements ActionListener{
    JButton Withdraw,Back;
    JTextField amount;
    String pin;
    
    Withdraw(String pin)
    {
          this.pin=pin;
          setLayout(null);
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,1000,1000);
        add(label);
        JLabel text=new JLabel("Enter you Want Witdraw Amount:");
        text.setBounds(230,330,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(text);
        
        amount=new JTextField();
        amount.setBounds(200,380,300,20);
        amount.setForeground(Color.BLACK);
        amount.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(amount);
        Withdraw=new JButton("Withdraw");
        Withdraw.setBounds(380,500,150,30);
        Withdraw.addActionListener(this);
        label.add(Withdraw);
        Back=new JButton("Back");
        Back.setBounds(380,550,150,30);
        Back.addActionListener(this);
        label.add(Back);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(1000,1000);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent a)
     { 
         if(a.getSource()==Withdraw){
             String number=amount.getText();
             Date date=new Date();
             if(number.equals(""))
             {
                 JOptionPane.showMessageDialog(null,"please enter the amount you want to Deposit");
             }else 
             {   
                try{
                conn c=new conn();
                String query="insert into signupthree value{'"+pin+"','"+date+"','"+Withdraw+"','"+number+"'}";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs"+number +"Withdraw Successfully");
                setVisible(false);
                new  transtion_1(pin).setVisible(true);
                }catch(Exception e)
                    {
                    System.out.println(e);
                }
              }        
            
        }
        else if(a.getSource()==Back){
           setVisible(false);
           new transtion_1(pin).setVisible(true);
        }
     }
    public static void main(String args[])
    {
        new Withdraw("");
    }

 
}
