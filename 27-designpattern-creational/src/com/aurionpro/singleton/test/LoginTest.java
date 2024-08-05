package com.aurionpro.singleton.test;

import com.aurionpro.singletone.model.Login;

public class LoginTest {
public static void main(String[] args) {
	
	Login login1=Login.getLogin();
	login1.status();
	
	Login login2=Login.getLogin(); //second reference to the same object.
    login2.status();
}
}
