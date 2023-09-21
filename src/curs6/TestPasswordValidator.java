package curs6;

public class TestPasswordValidator {

	public static void main(String[] args) {
		PasswordValidator validator  = new PasswordValidator();
		validator.printPasswordRules();
		validator.getUser();
		//validator.checkPasswordRules(null);
		validator.validatePassword();

	}

}
