package com.rays.objectcreation;

public class ObjectCreateUsingForname {

	    public static void main(String[] args) throws Exception {

	        Student s = (Student) Class.forName("com.rays.objectcreation.Student").newInstance();

	        s.display();
	    }
	
}
