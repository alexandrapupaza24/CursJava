package curs10;

public class ExceptionExample {

	public static void main(String[] args) {
		String[] days = {"L", "M", "Mi", "J", "V", "S", "D"};
		//                0    1    2     3    4    5    6
		System.out.println(days.length);
		try{
			System.out.println(days[7]);
			
		}catch(ArrayIndexOutOfBoundsException error){
			System.out.println("Exception occured");
			
		}
		System.out.println("Alta lini de cod");//nu se executa pt ca linia de mai sus se duce pe exceptie fara try-catch
		
		

	}

}
