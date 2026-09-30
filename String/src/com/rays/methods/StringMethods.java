package com.rays.methods;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String name = "Apurva ";
		String str = "Deshmukh";

		
		System.out.println("Length: "+name.length());
		System.out.println("Trim spaces: "+name.trim().length());
		
		String e = name + str;
		System.out.println("String After Add: "+e);
		
		System.out.println("-----------------------");
		
		System.out.println("String Length = "+ name.length());
		System.out.println("UpperCase = "+ name.toUpperCase());
		System.out.println("LowerCase = "+ name.toLowerCase());
		System.out.println("StartWith R = "+ name.startsWith("R"));
		System.out.println("EndWith t = "+ name.endsWith("t"));
		System.out.println("CharAt position 0 = "+ name.charAt(0));
		System.out.println("IndexOf a = "+ name.indexOf("a"));
		System.out.println("LastIndexOf a = "+ name.lastIndexOf("a"));
		System.out.println("SubString = "+ name.substring(1));
		System.out.println("Trim = "+ name.trim());
		System.out.println("Concat = "+ name.concat(str));
		System.out.println("Concat = "+ str.concat(name));
		System.out.println("Replace = "+ name.replace("Apurva", "Shiv"));
		
		System.out.println("-----------------------");
		
		String str1 = "Hello java";
        String[] s = str1.split(" "); //split space ke hisab se string ko tod deta h 
//        s[0] = "Hello"
//        s[1] = "java"
//        ["Hello", "java"]
        
        for (String s1 : s) {
            System.out.print(s1);
        }
        
        System.out.println("\n........................");
        
        String s3 = "SUNRAYS";
		String s4 = "SUNRAYS";
		
		String s5 = new String("SUNRAYS");
		String s6 = new String("SUNRAYS");

		
		boolean b = s3 == s4; //true
		System.out.println(b);
		
		boolean p = s3.equals(s4); //true
		System.out.println(p);
		
		boolean p1 = s5.equals(s6);
		System.out.println(p1);   //true
		
		boolean b1 = s5 == (s6);   //false
	    System.out.println(b1);
	    
//	    s5 ─────→ String object "SUNRAYS"
//
//	    s6 ─────→ String object "SUNRAYS"
//	    
//	    s5 == s6	They contain the same text, but they are different objects.
//	    
//	    == compares whether two references point to the same object, while .equals() compares the content of the String.
	    
	    System.out.println("........................");
	    
	    StringBuffer sb1 = new StringBuffer("ram");
		StringBuffer sb2 = new StringBuffer("ram");
		
		boolean bb = sb1.equals(sb2); //false Stringbuffer overrie nh krta equals ko
		//They contain the same text, but they are different objects.
		
		System.out.println(bb);
		
	}
}

//Output:
//	Length: 7
//	Trim spaces: 6
//	String After Add: Apurva Deshmukh
//	-----------------------
//	String Length = 7
//	UpperCase = APURVA 
//	LowerCase = apurva 
//	StartWith R = false
//	EndWith t = false
//	CharAt position 0 = A
//	IndexOf a = 5
//	LastIndexOf a = 5
//	SubString = purva 
//	Trim = Apurva
//	Concat = Apurva Deshmukh
//	Concat = DeshmukhApurva 
//	Replace = Shiv 
//	-----------------------
//	Hellojava
//	........................
//	true
//	true
//	true
//	false
//	........................
//	false