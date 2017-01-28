/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessbirthday;

import java.util.Scanner;
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
       Scanner input = new Scanner(System.in);
       
       //Prompt user to answer questions
        JOptionPane.showMessageDialog(null, "Is your Birthday in set1?\n");
        JOptionPane.showMessageDialog(null, set1);
        JOptionPane.showMessageDialog(null, "\nEnter 0 for NO and 1 for YES: ");
        int answer = input.nextInt();
        
        if(answer == 1)
            day += 1;
        
        JOptionPane.showMessageDialog(null, "Is your Birthday in set2?\n");
        JOptionPane.showMessageDialog(null, set2);
        JOptionPane.showMessageDialog(null, "\nEnter 0 for NO and 1 for YES: ");
        answer = input.nextInt();
        
        if(answer == 1)
            day += 2;
        
        JOptionPane.showMessageDialog(null, "Is your Birthday in set3?\n");
        JOptionPane.showMessageDialog(null, set3);
        JOptionPane.showMessageDialog(null, "\nEnter 0 for NO and 1 for YES: ");
        answer = input.nextInt();
        
        if(answer == 1)
            day += 4;
        
        JOptionPane.showMessageDialog(null, "Is your Birthday in set4?\n");
        JOptionPane.showMessageDialog(null, set4);
        JOptionPane.showMessageDialog(null, "\nEnter 0 for NO and 1 for YES: ");
        answer = input.nextInt();
        
        if(answer == 1)
            day += 8;
        
        JOptionPane.showMessageDialog(null, "Is your Birthday in set5?\n");
        JOptionPane.showMessageDialog(null, set5);
        JOptionPane.showMessageDialog(null, "\nEnter 0 for NO and 1 for YES: ");
        answer = input.nextInt();
        
        if(answer == 1)
            day += 16;
        
        JOptionPane.showMessageDialog(null, "\nYour Birthday is " + day + " ! ", "BIRTHDAYGUESS", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
