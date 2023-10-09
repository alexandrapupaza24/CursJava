package curs10;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) throws InvalidAgeException {
		
		AgeVerifier ageObj = new AgeVerifier();
		Scanner scan = new Scanner(System.in);
		System.out.println("Plesea enter your age: ");
		int age = scan.nextInt();
		try {
		ageObj.checkAgeLimit(age);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();//cine ce sau pe cine a chemat
		}
	}

}
