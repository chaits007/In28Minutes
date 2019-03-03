package com.chaitanya.jee;

public class UserValidationService {
	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(UserValidationService.class);

	public boolean validateUser(String userID, String password) {
		if (userID.equals("Chaitanya") && password.equals("asdf")) {
			return true;
		}
		return false;
	}

}
