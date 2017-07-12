/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.variables;

/**
 *
 * @author Education Unlimited
 */
public class PhoneBook {
    Assignment2Variables[] pb;
    int length;
    
    public PhoneBook() {
        length = 0;
        pb = new Assignment2Variables[100];
    }
    
    public void addPerson(Assignment2Variables p) {
        pb[length++] = p;
        //length++;
    } 
    
    public void printEntries() {
        for (int x = 0; x < length; x++) {
            System.out.println(pb[x].getFirstName() + " " + pb[x].getLastName() + ", " + pb[x].getPhoneNumber());
        
        }
            
    }
}
