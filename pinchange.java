
package bank.management.syatem;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class pinchange extends JFrame implements ActionListener{
    JPasswordField newpin,repin;
    JButton change,Back;
    JLabel text,text1,text2;
      String pin;
      pinchange(String pin)
     {
        this.pin=pin;
        setLayout(null);
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,1000,1000);
        add(label);
        text=new JLabel("CHANGE YOUR PIN:");
        text.setBounds(230,330,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(text);
        text2=new JLabel("Enter New PIN:");
        text2.setBounds(175,390,200,35);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(text2);
        newpin=new JPasswordField();
        newpin.setBounds(310,400,200,20);
        newpin.setForeground(Color.BLACK);
        newpin.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(newpin);
       text1=new JLabel("Renter New Pin:");
        text1.setBounds(175,450,200,20);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(text1);
        repin=new JPasswordField();
        repin.setBounds(310,450,200,20);
        repin.setForeground(Color.BLACK);
        repin.setFont(new Font("Syatem",Font.BOLD,16));
        label.add(repin);
        change=new JButton("CHANGE");
        change.setBounds(380,500,150,30);
        change.addActionListener(this);
        label.add(change);
        Back=new JButton("Back");
        Back.setBounds(380,550,150,30);
        Back.addActionListener(this);
        label.add(Back);
        getContentPane().setBackground(Color.WHITE);
        setSize(1000,1000);
        setVisible(true);
        setUndecorated(true);
        setLocation(350,200);
        
    }
      
     public void actionPerformed(ActionEvent a)
     {              
         if(a.getSource()==change){
             String text2=newpin.getText();
             String text1=repin.getText();
             if(newpin.equals(repin))
             {
                 JOptionPane.showMessageDialog(null,"please enter same REPIN");
             }    
                try{
                conn c=new conn();
                String query="update bank set pin'"+repin+"'where pin '"+pin+"'";
                 String query1="update Login set pin'"+repin+"'where pin '"+pin+"'";
                  String query2="update signupThree set'"+repin+"'where pin '"+pin+"'";
                c.s.executeUpdate(query);
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null,"Pin Change Successfully");
                setVisible(false);
                new  transtion_1(repin).setVisible(true);
                }
                catch(Exception e)
                    {
                    System.out.println(e);
                }
         }
              else if(a.getSource()==Back){
                    setVisible(false);
                    new transtion_1(pin).setVisible(true);
               }
           
    }

   static public void main(String args[])
   {
         new pinchange(" ");
   }
}   

