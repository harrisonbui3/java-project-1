/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviestore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class MovieStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList overdue = new ArrayList();

        String addMore = "yes";
        int counter = 1;

        //month
        ArrayList month = new ArrayList();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

        while (addMore.equals("yes")) {

            System.out.println("\nEnter first name");
            String fname = keyboard.nextLine();

            System.out.println("\nEnter last name");
            String lname = keyboard.nextLine();

            System.out.println("\nEnter movie name");
            String video = keyboard.nextLine();

            System.out.println("\nEnter phone number");
            String phoneNumber = keyboard.nextLine();

            System.out.println("\nEnter the month NUMBER");
            int checkOutMonth = Integer.parseInt(keyboard.nextLine());

            System.out.println("\nEnter the day number");
            int checkOutDay = Integer.parseInt(keyboard.nextLine());

            System.out.println("\nEnter the year");
            int checkOutYear = Integer.parseInt(keyboard.nextLine());

            //Due Date Calculations
            int dueDay = checkOutDay + 14;
            int monthNumber = checkOutMonth;
            int yearNumber = checkOutYear;

            if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12) {
                if (checkOutDay > 31) {
                    System.out.println("Error. Invalid Date");
                    addMore = "no";
                    continue;
                }
                else if (dueDay > 31) {
                    if (monthNumber == 12) {
                        monthNumber = 0;
                        dueDay -= 31;
                        yearNumber ++;
                    }
                    else {
                    
                    dueDay -= 31;
                }
                }
                if (monthNumber > 12) {
                    monthNumber = 1;
                    yearNumber += 1;
                }
                

            } else if (monthNumber == 2) {
                if (dueDay > 28) {
                    dueDay -= 28;

                }
            } else if (checkOutMonth > 12) {
                System.out.println("Error. Invalid Date");
                addMore = "no";
                continue;
            } else {
                if (dueDay > 30) {

                    dueDay -= 30;
                }
            }

            RentalList entry = new RentalList(fname, lname, video, phoneNumber, checkOutMonth, checkOutDay, checkOutYear, monthNumber, dueDay, yearNumber);

            System.out.println("\nEntry # " + counter + "\nVideo: " + entry.getVideoName() + "\nFirst Name: " + entry.getFname() + "\nLast Name: " + entry.getLname() + "\nPhone Number: " + entry.getPhoneNumber());
            System.out.println("\nCheck-out Date: " + month.get(entry.getCheckOutMonth() - 1) + " " + entry.getCheckOutDay() + ", " + entry.getCheckOutYear());
            System.out.println("\nDue Date: " + month.get(entry.getDueMonth()) + " " + entry.getDueDay() + ", " + entry.getDueYear());

            System.out.println("\n\nWould you like to add another entry?");
            addMore = keyboard.nextLine();
            counter++;

        }

    }
}
