package cs1102;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author VIJ Global
 */
import javax.swing.JOptionPane;

public class quiz_1 {
    static int nQuestion = 0;
    static int nCorrect = 0;
    public static void main(String[] args){
        String question1 = "1. What the second largest country in Africa? \n";
        question1 += "A. Sudan \n";
        question1 += "B. Kenya \n";
        question1 += "C. Algeria \n";
        question1 += "D. Congo D.R. \n";
        question1 += "E. None of the above"; 
        
        String question2 = "2. What is Kenya's current president name? \n";
        question2 += "A. Moi \n";
        question2 += "B. Uhuru \n";
        question2 += "C. Algeria \n";
        question2 += "D. Jessy \n";
        question2 += "E. None of the above";
        
        String question3 = "3. How many seasons do we have in Europe? \n";
        question3 += "A. 4 \n";
        question3 += "B. 1 \n";
        question3 += "C. 2 \n";
        question3 += "D. 5 \n";
        question3 += "E. None of the above";
        
        String question4 = "4. Can a human being survive without breathing? \n";
        question4 += "A. yes \n";
        question4 += "B. beans \n";
        question4 += "C. no \n";
        question4 += "D. sky \n";
        question4 += "E. None of the above";
        
        check(question1, "D"); 
        check(question2, "B");
        check(question3, "A");
        check(question4, "C");
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestion + " questions");
    }
    
    // the method for asking without checking if the answer is correct, just returning the answer...
    static String ask(String question){
      while (true){        
        String answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();
        if ((answer.equals("A")) || (answer.equals("B")) || (answer.equals("C")) || (answer.equals("D")) || (answer.equals("E"))){
            return(answer);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid input, please enter A, B, C, D, or E");
        }
      }      
    } 
    // method for checking answers if they are correct or not
    static void check(String question, String correctAnswer){
        nQuestion += 1;
        String answer = ask(question);
        if (answer.equals(correctAnswer)){
            nCorrect += 1;
            JOptionPane.showMessageDialog(null, "Well done! \n" + answer + " is the correct answer");
        }
        else{
            JOptionPane.showMessageDialog(null, answer + " is INCORRECT \nThe correct answer is " + correctAnswer);
        }
    }  
}

/*
for quiz question before modification of true and false cfr question.java

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
    static int nQuestion = 0;
    static int nCorrect = 0;
    String question; 
    String correctAnswer;
    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer){
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";
        correctAnswer = answer + "\n";
        correctAnswer = answer.toUpperCase();
    }
    
    String ask(){
      while (true){        
        String answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();
        if ((answer.equals("A")) || (answer.equals("B")) || (answer.equals("C")) || (answer.equals("D")) || (answer.equals("E"))){
            return(answer);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid input, please enter A, B, C, D, or E");
        }
      }      
    }
    
    void check(){
        nQuestion += 1;
        String answer = ask();
        if (answer.equals(correctAnswer)){
            nCorrect += 1;
            JOptionPane.showMessageDialog(null, "Well done! \n" + answer + " is the correct answer");
        }
        else{
            JOptionPane.showMessageDialog(null, answer + " is INCORRECT \nThe correct answer is " + correctAnswer);
        }
    }
    
    static void showResults(){
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestion + " questions");
    }
    
}


*/

/*
quizz.java before modification/addition of question.java

public class quizz {
    public static void main(String[] args){
        Question question1 = new MultipleChoiceQuestion("1. How many planets do we have?", "9", "4", "1", "7", "None of the above", "a");
        Question question2 = new MultipleChoiceQuestion("2. What is the biggest continent?", "Africa", "Asia", "America", "Europe", "None of the above", "b");
        Question question3 = new MultipleChoiceQuestion("3. Where is Goma town?", "Kenya", "South Africa", "UK", "Congo D.R.", "None of the above", "d");
        Question question4 = new MultipleChoiceQuestion("4. What is Scrabble?", "a fruit", "a country", "a fun game", "a person", "None of the above", "c");
        
        
        question1.check();
        question2.check();
        question3.check();
        question4.check();
        MultipleChoiceQuestion.showResults();
    }
}

*/

/*
//this is  question on false/true week

public abstract class Question {
    static int nQuestion = 0;
    static int nCorrect = 0;
    String question; 
    String correctAnswer;
    
    abstract String ask();
    
    void check(){
        nQuestion += 1;
        String answer = ask();
        if (answer.equals(correctAnswer)){
            nCorrect += 1;
            JOptionPane.showMessageDialog(null, "Well done! \n" + answer + " is the correct answer");
        }
        else{
            JOptionPane.showMessageDialog(null, answer + " is INCORRECT \nThe correct answer is " + correctAnswer);
        }
    }
    
    static void showResults(){
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestion + " questions");
    }
    
}
*/

/*
// TrueFaslse class before dialogue question (Week 7)
import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion (String question, String answer){
        this.question = "TRUE or FALSE: " + question;
        
        //this condition down is helping to allow any value of the answer to be a valid input of the ask method
        
        if ((answer.equals("false")) || (answer.equals("False")) || (answer.equals("FALSE")) || (answer.equals("no")) || (answer.equals("No")) || (answer.equals("NO"))){
            answer = "FALSE";
        }
        else if((answer.equals("t")) || (answer.equals("T")) || (answer.equals("true")) || (answer.equals("True")) || (answer.equals("TRUE")) || (answer.equals("y")) || (answer.equals("Y")) || (answer.equals("yes")) || (answer.equals("Yes")) || (answer.equals("YES"))){
            answer = "TRUE";
        }
        
        correctAnswer = answer.toUpperCase();
            
    }
    
    @Override
    String ask()
    {
      while (true)
      {        
        String answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();
        
        if ((answer.equals("false")) || (answer.equals("False")) || (answer.equals("FALSE")) || (answer.equals("no")) || (answer.equals("No")) || (answer.equals("NO")))
        {
            return "FALSE";
        }
        else if ((answer.equals("t")) || (answer.equals("T")) || (answer.equals("true")) || (answer.equals("True")) || (answer.equals("TRUE")) || (answer.equals("y")) || (answer.equals("Y")) || (answer.equals("yes")) || (answer.equals("Yes")) || (answer.equals("YES")))
        {
            return "TRUE";
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
        }
        
      }      
    }
    
    
}
*/

/*
//muliplechoicequestions.java from false and true
import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion (String query, String a, String b, String c, String d, String e, String answer){
        
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";
        
        correctAnswer = answer + "\n";
        correctAnswer = answer.toUpperCase();
    }
    
    String ask(){
      while (true){        
        String answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();
        if ((answer.equals("A")) || (answer.equals("B")) || (answer.equals("C")) || (answer.equals("D")) || (answer.equals("E"))){
            return(answer);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid input, please enter A, B, C, D, or E");
        }
      }      
    }    
}

*/