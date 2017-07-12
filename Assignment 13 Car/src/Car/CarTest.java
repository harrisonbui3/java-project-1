
package car;

public class CarTest {
    double e = 0.00000000001;
    Car c = new Car("Toyota", "Camry",1999,"goku","golden",8,9001);
    
    
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1= 1999;
        String nickName1 = "goku",color1 = "golden";
        int yearsOwned1 = 8;
        double miles1 = 9001;
        
       Car car1= new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear());
       System.out.println("The car's nickname is " + car1.getNickName() + ". Color: " + car1.getColor() + ", YearsOwned: " + car1.getYearsOwned() + ", Miles: " + car1.getMiles());
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }
    
}

