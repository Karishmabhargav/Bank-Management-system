
package bank.management.syatem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class signupTwo extends JFrame implements ActionListener {
    JTextField panTextField,addharTextField;
    JRadioButton syes,sno,eyes,eno;
    JButton Next;
    String formno;
    JComboBox religionJ,categoryJ,occuptionJ,incomej,qualificationJ;
    //                        1         2       3       4               5       6           7               8           9           
    JLabel addtionaldetails,religion,category,income,qualification,occuption, pannumber,addharnumber, seniorcitizen,existingaccount;
    signupTwo(String formno)
    {
      
       this.formno=formno;
        setLayout(null);
        setTitle("APPLICTION ACCOUNT PAGE 2 ");
        addtionaldetails =  new JLabel("Page 2:Additional Details");
        addtionaldetails.setFont(new Font("Raieway",Font.BOLD,20));
        addtionaldetails.setBounds(290,80,400,30);
        add(addtionaldetails);
        
        religion =  new JLabel("Religion:");
        religion.setFont(new Font("Raieway",Font.BOLD,15));
        religion.setBounds(100,140,150,30);
        add(religion);
        String valreligion[] ={"Hindu","Muslim","Christian","Other"};
        religionJ =new JComboBox(valreligion);
        religionJ.setFont(new Font("Arial",Font.ITALIC,15));
        religionJ.setBounds(300,150,150,20);
        religionJ.setBackground(Color.WHITE);
        add(religionJ);
        category =  new JLabel("Category:");
        category.setFont(new Font("Raieway",Font.BOLD,15));
        category.setBounds(100,190,200,30);
        add(category);
        String valcategory[] ={"General","OBC","ST","Other"};
        categoryJ =new JComboBox(valcategory);
        categoryJ.setFont(new Font("Arial",Font.ITALIC,15));
        categoryJ.setBounds(300,190,150,20);
        categoryJ.setBackground(Color.WHITE);
        add(categoryJ);
       
        income =  new JLabel("Income:");
        income.setFont(new Font("Raieway",Font.BOLD,15));
        income.setBounds(100,230,200,30);
        add(income);
        String valincome[] ={"NULL","<1,50,000","<2,50,000","5,00,000","Up to 10,00,000"};
        incomej =new JComboBox(valincome);
        incomej.setFont(new Font("Arial",Font.ITALIC,15));
        incomej.setBounds(300,230,150,20);
        incomej.setBackground(Color.WHITE);
        add(incomej);
      
        
        qualification =  new JLabel("Qualification:");
        qualification.setFont(new Font("Raieway",Font.BOLD,15));
        qualification.setBounds(100,270,200,30);
        add(qualification);
        String valqualification[] ={"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        qualificationJ =new JComboBox(valqualification);
        qualificationJ.setFont(new Font("Arial",Font.ITALIC,15));
        qualificationJ.setBounds(300,270,150,20);
        qualificationJ.setBackground(Color.WHITE);
        add(qualificationJ);
        
        occuption =  new JLabel("Occuption:");
        occuption.setFont(new Font("Raieway",Font.BOLD,15));
        occuption.setBounds(100,310,100,30);
        add(occuption);
        String valoccuption[] ={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occuptionJ =new JComboBox(valoccuption);
        occuptionJ.setFont(new Font("Arial",Font.ITALIC,15));
        occuptionJ.setBounds(300,310,150,30);
        occuptionJ.setBackground(Color.WHITE);
        add(occuptionJ);
         
        pannumber =  new JLabel("PANNumber:");
        pannumber.setFont(new Font("Raieway",Font.BOLD,15));
        pannumber.setBounds(100,350,200,30);
        add(pannumber);
        panTextField = new JTextField();
        panTextField.setFont(new Font("Arial",Font.ITALIC,15));
        panTextField.setBounds(
                300,350,230,20);
        add(panTextField);
        addharnumber =  new JLabel("AddharNumber:");
        addharnumber.setFont(new Font("Raieway",Font.BOLD,15));
        addharnumber.setBounds(100,390,200,30);
        add( addharnumber);
        addharTextField = new JTextField();
        addharTextField.setFont(new Font("Arial",Font.ITALIC,15));
        addharTextField.setBounds(300,390,230,20);
        add(addharTextField);
        seniorcitizen =  new JLabel("SeniorCitizen:");
        seniorcitizen.setFont(new Font("Raieway",Font.BOLD,15));
        seniorcitizen.setBounds(100,430,200,30);
        add(seniorcitizen);
        syes = new JRadioButton("YES");
        syes.setBounds(300,430,70,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno = new JRadioButton("NO");
        sno.setBounds(370,430,70,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        ButtonGroup seniorgroup  = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        existingaccount =  new JLabel("SeniorCitizen:");
        existingaccount.setFont(new Font("Raieway",Font.BOLD,15));
        existingaccount.setBounds(100,470,200,30);
        add(existingaccount);
        eyes = new JRadioButton("YES");
        eyes.setBounds(300,470,70,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno = new JRadioButton("NO");
        eno.setBounds(370,470,70,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        ButtonGroup existingaccountJ  = new ButtonGroup();
        existingaccountJ.add(eyes);
        existingaccountJ.add(eno);
        Next = new JButton("NEXT");
        Next.setBounds(450,530,70,30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setVisible(true);
        setLocation(350,200);
        
    }
    public void actionPerformed(ActionEvent a)
    {
        
        String religion=(String) religionJ.getSelectedItem();
        String category=(String) categoryJ.getSelectedItem();
        String occuption =(String) occuptionJ.getSelectedItem();
        String income=(String) incomej.getSelectedItem();
        String qualification=(String) qualificationJ.getSelectedItem();
        String pannumber=panTextField.getText();
        String addharnumber=addharTextField.getText();
        String seniorcitizen=null;
        if(syes.isSelected())
        {
            seniorcitizen="yes";
        }else if(sno.isSelected())
        {
            seniorcitizen="no";
        }
        String existingaccount=null;
        if(eyes.isSelected())
        {
           existingaccount="yes";
        }else if(eno.isSelected())
        {
            existingaccount="no";
        }
        
        try {
            if(pannumber.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the PAN Number");
            }
            else if(addharnumber.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill the Addhar Number");
            }
            else
            {
                /*conn c=new conn();
                String query="insert into signuptwo value{'"+formno+"','"+religion+"','"+category+"','"+occuption+"','"+income+"','"+qualification+"','"+pannumber+"','"+addharnumber+"',"
                + "'"+seniorcitizen+"','"+existingaccount+"'}";
                c.s.executeUpdate(query);*/
                setVisible(false);
                new signupThree(formno).setVisible(true);
            } 
            
        }catch(Exception e)
        {
            System.out.println(e);
         }
    }
    public static void main(String args[])
    {
        new signupTwo("");
    }

    
    
}
