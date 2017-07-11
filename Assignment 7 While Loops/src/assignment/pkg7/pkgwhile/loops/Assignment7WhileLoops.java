/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg7.pkgwhile.loops;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class Assignment7WhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Scanner keyboard = new Scanner(System.in);
       System.out.println("How many times would you like me to repeat a certain phrase?");
       Integer times = Integer.parseInt(keyboard.nextLine());
       System.out.print( "Type something, and I will repeat it " + times + " times: " );
       String input = keyboard.nextLine();
       
       System.out.println("Here we go?");
       int count = 0;
       
       while (count < times) {
           int number = count + 1;
           System.out.println(number + ". " + input);
           count ++;
       }
    }
    
}
