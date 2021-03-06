package lab;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListMain {
	static ArrayList<Integer> listNames = new ArrayList<>();
	public static void main(String[] args) {
		Random rondom = new Random();	
		 for(int i = 0; i < 10;i++) {
			 int iValue = rondom.nextInt(50);	
			 listNames.add(iValue);
		 }

	
	ArrayListMain show = new ArrayListMain();
	show.displayList(listNames);
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number");
	int input_num = scanner.nextInt();
	
	System.out.println("You entered: " + input_num);
	
	int position = show.search(input_num);
	if(position != -1) {
		System.out.println(listNames.get(position));
	}else {
		System.out.println("Number is not in the list");
	}
	}
	
	void displayList(ArrayList<Integer> numbers) {
		for(Integer number: numbers) {
			System.out.println(number);
		}
	}
	int search(Integer number) {
		return listNames.indexOf(number);
	}
	
	

}
