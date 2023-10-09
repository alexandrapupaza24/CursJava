package curs10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {
	
	public static void division() {
		
   int num1, num2, result;
   Scanner scan = new Scanner(System.in);
   
   do {
	   
	   try {
		   System.out.println("Please enter a number1: ");
		   try {
				 
			   num1 = Integer.parseInt(scan.next());//vreau sa ma asigur ca in mom in care primesti ceva0 de la tastatura este un numar 
			   }catch(NumberFormatException exception) {
				   System.out.println("Please ener only numeric values.");
				   
				   continue;   
			   }
		   System.out.println("Please enter number2: ");
		   try {
			   num2 = Integer.parseInt(scan.next());
		   }catch(NumberFormatException e) {
			   System.out.println("Please ener only numeric values.");
			   continue;
		   }
		   if(num2 ==0) {
			   throw new ArithmeticException("num2 is zero. try again.");
		   }
		   result = num1/num2;
		   System.err.println("Result: " + result);
		   break;
		   
		   
	   }catch(Exception e){
		   System.out.println(e.getMessage());
		   scan.reset();
		   
	   }
	   
	  
	   
   }while(true);
   
  
   
	}
	
	public static void main(String[] args){
		
		division();

	}

}
