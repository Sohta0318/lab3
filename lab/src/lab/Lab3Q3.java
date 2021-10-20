package lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab3Q3 {
public static void main(String[] args){
	List<Integer> Year = new ArrayList<>();
	final var car1 = new Car("Honda", "Civic",1999);
	final var car2 = new Car("Toyota", "Civic",2005);
	final var car3 = new Car("Prius", "Civic",1865);
	final var car4 = new Car("Nissan", "Civic",2010);
	final var car5 = new Car("BMW", "Civic",1923);
	 
	Year.add(car1.year());
	Year.add(car2.year());
	Year.add(car3.year());
	Year.add(car4.year());
	Year.add(car5.year());
	
	Collections.sort(Year);
	System.out.println(Year);
	
	
	
        
    }



}
record Car(String make,String model, int year) {

}