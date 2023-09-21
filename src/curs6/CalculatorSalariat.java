package curs6;

import java.util.Scanner;

public class CalculatorSalariat {
	/*
	 * facem un program care calculeaza salariul pe o sapt
	 * intrebam utilizatorul cate ore a lucrat
	 * calculam daca a lucrat maxim 40 de ore sau minim o ora
	 * daca introduce un nr invalid de ore il rugam sa introduca din nou
	 * rate per ora cu care calculam este 15 (rate/h = 15)
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu cate ore ai lucrat: ");
		int oreLucrate= scan.nextInt();
		
		while(oreLucrate <1 || oreLucrate>40) {
			System.out.println("Nr valid de ore: ");
			System.out.println("Introdu intre 1 si 40: ");
			oreLucrate = scan.nextInt();
		}
		System.out.println("Slariul tau este: " + oreLucrate*15);

	}
	
	

}
