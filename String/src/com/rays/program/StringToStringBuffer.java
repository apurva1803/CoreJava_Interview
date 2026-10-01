package com.rays.program;

public class StringToStringBuffer {

	public static void main(String[] args) {
		
		String s1="Apurva";
		
		StringBuffer sb=new StringBuffer(s1);
		
		System.out.println(sb);
		System.out.println(sb.insert(6, "Deshmukh"));
		
	}
}

//Output:
//Apurva
//ApurvaDeshmukh
