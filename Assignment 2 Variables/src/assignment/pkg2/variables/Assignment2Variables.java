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
public class Assignment2Variables {
    
        int age;
        double height;
        String firstName;
        String lastName;
        boolean AStudent;
        String phoneNumber;

    public Assignment2Variables(String first, String last, String phone) {
        firstName = first;
        lastName = last;
        phoneNumber = phone;
}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isAStudent() {
        return AStudent;
    }

    public void setAStudent(boolean AStudent) {
        this.AStudent = AStudent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
         
        
        
        
        
    

