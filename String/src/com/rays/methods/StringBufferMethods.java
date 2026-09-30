package com.rays.methods;

public class StringBufferMethods {

	public static void main(String[] args) {
		
		
	  StringBuffer sb=new StringBuffer("Apurva");
	  
	  StringBuffer s2=sb.append("Deshmukh");
	  System.out.println("String: "+s2);
	  
	  System.out.println("Insert o at position 3: "+sb.insert(3 ,"o"));
	  
	  System.out.println("Delete at position 5: "+sb.delete(5, 6));
//	  start → starting index inclusive
//	  end → ending index exclusive
//	  So delete(5, 6) deletes the character at index 5 only.
	  
	  System.out.println("--------------------------------");
	  
	  System.out.println("Reverse String: "+sb.reverse());
	  
	  System.out.println("Capacity String: "+sb.capacity());
	}
}

//Output:
//	String: ApurvaDeshmukh
//	Insert o at position 3: ApuorvaDeshmukh
//	Delete at position 5: ApuoraDeshmukh
//	--------------------------------
//	Reverse String: hkumhseDaroupA
//	Capacity String: 22
