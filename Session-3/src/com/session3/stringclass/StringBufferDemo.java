package com.session3.stringclass;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbf = new StringBuffer("Welcome");
		
		System.out.println(sbf);
		
		sbf.append(" to the Carnival !!!!!");
		
		System.out.println(sbf);
		
		sbf.append(" The millenia event ....****");
		
		System.out.println(sbf);
		
		//Insert
		
		sbf.insert(0, 'W');
		
		System.out.println(sbf);
		
		//replace
		
		sbf.replace(0, 2, "w");
		
		System.out.println(sbf);
		
		//delete
		sbf.delete(0, 1);
		System.out.println(sbf);
		
	    sbf.insert(0, "W");
		
		System.out.println(sbf);
		
		///////////String Builder////////////////////////
		
		StringBuilder s1 = new StringBuilder("Happy");
		
		s1.append(" to Help.");
		
		System.out.println(s1);
		
		System.out.println(s1.replace(0, 5, "Glad"));
		System.out.println(s1.delete(2, 5));
		
		/// Converting StringBuffer and String Builder to String
		
		String new1 = sbf.toString();
		
		String new2 = s1.toString();
		
		System.out.println(new1 +"\n"+ new2);
		
		// COnvert from String to StringBuffer or Builder
		
		String x = "New String";
		
		StringBuffer s2 = new StringBuffer(x);
		
		System.out.println(s2);
		
		System.out.println(s2.reverse());
		
		StringBuilder s3 = new StringBuilder(x);
		
		System.out.println(s3);
		
		System.out.println(s3.reverse());
		
		

	}

}
