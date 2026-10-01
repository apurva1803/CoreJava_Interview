package com.rays.program;

public class FindChar {

	public static void main(String[] args) {
		
		String s1="Apurva";
		
		char target='a';
	    int position = s1.indexOf(target);
	    
		if(position!=-1) {
			System.out.println("char found : " +target);
			System.out.println("At position : " +position);
		}
		
		else {
			System.out.println("char not found " + target);
		}
	}
}

//Output:
//char found : a
//At position : 5
