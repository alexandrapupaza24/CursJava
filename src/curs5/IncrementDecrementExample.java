package curs5;

public class IncrementDecrementExample {

	public static void main(String[] args) {
		// nr++  || nr+1 || nr= nr+1 || nr+=1
		//post increment
		int nr = 10;
		System.out.println(nr++);//adauga la urmatoare afisare 
		System.out.println(nr);
		
		//pre increment
		nr = 5;
		System.out.println(++nr); //adauga deja la nr curent si afiseaza val marita
		System.out.println(nr);
		
		//post decrement
		int nr3 = 20;
		System.out.println(nr3--);
		System.out.println(nr3);
		
		//pre increment
		int nr4=15;
		System.out.println(--nr4);
		System.out.println(nr4);

	}

}
