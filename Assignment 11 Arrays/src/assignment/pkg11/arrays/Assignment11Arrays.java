/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg11.arrays;

/**
 *
 * @author Education Unlimited
 */
public class Assignment11Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        array1[3] = 7;
        array1[4] = 9;
        array1[5] = 11;
        array1[6] = 13;
        array1[7] = 15;
        array1[8] = 17;
        array1[9] = 19;
        System.out.println("The number at index 0 is " + array1[0]);
        System.out.println("The number at index 1 is " + array1[1]);
        System.out.println("The number at index 2 is " + array1[2]);
        System.out.println("The number at index 3 is " + array1[3]);
        System.out.println("The number at index 4 is " + array1[4]);
        System.out.println("The number at index 5 is " + array1[5]);
        System.out.println("The number at index 6 is " + array1[6]);
        System.out.println("The number at index 7 is " + array1[7]);
        System.out.println("The number at index 8 is " + array1[8]);
        System.out.println("The number at index 9 is " + array1[9]);
        
        double[] array2 = new double[10];
        int indexLocation = 0;
        while (indexLocation < array2.length) {
            array2[indexLocation] = 1.25;
            System.out.println ("The number at index " + indexLocation + " is " + array2[indexLocation]);
            indexLocation++;
            
        }
        
        int[] array3 = new int[1000];
        indexLocation = 0;
        int counter = 1;
        while (indexLocation < array3.length) {
            int randomNumber = (int)(Math.random()*1000)+1;
            array3[indexLocation] = randomNumber;
            
            
            if (counter%20 == 0) {
                System.out.println (array3[indexLocation]);
            }
            else {
                System.out.print (array3[indexLocation] + " ");
               
            }
            counter++;
            indexLocation++;
        }
     }
    
}
