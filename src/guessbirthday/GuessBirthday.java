/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessbirthday;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaboom
 */
public class GuessBirthday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String set1 =
               " 1 3 5 7\n" +
               " 9 11 13 15\n" +
               "17 19 21 23\n" +
               "25 27 29 31";
        
        String set2 =
               " 2 3 6 7\n" +
               "10 11 14 15\n" +
               "18 19 22 23\n" +
               "26 27 30 31";
        
         String set3 =
                 " 4 5 6 7\n" +
                 "12 13 14 15\n" +
                 "20 21 22 23\n" +
                 "28 29 30 31";

        String set4 =
                " 8 9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        
        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        
       int day = 0;
       
       //Create the Scanner
       //Scanner input = new Scanner(System.in);
       
       //Prompt user to answer questions
        int answer = JOptionPane.showConfirmDialog(null, "Is your Birthday in these numbers?\n" + set1);
        
        if(answer == JOptionPane.YES_OPTION)
            day += 1;
        
        answer = JOptionPane.showConfirmDialog(null, "Is your Birthday in these numbers?\n" + set2);
        
        if(answer == JOptionPane.YES_OPTION)
            day += 2;
        
        answer = JOptionPane.showConfirmDialog(null, "Is your Birthday in these numbers?\n" + set3);
        
        if(answer == JOptionPane.YES_OPTION)
            day += 4;
        
        answer = JOptionPane.showConfirmDialog(null, "Is your Birthday in these numbers?\n" + set4);
        
        if(answer == JOptionPane.YES_OPTION)
            day += 8;
        
        answer = JOptionPane.showConfirmDialog(null, "Is your Birthday in these numbers?\n" + set5);
        
        if(answer == JOptionPane.YES_OPTION)
            day += 16;
        
        JOptionPane.showMessageDialog(null, "\nYour Birthday is " + day + " ! ", "BIRTHDAYGUESS", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
