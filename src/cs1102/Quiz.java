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

public class Quiz {
    public static void main(String[] args){
      while (true){
        String question = "What the second largest country in Africa? \n";
        question += "A. Sudan \n";
        question += "B. Kenya \n";
        question += "C. Algeria \n";
        question += "D. Congo D.R. \n";
        question += "E. None of the above";
        
        String answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();
        if (answer.equals("D")){
            JOptionPane.showMessageDialog(null,"Correct");
            break;
        }
        else if (answer.equals("A")){
            JOptionPane.showMessageDialog(null,"Incorrect, Try again");
        }
        else if (answer.equals("B")){
            JOptionPane.showMessageDialog(null,"Incorrect, Try again");
        }
        else if (answer.equals("C")){
            JOptionPane.showMessageDialog(null,"Incorrect, Try again");
        }
        else if(answer.equals("E")){
            JOptionPane.showMessageDialog(null,"Incorrect, Try again");
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid input");
        }
      }
    }   
}
