package com.session2.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(12,"John V","LA-16");
		Student s2 = new Student(22,"Indira","IN-00");
		Student s3 = new Student();
		
		s1.display();
		s2.display();
		
		s3.rollNo =1;
		s3.name="Meera";
		s3.address="IN-01";
				
		s3.display();

	}

}
