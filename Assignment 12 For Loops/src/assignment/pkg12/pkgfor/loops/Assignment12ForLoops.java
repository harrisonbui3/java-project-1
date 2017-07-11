/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg12.pkgfor.loops;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class Assignment12ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println();
        for (int number = 0; number < 10; number++){
            System.out.println ("I love Java");
        }
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println ("Enter a number");
        int number = Integer.parseInt(keyboard.nextLine());
        for (int value = 0; value <= number; value++){
            System.out.print (value + " "); 
        }
        System.out.println ("Enter a starting number");
        int snumber = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter an ending number");
        int enumber = Integer.parseInt(keyboard.nextLine());
        System.out.println ("What number would you like to count by?");
        int counter = Integer.parseInt(keyboard.nextLine());
        
        for (int i = snumber; i <= enumber; i += counter) {
            System.out.print (i + " ");   
        }
        System.out.println(" ");
        int[] array2 = new int[10];
        int indexLocation = 0;
        int given = 1;
        while (indexLocation <10) {
            array2[indexLocation] = given;
            indexLocation++;
            given++;
        }
        int[] array3 = new int[10];
        for (int i = 0; i < 10; i++) {
            int value = array2[i];
            value +=2;
            array3[i] = value;
            System.out.print (array3[i] + " ");        }
        
        System.out.println(" ");
        int[] array4 = new int[100];
        for (int x = 1; x < 100; x++) {
            System.out.print (x + " ");
            if (x % 5 == 0) {
                System.out.print ("! ");
            }
        }
        
    }
    
}
