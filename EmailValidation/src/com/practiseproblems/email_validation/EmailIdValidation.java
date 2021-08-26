package com.practiseproblems.email_validation;

import java.util.Scanner;

public class EmailIdValidation {
	
	// List of email ID's stored
	private String email_list[] = {
			"zsmuth0@free.fr",
			"astanford1@xinhuanet.com",
			"nfountaine2@github.com",
			"biffland3@addthis.com",
			"aburnep4@columbia.edu",
			"cmcquode5@feedburner.com",
			"bgerrans6@macromedia.com",
			"nflorence7@umich.edu",
			"bsherrott8@mapquest.com",
			"gmacdearmont9@mediafire.com",
			"kphilotta@cdbaby.com",
			"bdunanb@over-blog.com",
			"adesvignesc@diigo.com",
			"vweaversd@tripod.com",
			"bwenhame@ifeng.com"
	};
	
	//Method for email validation
	private int email_check(String email) {
		
		int flag =0;
		for (int i = 0;i< email_list.length;i++) {
			
			if (email_list[i].equals(email))
				flag=1;
		}
		
		return flag;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmailIdValidation obj = new EmailIdValidation();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the email id to be validated : " );
		String x = sc.next();
		
		int flag = obj.email_check(x);
		
		if (flag==1) {
			System.out.println(" Email Id : " + x + " , is valid");
		}
		else {System.out.println(" Email Id : " + x + " , is not valid");}
			

	}

}
