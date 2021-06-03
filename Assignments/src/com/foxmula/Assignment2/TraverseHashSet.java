package com.foxmula.Assignment2;
import java.util.*;

public class TraverseHashSet {

	public static void main(String[] args) {
		Set<Integer> S2= new HashSet<Integer>();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
            System.out.println("To Add Element Press 1");
            int option = scan.nextInt();
            if(option == 1) {
                System.out.println("Enter the element: ");
                int num = scan.nextInt();
                S2.add(num);
            }
            else
                {
                break;
            }
            
        }
		
		if(S2.size()==0) {
			System.out.println("Set is Empty....!!!");
			System.exit(0);
		}
		
		else{
				System.out.println("The Set is:");
				for(int i: S2) {
					System.out.print(i + " ");
				}
		}
		scan.close();
	}
	
}
