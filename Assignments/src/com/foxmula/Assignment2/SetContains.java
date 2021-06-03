package com.foxmula.Assignment2;
import java.util.*;

public class SetContains {

	public static void main(String[] args) {
		
		Set<Integer> S1= new HashSet<Integer>();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
            System.out.println("To Add Element Press 1");
            int option = scan.nextInt();
            if(option == 1) {
                System.out.println("Enter the element: ");
                int num = scan.nextInt();
                S1.add(num);
            }
            else
                {
                break;
            }
            
        }
		
		if(S1.size()==0) {
			System.out.println("Set is Empty....!!!");
			System.exit(0);
		}
		
		else{
				System.out.println("The Set is:"+S1);
			 	System.out.println("\nEnter the element to check if it is present or not: ");
		        int element = scan.nextInt();
		        if(S1.contains(element)) {
		            System.out.println(element + " is present in the set...!!!");
		        }
		        else {
		            System.out.println("Element is not present in the set...!!!");
		        }
			}
			scan.close();
	}

}
