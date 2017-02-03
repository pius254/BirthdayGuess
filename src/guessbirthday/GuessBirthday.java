/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessbirthday;

import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author Kaboom
 */
public class GuessBirthday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day = 0;//Day to be modified
        int answer;
       
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Is your Birthday in Set " + (i + 1)+ "?");
//            answer = JOptionPane.showConfirmDialog(null, "Is your Birthday in Set" + (i + 1)+ "?");
            for (int j = 0; j < 4; j++) {
                for(int k = 0; k < 4; k++)
                    System.out.print(GuessDate.getValue(i, j, k) + " ");
                System.out.println();
//                    JOptionPane.showMessageDialog(null, dates[i][j][k]);
            }
            System.out.println("Enter 0 for NO and 1 for YES");
            answer = input.nextInt();
            if (answer == 1) {
                day += GuessDate.getValue(i, 0, 0);
            } 
        }
        
        System.out.println("Your Birthday is "+ day);
//        JOptionPane.showMessageDialog(null, "Your Birthday is " + day);
    }   
    
}
