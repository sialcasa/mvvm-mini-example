package de.saxsys.mvvm;

import org.junit.Assert;
import org.junit.Test;

public class LoginViewModelTest {
	@Test
	public void disableLoginButton() throws Exception {
		LoginViewModel loginViewModel = new LoginViewModel();
		// No username and password were set
		Assert.assertFalse(loginViewModel.isLoginPossibleProperty().get());

		loginViewModel.userNameProperty().set("Stefanie Albrecht");
		// username was set, but no password
		Assert.assertFalse(loginViewModel.isLoginPossibleProperty().get());

		loginViewModel.passwordProperty().set("love");
		// username and password were set
		Assert.assertTrue(loginViewModel.isLoginPossibleProperty().get());
	}
}
