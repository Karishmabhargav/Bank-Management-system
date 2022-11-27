
package bank.management.syatem;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class signupThree extends JFrame implements ActionListener {
    JLabel accountdetails,type,card,number,pin,pnumber,carddetails,pindetails,service;
    JRadioButton r1,r2,r3;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton Submit,Cancel;
    String formno;
    signupThree(String formno)
    {
        this.formno=formno;
        setLayout(null);
        setTitle("APPLICTION ACCOUNT PAGE 3 ");
        accountdetails =  new JLabel("Page 3:Account Details");
        accountdetails.setFont(new Font("Raieway",Font.BOLD,20));
        accountdetails.setBounds(280,40,400,40);
        add(accountdetails);
        type =  new JLabel("Account Type");
        type.setFont(new Font("Raieway",Font.BOLD,20));
        type.setBounds(100,140,200,20);
        add(type);
        r1 =  new JRadioButton("Saving Account");
        r1.setFont(new Font("Raieway",Font.BOLD,20));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,200,20);
        add(r1);
        r2 =  new JRadioButton("Current Account");
        r2.setFont(new Font("Raieway",Font.BOLD,20));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,200,20);
        add(r2);
        r3 =  new JRadioButton("Fixed Deposit");
        r3.setFont(new Font("Raieway",Font.BOLD,20));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,200,20);
        add(r3);
        ButtonGroup accountgroup  = new ButtonGroup();
        accountgroup.add(r1);
        accountgroup.add(r2);
        accountgroup.add(r3);

        card=  new JLabel("Card Number");
        card.setFont(new Font("Raieway",Font.BOLD,20));
        card.setBounds(100,260,200,30);
        add(card);
        carddetails=  new JLabel("this 16 digit number");
        carddetails.setFont(new Font("Raieway",Font.ITALIC,12));
        carddetails.setBounds(100,300,300,15);
        add(carddetails);
        number=  new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raieway",Font.BOLD,20));
        number.setBounds(330,260,300,30);
        add(number);
        pin=  new JLabel("PIN");
        pin.setFont(new Font("Raieway",Font.BOLD,20));
        pin.setBounds(100,325,400,30);
        add(pin);
        pindetails=  new JLabel("this is 4 digit number");
        pindetails.setFont(new Font("Raieway",Font.ITALIC,12));
        pindetails.setBounds(100,360,400,15);
        add(pindetails);
         pnumber=  new JLabel("XXXX");
        pnumber.setFont(new Font("Raieway",Font.BOLD,20));
        pnumber.setBounds(330,325,400,30);
        add(pnumber);
        service =  new JLabel("Service Required");
       service.setFont(new Font("Raieway",Font.BOLD,20));
        service.setBounds(100,375,400,30);
        add(service);
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,410,200,20);
        add(c1);
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,410,200,20);
        add(c2);
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,440,200,20);
        add(c3);
        c4 = new JCheckBox("EMAIL & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,440,200,20);
        add(c4);
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,470,200,20);
        add(c5);
        c6 = new JCheckBox("E-Satement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,470,200,20);
        add(c6);
        c7 = new JCheckBox("I hereby that the above entered details are correct to the best of my knowledge ");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,500,650,20);
        add(c7);
        Submit = new JButton("Submit");
        Submit.setBounds(250,600,100,30);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);
        Cancel = new JButton("Cancel");
        Cancel.setBounds(420,600,100,30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.addActionListener(this);
        add(Cancel);
        getContentPane().setBackground(Color.WHITE);
        setSize(1000,1000);
        setVisible(true);
        setLocation(350,200);
        
    }
    public void actionPerformed(ActionEvent a)
    {
        
        if(a.getSource()==Submit){
            String type=null;
            if(r1.isSelected())
            {
                type="Saving Account";
            }else if(r2.isSelected())
            {
                type="Current Account";
            }
            else if(r3.isSelected())
            {
                type="Fixed Deposits";
            }
            Random r=new Random();
            String card=" "+Math.abs((r.nextLong()% 90000000L) +5040906000000000L);
            String PIN=" "+Math.abs((r.nextLong()% 9000) +1000L);
            String service =" ";
            if(c1.isSelected())
            {
                service=service+"ATM CARD";
            }else if(r2.isSelected())
            {
                service=service+"Internet Banking";
            }
            else if(r3.isSelected())
            {
               service=service+"Mobile Banking";
            }
            else if(c4.isSelected())
            {
                service=service+"EMAIL & SMS Alert";
            }else if(c5.isSelected())
            {
                service=service+"Cheque Book";
            }
            else if(c6.isSelected())
            {
               service=service+"E-Satement";
            }
            try {
            if(type.equals(null))
            {
                JOptionPane.showMessageDialog(null, "Fill the Account Type");
            }
            else if(service.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the Service Required at List one");
            }
            
            else if(a.getSource()==Cancel){
                System.exit(0);
            }
            else if(a.getSource()==Submit)
            {
               connection_t c=new connection_t();
                String query="insert into signupthree value{'"+formno+"','"+type+"','"+card+"','"+PIN+"','"+service+"'}";
                c.s.executeUpdate(query);
                setVisible(false);
                new Deposit(PIN).setVisible(true);
            }
            }catch(Exception e)
            {
            System.out.println(e);
        }
        
        
    }

    }
    public static void main(String args[])
    {
        new signupThree("");
    }
    
}
