
package bank.management.syatem;

//import com.mysql.cj.xdevapi.Statement;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;

public class signupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField,mnameTextField,emailTextField,AddressTextField,presentaTextField,cityTextField
            ,stateTextField,pinTextField;
    JDateChooser  dateChooser;
    JRadioButton male,female,other,married,unmarried,other1;
    JButton Next;
    //      1                       2   3       4   5       6       7       8    9   10   11    12     13 
    JLabel formno,personaldetails,name,fname,mname,email,Address,presenta,city,state,pin,dob,gender,marital;
    signupOne()
    {
        setLayout(null);
        setTitle("APPLICATION ACCOUNT PAGE 1 ");
        Random r =new Random();//use create random numbers
        random = Math.abs((r.nextLong()% 9000) +1000L);
        formno =  new JLabel("APPLICATION FORM NO: " + random);
        formno.setFont(new Font("Raieway",Font.BOLD,30));
        formno.setBounds(170,40,650,40);
        add(formno);
        personaldetails =  new JLabel("Page 1:Personal Details");
        personaldetails.setFont(new Font("Raieway",Font.BOLD,20));
        personaldetails.setBounds(290,80,400,30);
        add(personaldetails);
        name =  new JLabel("Name:");
        name.setFont(new Font("Raieway",Font.BOLD,15));
        name.setBounds(100,140,100,30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial",Font.ITALIC,15));
        nameTextField.setBounds(300,150,230,20);
        add(nameTextField);
        fname =  new JLabel("Father's Name:");
        fname.setFont(new Font("Raieway",Font.BOLD,15));
        fname.setBounds(100,190,200,30);
        add(fname);
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Arial",Font.ITALIC,15));
        fnameTextField.setBounds(300,190,230,20);
        add(fnameTextField);
        mname =  new JLabel("Mother's Name:");
        mname.setFont(new Font("Raieway",Font.BOLD,15));
        mname.setBounds(100,230,200,30);
        add(mname);
        mnameTextField = new JTextField();
        mnameTextField.setFont(new Font("Arial",Font.ITALIC,15));
        mnameTextField.setBounds(300,230,230,20);
        add(mnameTextField);
        dob =  new JLabel("Date Of Brith:");
        dob.setFont(new Font("Raieway",Font.BOLD,15));
        dob.setBounds(100,270,200,30);
        add(dob);
         dateChooser = new JDateChooser(); 
        dateChooser.setBounds(300,270,230,20);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        gender =  new JLabel("Gender:");
        gender.setFont(new Font("Raieway",Font.BOLD,15));
        gender.setBounds(100,310,200,30);
        add(gender);
        male = new JRadioButton("Male");
        male.setBounds(300,310,70,30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(370,310,70,30);
        female.setBackground(Color.WHITE);
        add(female);
        other = new JRadioButton("Other");
        other.setBounds(450,310,70,30);
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup gendergroup  = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        email =  new JLabel("Email Address:");
        email.setFont(new Font("Raieway",Font.BOLD,15));
        email.setBounds(100,350,200,30);
        add(email);
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial",Font.ITALIC,15));
        emailTextField.setBounds(300,350,230,20);
        add(emailTextField);
        marital =  new JLabel("Marital Status:");
        marital.setFont(new Font("Raieway",Font.BOLD,15));
        marital.setBounds(100,390,200,30);
        add(marital);
        married = new JRadioButton("Married");
        married.setBounds(300,390,70,30);
        married.setBackground(Color.WHITE);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(370,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        other1 = new JRadioButton("Other");
        other1.setBounds(450,390,70,30);
        other1.setBackground(Color.WHITE);
        add(other1);
        ButtonGroup gendergroup1  = new ButtonGroup();
        gendergroup1.add(married);
        gendergroup1.add(unmarried);
        gendergroup1.add(other);
         
        Address =  new JLabel("Address:");
        Address.setFont(new Font("Raieway",Font.BOLD,15));
        Address.setBounds(100,430,200,30);
        add(Address);
        AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Arial",Font.ITALIC,15));
        AddressTextField.setBounds(300,430,230,20);
        add(AddressTextField);
        presenta =  new JLabel("Present Address:");
         presenta.setFont(new Font("Raieway",Font.BOLD,15));
         presenta.setBounds(100,470,200,30);
        add( presenta);
        presentaTextField = new JTextField();
        presentaTextField.setFont(new Font("Arial",Font.ITALIC,15));
        presentaTextField.setBounds(300,470,230,20);
        add(presentaTextField);
        city =  new JLabel("City:");
         city.setFont(new Font("Raieway",Font.BOLD,15));
         city.setBounds(100,510,200,30);
        add( city);
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Arial",Font.ITALIC,15));
        cityTextField.setBounds(300,510,230,20);
        add(cityTextField);
        state=  new JLabel("State:");
         state.setFont(new Font("Raieway",Font.BOLD,15));
         state.setBounds(100,550,200,30);
        add( state);
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Arial",Font.ITALIC,15));
        stateTextField.setBounds(300,550,230,20);
        add(stateTextField);
        
         pin =  new JLabel("PIN code:");
         pin.setFont(new Font("Raieway",Font.BOLD,15));
         pin.setBounds(100,590,100,30);
        add( pin);
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Arial",Font.ITALIC,15));
        pinTextField.setBounds(300,590,230,20);
        add(pinTextField);
        
        Next = new JButton("NEXT");
        Next.setBounds(570,630,70,30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        //Next.addActionListener(this);
        add(Next);
        Next.addActionListener(this);
         
       
        setTitle("create account");
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setVisible(true);
        setLocation(350,200);
        
    }
    public void actionPerformed(ActionEvent a)
    {
        //emailTextField,AddressTextField,presentaTextField,cityTextField,stateTextField,pinTextField;
        String formno =" "+random;//number converted in the String;
        String name=nameTextField.getText();//getText are used to text field get the data
        String fname=fnameTextField.getText();
        String mname=mnameTextField.getText();
        String email=emailTextField.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();//getDateEditor().getUiComponent()help to date convert to String
        String gender=null;
        if(male.isSelected())
        {
            gender="male";
        }else if(female.isSelected())
        {
            gender="female";
        }
        else if(other.isSelected())
        {
            gender="other";
        }
        String martical=null;
        if(male.isSelected())
        {
           martical="married";
        }else if(female.isSelected())
        {
            martical="unmarried";
        }
        else if(other.isSelected())
        {
            martical="other1";
        }
        String Address=AddressTextField.getText();
        String presenta=presentaTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pin=pinTextField.getText();
        try {
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the name");
            }
            else if(fname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the Father's name");
            }
            else if(mname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the mname");
            }
            else if(email.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the email");
            }
            else if(dob.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the dob");
            }
            else if(Address.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the Address");
            }
            else{
               
                connection_t c=new connection_t();
               // String query=}";
                ResultSet rs = c.executeQuery("insert into signup value{'"+formno+"','"+name+"','"+fname+"','"+mname+"','"+email+"','"+dob+"','"+gender+"','"+martical+"','"+ Address+"','"+presenta+"','"+city+"','"+state+"','"+pin);
                setVisible(false);
                new signupTwo(formno).setVisible(true);
            }            
        }catch(Exception e)
        {
            System.out.println(e);
         }
       
    }
    public static void main(String args[])
    {
        new signupOne();
    }
    
}
