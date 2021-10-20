package lab;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortWithoutComparator {
    public static void main(String[] args) {
        ArrayList <CarImplementedComparable>list = new ArrayList<CarImplementedComparable>();//[1]
        list.add(new CarImplementedComparable("Honda", "Civic",1999));//[2]
        list.add(new CarImplementedComparable("Toyota", "Civic",2005));//[3]
        list.add(new CarImplementedComparable("Prius", "Civic",1865));//[4]
        list.add(new CarImplementedComparable("Nissan", "Civic",2010));//[5]
        list.add(new CarImplementedComparable("BMW", "Civic",1923));//[6]

        Collections.sort(list);//[7]
        for (CarImplementedComparable carNumber: list) {//[8]
            System.out.print("[Car Year = " + carNumber.year());//[9]
            System.out.println(", Make = " + carNumber.make());
            System.out.println(", Model = " + carNumber.model());
        }
    }
}
