package bank.management.syatem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class  Login extends JFrame implements ActionListener{
    JButton signin,clear,signup;
    JTextField pinTextField,cardTextField;
    Login()
    {
        setLayout(null);                
        setTitle("AUTOMATED TELLER MACHINE");      
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,40));
        text.setBounds(200,40,450,40);
        add(text);
        
        JLabel cardno=new JLabel("Card NO:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(125,150,375,30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial",Font.ITALIC,15));
        cardTextField.setBounds(300,150,230,20);
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(125,220,375,30);
        add(pin);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Arial",Font.ITALIC,15));
        pinTextField.setBounds(300,220,250,20);
        add(pinTextField);
        signin = new JButton("SIGN IN");
        signin.setBounds(300,300,100,30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
         
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
       getContentPane().setBackground(Color.WHITE);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        
    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(a.getSource()==signin){
            connection_t c = new connection_t();
            try{
            connection_t c=new connection_t();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText();
               // ResultSet rs=s.executequery("select * from login where cardnumber ='"+cardnumber +"' and pin = '"+pinnumber+"'");
            ResultSet rs = c.executeQuery("select * from login where cardnumber ='"+cardnumber +"' and pin = '"+pinnumber+"'");
                if(rs.next())
                {
                    setVisible(false);
                    new transtion_1(pinnumber).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect card Number or pin");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        }
        else if(a.getSource()==signup){
           setVisible(false);
           new signupOne().setVisible(true);
        }
        
    }
    public static void main(String args[])
    {
       new Login(); 
    }

}
