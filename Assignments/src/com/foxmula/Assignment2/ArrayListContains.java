package com.foxmula.Assignment2;
import java.util.*;

public class ArrayListContains {

	public static void main(String[] args) {
		
		ArrayList<Integer> A1=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
            System.out.println("To Add Element Press 1");
            int option = scan.nextInt();
            if(option == 1) {
                System.out.println("Enter the element: ");
                int num = scan.nextInt();
                A1.add(num);
            }
            else
                {
                break;
            }
            
        }
		
		if(A1.size()==0) {
			System.out.println("ArrayList is Empty....!!!");
			System.exit(0);
		}
		
		else {
			System.out.println("The ArrayList is:"+A1);
			System.out.println("\nEnter the element to check if it is present or not: ");
	        int element = scan.nextInt();
	        if(A1.contains(element)) {
	            System.out.println(element + " is present in the ArrayList...!!!");
	        }
	        else {
	            System.out.println("Element is not present in the ArrayList...!!!");
	        }
		}
		scan.close();
	}

}
