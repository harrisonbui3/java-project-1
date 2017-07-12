/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;


public class NewEmptyJUnitTest {
        double e = .00000000001;
        Car c = new Car("Toyota"," Camry", 1999, "goku","golden",8,9001);
        
        @Test
        public void makeGetterTest() {
            assertEquals(c.getMake(),"Toyota");
            
        }
        @Test
        public void makeSetterTest () {
            c.setMake ("Camry");
        }
        public NewEmptyJUnitTest() {
    }
    
}
