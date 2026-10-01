package com.rays.program;

public class CountOccuranceOfStringArray {

	public static void main(String[] args) {
		
		String[] str = { "core", "java" };

		for (char ch = 'a'; ch < 'z'; ch++) {

			int count = 0;

			for (String n : str)

				for (int i = 0; i < n.length(); i++) {

					if (ch == n.charAt(i)) {

						count++;
					}
				}
			
			if (count > 0) {
				System.out.println(ch + "=" + count);
			}
		}
	}
}

//Output:
//	a=2
//	c=1
//	e=1
//	j=1
//	o=1
//	r=1
//	v=1
