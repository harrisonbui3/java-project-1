/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.math.operations;

/**
 *
 * @author Education Unlimited
 */

public class Assignment3MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u;
          double a,b,c;
          String first, second, together;
 
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
         a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();
         
         int d = 4, e = 5, f = 9, g = 3;
         double h = 5.5;
         
         System.out.println ("d - 1 is " + d--);
         System.out.println ("h + 1 is " + h++);
         System.out.println ("ef is " + e + f);
         int i = f - g;
         System.out.println ("de is " + d + e);
         System.out.println("g + g is " + g * 2);
         

         first = "peanut butter";
         second = "jelly";
         together = first + " and " + second;
         System.out.println( together );
         
     }
}