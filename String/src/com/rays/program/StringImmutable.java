package com.rays.program;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s="Apurva";
		
		String s2="Shivu";
		
		System.out.println(s.concat(" ").concat(s2));	//"Apurva Shivu"
		System.out.println(s);	////Apurva
		
		System.out.println("====================================");
		
		//value change
		StringBuffer s1=new StringBuffer("Deshmukh");
		StringBuffer s3=new StringBuffer("chinu");

		System.out.println(s1.append(" ").append(s3));	////Deshmukh chinu
		System.out.println(s1);	////Deshmukh chinu
	}
}


//Output:
//Apurva Shivu
//Apurva
//====================================
//Deshmukh chinu
//Deshmukh chinu
