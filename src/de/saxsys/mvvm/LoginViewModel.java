package de.saxsys.mvvm;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginViewModel {

	private final StringProperty userName = new SimpleStringProperty();
	private final StringProperty password = new SimpleStringProperty();
	private final ReadOnlyBooleanWrapper loginPossible = new ReadOnlyBooleanWrapper();

	public LoginViewModel() {
		loginPossible.bind(userName.isNotEmpty().and(password.isNotEmpty()));
	}

	public StringProperty userNameProperty() {
		return userName;
	}

	public StringProperty passwordProperty() {
		return password;
	}

	public ReadOnlyBooleanProperty isLoginPossibleProperty() {
		return loginPossible.getReadOnlyProperty();
	}
}
