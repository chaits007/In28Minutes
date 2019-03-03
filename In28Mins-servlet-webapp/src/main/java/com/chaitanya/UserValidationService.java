package com.chaitanya;

public class UserValidationService {
	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(UserValidationService.class);

	public boolean validateUser(String userID, String password) {
		System.out.println("In validateUser : " + userID + " - " + password);
		if (userID.equals("Chaitanya") && password.equals("asdf")) {
			System.out.println("Success!");
			return true;
		}
		System.out.println("Fail!");
		return false;
	}

}
