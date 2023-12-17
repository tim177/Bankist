package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener{
     
    long random;
    JTextField nameJTextField, fnameJTextField, emailJTextField, addressJTextField, cityJTextField, pinJTextField, stateJTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;
    
    SignUpOne(){
            
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        //System.out.println(random);
        JLabel formno = new JLabel("Appliction Form number" + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameJTextField = new JTextField();
        nameJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameJTextField.setBounds(350, 140, 300, 30);
        add(nameJTextField);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        fnameJTextField = new JTextField();
        fnameJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameJTextField.setBounds(350, 190, 300, 30);
        add(fnameJTextField);
        
        JLabel dob = new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(350, 240, 300, 30);
        dateChooser.setForeground(new Color(105, 104, 105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(350, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        emailJTextField = new JTextField();
        emailJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailJTextField.setBounds(350, 340, 300, 30);
        add(emailJTextField);
        
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(350, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("other");
        other.setBounds(580, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        addressJTextField = new JTextField();
        addressJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressJTextField.setBounds(350, 440, 300, 30);
        add(addressJTextField);
               
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
       
        cityJTextField = new JTextField();
        cityJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityJTextField.setBounds(350, 490, 300, 30);
        add(cityJTextField);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        stateJTextField = new JTextField();
        stateJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateJTextField.setBounds(350, 540, 300, 30);
        add(stateJTextField);

        JLabel pin = new JLabel("Pin Code: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 590, 200, 30);
        add(pin);
        
        pinJTextField = new JTextField();
        pinJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinJTextField.setBounds(350, 590, 300, 30);
        add(pinJTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway", Font.BOLD, 14));
        next.setBounds(620, 700, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setVisible(true);
        setLocation(350, 10);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;    //long
        String name = nameJTextField.getText();
        String fname = fnameJTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailJTextField.getText();
        String martial = null;
        if(married.isSelected()){
            martial = "Married";
        }else if(unmarried.isSelected()){
            martial = "Unmarried";
        }else if(other.isSelected()){
            martial = "Other";
        }
        String address = addressJTextField.getText();
        String city = cityJTextField.getText();
        String state = stateJTextField.getText();
        String pin = pinJTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+martial+"','"+address+"','"+pin+"','"+city+"','"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
        }catch (Exception e){
            System.out.print("error from signup"+e);
        }
    }
    public static void main(String args[]) {
        new SignUpOne();
    }
}
