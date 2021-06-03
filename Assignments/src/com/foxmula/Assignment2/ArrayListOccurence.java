package com.foxmula.Assignment2;
import java.util.*;

public class ArrayListOccurence {

	public static void main(String[] args) {
		ArrayList<Integer> A3=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
            System.out.println("To Add Element Press 1");
            int option = scan.nextInt();
            if(option == 1) {
                System.out.println("Enter the element: ");
                int num = scan.nextInt();
                A3.add(num);
            }
            else
                {
                break;
            }
            
        }
		
		if(A3.size()==0) {
			System.out.println("ArrayList is Empty....!!!");
			System.exit(0);
		}
		
		else {
			System.out.println("The ArrayList is:"+A3);
			Set<Integer> S3=new HashSet<Integer>(A3);
			System.out.println("\nOccurence Of Each Element in ArrayList:");
			for (int s: S3) {
	            System.out.println("("+ s + ")" + " occured: " + Collections.frequency(A3, s) + " times");
	        }
		}
		scan.close();

	}

}
