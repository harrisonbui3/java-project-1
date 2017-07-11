/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg9.highorlow;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class Assignment9HighOrLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int counter = 1;
        int secretNumber = (int)(Math.random()*1000)+1;
        
        
        System.out.println("Enter your guess of the secret number!!");
        int guess = Integer.parseInt(keyboard.nextLine());
        
        while (guess != secretNumber) {
            if (guess > secretNumber) {
                System.out.println ("Your guess is too high. Guess again!");
                guess = Integer.parseInt(keyboard.nextLine());
            }
            else {
                System.out.println("Your guess is too low. Guess again!");
                guess = Integer.parseInt(keyboard.nextLine());
            counter++;            
                        }
            }
        System.out.println ("Hooray!! You guessed correctly! The secret nubmer was " + secretNumber +". It took you " + counter + " tries.");
            
        }
        
        
        
    }
    

