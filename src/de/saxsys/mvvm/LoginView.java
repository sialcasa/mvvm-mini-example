package de.saxsys.mvvm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginView {

	@FXML
	private TextField userNameTextField;

	@FXML
	private TextField passwordTextField;

	@FXML
	private Button loginButton;

	@FXML
	void initialize() {
		LoginViewModel loginViewModel = new LoginViewModel();
		userNameTextField.textProperty().bindBidirectional(loginViewModel.userNameProperty());
		passwordTextField.textProperty().bindBidirectional(loginViewModel.passwordProperty());
		loginButton.disableProperty().bind(loginViewModel.isLoginPossibleProperty().not());
	}
}