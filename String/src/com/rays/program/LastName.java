package com.rays.program;

public class LastName {

	 public static void main(String[] args) {

	        String name = "Apurva Shivam Deshmukh";

	        String lastName = name.substring(name.lastIndexOf(" ") + 1);

	        System.out.println("lastName: "+lastName);
	   }
}

//lastName: Deshmukh
