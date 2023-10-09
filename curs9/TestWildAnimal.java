package curs9;

public class TestWildAnimal {

	public static void main(String[] args) {
	   /* WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
		System.out.println("------------------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound(); //metoda suprascrisa
		bambi.eatGrass();
		
		System.out.println("------------------------------");
		
		Lion lion=new Lion();
		lion.makeSound();//metoda suprascrisa
		lion.eatMeat(); */
		
   //WebDriver browser = new ChromeDriver(); - la Selenium data type ul nu este la fel ca si constructorul, pot apartine unor clase diferite
		
		WildAnimal simba = new Lion(); //data type ul = wild animal(clasa parinte) , contructorul este efectiv tipul de animal
		simba.makeSound();
		((Lion)simba).eatMeat();//Lion simba = new Lion(); //cast la obiectul specific de data type lion pentru a putea vedea metoda doar din clasa copil.
		simba = new Deer();
		simba.makeSound();
		((Deer) simba).eatGrass();
		
	}

}
