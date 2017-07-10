/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4.booleans;

/**
 *
 * @author Education Unlimited
 */
public class Assignment4Booleans {

    public static void main(String[] args) {
        // < means less than
        // > means greater than
        // <= means less than or equal to
        // >= means greater than or equal to
        // == means equal to
        // != means not equal to
        int x,y;
        boolean a,b,c,d,e,f;
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        String s1 = "Good morning.";
        String s2 = "Hi there";
        String s3 = "Howdy, partner!";
        boolean compare1 = s1.equals(s2);
        int compare2 = s3.compareTo(s3);
        int compare3 = s2.compareTo(s3);
       System.out.println ("s1 equals s2 is " + compare1);
       System.out.println ("s3 equals s3 is " + compare2);
       System.out.println ("s2 equals s3 is " + compare3);
       boolean b1 = true;
       boolean b2 = false;
       System.out.println ("True and not true: " + (b1 && !b1));
       System.out.println ("False and not true: " + (b2 && !b1));
       System.out.println ("True and not false: " + (b1 && !b2));
       System.out.println ("True or false: " + (b1 || b2));
       System.out.println ("False or false: " + (b2 || b2)); 
    }
    }
    
