package curs5;

import java.util.Scanner;

public class Palindrom {
	
      String text;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please eneter a text: ");
		text= scan.nextLine(); 
		System.out.println(text.length());
		scan.close();
		
	}
	
	public void checkIfStringIsPalindrom() {
		//radar
		String cuvantNou = "";
		for(int i = text.length()-1; i>=0; i--) {
			cuvantNou = cuvantNou + text.charAt(i);
		}
		
		String result = text.equals(cuvantNou)? "Este palindrom" : "Nu este palindrom";
			System.out.println(result);
	}

}
