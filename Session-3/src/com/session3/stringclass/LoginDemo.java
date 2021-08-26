package com.session3.stringclass;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//equals
		
		String user = "Admin", password = "Password123";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name");
		
		String userInput = sc.next();
		
		System.out.println("Enter password");
		
		String passwordInput = sc.next();
		
		
		if (user.equals(userInput) && password.equals(passwordInput)) {
			
			System.out.println("Logged In");
		}
		
		else {
			System.out.println("No Match");
			
		}

	}

}
