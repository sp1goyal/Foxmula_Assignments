package com.foxmula.Assignment2;
import java.util.*;

public class ArrayListPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A4 = new ArrayList<>();
        A4.add(3);
        A4.add(4);
        A4.add(6);
        A4.add(7);
        A4.add(9);
        A4.add(10);

        System.out.println("ArrayList is:"+A4);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value 'k': ");
        int k = scan.nextInt();

        boolean flag = false;
        int low = 0, high = A4.size()-1;
        while(low < high) {
            if(A4.get(low) + A4.get(high) == k) {
                System.out.println("Pair Exists: (" +A4.get(low)+ "," +A4.get(high)+ ")");
                flag = true;
            }
            if(A4.get(low) + A4.get(high) > k) {
                high--;
            }
            else {
                low++;
            }
        }
        if(!flag) {
            System.out.println("No such pair is possible..!!");
        }
        scan.close();
	}

}
