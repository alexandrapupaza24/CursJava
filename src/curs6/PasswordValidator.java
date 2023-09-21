package curs6;

import java.util.Scanner;

public class PasswordValidator {
	String username;
	//String password;
	boolean valid = true;
	Scanner scan = new Scanner(System.in);
	
public void getUser() {
	System.out.println("Introdu username: ");
    username = scan.next();
}

public String getPassword() {
	System.out.println("Introdu password: ");
    String password = scan.next();
    return password;
    
}

public void printPasswordRules() {
	System.out.println("Reguli: ");
	System.out.println("Parola trebuie sa fie minim 10 caractere.");
	System.out.println("Parola trebuie sa contina upper case.");
	System.out.println("Parola trebuie sa fie diferita de username.");
	
}
 public void checkPasswordRules(String password) {
	 valid = true;
	 
	 if(password.length() <10 ) {
		 System.out.println("Parola trebuie sa fie minim 10 caractere. ");
		 valid=false;
	 }
	 if(password.equals(password.toLowerCase())) {
		 System.out.println("Parola trebuie sa contina cel putin un upper case. ");
		 valid=false;
	 }
	 if(password.equals(username)) {
		 System.out.println("Parola nu trebuie sa contina cel putin un upper case.fie identica cu username-ul. ");
		 valid=false;
	 }
 }

 public void validatePassword() {
	 
	 do {
		 
		 checkPasswordRules(getPassword());
		 
	 }while(!valid);
	 
 }

}
