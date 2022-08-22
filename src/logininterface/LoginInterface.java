/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logininterface;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Kabir Singh
 */
public class LoginInterface {
    
    public LoginInterface(){
       
        JFrame f = new JFrame();
             
        f.setTitle("Kabir Singh"); //setting frame parameters
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(500, 400);
        f.setLayout(null);
        JButton b1 = new JButton("Button1");
        f.add(b1);
        b1.setBounds(225, 25, 65, 65);
       
        //b1.addActionListener((ActionListener) this); ignore
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     new LoginInterface();
     
        
    }
    
}
