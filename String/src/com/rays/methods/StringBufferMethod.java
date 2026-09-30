package com.rays.methods;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("java");

		System.out.println("length : " + sb.length());

		System.out.println("delete : " + sb.delete(0, 2));

		System.out.println("string : " + sb.toString());

		System.out.println("insert w at position 2 : " + sb.insert(2, "w"));

		System.out.println("Capacity : " + sb.capacity());

		System.out.println("IndexOf v:" + sb.indexOf("v"));

		System.out.println("CharAt position 1: " + sb.charAt(1));
		
		
		
		System.out.println("---------------------");
		
		System.out.println("string: " + sb);

		System.out.println("Replace: " + sb.replace(0, 2, "w"));
		
//		sb.replace(start, end, newString);
//		start → starting index, inclusive
//		end → ending index, exclusive
//		"w" → text that will replace the characters

		System.out.println("Append: " + sb.append(" sivgggfgastava"));

		System.out.println("Reverse: " + sb.reverse());
	
	}
}

//Output:
//	length : 4
//	delete : va
//	string : va
//	insert w at position 2 : vaw
//	Capacity : 20
//	IndexOf v:0
//	CharAt position 1: a
//	---------------------
//	string: vaw
//	Replace: ww
//	Append: ww sivgggfgastava
//	Reverse: avatsagfgggvis ww
