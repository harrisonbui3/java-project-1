/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6.conditionals;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class Assignment6Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        System.out.println("Question 2: How many dragon balls are on planet Earth?");
        System.out.println("\tA) 5");
        System.out.println("\tB) 6");
        System.out.println("\tC) 7");
        System.out.println("\tD) 8");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, there are seven dragon balls on planet Earth?");
        }
        System.out.println("Question 3: What color is the aura of Super Saiyan God?");
        System.out.println("\tA) golden");
        System.out.println("\tB) emerals green");
        System.out.println("\tC) fiery red");
        System.out.println("\tD) sapphire blue");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the aura of Super Saiyan God is colored fiery red");
        }
        System.out.println("Question 4: Which dragon ball z character was the first to transform super saiyan 2?");
        System.out.println("\tA) Gohan");
        System.out.println("\tB) Goku");
        System.out.println("\tC) Future Trunks");
        System.out.println("\tD) Vegeta");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, Gohan was the first super saiyan 2. He achieved it during the Cell Games");
        }
        System.out.println("Question 5: Who is the Legendary Super Saiyan?");
        System.out.println("\tA) Goku");
        System.out.println("\tB) Broly");
        System.out.println("\tC) Gohan");
        System.out.println("\tD) Vegeta");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, Broly is the Legendary Super Saiyan");
        }
        System.out.println("Question 6: What is the name of Goku's brother?");
        System.out.println("\tA) Raditz");
        System.out.println("\tB) Nappa");
        System.out.println("\tC) Bardock");
        System.out.println("\tD) Goten");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, Raditz is Goku's brother");
        }
        System.out.println("Your score is " + rightAnswers + " out of 6 question.");
    }
}
    
    
