package curs6;

import java.util.Scanner;

public class ForVsWhile {

 /*
  * facem un program care ii cere userului numerele incontinuu
  * le inmulteste cu 10
  * face asta pana cand userul introduce 0
  * daca a introdus 0 face exit din loop
  */
	
	
	
	public static void main(String[] args) {
		//rezolvareCuFor();
		rezolvareCuWhile();

	}
	
	public static void rezolvareCuFor() {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int nr = scan.nextInt();
		
		if(nr == 0) {
			
		} else {
			
			for(; ;) {
				System.out.println(nr*10);
				System.out.println("Please enter a number: ");
				nr = scan.nextInt();
				if(nr==0) {
					break;
				}
					
				}
				
			}
			
		}
	
	
	public static void rezolvareCuWhile() {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int nr = scan.nextInt();
		
		while(nr != 0) {
			System.out.println(nr*10);
			System.out.println("Please enter a number: ");
			nr = scan.nextInt();
		}
		
	}
	
	
	
	}
	
	


