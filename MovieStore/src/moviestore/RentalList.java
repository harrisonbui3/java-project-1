/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviestore;

/**
 *
 * @author Education Unlimited
 */
public class RentalList {

    String fname, lname, videoName, phoneNumber;
    int checkOutMonth, checkOutDay, checkOutYear, dueMonth, dueDay, dueYear;

    public RentalList(String newfname, String newlname, String newVideo, String newphoneNumber, int newcheckOutMonth, int newcheckOutDay, int newcheckOutYear, int newdueMonth, int newdueDay, int newdueYear) {
        fname = newfname;
        lname = newlname;
        videoName = newVideo;
        phoneNumber = newphoneNumber;
        checkOutMonth = newcheckOutMonth;
        checkOutDay = newcheckOutDay;
        checkOutYear = newcheckOutYear;
        dueMonth = newdueMonth;
        dueDay = newdueDay;
        dueYear = newdueYear;

    }

    public String getFname() {

        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCheckOutMonth() {
        return checkOutMonth;
    }

    public void setCheckOutMonth(int checkOutMonth) {
        this.checkOutMonth = checkOutMonth;
    }

    public int getCheckOutDay() {
        return checkOutDay;
    }

    public void setCheckOutDay(int checkOutDay) {
        this.checkOutDay = checkOutDay;
    }

    public int getCheckOutYear() {
        return checkOutYear;
    }

    public void setCheckOutYear(int checkOutYear) {
        this.checkOutYear = checkOutYear;
    }

    public int getDueMonth() {
        return dueMonth;
    }

    public void setDueMonth(int dueMonth) {
        this.dueMonth = dueMonth;
    }

    public int getDueDay() {
        return dueDay;
    }

    public void setDueDay(int dueDay) {
        this.dueDay = dueDay;
    }

    public int getDueYear() {
        return dueYear;
    }

    public void setDueYear(int dueYear) {
        this.dueYear = dueYear;
    }

}
