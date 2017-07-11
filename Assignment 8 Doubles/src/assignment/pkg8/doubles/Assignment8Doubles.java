/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg8.doubles;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class Assignment8Doubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dice1 = (int)(Math.random()*6+1);
        int dice2 = (int)(Math.random()*6+1);
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("You rolled " + dice1 + " and " + dice2 + ". Would you like to roll again? Emter yes or no");
        String ask = keyboard.nextLine();
        
        
        while (ask.equals("yes") ) {
            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            System.out.println ("You rolled " + dice1 + " and " + dice2 + ". Would you like to roll again? Emter yes or no");
            ask = keyboard.nextLine(); 
        }
        System.out.println ("You entered no");
    }
    
}
