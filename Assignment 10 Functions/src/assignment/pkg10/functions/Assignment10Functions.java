/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg10.functions;

/**
 *
 * @author Education Unlimited
 */
public class Assignment10Functions {

    
    public static void main(String[] args) {
	
		//this part will test the functions
		System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has slope " + slope(2,8,4,-4) );
                
		System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has distance " + distance(2,8,4,-4) );
                lineEquation(0,-3,-1,-7);
	}
 
    
        public static double slope( int x1, int y1, int x2, int y2 )
	{
            double y_value = y2 - y1;
            double x_value = x2 - x1;
            
            return y_value/x_value;
	}
        
    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double distance( int x1, int y1, int x2, int y2 )
	{
            double x_value = x2 - x1;
            double y_value = y2 - y1;
            double x_squared = Math.pow(x_value,2);
            double y_squared = Math.pow(y_value,2);
            
            double addition = x_squared + y_squared;
            
            double squareroot = Math.sqrt(addition);
            
            return squareroot;
	}
        public static void lineEquation (int x1, int y1, int x2, int y2) {
            double m = slope(x1,y1,x2,y2);
            double b = y1 - m * x1;
            
            System.out.println ("The equation is: y = " + m + "x + " + b );
        }
}
    // TODO code application logic here
    
    
