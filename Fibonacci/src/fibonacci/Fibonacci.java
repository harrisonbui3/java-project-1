/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.ArrayList;
/**
 *
 * @author Education Unlimited
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        int location = 0;
        int sum = 0;
        while (sum < 4000000){
            sum = numbers.get(location) + numbers.get(location + 1);
            numbers.add(sum);
            location++;
    }
        ArrayList<Integer> evens = new ArrayList <Integer>();
        for (int x = 0; x < numbers.size(); x++){
            if (numbers.get(x)%2==0) {
                evens.add(numbers.get(x));
            }
        
    }
        int add = 0;
        for (int x = 0; x < evens.size(); x ++) {
            add += evens.get(x);
        }
         System.out.println (numbers + " \nThe final sum is " + add);
    
    }
}
