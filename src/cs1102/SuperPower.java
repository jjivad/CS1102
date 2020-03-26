/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs1102;

/**
 *
 * @author VIJ Global
 */
import javax.swing.JOptionPane;

public class SuperPower {
    public static void main(String[] args)
    {
        /*System.out.println("SUPER POWERS TO THE RESCUE!"); */
        /*JOptionPane.showMessageDialog(null, "SUPER POWERS TO THE RESCUE!");*/
        String power = JOptionPane.showInputDialog("What is your super power?");
        power = power.toUpperCase(); 
        JOptionPane.showMessageDialog(null,power+" TO THE RESCUE!");
        
        
    }
    
}



