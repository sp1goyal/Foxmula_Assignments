package com.foxmula.Assignment1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Addition Of Time
		Time time1 = new Time (23,30,59);
		Time time2 = new Time (0,31,1);

		time1.add(time2);

		
		//Area of Quadrilaterals
		Square square = new Square(20,20,40,20,40,40,20,40);
        System.out.println("Square area : "+square.area());
        
        Rectangle rect = new Rectangle(20,20,40,20,40,30,20,30);
        System.out.println("Rectangle area : "+rect.area());
        
		Trapezoid trap = new Trapezoid(20,20,40,20,30,30,10,30,8);
        System.out.println("Trapezoid area : "+trap.area());

        Parallelogram para = new Parallelogram(20,20,40,20,30,30,10,30,8);
        System.out.println("Parallelogram area : "+para.area());

        //Stack Operations Menu
        
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        Menu(stack1, stack2);
    }
    
    public static void Check(Stack stack1, Stack stack2) {
        if(stack1.length() == stack2.length())
        	System.out.println("Stack 1 and Stack 2 are equal in size.");
    }

    public static void Menu(Stack stack1, Stack stack2) {
    	Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Choose Operations to Perform\n\t1.Push in 1st Stack.\n\t2.Push in 2nd Stack.\n\t3.Pop from 1st Stack.\n\t4.Pop from 2nd Stack.\n\t5.Is Stack 1 empty?\n\t6.Is Stack 2 empty?\n\t7.Exit");
            int option = scan.nextInt();
            switch(option){
               case 1: 
            	   System.out.println("Enter value to push: ");
                   int data1 = scan.nextInt();
                   stack1.push(data1);
                   Check(stack1, stack2);
                   break;
                   
               case 2: 
            	   System.out.println("Enter value to push: ");
		           int data2 = scan.nextInt();
		           stack2.push(data2);
		           Check(stack1, stack2);
		           break;
		           
               case 3: 
            	   try {
            		   System.out.println("Popped element from 1st Stack: "+stack1.pop());
	                   Check(stack1, stack2);
		                
            	   } 
            	   catch (NoSuchElementException exp) {
            		   System.out.println("Stack is empty! Please push first");
		               continue;
		           }
                   break;
                		
               case 4: 
            	   try {
            		   System.out.println("Popped element from 2nd Stack: "+stack2.pop());
	                   Check(stack1, stack2);
	               } 
            	   catch (NoSuchElementException exp) {
            		   System.out.println("Stack is empty! Please push first");
		               continue;
		           }
                   break;
                   
               case 5:	
            	   System.out.println(stack1.isEmpty());
                   break;
                   
               case 6:	
            	   System.out.println(stack2.isEmpty());
            	   break;
               
               case 7:	
            	   System.exit(1);
                
               default:
            	   System.out.println("Enter Valid Option");
                        break;   
            }
            scan.close();
        }
        
    }
    
}
