/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIJ Global
 */
import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion (String query, String a, String b, String c, String d, String e, String answer){
        super(query);
        correctAnswer = answer + "\n";
        correctAnswer = answer.toUpperCase();
        addChoice("A", a);
        addChoice("B", b);
        addChoice("C", c);
        addChoice("D", d);
        addChoice("E", e);
        
        initQuestionDialog();
    }
    
    void addChoice(String name, String label){
        JPanel choice = new JPanel(new BorderLayout());
        JButton button = new JButton(name);
        button.addActionListener(question);
        choice.add(button, BorderLayout.WEST);
        choice.add(new JLabel(label + " ", JLabel.LEFT), BorderLayout.CENTER);
        question.add(choice);
    }
    
}
