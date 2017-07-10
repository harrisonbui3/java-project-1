/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5.scanner;
import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class Assignment5Scanner {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your first name? My first name is Billy" );
        String fname = keyboard.nextLine();
        
        System.out.println ("What's your last name? Mine is Joe");
        String lname = keyboard.nextLine();
        
        System.out.println (" Hi, " + fname + "! How old are you?");
        int age = Integer.parseInt(keyboard.nextLine());
        
        int dob = 2017 - age;
        System.out.println ("I see. You must be born in the year " + dob + ". When is your birthday (month)?");
        String monthBirthday = keyboard.nextLine();
        
        System.out.println ("When is your birthday (day)?");
        int dayBirthday = Integer.parseInt(keyboard.nextLine());
        
        System.out.println ("What is your favorite book?");
        String favbook = keyboard.nextLine();
        System.out.println ("Really? That's my favorite book too!");
        
        System.out.println ("Where are you from? I'm from California!");
        String hometown = keyboard.nextLine();
        
        System.out.println ("That's sounds like a really nice place! What's your favorite number? Mine is the number three.");
        double favnumber = Double.parseDouble(keyboard.nextLine());
        
        System.out.println ("What's your shoe size?");
        double shoeSize = Double.parseDouble(keyboard.nextLine());
        
        System.out.println ("On a scale from 1 to 5, how excited are your to learn Java? I'm really  excited to learn more!");
        double enthusiasm = Double.parseDouble(keyboard.nextLine());
        
        System.out.println ("One cool fact about me is that I love Dragon Ball? What's your cool fact?");
        String coolFact = keyboard.nextLine();
        
        
        
        System.out.println (fname + " " + lname + ", " + "age " + age + ", " + "was born on " + monthBirthday + " " + dayBirthday + ", " + dob + ".");
        System.out.println ("From " + hometown + ", " + fname + " has lucky number " + favnumber + " and a shoe size of " + shoeSize + ".");
        System.out.println ("On a scale of 1 to 5, " + fname + " is this excited to learn about Java: " + enthusiasm + "! A fun fact about " + fname + " is: " + coolFact);
        
        
        int futureAge = age + 5;
        
        boolean compare1 = age == dayBirthday;
        
        boolean compare2 = (dob/2000) > 1;
        
        double combo = shoeSize * enthusiasm;
        
        System.out.println ("Future age " + futureAge);
        System.out.println ("Golden birthday? " + compare1);
        System.out.println ("Born after the year 2000?" + compare2);
        System.out.println("Random correlation between shoe size and enthusiasm: " + combo);
    }
    
}
        // TODO code application logic here
    
    

