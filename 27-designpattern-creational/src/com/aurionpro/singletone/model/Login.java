package com.aurionpro.singletone.model;

public class Login {
	private static Login login;
private Login()
{
	System.out.println("Login is created");
}

public void status() {
	System.out.println("Login is successful");
	}

public static Login getLogin() {
	if(login==null)
	   login=new Login();
	return login;
}
}

