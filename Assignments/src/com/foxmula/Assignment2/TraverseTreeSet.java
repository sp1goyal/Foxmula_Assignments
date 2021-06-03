package com.foxmula.Assignment2;
import java.util.*;

public class TraverseTreeSet {

	public static void main(String[] args) {
		Set<Integer> T1= new TreeSet<Integer>();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
            System.out.println("To Add Element Press 1");
            int option = scan.nextInt();
            if(option == 1) {
                System.out.println("Enter the element: ");
                int num = scan.nextInt();
                T1.add(num);
            }
            else
                {
                break;
            }
            
        }
		
		if(T1.size()==0) {
			System.out.println("Set is Empty....!!!");
			System.exit(0);
		}
		
		else{
				System.out.println("The Set is:");
				for(int i: T1) {
					System.out.print(i + " ");
				}
		}
		scan.close();

	}

}
