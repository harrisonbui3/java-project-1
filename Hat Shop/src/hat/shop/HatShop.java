/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hat.shop;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Education Unlimited
 */
public class HatShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Selecton one of four options: \n\n 'Add' a hat to cart \n 'See' your cart \n 'Remove' hats from order \n 'Checkout'");
        String response = keyboard.nextLine();
        
        ArrayList hats = new ArrayList();
        
        while (!response.equals("Checkout")){
            if (response.equals("Add")) {
                System.out.println ("Type in the color of the hat");
                String color = keyboard.nextLine();
                hats.add(color);
            }
            else if (response.equals("See")) {
                System.out.println(hats + "\n There are " + hats.size() + " hats");
            }
            else if (response.equals("Remove")) {
                System.out.println("What color hat would you like to remove?");
                String color = keyboard.nextLine();
                hats.remove(color);
            }
            else{
                System.out.println ("Error. Please enter 'Add','See','Remove',or'Checkout'");
            }
            System.out.println ("Selecton one of four options: \n\n 'Add' a hat to cart \n 'See' your cart \n 'Remove' hats from order \n 'Checkout'");
            response = keyboard.nextLine();
        }
        System.out.println(hats + "\n You will buy " + hats.size() + " hats");
    }
    
}
