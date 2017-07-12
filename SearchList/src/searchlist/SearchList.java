/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class SearchList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        for (int counter = 0; counter < 10; counter ++) {
            int number = (int)(Math.random()*50 + 1);
            x.add(number);
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Choose a number to search");
        int search = Integer.parseInt(keyboard.nextLine());
        
        boolean found = false;
        
        for (int counter = 0; counter < 10; counter++) {
            if ((int)x.get(counter)==(search)) {
                found = true;
                break;                
            }
            }
        if (found = true) {
            System.out.println ("Number selected has been found");
                  }
        else {
            System.out.println ("Number selected has NOT been found");
        }
        
        
        int maximum = 0;
        for (int counter = 0; counter < 10; counter++) {
            if ((int)x.get(counter) > maximum){
                maximum = (int)x.get(counter);
            }
                }
        System.out.println ("The highest number in the list is " + maximum);
        
        
        
        ArrayList y = new ArrayList();
        y.add("A");
        y.add("bunch");
        y.add("of");
        y.add("revolutionary");
        y.add("manumission");
        y.add("abolitionists");
        y.add("give");
        y.add("me");
        y.add("your");
        y.add("position");
        y.add("show");
        y.add("me");
        y.add("where");
        y.add("the");
        y.add("ammunition");
        y.add("is");
        
        ArrayList z = new ArrayList();
        
        
        while (y.size() != 0) {
            String alpha = (String)y.get(0);
            for (int counter = 0; counter < y.size(); counter++){
                
                if (alpha.compareTo((String)y.get(counter))> 0) {
                    alpha = (String)y.get(counter);
            }
            
        }
        z.add (alpha);
        y.remove (alpha);
        }
        System.out.println (z);
           
    }
}
    
