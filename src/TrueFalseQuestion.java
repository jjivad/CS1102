/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIJ Global
 */

import javax.swing.*;

public class TrueFalseQuestion extends Question {
    
    void addButton(JPanel buttons, String label){
        JButton button =  new JButton(label);
        button.addActionListener(question);
        buttons.add(button);            
    }
    
    public TrueFalseQuestion (String question, String answer){
        super(question);
        
        JPanel buttons = new JPanel();
        
        addButton(buttons, "TRUE");
        addButton(buttons, "FALSE");
        
        this.question.add(buttons);
        initQuestionDialog();
        
        //this condition down is helping to allow any value of the answer to be a valid input of the ask method
        
        if ((answer.equals("false")) || (answer.equals("False")) || (answer.equals("FALSE")) || (answer.equals("no")) || (answer.equals("No")) || (answer.equals("NO"))){
            answer = "FALSE";
        }
        else if((answer.equals("t")) || (answer.equals("T")) || (answer.equals("true")) || (answer.equals("True")) || (answer.equals("TRUE")) || (answer.equals("y")) || (answer.equals("Y")) || (answer.equals("yes")) || (answer.equals("Yes")) || (answer.equals("YES"))){
            answer = "TRUE";
        }
        
        correctAnswer = answer.toUpperCase();
            
    } 
}
