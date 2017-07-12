package car;


public class Car {
    
  
   String make, model;
   int year;

    
   String nickName,color;
   int yearsOwned;
   double miles;
   boolean isOn;
   
   public Car(String newMake, String newModel, int newYear, String newNickName, String newColor, int newYearsOwned, double newMiles) {
       make=newMake;
       model=newModel;
       year=newYear;
       nickName=newNickName;
       color=newColor;
       yearsOwned=newYearsOwned;
       miles=newMiles;
       isOn = false;
   }
   
       public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model=model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   
    public void turnOn() {
        isOn=true;
        System.out.println("The car is now on!");
    }
   
    public void turnOff() {
        if (isOn==true) {
            isOn=false;
            System.out.println("The car is now off!");
        } 
        else {
            System.out.println("The car is already off!");
        }
       
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearsOwned() {
        return yearsOwned;
    }

    public void setYearsOwned(int yearsOwned) {
        this.yearsOwned = yearsOwned;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
