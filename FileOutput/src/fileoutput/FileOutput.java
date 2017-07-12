
package fileoutput;
import java.io.*;

public class FileOutput {

    public static void main(String[] args) {
        // TODO code application logic here        
        System.out.println("Done");
        String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "His power level\n";
            String line2 = "It's\n";
            String line3 = "Over\n";
            String line4 = "9000";
            String line5 = "!!\n";
            //here is where you should write your numbers to the file
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
            double value = Double.parseDouble(currentLine);
            sum += value;
            while (currentLine != null) {
		System.out.println(currentLine);
                currentLine = reader.readLine();
                value = Double.parseDouble(currentLine);
                sum += value;
            }
            System.out.println ("The sum is " + sum);

	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}
