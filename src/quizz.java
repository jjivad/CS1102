/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author VIJ Global
 */
public class quizz {
    public static void main(String[] args){
        
        Question question1 = new MultipleChoiceQuestion("1. How many planets do we have?", "9", "4", "1", "7", "None of the above", "a");
        Question question2 = new MultipleChoiceQuestion("2. What is the biggest continent?", "Africa", "Asia", "America", "Europe", "None of the above", "b");
        Question question3 = new MultipleChoiceQuestion("3. Where is Goma town?", "Kenya", "South Africa", "UK", "Congo D.R.", "None of the above", "d");
        Question question4 = new MultipleChoiceQuestion("4. What is Scrabble?", "a fruit", "a country", "a fun game", "a person", "None of the above", "c");
        
        Question question5 = new TrueFalseQuestion ("1. Are there 9 planets?", "yes");
        Question question6 = new TrueFalseQuestion("2. Is Africa the biggest continent?", "no");
        Question question7 = new TrueFalseQuestion("3. Is Goma a town of Kenya?", "no");
        Question question8 = new TrueFalseQuestion("4. Is Scrabble a game?", "yes");
        
        //multiple choice questions call
        question1.check();
        question2.check();
        question3.check();
        question4.check();
        // true or false questions call
        question5.check();
        question6.check();
        question7.check();
        question8.check();
        
        Question.showResults();
    }
}
