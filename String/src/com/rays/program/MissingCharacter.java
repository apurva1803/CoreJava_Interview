package com.rays.program;

public class MissingCharacter {

	public static void main(String[] args) {
		
		String s1="chinujdkjaueedkjandklajwoincxmzmwoiqe";
		
		for(char c='a';c<='z';c++) {
			
			int count=0;

			for (int i = 0; i < s1.length(); i++) {
			
				if(s1.charAt(i)==c) {
				count++;
				
			}
		}
			
		if(count==0) {
			System.out.println("missing char = " +c);
		}
		
		}
	}
}

//Output:
//	missing char = b
//	missing char = f
//	missing char = g
//	missing char = p
//	missing char = r
//	missing char = s
//	missing char = t
//	missing char = v
//	missing char = y
