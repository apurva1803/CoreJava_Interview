package com.rays.program;

public class Constants {

	public static void main(String[] args) {
		
		String s ="Apurva Deshmukh";
		int count=0;
		String print="";
		
		for(int i=0;i<s.length();i++) {
		
			char ch = Character.toLowerCase(s.charAt(i));
			
			if (ch != ' ' &&  ch != 'a' && ch != 'e' && ch != 'i' &&
				    ch != 'o' && ch != 'u' && print.indexOf(ch) == -1) 
			{
				count++;
				print+=ch;
			}
			
		}
		
		if(count>0) {
			System.out.println("Count: "+count);
			System.out.println("Remaining String: "+print);
		}
		
	
	}
}

//Output: 
//Count: 8
//Remaining String: prvdshmk
