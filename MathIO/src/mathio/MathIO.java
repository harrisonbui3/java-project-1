/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Education Unlimited
 */
public class MathIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "9000.0\n";
            String line2 = "300.0\n";
            String line3 = "400.0\n";
            String line4 = "5000.0\n";
            String line5 = "200.0\n";
            //here is where you should write your numbers to the file
            Double.parseDouble(line1);
            Double.parseDouble(line2);
            Double.parseDouble(line3);
            Double.parseDouble(line4);
            Double.parseDouble(line5);
            
            writer.write(line1);
            writer.write(line2);
            writer.write(line3);
            writer.write(line4);
            writer.write(line5);
            System.out.println("Done");
            
            
	} 
        catch (IOException e) {
            e.printStackTrace();

	}
        
        //Part 2
    
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            double sum = 0.0;
            
            
            
            while (currentLine != null) {
                sum += Double.parseDouble(currentLine);
		System.out.println(currentLine);
                currentLine = reader.readLine();
                
                
            }
            System.out.println ("The sum is " + sum);

	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}
